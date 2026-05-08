/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**
 *
 * @author Acer
 */
public class tarea8 {
    public static void main(String[] args) {
        long inicio = System.nanoTime();
        
        for (int i = 0; i < 100000000; i++) {
            double a = Math.sqrt(i);
            
        }
        long fin = System.nanoTime();
        System.out.println("Time CPU: " + (fin - inicio));
    }
}