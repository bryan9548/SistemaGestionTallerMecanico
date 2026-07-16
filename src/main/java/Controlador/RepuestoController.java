package Controlador;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RepuestoController {

    // CREATE
    public boolean guardarRepuesto(String codigo, String nombre, double precio, int stock) {
        String sql = "INSERT INTO Repuesto (Codigo, Nombre, Precio, Stock, Estado) VALUES (?, ?, ?, ?, 1)";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setDouble(3, precio);
            ps.setInt(4, stock);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
            return false;
        }
    }

    // READ - todos
    public List<Object[]> listarRepuestos() {
        List<Object[]> lista = new ArrayList<>();
        String sql = "SELECT Codigo, Nombre, Precio, Stock FROM Repuesto WHERE Estado = 1";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Object[]{
                    rs.getString("Codigo"),
                    rs.getString("Nombre"),
                    rs.getDouble("Precio"),
                    rs.getInt("Stock")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar: " + e.getMessage());
        }
        return lista;
    }

    // READ - buscar por Código
    public Object[] buscarRepuestoPorCodigo(String codigo) {
        String sql = "SELECT Codigo, Nombre, Precio, Stock FROM Repuesto WHERE Codigo = ?";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Object[]{
                    rs.getString("Codigo"),
                    rs.getString("Nombre"),
                    rs.getDouble("Precio"),
                    rs.getInt("Stock")
                };
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
        }
        return null;
    }

    // UPDATE
    public boolean actualizarRepuesto(String codigo, String nombre, double precio, int stock) {
        String sql = "UPDATE Repuesto SET Nombre = ?, Precio = ?, Stock = ? WHERE Codigo = ?";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, stock);
            ps.setString(4, codigo);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean eliminarRepuesto(String codigo) {
        String sql = "DELETE FROM Repuesto WHERE Codigo = ?";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            return false;
        }
    }
    // Para combos (con RepuestoID y Precio)
    public java.util.List<modelos.ComboItem> listarRepuestosParaCombo() {
        java.util.List<modelos.ComboItem> lista = new java.util.ArrayList<>();
        String sql = "SELECT RepuestoID, Codigo, Nombre, Precio FROM Repuesto WHERE Estado = 1";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String texto = rs.getString("Codigo") + " - " + rs.getString("Nombre");
                lista.add(new modelos.ComboItem(rs.getInt("RepuestoID"), texto, rs.getDouble("Precio")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar repuestos: " + e.getMessage());
        }
        return lista;
    }
}