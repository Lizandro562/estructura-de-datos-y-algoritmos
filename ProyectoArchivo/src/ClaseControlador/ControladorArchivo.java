/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseControlador;

/**
 *
 * @author Acer
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorArchivo implements ActionListener {

    private ArchivoCliente Modelo;
    private VentanaPrincipal Vista;

    public ControladorArchivo(ArchivoCliente modelo, VentanaPrincipal vista) {

        this.Modelo = modelo;
        this.Vista = vista;

        this.Vista.btnProcesar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        procesarArchivo();
    }

    public void procesarArchivo() {

        try {

            Modelo.setEstado("Descargando");

            Vista.areaTexto.append("Descargando archivo...\n");
            Thread.sleep(3000);

            Modelo.setEstado("Validando");

            Vista.areaTexto.append("Validando archivo...\n");
            Thread.sleep(3000);

            Modelo.setEstado("Procesando");

            Vista.areaTexto.append("Procesando archivo...\n");
            Thread.sleep(3000);

            Modelo.setEstado("Finalizado");

            Vista.areaTexto.append("Proceso finalizado.\n\n");

        } catch (InterruptedException ex) {

            Vista.areaTexto.append("Error en el proceso.\n");
        }
    }
}