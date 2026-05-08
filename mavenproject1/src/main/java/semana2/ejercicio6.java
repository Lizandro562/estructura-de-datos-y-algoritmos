/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**
 *
 * @author Acer
 */
import java.util.Random;
public class ejercicio6 {
    public static void main(String[] args) {
        long inicio = System.nanoTime();
        int[] vector = new int[100];
        
        Random random = new Random();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(1000);
        }
        int mayor = vector[0];
        
        for (int i = 1; i < vector.length; i++) {
            if (vector[i]>mayor) {
                mayor = vector[i];
            }
        }
        long fin = System.nanoTime();
        
        long Tiempototal = fin - inicio;
        
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Tiempo de ejecucion: " + Tiempototal + "ns");
    }
}
