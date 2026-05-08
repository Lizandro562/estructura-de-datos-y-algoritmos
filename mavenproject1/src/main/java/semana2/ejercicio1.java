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
public class ejercicio1 {
    public static void main(String[] args) {
        //Tiempo de inicio
        long fin = System.nanoTime();
        //100 elementos
        int[] vector = new int[100];
        Random random = new Random();
        //Llenar el vector de forma aleatoria
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(1000); //Numeros aleatorios entre 0 a 999
            
        }
        //Capturar tiempo de fin
        long inicio = System.nanoTime();
        //Clacular e imprimir el tiempo trascurrido
        long Tiempototal = fin - inicio;
        System.out.println("Tiempo de ejecucion:" + Tiempototal + "ns");
    }
}
