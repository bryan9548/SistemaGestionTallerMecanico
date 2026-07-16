/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.ClienteController;
import modelos.Cliente;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class FrmCliente extends javax.swing.JFrame {

   private final ClienteController controller = new ClienteController();
    public FrmCliente() {
        initComponents();
        cargarTabla();
    jTable6.getSelectionModel().addListSelectionListener(evt -> seleccionarFila());
    }

  private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable6.getModel();
        modelo.setRowCount(0);
        for (Cliente c : controller.listarClientes()) {
            modelo.addRow(new Object[]{c.getIdPersona(), c.getNombre(), c.getTelefono(), c.getEmail()});
        }
    }

     private void seleccionarFila() {
        int fila = jTable6.getSelectedRow();
        if (fila >= 0) {
            txtCodigo4.setText(jTable6.getValueAt(fila, 0).toString());
            txtNombre4.setText(jTable6.getValueAt(fila, 1).toString());
            txtTelefono4.setText(jTable6.getValueAt(fila, 2).toString());
            txtCorreo4.setText(jTable6.getValueAt(fila, 3).toString());
        }
    }
   private void limpiarCampos() {
        txtCodigo4.setText("");
        txtNombre4.setText("");
        txtTelefono4.setText("");
        txtCorreo4.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        pnlTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        pnlTitulo1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlDatos1 = new javax.swing.JPanel();
        lblCodigo1 = new javax.swing.JLabel();
        lblTelefono1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblCorreo1 = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtCorreo1 = new javax.swing.JTextField();
        pnlBotones1 = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        pnlTitulo2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlDatos2 = new javax.swing.JPanel();
        lblCodigo2 = new javax.swing.JLabel();
        lblTelefono2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblCorreo2 = new javax.swing.JLabel();
        txtCodigo2 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtCorreo2 = new javax.swing.JTextField();
        pnlBotones2 = new javax.swing.JPanel();
        btnGuardar2 = new javax.swing.JButton();
        btnNuevo2 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        btnActualizar2 = new javax.swing.JButton();
        btnBuscar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        pnlTitulo3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlDatos3 = new javax.swing.JPanel();
        lblCodigo3 = new javax.swing.JLabel();
        lblTelefono3 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblCorreo3 = new javax.swing.JLabel();
        txtCodigo3 = new javax.swing.JTextField();
        txtTelefono3 = new javax.swing.JTextField();
        txtNombre3 = new javax.swing.JTextField();
        txtCorreo3 = new javax.swing.JTextField();
        pnlBotones3 = new javax.swing.JPanel();
        btnGuardar3 = new javax.swing.JButton();
        btnNuevo3 = new javax.swing.JButton();
        btnEliminar3 = new javax.swing.JButton();
        btnActualizar3 = new javax.swing.JButton();
        btnBuscar3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        pnlTitulo4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlBotones4 = new javax.swing.JPanel();
        btnGuardar4 = new javax.swing.JButton();
        btnNuevo4 = new javax.swing.JButton();
        btnEliminar4 = new javax.swing.JButton();
        btnActualizar4 = new javax.swing.JButton();
        btnBuscar4 = new javax.swing.JButton();
        pnlDatos4 = new javax.swing.JPanel();
        lblCodigo4 = new javax.swing.JLabel();
        lblTelefono4 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblCorreo4 = new javax.swing.JLabel();
        txtCodigo4 = new javax.swing.JTextField();
        txtTelefono4 = new javax.swing.JTextField();
        txtNombre4 = new javax.swing.JTextField();
        txtCorreo4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Gestion de Clientes");

        pnlTitulo.setBackground(new java.awt.Color(0, 51, 255));
        pnlTitulo.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion de Clientes");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setText("Código:");

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefono.setText("Teléfono:");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCorreo.setText("Correo:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono)))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo)
                        .addGap(6, 6, 6))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre)))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblNombre)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(lblTelefono)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlBotones.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(102, 102, 102));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusPainted(false);

        btnActualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusPainted(false);

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Gestion de Clientes");

        pnlTitulo1.setBackground(new java.awt.Color(0, 51, 255));
        pnlTitulo1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion de Clientes");

        javax.swing.GroupLayout pnlTitulo1Layout = new javax.swing.GroupLayout(pnlTitulo1);
        pnlTitulo1.setLayout(pnlTitulo1Layout);
        pnlTitulo1Layout.setHorizontalGroup(
            pnlTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitulo1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitulo1Layout.setVerticalGroup(
            pnlTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitulo1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlDatos1.setBackground(new java.awt.Color(255, 255, 255));

        lblCodigo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo1.setText("Código:");

        lblTelefono1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefono1.setText("Teléfono:");

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre1.setText("Nombre:");

        lblCorreo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCorreo1.setText("Correo:");

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        txtCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatos1Layout = new javax.swing.GroupLayout(pnlDatos1);
        pnlDatos1.setLayout(pnlDatos1Layout);
        pnlDatos1Layout.setHorizontalGroup(
            pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDatos1Layout.createSequentialGroup()
                        .addComponent(lblCodigo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatos1Layout.createSequentialGroup()
                        .addComponent(lblTelefono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono1)))
                .addGap(18, 18, 18)
                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatos1Layout.createSequentialGroup()
                        .addComponent(lblCorreo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo1)
                        .addGap(6, 6, 6))
                    .addGroup(pnlDatos1Layout.createSequentialGroup()
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre1)))
                .addContainerGap())
        );
        pnlDatos1Layout.setVerticalGroup(
            pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo1)
                    .addComponent(lblNombre1)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo1)
                    .addComponent(lblTelefono1)
                    .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlBotones1.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar1.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setText("Guardar");
        btnGuardar1.setFocusPainted(false);
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnNuevo1.setBackground(new java.awt.Color(102, 102, 102));
        btnNuevo1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNuevo1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo1.setText("Nuevo");
        btnNuevo1.setFocusPainted(false);
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setFocusPainted(false);

        btnActualizar1.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnActualizar1.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar1.setText("Actualizar");
        btnActualizar1.setFocusPainted(false);
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        btnBuscar1.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("Buscar");
        btnBuscar1.setFocusPainted(false);

        javax.swing.GroupLayout pnlBotones1Layout = new javax.swing.GroupLayout(pnlBotones1);
        pnlBotones1.setLayout(pnlBotones1Layout);
        pnlBotones1Layout.setHorizontalGroup(
            pnlBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotones1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotones1Layout.setVerticalGroup(
            pnlBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotones1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Correo"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jInternalFrame3.setClosable(true);
        jInternalFrame3.setIconifiable(true);
        jInternalFrame3.setMaximizable(true);
        jInternalFrame3.setResizable(true);
        jInternalFrame3.setTitle("Gestion de Clientes");

        pnlTitulo2.setBackground(new java.awt.Color(0, 51, 255));
        pnlTitulo2.setForeground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestion de Clientes");

        javax.swing.GroupLayout pnlTitulo2Layout = new javax.swing.GroupLayout(pnlTitulo2);
        pnlTitulo2.setLayout(pnlTitulo2Layout);
        pnlTitulo2Layout.setHorizontalGroup(
            pnlTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitulo2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitulo2Layout.setVerticalGroup(
            pnlTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitulo2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlDatos2.setBackground(new java.awt.Color(255, 255, 255));

        lblCodigo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo2.setText("Código:");

        lblTelefono2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefono2.setText("Teléfono:");

        lblNombre2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre2.setText("Nombre:");

        lblCorreo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCorreo2.setText("Correo:");

        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });

        txtCorreo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatos2Layout = new javax.swing.GroupLayout(pnlDatos2);
        pnlDatos2.setLayout(pnlDatos2Layout);
        pnlDatos2Layout.setHorizontalGroup(
            pnlDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDatos2Layout.createSequentialGroup()
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatos2Layout.createSequentialGroup()
                        .addComponent(lblTelefono2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono2)))
                .addGap(18, 18, 18)
                .addGroup(pnlDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatos2Layout.createSequentialGroup()
                        .addComponent(lblCorreo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo2)
                        .addGap(6, 6, 6))
                    .addGroup(pnlDatos2Layout.createSequentialGroup()
                        .addComponent(lblNombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre2)))
                .addContainerGap())
        );
        pnlDatos2Layout.setVerticalGroup(
            pnlDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo2)
                    .addComponent(lblNombre2)
                    .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo2)
                    .addComponent(lblTelefono2)
                    .addComponent(txtCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlBotones2.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar2.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar2.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar2.setText("Guardar");
        btnGuardar2.setFocusPainted(false);
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        btnNuevo2.setBackground(new java.awt.Color(102, 102, 102));
        btnNuevo2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNuevo2.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo2.setText("Nuevo");
        btnNuevo2.setFocusPainted(false);
        btnNuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo2ActionPerformed(evt);
            }
        });

        btnEliminar2.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar2.setText("Eliminar");
        btnEliminar2.setFocusPainted(false);

        btnActualizar2.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnActualizar2.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar2.setText("Actualizar");
        btnActualizar2.setFocusPainted(false);
        btnActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar2ActionPerformed(evt);
            }
        });

        btnBuscar2.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar2.setText("Buscar");
        btnBuscar2.setFocusPainted(false);

        javax.swing.GroupLayout pnlBotones2Layout = new javax.swing.GroupLayout(pnlBotones2);
        pnlBotones2.setLayout(pnlBotones2Layout);
        pnlBotones2Layout.setHorizontalGroup(
            pnlBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotones2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotones2Layout.setVerticalGroup(
            pnlBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotones2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Correo"
            }
        ));
        jScrollPane2.setViewportView(jTable4);

        jInternalFrame4.setClosable(true);
        jInternalFrame4.setIconifiable(true);
        jInternalFrame4.setMaximizable(true);
        jInternalFrame4.setResizable(true);
        jInternalFrame4.setTitle("Gestion de Clientes");

        pnlTitulo3.setBackground(new java.awt.Color(0, 51, 255));
        pnlTitulo3.setForeground(new java.awt.Color(51, 51, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestion de Clientes");

        javax.swing.GroupLayout pnlTitulo3Layout = new javax.swing.GroupLayout(pnlTitulo3);
        pnlTitulo3.setLayout(pnlTitulo3Layout);
        pnlTitulo3Layout.setHorizontalGroup(
            pnlTitulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitulo3Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitulo3Layout.setVerticalGroup(
            pnlTitulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitulo3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlDatos3.setBackground(new java.awt.Color(255, 255, 255));

        lblCodigo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo3.setText("Código:");

        lblTelefono3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefono3.setText("Teléfono:");

        lblNombre3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre3.setText("Nombre:");

        lblCorreo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCorreo3.setText("Correo:");

        txtNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre3ActionPerformed(evt);
            }
        });

        txtCorreo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatos3Layout = new javax.swing.GroupLayout(pnlDatos3);
        pnlDatos3.setLayout(pnlDatos3Layout);
        pnlDatos3Layout.setHorizontalGroup(
            pnlDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDatos3Layout.createSequentialGroup()
                        .addComponent(lblCodigo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatos3Layout.createSequentialGroup()
                        .addComponent(lblTelefono3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono3)))
                .addGap(18, 18, 18)
                .addGroup(pnlDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatos3Layout.createSequentialGroup()
                        .addComponent(lblCorreo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo3)
                        .addGap(6, 6, 6))
                    .addGroup(pnlDatos3Layout.createSequentialGroup()
                        .addComponent(lblNombre3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre3)))
                .addContainerGap())
        );
        pnlDatos3Layout.setVerticalGroup(
            pnlDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo3)
                    .addComponent(lblNombre3)
                    .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo3)
                    .addComponent(lblTelefono3)
                    .addComponent(txtCorreo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlBotones3.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar3.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar3.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar3.setText("Guardar");
        btnGuardar3.setFocusPainted(false);
        btnGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar3ActionPerformed(evt);
            }
        });

        btnNuevo3.setBackground(new java.awt.Color(102, 102, 102));
        btnNuevo3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNuevo3.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo3.setText("Nuevo");
        btnNuevo3.setFocusPainted(false);
        btnNuevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo3ActionPerformed(evt);
            }
        });

        btnEliminar3.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar3.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar3.setText("Eliminar");
        btnEliminar3.setFocusPainted(false);

        btnActualizar3.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnActualizar3.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar3.setText("Actualizar");
        btnActualizar3.setFocusPainted(false);
        btnActualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar3ActionPerformed(evt);
            }
        });

        btnBuscar3.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscar3.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar3.setText("Buscar");
        btnBuscar3.setFocusPainted(false);

        javax.swing.GroupLayout pnlBotones3Layout = new javax.swing.GroupLayout(pnlBotones3);
        pnlBotones3.setLayout(pnlBotones3Layout);
        pnlBotones3Layout.setHorizontalGroup(
            pnlBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotones3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNuevo3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotones3Layout.setVerticalGroup(
            pnlBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotones3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Correo"
            }
        ));
        jScrollPane4.setViewportView(jTable5);

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame3Layout.createSequentialGroup()
                    .addGap(0, 297, Short.MAX_VALUE)
                    .addComponent(jInternalFrame4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 297, Short.MAX_VALUE)))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Correo"
            }
        ));
        jScrollPane5.setViewportView(jTable6);

        pnlTitulo4.setBackground(new java.awt.Color(0, 51, 255));
        pnlTitulo4.setForeground(new java.awt.Color(51, 51, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestion de Clientes");

        javax.swing.GroupLayout pnlTitulo4Layout = new javax.swing.GroupLayout(pnlTitulo4);
        pnlTitulo4.setLayout(pnlTitulo4Layout);
        pnlTitulo4Layout.setHorizontalGroup(
            pnlTitulo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitulo4Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitulo4Layout.setVerticalGroup(
            pnlTitulo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitulo4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlBotones4.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar4.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar4.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar4.setText("Guardar");
        btnGuardar4.setFocusPainted(false);
        btnGuardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar4ActionPerformed(evt);
            }
        });

        btnNuevo4.setBackground(new java.awt.Color(102, 102, 102));
        btnNuevo4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNuevo4.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo4.setText("Nuevo");
        btnNuevo4.setFocusPainted(false);
        btnNuevo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo4ActionPerformed(evt);
            }
        });

        btnEliminar4.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar4.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar4.setText("Eliminar");
        btnEliminar4.setFocusPainted(false);
        btnEliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar4ActionPerformed(evt);
            }
        });

        btnActualizar4.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnActualizar4.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar4.setText("Actualizar");
        btnActualizar4.setFocusPainted(false);
        btnActualizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar4ActionPerformed(evt);
            }
        });

        btnBuscar4.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscar4.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar4.setText("Buscar");
        btnBuscar4.setFocusPainted(false);
        btnBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotones4Layout = new javax.swing.GroupLayout(pnlBotones4);
        pnlBotones4.setLayout(pnlBotones4Layout);
        pnlBotones4Layout.setHorizontalGroup(
            pnlBotones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotones4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlBotones4Layout.setVerticalGroup(
            pnlBotones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotones4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlBotones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlDatos4.setBackground(new java.awt.Color(255, 255, 255));

        lblCodigo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo4.setText("Código:");

        lblTelefono4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefono4.setText("Teléfono:");

        lblNombre4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre4.setText("Nombre:");

        lblCorreo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCorreo4.setText("Correo:");

        txtNombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre4ActionPerformed(evt);
            }
        });

        txtCorreo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatos4Layout = new javax.swing.GroupLayout(pnlDatos4);
        pnlDatos4.setLayout(pnlDatos4Layout);
        pnlDatos4Layout.setHorizontalGroup(
            pnlDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDatos4Layout.createSequentialGroup()
                        .addComponent(lblCodigo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatos4Layout.createSequentialGroup()
                        .addComponent(lblTelefono4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono4)))
                .addGap(18, 18, 18)
                .addGroup(pnlDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatos4Layout.createSequentialGroup()
                        .addComponent(lblCorreo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo4)
                        .addGap(6, 6, 6))
                    .addGroup(pnlDatos4Layout.createSequentialGroup()
                        .addComponent(lblNombre4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre4)))
                .addContainerGap())
        );
        pnlDatos4Layout.setVerticalGroup(
            pnlDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo4)
                    .addComponent(lblNombre4)
                    .addComponent(txtCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo4)
                    .addComponent(lblTelefono4)
                    .addComponent(txtCorreo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 295, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 295, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlDatos4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlBotones4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5)
                        .addComponent(pnlTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(4, 4, 4)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 279, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 280, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnlDatos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnlBotones4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Cliente c = new Cliente(0, txtNombre.getText(), txtTelefono.getText(), txtCorreo.getText());
   if (controller.guardarCliente(c)) {
       JOptionPane.showMessageDialog(this, "Cliente guardado.");
       cargarTabla();
       limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed
}
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         if (txtCodigo.getText().isEmpty()) {
       JOptionPane.showMessageDialog(this, "Seleccione un cliente de la tabla.");
       return;
   }
   Cliente c = new Cliente(
           Integer.parseInt(txtCodigo.getText()),
           txtNombre.getText(), txtTelefono.getText(), txtCorreo.getText());
   if (controller.actualizarCliente(c)) {
       JOptionPane.showMessageDialog(this, "Cliente actualizado.");
       cargarTabla();
       limpiarCampos();
    }//GEN-LAST:event_btnActualizarActionPerformed
    }
    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtCorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void txtCorreo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo2ActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void btnNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevo2ActionPerformed

    private void btnActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar2ActionPerformed

    private void txtNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre3ActionPerformed

    private void txtCorreo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo3ActionPerformed

    private void btnGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar3ActionPerformed

    private void btnNuevo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevo3ActionPerformed

    private void btnActualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar3ActionPerformed

    private void btnGuardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar4ActionPerformed
        Cliente c = new Cliente(0, txtNombre4.getText(), txtTelefono4.getText(), txtCorreo4.getText());
       if (controller.guardarCliente(c)) {
           JOptionPane.showMessageDialog(this, "Cliente guardado.");
           cargarTabla();
           limpiarCampos();
       }
    }//GEN-LAST:event_btnGuardar4ActionPerformed

    private void btnNuevo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo4ActionPerformed
     limpiarCampos();      
    }//GEN-LAST:event_btnNuevo4ActionPerformed

    private void btnActualizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar4ActionPerformed
        if (txtCodigo4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente de la tabla.");
            return;
        }
        Cliente c = new Cliente(
                Integer.parseInt(txtCodigo4.getText()),
                txtNombre4.getText(), txtTelefono4.getText(), txtCorreo4.getText());
        if (controller.actualizarCliente(c)) {
            JOptionPane.showMessageDialog(this, "Cliente actualizado.");
            cargarTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_btnActualizar4ActionPerformed

    private void txtNombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre4ActionPerformed

    private void txtCorreo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo4ActionPerformed

    private void btnBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar4ActionPerformed
if (txtCodigo4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un código para buscar.");
            return;
        }
        Cliente c = controller.buscarClientePorId(Integer.parseInt(txtCodigo4.getText()));
        if (c != null) {
            txtNombre4.setText(c.getNombre());
            txtTelefono4.setText(c.getTelefono());
            txtCorreo4.setText(c.getEmail());
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar4ActionPerformed

    private void btnEliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar4ActionPerformed
if (txtCodigo4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente de la tabla.");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "¿Eliminar cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (controller.eliminarCliente(Integer.parseInt(txtCodigo4.getText()))) {
                JOptionPane.showMessageDialog(this, "Cliente eliminado.");
                cargarTabla();
                limpiarCampos();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnActualizar3;
    private javax.swing.JButton btnActualizar4;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnBuscar4;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnEliminar3;
    private javax.swing.JButton btnEliminar4;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnGuardar3;
    private javax.swing.JButton btnGuardar4;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnNuevo2;
    private javax.swing.JButton btnNuevo3;
    private javax.swing.JButton btnNuevo4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo3;
    private javax.swing.JLabel lblCodigo4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblCorreo4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JLabel lblTelefono2;
    private javax.swing.JLabel lblTelefono3;
    private javax.swing.JLabel lblTelefono4;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlBotones1;
    private javax.swing.JPanel pnlBotones2;
    private javax.swing.JPanel pnlBotones3;
    private javax.swing.JPanel pnlBotones4;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlDatos1;
    private javax.swing.JPanel pnlDatos2;
    private javax.swing.JPanel pnlDatos3;
    private javax.swing.JPanel pnlDatos4;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlTitulo1;
    private javax.swing.JPanel pnlTitulo2;
    private javax.swing.JPanel pnlTitulo3;
    private javax.swing.JPanel pnlTitulo4;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtCodigo4;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtCorreo2;
    private javax.swing.JTextField txtCorreo3;
    private javax.swing.JTextField txtCorreo4;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtNombre4;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtTelefono3;
    private javax.swing.JTextField txtTelefono4;
    // End of variables declaration//GEN-END:variables
}
