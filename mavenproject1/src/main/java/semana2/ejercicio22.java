/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Crea una matriz 4x4: Muestra la suma total, el numero mayor y el menor
 *
 * @author Acer
 */
import java.util.Random;
public class ejercicio22 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = r.nextInt(15);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("Suma total: " + suma);
        
        
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] >mayor) {
                    mayor = matriz[i][j];
                } else if(matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("NUmero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}
