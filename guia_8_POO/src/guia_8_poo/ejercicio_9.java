/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_poo;

import Entidad.Matematica;
import Servicio.MatematicaService;

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
public class ejercicio_9 {
    
    public static void main(String[] args){
        
        MatematicaService mat = new MatematicaService();
        
        Matematica mat1 = new Matematica((int) (Math.random()*10+1), (int) (Math.random()*10+1));
        
        System.out.println("Los números son: "+mat1.getNum1()+" - "+mat1.getNum2());
        
        mat.devolverMayor(mat1);
        mat.calcularPotencia(mat1);
        mat.calcularRaiz(mat1);        
        
    }
    
}
