/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Scanner y Random;
 *
 * @author Acer
 */
import java.util.Scanner;
import java.util.Random;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int secreto = r.nextInt(10);
        
        System.out.print("Adivina el numero(0-9): ");
        int intento = sc.nextInt();
        
        if (intento == secreto) {
            System.out.println("Ganaste! : ");
        }else {
            System.out.println("Perdiste era: "+ secreto);
        }
    }
}
