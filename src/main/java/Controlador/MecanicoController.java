package Controlador;

import conexion.Conexion;
import modelos.MecanicoBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MecanicoController {
    
   
    public boolean guardarMecanico(MecanicoBD m) {

    Connection con = null;

    try {

        con = Conexion.conectar();
        con.setAutoCommit(false);


        String sqlPersona =
        "INSERT INTO Persona (Nombre,Apellido,NumeroDocumento,TipoDocumento,Telefono,Email,Estado) " +
        "VALUES (?, '', ?, 'DNI', ?, '', 1)";

        PreparedStatement psPersona =
        con.prepareStatement(sqlPersona, Statement.RETURN_GENERATED_KEYS);

        psPersona.setString(1, m.getNombre());

        psPersona.setString(2, "MEC-" + System.currentTimeMillis());

        psPersona.setString(3, m.getTelefono());

        psPersona.executeUpdate();

        ResultSet rsPersona = psPersona.getGeneratedKeys();

        int personaId = 0;

        if(rsPersona.next()){

            personaId = rsPersona.getInt(1);

        }


        String sqlEmpleado =
        "INSERT INTO Empleado(PersonaID,Cargo,Sueldo,Estado) VALUES(?, 'Mecánico',2500,1)";

        PreparedStatement psEmpleado =
        con.prepareStatement(sqlEmpleado, Statement.RETURN_GENERATED_KEYS);

        psEmpleado.setInt(1, personaId);

        psEmpleado.executeUpdate();

        ResultSet rsEmpleado = psEmpleado.getGeneratedKeys();

        int empleadoId = 0;

        if(rsEmpleado.next()){

            empleadoId = rsEmpleado.getInt(1);

        }

      

        String sqlMecanico =
        "INSERT INTO Mecanico(EmpleadoID,Especialidad,Estado) VALUES(?,?,?)";

        PreparedStatement psMecanico =
        con.prepareStatement(sqlMecanico);

        psMecanico.setInt(1, empleadoId);

        psMecanico.setString(2, m.getEspecialidad());
        psMecanico.setInt(3, m.getEstado());

        psMecanico.executeUpdate();

        con.commit();

        return true;

    } catch (SQLException e) {

        try{

            if(con!=null){

                con.rollback();

            }

        }catch(SQLException ex){}

        JOptionPane.showMessageDialog(null,e.getMessage());

        return false;

    } finally{

        try{

            if(con!=null){

                con.setAutoCommit(true);

            }

        }catch(SQLException e){}

    }

}
    // LISTAR
public List<MecanicoBD> listarMecanicos() {

    List<MecanicoBD> lista = new ArrayList<>();

    String sql =
    "SELECT m.MecanicoID, e.EmpleadoID, p.Nombre, p.Telefono, m.Especialidad, m.Estado " +
    "FROM Mecanico m " +
    "INNER JOIN Empleado e ON m.EmpleadoID = e.EmpleadoID " +
    "INNER JOIN Persona p ON e.PersonaID = p.PersonaID";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            MecanicoBD m = new MecanicoBD();

            m.setMecanicoId(rs.getInt("MecanicoID"));
            m.setEmpleadoId(rs.getInt("EmpleadoID"));
            m.setNombre(rs.getString("Nombre"));
            m.setEspecialidad(rs.getString("Especialidad"));
            m.setEstado(rs.getInt("Estado"));

            lista.add(m);

        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null,
                "Error al listar mecánicos:\n" + e.getMessage());

    }

    return lista;

}
// BUSCAR
public MecanicoBD buscarMecanico(int id) {

    String sql =
    "SELECT m.MecanicoID, e.EmpleadoID, p.Nombre, m.Especialidad, m.Estado " + 
    "FROM Mecanico m " +
    "INNER JOIN Empleado e ON m.EmpleadoID = e.EmpleadoID " + 
    "INNER JOIN Persona p ON e.PersonaID = p.PersonaID " + 
    "WHERE m.MecanicoID = ?";

    try(Connection con=Conexion.conectar();
        PreparedStatement ps=con.prepareStatement(sql)){

        ps.setInt(1,id);

        ResultSet rs=ps.executeQuery();

        if(rs.next()){

            MecanicoBD m=new MecanicoBD();

            m.setMecanicoId(rs.getInt("MecanicoID"));
            m.setEmpleadoId(rs.getInt("EmpleadoID"));
            m.setNombre(rs.getString("Nombre"));
            m.setEspecialidad(rs.getString("Especialidad"));
            m.setEstado(rs.getInt("Estado"));

            return m;

        }

    }catch(SQLException e){

        JOptionPane.showMessageDialog(null,e.getMessage());

    }

    return null;

}
// ACTUALIZAR
public boolean actualizarMecanico(MecanicoBD m){

    Connection con=null;

    try{

        con=Conexion.conectar();

        con.setAutoCommit(false);

        String sqlPersona=

        "UPDATE Persona SET Nombre=?,Telefono=? " +

        "WHERE PersonaID=(" +

        "SELECT PersonaID FROM Empleado WHERE EmpleadoID=?)";

        PreparedStatement psPersona=

        con.prepareStatement(sqlPersona);

        psPersona.setString(1,m.getNombre());
        psPersona.setString(2,m.getTelefono());
        psPersona.setInt(3,m.getEmpleadoId());

        psPersona.executeUpdate();

        String sqlMecanico=

        "UPDATE Mecanico SET Especialidad=? WHERE MecanicoID=?";

        PreparedStatement psMecanico=

        con.prepareStatement(sqlMecanico);

        psMecanico.setString(1,m.getEspecialidad());
        psMecanico.setInt(2,m.getMecanicoId());

        psMecanico.executeUpdate();

        con.commit();

        return true;

    }catch(SQLException e){

        try{

            if(con!=null){

                con.rollback();

            }

        }catch(SQLException ex){}

        JOptionPane.showMessageDialog(null,e.getMessage());

        return false;

    }

}
// ELIMINAR
public boolean eliminarMecanico(int id){

    Connection con=null;

    try{

        con=Conexion.conectar();

        con.setAutoCommit(false);

        int empleadoId=0;
        int personaId=0;

        PreparedStatement ps=

        con.prepareStatement(

        "SELECT EmpleadoID FROM Mecanico WHERE MecanicoID=?");

        ps.setInt(1,id);

        ResultSet rs=ps.executeQuery();

        if(rs.next()){

            empleadoId=rs.getInt("EmpleadoID");

        }

        ps=con.prepareStatement(

        "SELECT PersonaID FROM Empleado WHERE EmpleadoID=?");

        ps.setInt(1,empleadoId);

        rs=ps.executeQuery();

        if(rs.next()){

            personaId=rs.getInt("PersonaID");

        }

        ps=con.prepareStatement(

        "DELETE FROM Mecanico WHERE MecanicoID=?");

        ps.setInt(1,id);

        ps.executeUpdate();

        ps=con.prepareStatement(

        "DELETE FROM Empleado WHERE EmpleadoID=?");

        ps.setInt(1,empleadoId);

        ps.executeUpdate();

        ps=con.prepareStatement(

        "DELETE FROM Persona WHERE PersonaID=?");

        ps.setInt(1,personaId);

        ps.executeUpdate();

        con.commit();

        return true;

    }catch(SQLException e){

        try{

            if(con!=null){

                con.rollback();

            }

        }catch(SQLException ex){}

        JOptionPane.showMessageDialog(null,e.getMessage());

        return false;

    }finally {

        try{

            if(con!=null){

                con.setAutoCommit(true);

            }

        }catch(SQLException e){}

    }
  }
}