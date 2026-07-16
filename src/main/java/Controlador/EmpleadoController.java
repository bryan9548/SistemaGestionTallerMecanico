package Controlador;

import conexion.Conexion;
import modelos.EmpleadoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class EmpleadoController {
    public List<EmpleadoBD> listarEmpleados(){

    List<EmpleadoBD> lista = new ArrayList<>();

    String sql =
    "SELECT e.EmpleadoID, " +
    "p.Nombre, " +
    "e.Cargo, " +
    "e.Sueldo, " +
    "e.Estado " +
    "FROM Empleado e " +
    "INNER JOIN Persona p ON e.PersonaID = p.PersonaID";

    try(Connection con = Conexion.conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()){

        while(rs.next()){

            EmpleadoBD emp = new EmpleadoBD();

            emp.setEmpleadoId(rs.getInt("EmpleadoID"));
            emp.setNombre(rs.getString("Nombre"));
            emp.setCargo(rs.getString("Cargo"));
            emp.setSueldo(rs.getDouble("Sueldo"));
            emp.setEstado(rs.getInt("Estado"));

            lista.add(emp);

        }

    }catch(SQLException e){

        JOptionPane.showMessageDialog(null,
                "Error al listar empleados:\n"+e.getMessage());

    }

    return lista;

}
    public EmpleadoBD buscarEmpleado(int id) {

    String sql =
    "SELECT e.EmpleadoID, " +
    "e.PersonaID, " +
    "p.Nombre, " +
    "e.Cargo, " +
    "e.Sueldo, " +
    "e.Estado " +
    "FROM Empleado e " +
    "INNER JOIN Persona p ON e.PersonaID = p.PersonaID " +
    "WHERE e.EmpleadoID = ?";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            EmpleadoBD emp = new EmpleadoBD();

            emp.setEmpleadoId(rs.getInt("EmpleadoID"));
            emp.setPersonaId(rs.getInt("PersonaID"));
            emp.setNombre(rs.getString("Nombre"));
            emp.setCargo(rs.getString("Cargo"));
            emp.setSueldo(rs.getDouble("Sueldo"));
            emp.setEstado(rs.getInt("Estado"));

            return emp;

        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null,
                "Error al buscar empleado:\n" + e.getMessage());

    }

    return null;

}

}