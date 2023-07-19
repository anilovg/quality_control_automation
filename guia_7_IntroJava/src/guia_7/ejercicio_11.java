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

public class ejercicio_11 {

    /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
    El programa deberá ejecutarse hasta que se elija la opción 5.
    Si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje
    de confirmación: "¿Está seguro que desea salir del programa (S/N)?" Si el usuario selecciona el carácter ‘S’ se sale del programa,
    caso contrario se vuelve a mostrar el menú. */
    
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do número:"));
        char confirmacion = 'N';
        int suma, resta, producto;
        double cociente;

        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija una opción:\n"));

            switch (opcion) {
                case 1:
                    suma = num1+num2;
                    JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + suma);
                    continue;
                case 2:
                    resta = num1-num2;
                    JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + resta);
                    continue;
                case 3:
                    producto = num1*num2;
                    JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + producto);
                    continue;
                case 4:
                    cociente = (double)num1/num2;
                    JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + cociente);
                    continue;
                case 5:
                    confirmacion = JOptionPane.showInputDialog("¿Está seguro que desea salir del programa? (S/N)").charAt(0);
                    if (confirmacion == 'S'|| confirmacion == 's') {
                        break;
                    } else {
                        continue;
                    }
            }
        } while (confirmacion == 'N' || confirmacion == 'n');
    }
}
