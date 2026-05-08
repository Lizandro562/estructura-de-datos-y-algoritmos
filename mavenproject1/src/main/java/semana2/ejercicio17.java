/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Este programa suma solo las filas de una matriz 3x3
 *
 * @author Acer
 */
import java.util.Random;//Random para generar numeros aleatorios
public class ejercicio17 {
    public static void main(String[] args) {//Inicia el programa
        Random r = new Random();//Creamos un objeto para guardar los numeros aleatorios
        
        int[][] matriz = new int[3][3];//Crea una matriz 3x3
        
        for (int i = 0; i < 3; i++) {//Recorre filas 
            for (int j = 0; j < 3; j++) {//Recorre columnas
                matriz[i][j] = r.nextInt(10);//Genera numeros aleatorios en un rango de 0 a 9
                System.out.print(matriz[i][j] + " ");
            } 
            System.out.println();//Imprime la matriz
        }
        
        for (int i = 0; i < 3; i++) {//Recorre nuevamente las filas
            int SumaFila = 0;//Variable para guardar la suma de las filas
            for (int j = 0; j < 3; j++) {//Recorre las columnas
                SumaFila += matriz[i][j];//Suma solo las filas de la matriz
            }
            System.out.println("Suma fila: " + SumaFila);//Imprime la suma de las filas
        }
    }
}
