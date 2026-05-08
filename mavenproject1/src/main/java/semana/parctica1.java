/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class parctica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INgrese numeros.");
        int num = sc.nextInt();
        
        int factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de "+ num + "es: "+ factorial);
    }
}
