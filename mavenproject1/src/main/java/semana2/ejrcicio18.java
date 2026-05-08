/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**mayor numero en una mtriz
 *
 * @author Acer
 */
import java.util.Random;
public class ejrcicio18 {
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
        
        int mayor = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 0) {
                    mayor = matriz[i][j];
                }else if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("NUmero mayor: " + mayor);
    }
}
