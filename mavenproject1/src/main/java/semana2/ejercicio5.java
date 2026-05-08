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
public class ejercicio5 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        
        // Memoria ANTES
        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        
        // Tiempo ANTES
        long inicio = System.nanoTime();
        
        // Código a evaluar
        int[] vector = new int[100];
        for (int i = 0; i < 10; i++) {
            vector[i] = rand.nextInt(1000);
        }
        
        // Tiempo DESPUÉS
        long fin = System.nanoTime();
        
        // Memoria DESPUÉS
        long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();
        
        System.out.println("Tiepo: " + (fin - inicio) + " ns");
        System.out.println("Memoria: " + (memoriaDespues - memoriaAntes) + " bytes");
    }
}
