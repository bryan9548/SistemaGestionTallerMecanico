
package Vistas;

import conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmReportes extends javax.swing.JFrame {
    
    public FrmReportes() {
        initComponents();

    cmbReportes.removeAllItems();

    cmbReportes.addItem("Clientes");
    cmbReportes.addItem("Vehículos");
    cmbReportes.addItem("Mecánicos");
    cmbReportes.addItem("Repuestos con bajo stock");
    cmbReportes.addItem("Órdenes de trabajo");
    }

private void reporteClientes() {

    DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("Código");
    modelo.addColumn("Nombre");
    modelo.addColumn("Teléfono");
    modelo.addColumn("Tipo Cliente");

    String sql =
        "SELECT c.ClienteID, p.Nombre, p.Telefono, c.TipoCliente " +
        "FROM Cliente c " +
        "INNER JOIN Persona p ON c.PersonaID = p.PersonaID";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            modelo.addRow(new Object[]{

                rs.getInt("ClienteID"),
                rs.getString("Nombre"),
                rs.getString("Telefono"),
                rs.getString("TipoCliente")

            });

        }

        tblReportes.setModel(modelo);

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(this,
                "Error al generar el reporte:\n" + e.getMessage());

    }
}
    private void reporteVehiculos(){
        DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("Código");
    modelo.addColumn("Cliente");
    modelo.addColumn("Marca");
    modelo.addColumn("Modelo");
    modelo.addColumn("Placa");

    String sql =
        "SELECT v.VehiculoID, p.Nombre, mv.NombreMarca, v.Modelo, v.Placa " +
        "FROM Vehiculo v " +
        "INNER JOIN Cliente c ON v.ClienteID = c.ClienteID " +
        "INNER JOIN Persona p ON c.PersonaID = p.PersonaID " +
        "INNER JOIN MarcaVehiculo mv ON v.MarcaID = mv.MarcaID";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            modelo.addRow(new Object[]{

                rs.getInt("VehiculoID"),
                rs.getString("Nombre"),
                rs.getString("NombreMarca"),
                rs.getString("Modelo"),
                rs.getString("Placa")

            });

        }

        tblReportes.setModel(modelo);

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(this,
                "Error al generar el reporte:\n" + e.getMessage());

    }

}

private void reporteMecanicos(){
     DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("Código");
    modelo.addColumn("Nombre");
    modelo.addColumn("Especialidad");
    modelo.addColumn("Estado");

    String sql =
        "SELECT m.MecanicoID, p.Nombre, m.Especialidad, m.Estado " +
        "FROM Mecanico m " +
        "INNER JOIN Empleado e ON m.EmpleadoID = e.EmpleadoID " +
        "INNER JOIN Persona p ON e.PersonaID = p.PersonaID";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            modelo.addRow(new Object[]{

                rs.getInt("MecanicoID"),
                rs.getString("Nombre"),
                rs.getString("Especialidad"),
                rs.getBoolean("Estado") ? "Activo" : "Inactivo"

            });

        }

        tblReportes.setModel(modelo);

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(this,
                "Error al generar el reporte:\n" + e.getMessage());

    }


}

private void reporteRepuestos(){
 DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("Código");
    modelo.addColumn("Nombre");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");

    String sql =
        "SELECT Codigo, Nombre, Precio, Stock " +
        "FROM Repuesto " +
        "WHERE Stock < 5";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            modelo.addRow(new Object[]{

                rs.getString("Codigo"),
                rs.getString("Nombre"),
                rs.getDouble("Precio"),
                rs.getInt("Stock")

            });

        }

        tblReportes.setModel(modelo);

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(this,
                "Error al generar el reporte:\n" + e.getMessage());

    }

}

private void reporteOrdenes(){
DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("Orden");
    modelo.addColumn("Vehículo");
    modelo.addColumn("Mecánico");
    modelo.addColumn("Estado");
    modelo.addColumn("Total");

    String sql =
        "SELECT o.OrdenTrabajoID, " +
        "v.Placa, " +
        "p.Nombre, " +
        "o.Estado, " +
        "o.Total " +
        "FROM OrdenTrabajo o " +
        "INNER JOIN Vehiculo v ON o.VehiculoID = v.VehiculoID " +
        "INNER JOIN Mecanico m ON o.MecanicoID = m.MecanicoID " +
        "INNER JOIN Empleado e ON m.EmpleadoID = e.EmpleadoID " +
        "INNER JOIN Persona p ON e.PersonaID = p.PersonaID";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            modelo.addRow(new Object[]{

                rs.getInt("OrdenTrabajoID"),
                rs.getString("Placa"),
                rs.getString("Nombre"),
                rs.getString("Estado"),
                rs.getDouble("Total")

            });

        }

        tblReportes.setModel(modelo);

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(this,
                "Error al generar el reporte:\n" + e.getMessage());

    }

}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTipoReporte = new javax.swing.JLabel();
        cmbReportes = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        tbnMostrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        tblRportes = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Reportes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        lblTipoReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoReporte.setText("Tipo de Reporte:");

        cmbReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes ", "Vehiculos ", "Mecanicos ", "Reppuestos con bajo stock", "Ordenes de trabajo", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lblTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(cmbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        tbnMostrar.setBackground(new java.awt.Color(102, 102, 102));
        tbnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        tbnMostrar.setText("Mostrar");
        tbnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(tbnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tbnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(102, 102, 102));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Clientes ", "Vehiculos ", "Mecanicos ", "Repuestos con bajo stock", "Ordenes de trabajo"
            }
        ));
        tblRportes.setViewportView(tblReportes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tblRportes))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblRportes, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getAccessibleContext().setAccessibleName("Gestion de Reportes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cmbReportes.setSelectedIndex(0);

    tblReportes.setModel(new DefaultTableModel());
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tbnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnMostrarActionPerformed
String opcion = cmbReportes.getSelectedItem().toString();

switch(opcion){

    case "Clientes":

        reporteClientes();

        break;

    case "Vehículos":

        reporteVehiculos();

        break;

    case "Mecánicos":

        reporteMecanicos();

        break;

    case "Repuestos con bajo stock":

        reporteRepuestos();

        break;

    case "Órdenes de trabajo":

        reporteOrdenes();

        break;        
    }//GEN-LAST:event_tbnMostrarActionPerformed
    }
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbReportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblTipoReporte;
    private javax.swing.JTable tblReportes;
    private javax.swing.JScrollPane tblRportes;
    private javax.swing.JButton tbnMostrar;
    // End of variables declaration//GEN-END:variables
}
