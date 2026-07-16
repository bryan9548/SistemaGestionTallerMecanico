package Controlador;

import conexion.Conexion;
import modelos.Vehiculo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VehiculoController {

    // GUARDAR
    public boolean guardarVehiculo(Vehiculo v) {

        String sql = "INSERT INTO Vehiculo "
                + "(ClienteID, MarcaID, Modelo, Año, Placa) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, v.getClienteId());
            ps.setInt(2, v.getMarcaId());
            ps.setString(3, v.getModelo());
            ps.setInt(4, v.getAnio());
            ps.setString(5, v.getPlaca());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar vehículo:\n" + e.getMessage());
            return false;
        }
    }

    // LISTAR
    public List<Vehiculo> listarVehiculos() {

        List<Vehiculo> lista = new ArrayList<>();

        String sql =
        "SELECT Placa, MarcaID, Modelo, Año, ClienteID FROM Vehiculo";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Vehiculo v = new Vehiculo();

                v.setPlaca(rs.getString("Placa"));
                v.setMarcaId(rs.getInt("MarcaID"));
                v.setModelo(rs.getString("Modelo"));
                v.setAnio(rs.getInt("Año"));
                v.setClienteId(rs.getInt("ClienteID"));

                lista.add(v);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return lista;
    }

    // BUSCAR
    public ResultSet buscarVehiculo(String placa) {

    String sql =
        "SELECT v.Placa, v.Modelo, v.Año, " +
        "m.NombreMarca, p.Nombre " +
        "FROM Vehiculo v " +
        "INNER JOIN MarcaVehiculo m ON v.MarcaID = m.MarcaID " +
        "INNER JOIN Cliente c ON v.ClienteID = c.ClienteID " +
        "INNER JOIN Persona p ON c.PersonaID = p.PersonaID " +
        "WHERE v.Placa = ?";

    try {

        Connection con = Conexion.conectar();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, placa);

        return ps.executeQuery();

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

        return null;

    }
}

    // ACTUALIZAR
    public boolean actualizarVehiculo(Vehiculo v) {

        String sql =
        "UPDATE Vehiculo SET MarcaID=?,Modelo=?,Año=?,ClienteID=? WHERE Placa=?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, v.getMarcaId());
            ps.setString(2, v.getModelo());
            ps.setInt(3, v.getAnio());
            ps.setInt(4, v.getClienteId());
            ps.setString(5, v.getPlaca());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;

        }

    }

    // ELIMINAR
    public boolean eliminarVehiculo(String placa) {

        String sql =
        "DELETE FROM Vehiculo WHERE Placa=?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, placa);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

            return false;

        }

    }

    public ResultSet obtenerMarcas() {

    try {
        Connection con = Conexion.conectar();

        String sql = "SELECT MarcaID, NombreMarca FROM MarcaVehiculo WHERE Estado = 1 ORDER BY NombreMarca";

        PreparedStatement ps = con.prepareStatement(sql);

        return ps.executeQuery();

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null, e.getMessage());
        return null;

    }

}

public ResultSet obtenerClientes() {

    try {

        Connection con = Conexion.conectar();

        String sql =
        "SELECT c.ClienteID, p.Nombre " +
        "FROM Cliente c " +
        "INNER JOIN Persona p ON c.PersonaID = p.PersonaID " +
        "ORDER BY p.Nombre";

        PreparedStatement ps = con.prepareStatement(sql);

        return ps.executeQuery();

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

        return null;

    }

}
public int obtenerIdMarca(String nombreMarca) {

    String sql = "SELECT MarcaID FROM MarcaVehiculo WHERE NombreMarca = ?";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, nombreMarca);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getInt("MarcaID");
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

    }

    return 0;
}
    public int obtenerIdCliente(String nombreCliente) {

    String sql = "SELECT c.ClienteID " +
                 "FROM Cliente c " +
                 "INNER JOIN Persona p ON c.PersonaID = p.PersonaID " +
                 "WHERE p.Nombre = ?";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, nombreCliente);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getInt("ClienteID");
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

    }

    return 0;
}


public ResultSet listarVehiculosTabla() {

    try {

        Connection con = Conexion.conectar();

        String sql =
            "SELECT v.Placa, " +
            "m.NombreMarca, " +
            "v.Modelo, " +
            "v.Año, " +
            "p.Nombre " +
            "FROM Vehiculo v " +
            "INNER JOIN MarcaVehiculo m ON v.MarcaID = m.MarcaID " +
            "INNER JOIN Cliente c ON v.ClienteID = c.ClienteID " +
            "INNER JOIN Persona p ON c.PersonaID = p.PersonaID";

        PreparedStatement ps = con.prepareStatement(sql);

        return ps.executeQuery();

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

        return null;
    }

}
}
