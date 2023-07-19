/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import java.util.Scanner;

/*
 * @author Ani
 */

public class ejercicio_20 {
    
    /* Un cuadrado mágico de 3 x 3, es una matriz de 3 x 3 formada por números del 1 al 9
    donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
    Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9. */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] magicCube = new int[3][3];
        int cont = 1;
        int sumaF = 0;
        int sumaC = 0;
        int diagA = 0;
        int diagB = 0;
        int[] fila = new int[3];
        int[] columna = new int[3];
        boolean magica = true;
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese el número "+cont+" del cubo mágico");
                    magicCube[i][j] = leer.nextInt();
                } while (magicCube[i][j] < 1 || magicCube[i][j] > 9);
                cont += 1;
            }
        }
        
        System.out.println("La matríz ingresada para el cubo mágico es:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(magicCube[i][j] + "\n");
                } else {
                    System.out.print(magicCube[i][j] + "   ");
                }                
            }            
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaF += magicCube[i][j];                
            }
            fila[i] = sumaF;
            System.out.println("La suma de la fila "+(i+1)+" es = "+sumaF+"\n");
            sumaF = 0;
        }
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumaC += magicCube[i][j];                
            }
            columna[j] = sumaC;
            System.out.println("La suma de la columna "+(j+1)+" es = "+sumaC+"\n");
            sumaC = 0;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagA += magicCube[i][j];
                }
                if (i + j == 2) {
                    diagB += magicCube[i][j];
                }
            }
        }
        
        System.out.println("La suma de la diagonal A es = " + diagA + "\n");
        System.out.println("La suma de la diagonal B es = "+diagB+"\n");


        for (int i = 0; i < 3; i++) {
            if (fila[i] == columna[i] && columna[i] == diagA && diagA == diagB) {
                i += 1;
            } else {
                magica = false;
            }
        }
        
        if (magica) {
            System.out.println("La matríz es mágica.");
        } else {
            System.out.println("La matríz no es mágica.");
        }

    }
}
