/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**Este programa utiliza el bucle for para crear números que estan en el rango 
 * del 1 al 20, para luego inprimir solo los  números pares
 *
 * @author Acer
 */
public class ejercicio2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
