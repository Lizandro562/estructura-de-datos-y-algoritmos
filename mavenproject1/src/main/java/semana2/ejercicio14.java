/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Este programa genera números aleatorios y los oredena
 *
 * @author Acer
 */
import java.util.Random;//Random para generar números aleatorios
public class ejercicio14 {
    public static void main(String[] args) {//Inicia el programa
        Random r = new Random();//Objeto para guardar números aleatorios
        
        int[] arr = new int[10];//10 posicines para guardar números aleatorios
        
        for (int i = 0; i < arr.length; i++) {//Bucle que recorre todo el arreglo
            arr[i] = r.nextInt(100);//Rango para generar cualquier número aleatorio
            System.out.println(arr[i]+"");//Muestra los números generado
        }
        //Ordenamiento de numeros aleatorios
        for (int i = 0; i < arr.length; i++) {//Bucle para controlar cuantas veces se repite el proceso
            for (int j = 0; j < arr.length - 1; j++) {//Bucle para comparar elementos consecutivos
                if (arr[j] > arr[j+1]){
                    //Compara los números
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        System.out.println("Ordenado: ");//Mostramos un texto diciendo que ahora los números estan ordenados
        for (int i = 0; i < arr.length; i++) {//Se recorre nuevamente el arreglo
            System.out.println(arr[i]+"");//Se imprime de forma ordenada
        }
    }
}
