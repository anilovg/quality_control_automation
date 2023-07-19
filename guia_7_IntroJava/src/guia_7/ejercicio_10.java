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

public class ejercicio_10 {

    /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números
    al usuario hasta que la suma de los números introducidos supere el límite inicial. */
    
    public static void main(String[] args) {

        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número límite: "));

        int suma = 0;

        suma += Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (suma < limite) {
            suma += Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            JOptionPane.showMessageDialog(null, "Suma actual = " + suma);
        }

    }

}
