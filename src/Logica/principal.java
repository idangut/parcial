/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Random;

/**
 *
 * @author Dark
 */
public class principal {
    //Funcion que ordena aleatoriamente las cartas al ejecutar el programa
    public int[] getCardNumbers() {
        //arreglo que contrendra 4 pares de cartas para un total de 8
        int[] numbers = new int[8];
        int count = 0;
        
        while(count < 8) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 8; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin
            
        }
        
        
        return numbers;
    }
            
}
