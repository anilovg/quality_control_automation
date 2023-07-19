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

public class ejercicio_14 {
    
    /* Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
    estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €   */
    
    public static void main(String[] args) {
        
        double euro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de euros a convertir:"));
        int moneda = Integer.parseInt(JOptionPane.showInputDialog("Seleccione moneda a convertir:\n"
                + "1. Dólares\n"
                + "2. Libras\n"
                + "3. Yenes"));
        
        JOptionPane.showMessageDialog(null, conversion(euro, moneda));
        
    }
    
    public static String conversion(double euro, int moneda) {
        double dolares, libras, yenes;
        String respuesta="";
        
        switch (moneda){
            case 1:
                dolares = euro*1.28611;
                respuesta = euro+"€ equivalen a "+dolares+" US$.";
                break;
            case 2:
                libras = euro*0.86;
                respuesta = euro+"€ equivalen a "+libras+" libras.";
                break;
            case 3:
                yenes = euro*129.852;
                respuesta = euro+"€ equivalen a "+yenes+" yenes.";
                break;
            default:
                respuesta = "Opción no válida.";
                
        }
        
        return respuesta;
 
    }
    
}