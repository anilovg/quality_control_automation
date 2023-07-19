/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import java.text.DecimalFormat;
import java.util.Scanner;

/* Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas.
La clase deber tener un constructor vacío, parametrizado y get y set.
En el main se creará el objeto y se usará el Math.random para generar los dos números y
se guardaran en el objeto con su respectivos set.
Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 * @author Ani
 */
public class MatematicaService {
    
    private Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    DecimalFormat df = new DecimalFormat("#.00"); // Para definir la cant de decimales.
    
    public Matematica devolverMayor(Matematica matN){
        int mayor = Math.max(matN.getNum1(), matN.getNum2());
                
        System.out.println("El número mayor es: "+mayor);
        
        return null;
    }
    
    public Matematica calcularPotencia(Matematica matN){
        int potencia = 0;
        int mayor = Math.max(matN.getNum1(), matN.getNum2());
        int menor = Math.min(matN.getNum1(), matN.getNum2());
        
        potencia = (int) Math.pow(mayor, menor);
        
        System.out.println("La potencia de "+mayor+" elevado a "+menor+" es = "+potencia);
        
        return null;
    }
    
    public Matematica calcularRaiz(Matematica matN){
        int menor = Math.min(matN.getNum1(), matN.getNum2());
        double raiz = 0;
        
        raiz = Math.sqrt(menor);
        
        System.out.println("La raíz cuadrada de "+menor+" es = "+df.format(raiz));
                
        return null;
    }
    
}
