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

import javax.swing.SwingWorker;
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

        vista.btnProcesar.setEnabled(false);

        SwingWorker<Void, Void> worker =
                new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() throws Exception {

                modelo.setEstado("Descargando");

                vista.areaTexto.append(
                        "Descargando archivo... 25%\n");

                Thread.sleep(3000);

                vista.barra.setValue(25);

                modelo.setEstado("Validando");

                vista.areaTexto.append(
                        "Validando archivo... 50%\n");

                Thread.sleep(3000);

                vista.barra.setValue(50);

                modelo.setEstado("Procesando");

                vista.areaTexto.append(
                        "Procesando archivo... 75%\n");

                Thread.sleep(3000);

                vista.barra.setValue(75);

                modelo.setEstado("Finalizado");

                vista.areaTexto.append(
                        "Proceso finalizado... 100%\n");

                vista.barra.setValue(100);

                return null;
            }

            @Override
            protected void done() {

                vista.btnProcesar.setEnabled(true);
            }
        };

        worker.execute();
    }
}
