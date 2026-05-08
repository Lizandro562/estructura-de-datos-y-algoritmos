/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**ESte programa usa el bucle for para crear numeros que esten en el rango de 1 al 50
 * y utiliza la variable suma para inprimir la suma de allas
 *
 * @author Acer
 */
public class ejercicio3 {
    public static void main(String[] args) {
        
        int suma = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
                suma += i;
            } 
        }
        System.out.println("\nLa suma de los primeros 50 numeros pares es:" +suma);
    }
}
