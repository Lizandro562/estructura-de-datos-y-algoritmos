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

public class VentanaPrincipal extends JFrame {

    public JButton btnProcesar;
    public JButton btnCancelar;

    public JTextArea areaTexto;

    public JScrollPane scroll;

    public JProgressBar barra;

    public JLabel lblEstado;

    public VentanaPrincipal() {

        setTitle("Sistema Final Mejorado");
        setSize(600, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        setLocationRelativeTo(null);

        btnProcesar = new JButton("Procesar");
        btnProcesar.setBounds(80, 20, 150, 40);
        add(btnProcesar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(330, 20, 150, 40);
        add(btnCancelar);

        barra = new JProgressBar();
        barra.setBounds(50, 90, 480, 30);
        barra.setMinimum(0);
        barra.setMaximum(100);
        add(barra);

        lblEstado = new JLabel("Estado: Esperando");
        lblEstado.setBounds(50, 130, 300, 30);
        add(lblEstado);

        areaTexto = new JTextArea();

        scroll = new JScrollPane(areaTexto);

        scroll.setBounds(50, 180, 480, 220);

        add(scroll);
    }
}