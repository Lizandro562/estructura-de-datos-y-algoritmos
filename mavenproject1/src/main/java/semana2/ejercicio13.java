/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Buscar un numero en un array
 *
 * @author Acer
 */
import java.util.Scanner;
import java.util.Random;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int[] arr = new int[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
            System.out.println(arr[i] + " ");
        }
        System.out.print("Buscar numero: ");
        int buscar = sc.nextInt();
        
        boolean encontrado = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Si existe: ");
        }else{
            System.out.println("No existe: ");
        }
    }
}
