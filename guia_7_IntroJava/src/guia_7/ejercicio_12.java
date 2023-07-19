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

public class ejercicio_12 {
    
    /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
    Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
    el primer carácter tiene que ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
    y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
    Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals(). */
    
    public static void main(String[] args) {

        String FDE = "&&&&&";
        String cadena = null;
        int v = 0; // contador para las cadenas correctas
        int x = 0; // contador para las cadenas incorrectas

        do {
            cadena = JOptionPane.showInputDialog("Bienvenido al dispositivo RS232\n"
                    + "\nIngrese la cadena a leer:"
                    + "\n[Secuencia de salida: \"&&&&&\"]");

            int max = cadena.length();

            if (cadena.substring(0, 1).equals("X") && cadena.substring(max - 1, max).equals("O") && max <= 5) {
                v += 1;
                continue;
            } else {
                x += 1;
            }

        } while (!cadena.equals("&&&&&"));

        JOptionPane.showMessageDialog(null, "Cadenas correctas: " + v
                + "\nCadenas incorrectas: " + (x - 1)
                + "\n\n FIN DE LA OPERACION.");
    }
}
