/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**While: adivinar un número, el usuario debe de ingresar un número determinado
 * para poder salir del bucle
 *
 * @author Acer
 */
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 6;
        int num = 0;
        
        while(num != secreto) {
            System.out.print("Adivina el numero secreto: ");
            num = sc.nextInt();
            
            if (num != secreto) {
                System.out.println("Incorrecto ,ingresa otra vez");
            }
        }
        System.out.println("!Correcto, acertaste el numero: ");
    }
}
