/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * @author Ani
 */

public class ejercicio_17 {
    
    /* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
    cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
    
    public static void main(String[] args) {
        
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del vector:"));
        int[] vector = new int[tam];   
        int uno=0, dos=0, tres=0, cuatro=0, cinco=0;
        
        for (int i = 0; i < tam; i++) {
            int digitos = (int)(Math.random()*5+1);
            
            switch(digitos){
                case 1:
                    vector[i] = (int) (Math.random() * 10);
                    uno += 1;
                    continue;
                case 2:
                    vector[i] = (int) (Math.random() * 100);
                    dos += 1;
                    continue;
                case 3:
                    vector[i] = (int) (Math.random() * 1000);
                    tres += 1;
                    continue;
                case 4:
                    vector[i] = (int) (Math.random() * 10000);
                    cuatro += 1;
                    continue;
                case 5:
                    vector[i] = (int) (Math.random() * 100000);
                    cinco += 1;
                    continue;
            }
        }
        
        // Arrays.toString(nombreDelVector) para imprimir por pantalla un vector
        JOptionPane.showMessageDialog(null, "En el vector:\n"
                + Arrays.toString(vector)
                + "\n\nHay " + uno + " números de un dígito.\n"
                + "Hay " + dos + " números de dos dígitos.\n"
                + "Hay " + tres + " números de tres dígitos.\n"
                + "Hay " + cuatro + " números de cuatro dígitos.\n"
                + "Hay " + cinco + " números de cinco dígitos.");       

    }
}