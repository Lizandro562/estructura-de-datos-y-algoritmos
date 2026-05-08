/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**numero menor de un numero aleatorio
 *
 * @author Acer
 */
import java.util.Random;//Random para generar números aleatorios
public class ejercicio11 {
    public static void main(String[] args) {//Da inicio al programa
        Random r = new Random();//Objeto para generar números aleatorios
        
        int[] arr = new int[10];//Arreglo de 10 posiciones para guardar números aleatorios
        
        for (int i = 0; i < arr.length; i++) {//Recorre desde 0 hasta 9
            arr[i] = r.nextInt(100);//Genera números aleatorios de 0 a 99
            System.out.println("Numeros aleatorios: " + arr[i]);//Imprime números aleatorios
        }
        
        int menor = arr[0];//SE asigna como valor inicial al primer numero del arreglo
        
        for (int i = 1; i < arr.length; i++) {//Recorre nuevamente el bucle
            if (arr[i] < menor) {//Compara todos los numeros del arreglo generado
                
                menor = arr[i];//Si es menor lo guarda
            }
        }
        System.out.println("Numero aleatorio menor: " + menor);//Se imprime el número menor del arreglo
    }
}
