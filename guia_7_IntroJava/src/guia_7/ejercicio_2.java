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

public class ejercicio_2 {
    
    /* Escribir un programa que pida tu nombre, lo guarde
    en una variable y lo muestre por pantalla. */
    
    public static void main(String[] args) {
        
        String nombre;

        nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        JOptionPane.showMessageDialog(null, "Tu nombre es: "+nombre);
        
    }
    
}
