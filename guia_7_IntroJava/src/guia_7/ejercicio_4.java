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

public class ejercicio_4 {
    
    /* Dada una cantidad de grados centígrados se
    debe mostrar su equivalente en grados Fahrenheit.
    La fórmula correspondiente es: F = 32 + (9 * C / 5). */
    
      public static void main(String[] args) {
          
        int gradosC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los grados centígrados a convertir:"));
        
        int gradosF = 32+(9*(gradosC/5));
        
        JOptionPane.showMessageDialog(null, gradosC+"ºC equivalen a: "+gradosF+"ºF");
          
      }
    
}