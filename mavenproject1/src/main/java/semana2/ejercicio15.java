/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Este programa genera una matriz 3x3 con números aleatorios
 *
 * @author Acer
 */
import java.util.Random;//Random para generar números aleatorios
public class ejercicio15 {
    public static void main(String[] args) {//Inicia el programa
        Random r = new Random();//Objeto que guarda números aleatorios
        int[][] matriz = new int[3][3];//Crea una matriz de 3x3
        
        for (int i = 0; i < 3; i++) {//Bucle que recorre las filas de la matriz
            for (int j = 0; j < 3; j++) {//Bucle que recorre las columnas de la matriz
                matriz[i][j] = r.nextInt(10);//Genera números aleatorios de 0 a 10
                System.out.print(matriz[i][j] + " ");//Muestra los números
            }
            System.out.println();//Imprime la matriz 3x3
        }
    }

}
