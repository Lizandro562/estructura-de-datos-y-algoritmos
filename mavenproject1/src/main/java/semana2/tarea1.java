/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Comparacion entre un vector grande y uno pequeño
 *
 * @author Acer
 */
import java.util.Random;
public class tarea1 {
    public static void main(String[] args) {
        Random r = new Random();
        
        long inicio = System.nanoTime();
        
        int[] vector = new int[10];//SE cambia de valor
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(1000);
        }
        long fin = System.nanoTime();
        
        System.out.println("Tiempo: " + (fin - inicio) + "ns.");  
    }
}