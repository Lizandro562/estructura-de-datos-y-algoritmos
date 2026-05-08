/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**do While: este programa termina cuando el usuario ingresa un número positivo
 *
 * @author Acer
 */
import java.util.Scanner;//Lee datos
public class ejercicio13 {
    public static void main(String[] args) {//Da inicio al programa
        Scanner sc = new Scanner(System.in);//Lee datos del usuario
        int num;//Guarda los datos
        
        do {//Se ejecuta al menos una vez
            System.out.print("Enter positive number.");//Pedimos al usuario que ingrese un número
            num = sc.nextInt();//Se guarda los números ingrsados
        }while (num <= 0);//se repetira mientras siga la condicion
        System.out.println("valid number.");//Imprime cuando el usuario ingrese un numero positivo
    }
}
