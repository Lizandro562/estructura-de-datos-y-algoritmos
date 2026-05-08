/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Suma de con array de numeros aleatorios
 *
 * @author Acer
 */
import java.util.Random;//Random para crear números aleatorios
public class ejercicio10 {
    public static void main(String[] args) {//Da inicio al programa
        Random r = new Random();//Genera números aleatorios
        
        int[] arr = new int[10];//Arreglo de 10 posiciones para guardar números
        
        for (int i = 0; i < arr.length; i++) {//Recorre el arreglo desde la posicion 0 hasta la 12
            arr[i] = r.nextInt(100);//Se genera cualquier número desde 0 hasta 99
            System.out.println("Numeros aleatorios: " + arr[i]);//Imprime numeros aleatorios
        }
        
        int suma = 0;//Se acumula la suma de todos los números aleatorios
        
        for (int i = 0; i < arr.length; i++) {//Recorre n uevamente el arreglo
            suma += arr[i];//Se suma los números aleatorios
          
        }
        System.out.println("Suma: " + suma);//Imprime la suma
    }
}
