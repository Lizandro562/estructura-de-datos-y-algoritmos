/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasarchivosmvc;

/**
 *
 * @author Acer
 */
import controlador.ControladorArchivo;
import modelo.ArchivoCliente;
import vista.VentanaPrincipal;

public class SistemasArchivosMVC {

    public static void main(String[] args) {

        ArchivoCliente modelo =
                new ArchivoCliente("Archivo1");

        VentanaPrincipal vista =
                new VentanaPrincipal();

        ControladorArchivo controlador =
                new ControladorArchivo(
                        modelo,
                        vista);

        vista.setVisible(true);
    }
}
