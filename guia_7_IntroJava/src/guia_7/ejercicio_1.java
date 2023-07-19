/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

// import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @author Ani
 */

public class ejercicio_1 {
    
    /* Escribir un programa que pida dos números enteros por teclado
    y calcule la suma de los dos.
    El programa deberá después mostrar el resultado de la suma */

    public static void main(String[] args) {
        // Scanner leer = new Scanner(System.in);
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er número:\n"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do número:\n"));
 
        int suma = num1+num2;
        
        JOptionPane.showMessageDialog(null, "La suma de "+num1+" + "+num2+" es = "+suma);
    }
    
}
