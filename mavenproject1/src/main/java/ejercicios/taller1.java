/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**HotelCaminoVIP
 *
 * @author Acer
 */
import java.util.Scanner;//
public class taller1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bariables principales de la matriz
        int[][] Hotel = new int[3][4];
        int opcion;
        
        //Iniciamos el programa con un menu de opciones con el bucle do while
        
        //El menu se repetira hasta que el usuario alija salir del rpograma
        do {
            System.out.println("\n -------HotelCaminoVIP--------- ");
            System.out.println("1.Mostrar habitaciones disponibles. ");
            System.out.println("2.Ocupar Habitacion. ");
            System.out.println("3.Encontrar habitacion libre. ");
            System.out.println("4.Salir. ");
            System.out.print("Elige una opcion.");
            opcion = sc.nextByte();
            //Se muestran las opciones que tenemos para el cliente
            
            //Se ejecutan diferentes acciones segun el usuario elija
            switch (opcion) {
                case 1:
                    System.out.println("\n Habitaciones (0= libres):");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Piso "+ (i+1) +": ");
                        for (int j = 0; j < 4; j++) {
                            System.out.print(Hotel[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el numero de piso que quieres alojarte(0-2): ");
                    int piso = sc.nextInt();
                    System.out.print("Ingrese el numero de habitacion(0-3): ");
                    int habitacion = sc.nextInt();
                    
                    if (piso >= 0&&piso<3&&habitacion>=0&&habitacion<4) {
                        if (Hotel[piso][habitacion] == 0) {
                            Hotel[piso][habitacion] = 1;
                            System.out.println("Usted se registro correctamente.");
                        }else{
                            System.out.println("Habitaciones no disponible.");
                        }
                    }else{
                        System.out.println("Datos invalidos.");
                    }
                    //Hotel actualizado
                    System.out.println("Hotel actualizado.");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Piso "+i+":");
                        for (int j = 0; j < 4; j++) {
                            System.out.print(Hotel[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Usted se registro correctamente.");
                    break;
                case 3:
                    boolean encontrado = false;
                    
                    for (int i = 0; i < Hotel.length && !encontrado; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (Hotel[i][j] == 0) {
                                System.out.println("La primera habitacion libre esta en el piso " + i + " , habitacion " + j);
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if(!encontrado) {
                        System.out.println("No hay habitaciones disponible.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.....");
                    break;
                default:
                    System.out.println("OPcion invalida.");
                
            }
        }while(opcion != 4);
        sc.close();
    }
}
//Uso de matrices → 9/10
//Uso de bucles → 9/10
//Uso de condicionales → 8.5/10
//Estructura general → 8/10
//Evita duplicar lógica,Usa .length en lugar de números fijos,(Bonus) Evita mensajes incoherentes.