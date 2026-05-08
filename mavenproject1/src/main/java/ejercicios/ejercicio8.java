/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**While: pide al usuario que ingrese solo números positivos, el programa se detiene
 * cuando el usuario ingrese un número negativo
 *
 * @author Acer
 */
import java.util.Scanner;//Lee datos 
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        while(num >= 0) {
            System.out.print("Ingrese numeros . ");
            num = sc.nextInt();
        }
        System.out.println("Programa terminado(ingresaste un numero negativo): ");
    }
}
