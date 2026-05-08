/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Acer
 */
import modelo.ArchivoCliente;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorArchivo implements ActionListener {

    private ArchivoCliente modelo;
    private VentanaPrincipal vista;

    public ControladorArchivo(
            ArchivoCliente modelo,
            VentanaPrincipal vista) {

        this.modelo = modelo;
        this.vista = vista;

        this.vista.btnProcesar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        procesarArchivo();
    }

    public void procesarArchivo() {

        try {

            modelo.setEstado("Descargando");

            vista.areaTexto.append(
                    "Descargando archivo...\n");

            Thread.sleep(3000);

            modelo.setEstado("Validando");

            vista.areaTexto.append(
                    "Validando archivo...\n");

            Thread.sleep(3000);

            modelo.setEstado("Procesando");

            vista.areaTexto.append(
                    "Procesando archivo...\n");

            Thread.sleep(3000);

            modelo.setEstado("Finalizado");

            vista.areaTexto.append(
                    "Proceso finalizado.\n\n");

        } catch (InterruptedException ex) {

            vista.areaTexto.append(
                    "Error en el proceso.\n");
        }
    }
}