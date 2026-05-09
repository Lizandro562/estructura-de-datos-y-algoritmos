/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author Acer
 */
import java.util.ArrayList;
import java.util.Scanner;

public class codigo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> ventas = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE VENTAS =====");
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese nombre del cliente: ");
                    String cliente = entrada.nextLine();

                    System.out.print("Ingrese producto: ");
                    String producto = entrada.nextLine();

                    System.out.print("Ingrese cantidad: ");
                    int cantidad = entrada.nextInt();

                    System.out.print("Ingrese precio: ");
                    double precio = entrada.nextDouble();

                    double total = cantidad * precio;

                    String venta = "Cliente: " + cliente +
                                   " | Producto: " + producto +
                                   " | Cantidad: " + cantidad +
                                   " | Total: S/ " + total;

                    ventas.add(venta);

                    System.out.println("Venta registrada correctamente.");
                    break;

                case 2:

                    System.out.println("\n===== LISTA DE VENTAS =====");

                    if (ventas.isEmpty()) {

                        System.out.println("No hay ventas registradas.");

                    } else {

                        for (String v : ventas) {
                            System.out.println(v);
                        }
                    }

                    break;

                case 3:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);

        entrada.close();
    }
}
