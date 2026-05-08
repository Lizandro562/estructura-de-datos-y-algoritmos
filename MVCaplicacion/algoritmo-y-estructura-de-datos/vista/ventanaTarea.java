/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Acer
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class ventanaTarea extends JFrame{
    public JTextField txtCodigo, txtTitulo, txtCurso, txtFecha;
    public JComboBox<String> cbEstado;
    public JButton btnRegistrar, btnEliminar, btnBuscar;
    public JTable tablaTareas;
    public DefaultTableModel modeloTabla;

    public ventanaTarea() {
        setTitle("Gestión de Tareas - MVC");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Panel de entrada de datos (GridLayout)
        JPanel pnlDatos = new JPanel(new GridLayout(6, 2, 5, 5));
        pnlDatos.add(new JLabel(" Código:"));
        txtCodigo = new JTextField(); pnlDatos.add(txtCodigo);
        
        pnlDatos.add(new JLabel(" Título:"));
        txtTitulo = new JTextField(); pnlDatos.add(txtTitulo);
        
        pnlDatos.add(new JLabel(" Curso:"));
        txtCurso = new JTextField(); pnlDatos.add(txtCurso);
        
        pnlDatos.add(new JLabel(" Fecha entrega:"));
        txtFecha = new JTextField(); pnlDatos.add(txtFecha);
        
        pnlDatos.add(new JLabel(" Estado:"));
        cbEstado = new JComboBox<>(new String[]{"Pendiente", "En proceso", "Completada"});
        pnlDatos.add(cbEstado);

        btnRegistrar = new JButton("Registrar Tarea");
        pnlDatos.add(btnRegistrar);
        
        add(pnlDatos, BorderLayout.NORTH);

        // Tabla para mostrar tareas
        modeloTabla = new DefaultTableModel(new Object[]{"ID", "Título", "Curso", "Fecha", "Estado"}, 0);
        tablaTareas = new JTable(modeloTabla);
        add(new JScrollPane(tablaTareas), BorderLayout.CENTER);

        // Botones de acción sur
        JPanel pnlBotones = new JPanel();
        btnBuscar = new JButton("Buscar");
        btnEliminar = new JButton("Eliminar");
        pnlBotones.add(btnBuscar);
        pnlBotones.add(btnEliminar);
        add(pnlBotones, BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
    }
}
