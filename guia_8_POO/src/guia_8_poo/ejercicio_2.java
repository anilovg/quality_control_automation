/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_poo;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;


/* Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
    A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    d) Método area(): para calcular el área de la circunferencia (Área = π * radio2).
    e) Método perimetro(): para calcular el perímetro (Perímetro = 2 * π * radio).

 * @author Ani
 */
public class ejercicio_2 {
    
    public static void main(String[] args) {
    
    CircunferenciaService cir = new CircunferenciaService();

    Circunferencia cir1 = cir.crearCircunferencia();
        
    cir.area(cir1);
    cir.perimetro(cir1);
        
    }
    
}
