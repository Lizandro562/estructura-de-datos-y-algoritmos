/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Este programa cuenta cuantas números son mayores a 5
 *
 * @author Acer
 */
import java.util.Random;//Genera números aleatorios
public class ejercicio19 {
    public static void main(String[] args) {//Inicia el programa
        Random r = new Random();//Objeto para guardar números aleatorios
        int[][] matriz = new int[3][3];//Se crea una matriz 3x3
        for (int i = 0; i < 3; i++) {//Recore la fila de la matriz
            for (int j = 0; j < 3; j++) {//Recorre la columna de la matriz
                matriz[i][j] = r.nextInt(10);//Genera números que esten en el rango del 0 a 9
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();//Se imprime la matriz
        }
        int contador = 0;//Creamos la variable contador
        for (int i = 0; i < 3; i++) {//Se recorre nuevamente la fila 
            for (int j = 0; j < 3; j++) {//Y la columna
                if (matriz[i][j] > 5) {//Verifica si los numeros son mayores a 5
                    contador++;//Contador de números mayores a 5
                }
            }
        }
        System.out.println("Numeros mayores a 5: " + contador);//Imprime cuantos números son mayores a 5
    }
}
