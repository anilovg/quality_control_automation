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
public class ejercicio_6 {

    // Crear un programa que dado un numero determine si es par o impar.
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es impar.");
        }

    }

}
