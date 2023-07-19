/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

/*
 * @author Ani
 */

public class ejercicio_18 {

    /* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
    La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
    
    1 0 4       1 0 6
    0 5 0  -->  0 5 0
    6 0 9       4 0 9   */
    
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Matriz:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3) {
                    System.out.println(matriz[i][j] + "\n");
                } else {
                    System.out.print(matriz[i][j] + "   ");
                }
            }
        }

        System.out.println("Matriz transpuesta:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3) {
                    System.out.println(matriz[j][i] + "\n");
                } else {
                    System.out.print(matriz[j][i] + "   ");
                }
            }
        }

    }
}
