package Controlador;

import conexion.Conexion;
import modelos.ComboItem;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrdenTrabajoController {

    // Combo de vehículos (muestra Placa + Modelo + Cliente)
    public List<ComboItem> listarVehiculosParaCombo() {
        List<ComboItem> lista = new ArrayList<>();
        String sql = "SELECT v.VehiculoID, v.Placa, v.Modelo, p.Nombre, p.Apellido " +
                     "FROM Vehiculo v " +
                     "INNER JOIN Cliente c ON v.ClienteID = c.ClienteID " +
                     "INNER JOIN Persona p ON c.PersonaID = p.PersonaID " +
                     "WHERE v.Estado = 1";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String texto = rs.getString("Placa") + " - " + rs.getString("Modelo")
                        + " (" + rs.getString("Nombre") + " " + rs.getString("Apellido") + ")";
                lista.add(new ComboItem(rs.getInt("VehiculoID"), texto, 0));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar vehículos: " + e.getMessage());
        }
        return lista;
    }

    // Guardar orden completa (cabecera + detalle) en una transacción
    public int guardarOrden(int vehiculoId, int mecanicoId, DefaultTableModel modeloDetalle, double total) {
        Connection con = null;
        try {
            con = Conexion.conectar();
            con.setAutoCommit(false);

            String sqlOrden = "INSERT INTO OrdenTrabajo (VehiculoID, MecanicoID, Estado, Total) VALUES (?, ?, 'Pendiente', ?)";
            PreparedStatement psOrden = con.prepareStatement(sqlOrden, Statement.RETURN_GENERATED_KEYS);
            psOrden.setInt(1, vehiculoId);
            psOrden.setInt(2, mecanicoId);
            psOrden.setDouble(3, total);
            psOrden.executeUpdate();

            ResultSet rs = psOrden.getGeneratedKeys();
            int ordenId = 0;
            if (rs.next()) {
                ordenId = rs.getInt(1);
            }

            String sqlDetalle = "INSERT INTO DetalleOrden (OrdenTrabajoID, RepuestoID, Cantidad, PrecioUnitario, SubTotal) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psDetalle = con.prepareStatement(sqlDetalle);

            for (int i = 0; i < modeloDetalle.getRowCount(); i++) {
                int repuestoId = (int) modeloDetalle.getValueAt(i, 4); // columna oculta
                int cantidad = (int) modeloDetalle.getValueAt(i, 1);
                double precioUnitario = (double) modeloDetalle.getValueAt(i, 2);
                double subtotal = (double) modeloDetalle.getValueAt(i, 3);

                psDetalle.setInt(1, ordenId);
                psDetalle.setInt(2, repuestoId);
                psDetalle.setInt(3, cantidad);
                psDetalle.setDouble(4, precioUnitario);
                psDetalle.setDouble(5, subtotal);
                psDetalle.addBatch();
            }
            psDetalle.executeBatch();

            con.commit();
            return ordenId;

        } catch (SQLException e) {
            try { if (con != null) con.rollback(); } catch (SQLException ex) {}
            JOptionPane.showMessageDialog(null, "Error al guardar la orden: " + e.getMessage());
            return -1;
        } finally {
            try { if (con != null) con.setAutoCommit(true); } catch (SQLException e) {}
        }
    }
    public int obtenerSiguienteNumeroOrden() {
        String sql = "SELECT ISNULL(MAX(OrdenTrabajoID), 0) + 1 AS Siguiente FROM OrdenTrabajo";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("Siguiente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener número de orden: " + e.getMessage());
        }
        return 1;
    }
}