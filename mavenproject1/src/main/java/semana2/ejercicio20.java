/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**suma de la diagonal principal
 *
 * @author Acer
 */
import java.util.Random;
public class ejercicio20 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = r.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println("Suma de la diagonal principal: " + suma);
    }
}
