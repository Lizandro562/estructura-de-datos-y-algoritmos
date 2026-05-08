/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**do While: pide al usuario que ingrese su contraseña
 *
 * @author Acer
 */
import java.util.Scanner;//lee datos del usuario
public class ejercicio12 {
    public static void main(String[] args) {//Da inicio al programa
        Scanner sc = new Scanner(System.in);//Lee lo que escribe el usuario
        int pass;// Se guarada la contraseña
        
        do {//Se ejecuta al menos una vez
            System.out.print("Enter pasword:");
            pass = sc.nextInt();//El usuario escribe la contraseña
        }while (pass != 1234);//Se repite mientas la contraseña no se el número correcto
        System.out.println("Correct access");//SE imprime la contraseña cuando el usuario ingresa la correcta
    }
}
