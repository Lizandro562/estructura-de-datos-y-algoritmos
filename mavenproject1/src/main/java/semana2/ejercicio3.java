/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**
 *
 * @author Acer
 */
import java.util.Random;
public class ejercicio3 {
    public static void main(String[] args) {
        
        int tamaño= 10;
        int [] array = new int[tamaño];
        Random numero = new Random();
        
        System.out.println("llenando array" +tamaño + " posiciones con datos random");
        
        for (int i = 0; i < tamaño; i++) {
            array[i] = numero.nextInt(100);
            System.out.println("posicion [" +i+ "] = " +array[i]);
        }
        System.out.println("ya lleno el array" );
        
        long inicioTiempo, finTiempo, tiempoTotal;
        
        inicioTiempo = System.nanoTime();
        
        for (int i = 0; i < tamaño; i++) {
            int lectura = array[i];
        }
        
        finTiempo = System.nanoTime();
        tiempoTotal = finTiempo - inicioTiempo;
        System.out.println("tiempo usado por el FOR :   " + tiempoTotal+ "nanosegundos.");
        
    }
}