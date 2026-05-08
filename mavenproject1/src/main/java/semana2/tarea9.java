/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**
 *
 * @author Acer
 */
public class tarea9 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> { 
            for (int i = 0; i < 50000000; i++) {
                Math.sqrt(i);
            }
        });
        Thread t2 = new Thread(() -> { 
            for (int i = 0; i < 50000000; i++) {
                Math.sqrt(i);
            }
        });
        long inicio = System.nanoTime();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}
        long fin = System.nanoTime();
        System.out.println("Time with threads: " +(fin-inicio));
    }
}