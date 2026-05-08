/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseVista;

/**
 *
 * @author Acer
 */
import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    public JButton btnProcesar;
    public JTextArea areaTexto;
    public JScrollPane scroll;

    public VentanaPrincipal() {

        setTitle("Sistema de Procesamiento");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        btnProcesar = new JButton("Procesar archivo");
        btnProcesar.setBounds(150, 20, 180, 40);
        add(btnProcesar);

        areaTexto = new JTextArea();
        scroll = new JScrollPane(areaTexto);
        scroll.setBounds(40, 90, 400, 170);
        add(scroll);
    }
}