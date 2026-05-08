/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**do while: El programa suma solo números positivos, el programa acaba cuando 
 * el usuario ingresa un número negativo.
 *
 *
 * @author Acer
 */
import java.util.Scanner;//Lee datos del usuario
public class ejercicio15 {
    public static void main(String[] args) {//Da incio el programa
        Scanner sc = new Scanner(System.in);//Guarda datos
        
        int num;//Guarda números ingresados
        int suma = 0;//Acumulador de suma
        
        do {//Se ejecuta al menos una vez
            System.out.print("Enter a number(negative to leave):");//Texto que pide que ingrese un número al usuario
            num = sc.nextInt();//Lee el número ingresado
            
            if (num >= 0) {//Condicional que verifica si el númeor el mayor o igual a cero
                suma += num;//Suma el número total
            }
            
        }while (num >= 0);//Se repite mientras el número se mayor o igual a cero
        System.out.println("The sum of positive numbers is: " + suma);//Se  muestra la suma total
    }
}
