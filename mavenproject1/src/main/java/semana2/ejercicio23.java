/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Medir el tiempo en nano segundos
 *
 * @author Acer
 */
import java.util.Random;
public class ejercicio23 {
    public static void main(String[] args) {
        //Tiempor de inicio
        Random r = new Random();
        long inicio = System.nanoTime();
        int[] vector = new int[100];
        //Llenar el vector 
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(1000);
        }
        //Fin del tiempo
        long fin = System.nanoTime();
        
        // Tiempo total
        
        long TiempoTotal = fin - inicio;
        
        //Resultado de la ejecucion
        
        System.out.println("Tiempo de ejecucion: " + TiempoTotal + "ns");
    }
}
