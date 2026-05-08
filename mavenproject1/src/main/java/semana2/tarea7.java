/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Recorrido simple y recorrido con condicion
 *
 * @author Acer
 */
import java.util.Random;
public class tarea7 {
    public static void main(String[] args) {
        Random r = new Random();
        
        int[] arr = new int[1000];
        
        //llenar arreglo
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        //Recorrido simple
        for (int i = 0; i < arr.length; i++) {
            
        }
        //recorrido con condicion
        
        int contador = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 50) {
                contador++;
            }
        }
        System.out.println("Elementos mayores a 50: " + contador);
    }
}
//El segundo rrecorrido utiliza mayor procesador que el otro, ya que al recorrer el arreglo
//realiza compraciones y operaciones adicionales. Esto incrementa el numero de intruccines
//que se ejecutaran en el programa