/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**While: tabla de multiplicar
 *
 * @author Acer
 */
import java.util.Scanner;//lee datos 
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        
        int i = 0;
        
        while(i <= 12) {
            System.out.println(num+"x"+i+"="+(i*num));
            i++;
        }
    }
}
