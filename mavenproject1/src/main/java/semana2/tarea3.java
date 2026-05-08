/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**Tiempo con for
 *
 *
 * @author Acer
 */
public class tarea3 {
    public static void main(String[] args) {
       long inicio = System.nanoTime();
       
       for (int i = 0; i < 1000; i++) {
           
       }
       long fin = System.nanoTime();
       
        System.out.println("Tiempo for: " +(fin-inicio));
    }
}
//Con el bucle for tarda mas tiempo porque realiza un mayor numero de interacciones,
//Esto demuestra que cuando se ejecuten mas operaciones, mas sera el tiempo de ejecucion.
