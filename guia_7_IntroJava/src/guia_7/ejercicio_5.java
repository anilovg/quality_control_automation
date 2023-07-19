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

public class ejercicio_5 {
    
    /* Escribir un programa que lea un número entero por teclado y muestre
    por pantalla el doble, el triple y la raíz cuadrada de ese número.
    Nota: investigar la función Math.sqrt(). */
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int numD, numT, rC;
        
        numD = num*2;
        numT = num*3;
        rC = (int)Math.sqrt(num);
        
        JOptionPane.showMessageDialog(null, "El número ingresado es: "+num
        +"\nEl doble es: "+numD
        +"\nEl triple es: "+numT
        +"\nLa raíz cuadrada es: "+rC);
    }
    
}
