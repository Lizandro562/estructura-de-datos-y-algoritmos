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
public class ejercicio4 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();

// Código a evaluar
int[] arreglo = new int[1000000];

long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

System.out.println("Memoria usada: " + (memoriaDespues - memoriaAntes) + " bytes");
    }
}
