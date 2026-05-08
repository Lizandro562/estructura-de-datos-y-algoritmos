/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana;

/**
 *
 * @author Acer
 * 
 */

public class java {
    public static void main(String[] args) {
        
        int[] num = {5,-4,-2,0,0,0,1,2,-8};
        int positivos=0;
        int negativos=0;
        int cero=0;
        
        for (int i = 0;i<num.length; i++) {
            if(num[i] > 0) {
                positivos++;
            }else if(num[i]<0) {
                negativos++;
            } else {
                cero++;
            }
        }
        System.out.println("Positivos." + positivos);
        System.out.println("Negativos." + negativos);
        System.out.println("ceros. " + cero);
    }
}
