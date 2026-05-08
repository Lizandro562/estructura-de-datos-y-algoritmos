/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**tabla de multiplicar
 *
 * @author Acer
 */
import java.util.Scanner;//usamos Scanner para leer los datos que ingrese el usuario
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);//se crea un objeto para leer lo que escribe el usuario
        
        System.out.print("Enter a number.");// Escribimos un mensaje 
        int num = sc.nextInt();//guarda lo que escribe el usuario
        
        for (int i = 1; i <= 12; i++) {//ciclo que se repetira 
            System.out.println(num +"x"+i+"="+(num * i));// se muestra una multiplicacion
        }
    }
}
