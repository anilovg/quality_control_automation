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

public class ejercicio_3 {
    
    /* Escribir un programa que pida una frase y la muestre toda
    en mayúsculas y después toda en minúsculas.
    Nota: investigar la función toUpperCase() y toLowerCase() en Java. */
    
     public static void main(String[] args) {
         
         String frase = JOptionPane.showInputDialog("Ingrese una frase:");
         
         JOptionPane.showMessageDialog(null, "La frase en mayúsculas es:\n"
                 + frase.toUpperCase());
         JOptionPane.showMessageDialog(null, "La frase en minúsculas es:\n"
                 + frase.toLowerCase());
         
     }
}
