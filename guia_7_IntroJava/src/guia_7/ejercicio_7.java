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

public class ejercicio_7 {

    /* Crear un programa que pida una frase y si esa frase es igual a “eureka”
    el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
    Nota: investigar la función equals() en Java. */
    
    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");

        if (palabra.equals("eureka")) {
            JOptionPane.showMessageDialog(null, "Correcto.");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto.");
        }

    }

}
