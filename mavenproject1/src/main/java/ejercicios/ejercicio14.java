/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**do While: contar cuantos digitos tiene el número que ingresa el usuario
 *
 * @author Acer
 */
import java.util.Scanner;//Lee datos
public class ejercicio14 {
    public static void main(String[] args) {//da inicio al programa
        Scanner sc = new Scanner(System.in);//Lee datos ingresados por el usuario
        int num;//Número ingresados
        int contador = 0;// Cuenta los digitos del número ingresado
        
        System.out.print("Enter a number: ");//Pedimos el usuario que ingrese un número
        num = sc.nextInt();//Lee el número ingresado
        
        do {//Se repite al menos al menos una vez
            num = num / 10;//Divide el numero entre diez y elimina el ultimo digito
            contador++;//Aumenta el contador 
        }while (num != 0);//Se repite mientras que el número sea difentre a "0"
        System.out.println("Number of digits: " + contador);//IMprime el número de digitos ingresados
    }
}
