/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import javax.swing.JOptionPane;

/*
 * @author Ani
 */

public class ejercicio_16 {
    
    /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
    al usuario un número a buscar en el vector.
    El programa mostrará donde se encuentra el número y si se encuentra repetido */
    
    public static void main(String[] args) {
        
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del vector:"));     
        
        int[] vector = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vector[i]=(int)(Math.random()*10+1); // *10+1 --> Para que me de números entre 1 y 10.
        }
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 1-10 para buscar en el vector:"));
        
        for (int i = 0; i < tam; i++) {
            if (vector[i]==x) {
                JOptionPane.showMessageDialog(null, "El número "+x+" se encuentra en la posición: "+(i+1));
            } else {
                JOptionPane.showMessageDialog(null, "El número "+x+" no se encuentra en el vector");
                break;
            }
        }
    
    }    
}
