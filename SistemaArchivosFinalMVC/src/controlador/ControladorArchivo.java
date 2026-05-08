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

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ControladorArchivo implements ActionListener {

    private ArchivoCliente modelo;

    private VentanaPrincipal vista;

    private SwingWorker<Void, String> worker;

    public ControladorArchivo(
            ArchivoCliente modelo,
            VentanaPrincipal vista) {

        this.modelo = modelo;

        this.vista = vista;

        vista.btnProcesar.addActionListener(this);

        vista.btnCancelar.addActionListener(e -> cancelarProceso());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        iniciarProceso();
    }

    public void iniciarProceso() {

        vista.btnProcesar.setEnabled(false);

        worker = new SwingWorker<Void, String>() {

            @Override
            protected Void doInBackground() throws Exception {

                procesarEtapa(
                        "Descargando archivos...",
                        25);

                procesarEtapa(
                        "Validando información...",
                        50);

                procesarEtapa(
                        "Procesando datos...",
                        75);

                procesarEtapa(
                        "Generando resultados...",
                        100);

                return null;
            }

            public void procesarEtapa(
                    String mensaje,
                    int progreso)
                    throws Exception {

                if (isCancelled()) {

                    return;
                }

                publish(mensaje);

                Thread.sleep(3000);

                vista.barra.setValue(progreso);

                vista.lblEstado.setText(
                        "Estado: " + mensaje);

                Random random = new Random();

                int error = random.nextInt(10);

                if (error == 5) {

                    publish(
                            "Error simulado en el proceso");
                }
            }

            @Override
            protected void process(
                    java.util.List<String> chunks) {

                for (String mensaje : chunks) {

                    vista.areaTexto.append(
                            mensaje + "\n");
                }
            }

            @Override
            protected void done() {

                vista.btnProcesar.setEnabled(true);

                if (isCancelled()) {

                    vista.areaTexto.append(
                            "Proceso cancelado.\n");

                    vista.lblEstado.setText(
                            "Estado: Cancelado");

                } else {

                    vista.areaTexto.append(
                            "\nResumen Final\n");

                    vista.areaTexto.append(
                            "Archivos procesados: 5\n");

                    vista.areaTexto.append(
                            "Exitosos: 4\n");

                    vista.areaTexto.append(
                            "Fallidos: 1\n");

                    vista.areaTexto.append(
                            "Tiempo total: 12 segundos\n");

                    vista.lblEstado.setText(
                            "Estado: Finalizado");
                }
            }
        };

        worker.execute();
    }

    public void cancelarProceso() {

        if (worker != null &&
                !worker.isDone()) {

            worker.cancel(true);
        }
    }
}
