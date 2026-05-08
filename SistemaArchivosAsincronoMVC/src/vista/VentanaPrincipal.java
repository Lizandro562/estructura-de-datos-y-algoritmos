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
    public JTextArea areaTexto;
    public JScrollPane scroll;
    public JProgressBar barra;

    public VentanaPrincipal() {

        setTitle("Sistema Asíncrono");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        btnProcesar = new JButton("Procesar archivo");
        btnProcesar.setBounds(150, 20, 180, 40);
        add(btnProcesar);

        barra = new JProgressBar();
        barra.setBounds(50, 80, 380, 30);
        barra.setMinimum(0);
        barra.setMaximum(100);
        add(barra);

        areaTexto = new JTextArea();

        scroll = new JScrollPane(areaTexto);
        scroll.setBounds(40, 130, 400, 170);

        add(scroll);
    }
}
