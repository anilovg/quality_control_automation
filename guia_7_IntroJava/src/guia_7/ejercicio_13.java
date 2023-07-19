/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

// import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author Ani
 */

public class ejercicio_13 {
    
    /* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente: 
    
    * * * *
    *     *
    *     *
    * * * *         */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar lados del cuadrado:");
        int lados = leer.nextInt();
        int k = lados - 1;

        int[][] cuadrado = new int[lados][lados];

        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {

                if (i == 0 || i == lados - 1 || j == 0 || j == lados - 1) {

                    if (i == 0 && j == lados - 1 || (i + j) != 0 && (i + j) % (k) == 0) {
                        System.out.println("*\n");
                        k += 1;
                    } else {
                        System.out.print("*   ");
                    }

                } else {
                    System.out.print("    ");
                }

            }
        }

    }
}
