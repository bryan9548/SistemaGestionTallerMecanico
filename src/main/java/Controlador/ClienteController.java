package Controlador;

import conexion.Conexion;
import modelos.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteController {

    // CREATE — inserta en Persona y luego en Cliente, en una transacción
   public boolean guardarCliente(Cliente cliente) {
        Connection con = null;
        try {
            con = Conexion.conectar();
            con.setAutoCommit(false);

            String sqlPersona = "INSERT INTO Persona (Nombre, Apellido, NumeroDocumento, TipoDocumento, Telefono, Email, Estado) VALUES (?, '', ?, 'DNI', ?, ?, 1)";
            PreparedStatement psPersona = con.prepareStatement(sqlPersona, Statement.RETURN_GENERATED_KEYS);
            psPersona.setString(1, cliente.getNombre());
            psPersona.setString(2, "SN-" + System.currentTimeMillis());
            psPersona.setString(3, cliente.getTelefono());
            psPersona.setString(4, cliente.getEmail());
            psPersona.executeUpdate();

            ResultSet rs = psPersona.getGeneratedKeys();
            int personaId = 0;
            if (rs.next()) {
                personaId = rs.getInt(1);
            }

            String sqlCliente = "INSERT INTO Cliente (PersonaID, RazonSocial, TipoCliente, FechaRegistro, Estado) VALUES (?, ?, 'Natural', GETDATE(), 1)";
            PreparedStatement psCliente = con.prepareStatement(sqlCliente);
            psCliente.setInt(1, personaId);
            psCliente.setString(2, cliente.getNombre());
            psCliente.executeUpdate();

            con.commit();
            return true;

        } catch (SQLException e) {
            try { if (con != null) con.rollback(); } catch (SQLException ex) {}
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
            return false;
        } finally {
            try { if (con != null) con.setAutoCommit(true); } catch (SQLException e) {}
        }
    }
    // READ - todos (JOIN entre Cliente y Persona)
    public List<Cliente> listarClientes() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT c.ClienteID, p.Nombre, p.Telefono, p.Email " +
                     "FROM Cliente c INNER JOIN Persona p ON c.PersonaID = p.PersonaID";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("ClienteID"),
                        rs.getString("Nombre"),
                        rs.getString("Telefono"),
                        rs.getString("Email")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar: " + e.getMessage());
        }
        return lista;
    }

    // READ - buscar por ClienteID
    public Cliente buscarClientePorId(int id) {
        String sql = "SELECT c.ClienteID, p.Nombre, p.Telefono, p.Email " +
                     "FROM Cliente c INNER JOIN Persona p ON c.PersonaID = p.PersonaID " +
                     "WHERE c.ClienteID = ?";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Cliente(
                        rs.getInt("ClienteID"),
                        rs.getString("Nombre"),
                        rs.getString("Telefono"),
                        rs.getString("Email")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
        }
        return null;
    }

    // UPDATE — actualiza Persona (los datos reales) usando el ClienteID para encontrar la Persona
    public boolean actualizarCliente(Cliente cliente) {
        String sql = "UPDATE Persona SET Nombre = ?, Telefono = ?, Email = ? " +
                     "WHERE PersonaID = (SELECT PersonaID FROM Cliente WHERE ClienteID = ?)";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getEmail());
            ps.setInt(4, cliente.getIdPersona());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
            return false;
        }
    }

    // DELETE — borra Cliente y su Persona asociada
    public boolean eliminarCliente(int id) {
        Connection con = null;
        try {
            con = Conexion.conectar();
            con.setAutoCommit(false);

            PreparedStatement psGetPersona = con.prepareStatement("SELECT PersonaID FROM Cliente WHERE ClienteID = ?");
            psGetPersona.setInt(1, id);
            ResultSet rs = psGetPersona.executeQuery();
            int personaId = 0;
            if (rs.next()) {
                personaId = rs.getInt("PersonaID");
            }

            PreparedStatement psDelCliente = con.prepareStatement("DELETE FROM Cliente WHERE ClienteID = ?");
            psDelCliente.setInt(1, id);
            psDelCliente.executeUpdate();

            PreparedStatement psDelPersona = con.prepareStatement("DELETE FROM Persona WHERE PersonaID = ?");
            psDelPersona.setInt(1, personaId);
            psDelPersona.executeUpdate();

            con.commit();
            return true;

        } catch (SQLException e) {
            try { if (con != null) con.rollback(); } catch (SQLException ex) {}
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            return false;
        } finally {
            try { if (con != null) con.setAutoCommit(true); } catch (SQLException e) {}
        }
    }
    
}