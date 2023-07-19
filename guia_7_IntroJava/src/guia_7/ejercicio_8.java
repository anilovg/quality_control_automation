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

public class ejercicio_8 {

    /* Realizar un programa que solo permita introducir frases o palabras de 8 de largo.
    Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
    por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    Nota: investigar la función Lenght() en Java. */
    
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Ingrese una frase o palabra de 8 caracteres.");
        
        if (frase.length() == 8) {
            JOptionPane.showMessageDialog(null, "CORRECTO.");
        } else {
            JOptionPane.showMessageDialog(null, "INCORRECTO.");
        }
        
    }
    
}
