/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasePrincipal;

/**
 *
 * @author Acer
 */
public class Main {

    public static void main(String[] args) {

        ArchivoCliente modelo = new ArchivoCliente("Archivo1");

        VentanaPrincipal vista = new VentanaPrincipal();

        ControladorArchivo controlador =
                new ControladorArchivo(modelo, vista);

        vista.setVisible(true);
    }
}
