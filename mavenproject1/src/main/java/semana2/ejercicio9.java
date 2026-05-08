/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**ARRAY: Este programa crea números aleatorios e imprime el número mayor de esos números aleatorios
 *
 * @author Acer
 */
import java.util.Random;//Se crea numeros aleatorios
public class ejercicio9 {
    public static void main(String[] args) {//Da inicio al programa
        Random r = new Random();//Generador de numeros aleatorios
        int[] arr = new int[10];//Se  crea un arreglo de 10 posiciones
        for (int i = 0; i < arr.length; i++) {//Recorre todo el arreglo
            arr[i] = r.nextInt(100);//Genera numeros aleatorios del 0 al 99
            System.out.println("Numeros aleatorios: " + arr[i]);//Se imprime numeros aleatorios generados
        }
        int mayor = arr[0];//Supone que el primer número es mayor
        for (int i = 0; i < arr.length; i++) {//Recorre nuevamente el arreglo
            if (arr[i] > mayor) {//Se comprara cada número hasta encontrar el mayor
                mayor = arr[i];//Si encuentra uno mas grande lo guarda
            }
        }
        System.out.println("El mayor: " + mayor);//Imprime el número mas grande del arreglo
    }    
}