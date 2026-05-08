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
public class practica5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        
        System.out.println("INgrese numeros(0 para salir):");
        num = sc.nextInt();
        
        while (num !=0) {
            suma += num;
            num = sc.nextInt();
        }
        System.out.println("suma de los numeros." +suma);
        
    }
}
