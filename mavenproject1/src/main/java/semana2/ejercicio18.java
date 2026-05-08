/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Este programa muestra solo la diagonal principal de una matriz
 *
 * @author Acer
 */
import java.util.Random;//Random para generar números aleatorios
public class ejercicio18 {
    public static void main(String[] args) {//Inicia el programa
        Random r = new Random();//Objeto para guardar los números
        
        int[][] matriz = new int[3][3];//Se crea una matriz 3x3
        
        for (int i = 0; i < 3; i++) {//Recorre la fila de la mtriz
            for (int j = 0; j < 3; j++) {//REcorre culumnas
                matriz[i][j] = r.nextInt(10);//Rango de 0 a 9 para generar números aleatorios
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();//Se imprime la matriz
        }
        for (int i = 0; i < 3; i++) {//Nuevamente recore la fila
            for (int j = 0; j < 3; j++) {//Recore columnas
                if (i == j) {//Este la diagonal primcipal
                    System.out.print(matriz[i][j] + "");//Imprime solo los números de la diagonal
                } else {
                    System.out.print("-");//Imprime en guión si no esta en la diagonal
                }
            }
            System.out.println();//Se imprime el codigo
        }
    }
}
