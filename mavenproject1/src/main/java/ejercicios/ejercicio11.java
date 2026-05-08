/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**Do while: contar la cantidad de números ingresados hasta que el usuario 
 * ingrese un número 0
 *
 * @author Acer
 */
import java.util.Scanner;//lee datos ingresados por el usuario
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//lee lo que  el usuario escribe
        int num;//Guarda números ingresados ingresados
        int contador = 0;//Cuenta cuantos números se ingrasan, excepto {0}
        
        do {//Se ejecuta
            System.out.println("Enter a number(0 to exit): ");
            num = sc.nextInt();//Usuario ingresa un número
            
            if (num != 0) {//Se ingresa números diferentes de cero
                contador++;// se incrementa el contador
            }
            
        }while (num != 0);//Se repite mientras que el usuario no ingrese el número cero
        System.out.println("number of numbers entered is: " + contador);// muestra cuantos números se ingresaron antes que 
        // el usuario ingreará el número cero
     
    }
}
