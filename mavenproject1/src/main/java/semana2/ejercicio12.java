/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Este programa se encarga de ejecutar números pares e impares de un array aleatorio
 *
 * @author Acer
 */
import java.util.Random;//Random para generar numeros aleatorios
public class ejercicio12 {
    public static void main(String[] args) {//Inicia el programa
        Random r = new Random();//Objeto para generar numeros aleatorios
        
        int[] arr = new int[10];//10 posiciones para numeros aleatorios
        
        int pares = 0;//Contador de números pares
        int impares = 0;//Contador de números impares
               
        for (int i = 0; i < arr.length; i++) {//Ciclo que recorre todo el arreglo
            arr[i] = r.nextInt(100);//Generar numeros aleatorios en un rango de 0 99
            System.out.println("Numeros aleatorios: "+ arr[i]);//Se muestra los números aleatorios generados
            
            if (arr[i] % 2 == 0) {//Si cuple la condicion el número es par
                pares++;//Contador de números pares
            }else{//y si no, es impara
                impares++;//contador de impares
            }
    
        }
        System.out.println("Pares: "+pares);//Imprime números pares
        System.out.println("Impares: "+impares);//Imprime números impares
    }
}