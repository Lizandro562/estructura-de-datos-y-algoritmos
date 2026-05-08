/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**While: sumar numeros hasta que el usuario ponga el número cero
 *
 * @author Acer
 */
import java.util.Scanner;//Se lee datos que ingresa el usuario
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        
        System.out.println("INgresa un numero(0 para terminar): ");
        
        num = sc.nextInt();
        
        while(num != 0) {
            suma += num;
            num = sc.nextInt();
        }
        System.out.println("La suma es: " + suma);
    }
        
}
