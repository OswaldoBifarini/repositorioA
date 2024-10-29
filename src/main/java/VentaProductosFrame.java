/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ventaproductos;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegistroVentasFrame extends javax.swing.JFrame {

     // Componentes de la interfaz gráfica
    private JTextField txtCedula, txtNombres, txtEmail, txtTelefono;
    private JTextField txtCodigo, txtNombreProducto, txtStock, txtPrecioUnitario, txtCantidad, txtPrecioTotal;
    private JTextField txtSubtotal, txtIVA, txtTotal;
    private JButton btnRegistrar, btnVisualizar, btnLimpiar;

    // Listas para almacenar clientes y productos
    private DefaultListModel<Cliente> listaClientes = new DefaultListModel<>();
    private DefaultListModel<Producto> listaProductos = new DefaultListModel<>();

    public RegistroVentasFrame() {
        initComponents();
    }

    // Configuración de la ventana
        setTitle("Registro de Ventas");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Inicialización de componentes
        initComponents();

        // Mostrar la ventana
        setVisible(true);
    }

    private void initComponents() {
        // Componentes de datos de clientes
        JLabel lblCedula = new JLabel("Cédula:");
        lblCedula.setBounds(20, 20, 100, 25);
        add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setBounds(140, 20, 200, 25);
        add(txtCedula);

        JLabel lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(20, 60, 100, 25);
        add(lblNombres);

        txtNombres = new JTextField();
        txtNombres.setBounds(140, 60, 200, 25);
        add(txtNombres);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 100, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(140, 100, 200, 25);
        add(txtEmail);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(20, 140, 100, 25);
        add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(140, 140, 200, 25);
        add(txtTelefono);

        // Componentes de datos del producto
        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 180, 100, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(140, 180, 200, 25);
        add(txtCodigo);

        JLabel lblNombreProducto = new JLabel("Nombre Producto:");
        lblNombreProducto.setBounds(20, 220, 120, 25);
        add(lblNombreProducto);

        txtNombreProducto = new JTextField();
        txtNombreProducto.setBounds(140, 220, 200, 25);
        add(txtNombreProducto);

        JLabel lblStock = new JLabel("Stock:");
        lblStock.setBounds(20, 260, 100, 25);
        add(lblStock);

        txtStock = new JTextField();
        txtStock.setBounds(140, 260, 200, 25);
        add(txtStock);

        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        lblPrecioUnitario.setBounds(20, 300, 100, 25);
        add(lblPrecioUnitario);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(140, 300, 200, 25);
        add(txtPrecioUnitario);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(20, 340, 100, 25);
        add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(140, 340, 200, 25);
        add(txtCantidad);

        JLabel lblPrecioTotal = new JLabel("Precio Total:");
        lblPrecioTotal.setBounds(20, 380, 100, 25);
        add(lblPrecioTotal);

        txtPrecioTotal = new JTextField();
        txtPrecioTotal.setBounds(140, 380, 200, 25);
        txtPrecioTotal.setEditable(false);
        add(txtPrecioTotal);

        // Botones
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(20, 420, 100, 25);
        add(btnRegistrar);

        btnVisualizar = new JButton("Visualizar");
        btnVisualizar.setBounds(140, 420, 100, 25);
        add(btnVisualizar);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(260, 420, 100, 25);
        add(btnLimpiar);

        // Resultados de la compra
        JLabel lblSubtotal = new JLabel("Subtotal:");
        lblSubtotal.setBounds(20, 460, 100, 25);
        add(lblSubtotal);

        txtSubtotal = new JTextField();
        txtSubtotal.setBounds(140, 460, 200, 25);
        txtSubtotal.setEditable(false);
        add(txtSubtotal);

        JLabel lblIVA = new JLabel("IVA (15%):");
        lblIVA.setBounds(20, 500, 100, 25);
        add(lblIVA);

        txtIVA = new JTextField();
        txtIVA.setBounds(140, 500, 200, 25);
        txtIVA.setEditable(false);
        add(txtIVA);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(20, 540, 100, 25);
        add(lblTotal);

        txtTotal = new JTextField();
        txtTotal.setBounds(140, 540, 200, 25);
        txtTotal.setEditable(false);
        add(txtTotal);

        // Eventos
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarVenta();
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        // Implement
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
