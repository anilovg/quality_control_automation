/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import java.util.Arrays;

/*
 * @author Ani
 */

public class ejercicio_19 {
    
    /* Realice un programa que compruebe si una matriz dada es anti simétrica.
    Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
    Es decir, A es anti simétrica si A = -AT.
    La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
    
     0 -2  4        0  2 -4
     2  0  2  -->  -2  0 -2
    -4 -2  0        4  2  0
    
    En este caso la matriz es anti simétrica.   */
    
    public static void main(String[] args) {

        int[][] matrizS = {{0, 2, 4}, {2, 0, 2}, {4, 2, 0}};
        int[][] matrizAS = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        matrizTranspuesta(matrizS);
        matrizTranspuesta(matrizAS);

    }

    public static int matrizTranspuesta(int[][] matriz) {
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == (matriz[j][i] * (-1))) {
                    k += 1;
                }
            }
        }

        if (k == 9) {   // Arrays.deepToString(nombreDeLaMatriz) para imprimir por pantalla una matriz
            System.out.println("La matriz: "+Arrays.deepToString(matriz)+" SI ES anti simétrica.");
        } else {
            System.out.println("La matriz: "+Arrays.deepToString(matriz)+" NO ES anti simétrica.");
        }
        return 0;
    }

}
