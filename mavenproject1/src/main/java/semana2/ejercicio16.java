/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Este programa se encarga de suma matrices3x3
 *
 * @author Acer
 */
import java.util.Random;//Random para generar números aleatorios
public class ejercicio16 {
    public static void main(String[] args) {//Inicia el programa
        Random r = new Random();//Objeto para guardar números aleatorios
        
        int[][] matriz = new int[3][3];//Creamos una matriz de 3x3
        
        for (int i = 0; i < 3; i++) {//Recorre la fila 
            for (int j = 0; j < 3; j++) {//Recorre la columna
                matriz[i][j] = r.nextInt(10);//Genera números aleatorios de 0 a 9
                System.out.print(matriz[i][j]+" ");//Muestra los números en fila 
            }
            System.out.println();// Se imprime la matriz
        }
        int suma = 0;//Creamos una variable suma
        
        for (int i = 0; i < 3; i++) {//Recorre las filas 
            for (int j = 0; j < 3; j++) {//Recorre las columnas
                suma += matriz[i][j];//Y suma la matriz 3x3
            }
        }
        System.out.println("Suma total: " + suma);//Se imprime la suma
    }
}
