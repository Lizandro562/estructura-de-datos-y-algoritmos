/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Busqueda en un arreglo
 *
 * @author Acer
 */
import java.util.Random;
public class tarea6 {
    public static void main(String[] args) {
        Random r = new Random();
        
        int[] arr = new int[1000];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        int buscar = 892; //Dificil de encontrar
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == buscar) {
                break;
            }
        }
        System.out.println("BUsqueda hecha:" + buscar);
    }
}
//La busqueda lineal utiliza mas procesador por que recorre todas las lineas del
//arreglo y realiza multiples comparaciones hasta encontrar el numero que queremos encontrar