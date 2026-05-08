/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**
 *
 * @author Acer
 */
public class tarea4 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        
        long antes = r.freeMemory();
        
        int[][] matriz = new int[1000][1000];
        
        long despues = r.freeMemory();
        
        System.out.println("Used memory: " +(antes-despues));
    }
}