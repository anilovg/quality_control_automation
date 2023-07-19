/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/* Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
    A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    d) Método area(): para calcular el área de la circunferencia (Área = π * radio2).
    e) Método perimetro(): para calcular el perímetro (Perímetro = 2 * π * radio).

 * @author Ani
 */
public class CircunferenciaService {
    
    private Scanner read = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el radio de la circunferencia:");
        int radio = read.nextInt();
        
        return new Circunferencia(radio);
        
    }
    
    public Circunferencia area(Circunferencia cirN){
       
        String area = String.format("%.2f",(cirN.getRadio()*cirN.getRadio())*3.14);
        
        System.out.println("El área de la circunferencia es: "+area+"cm.");
        
        return null;
               
    }
    
    public Circunferencia perimetro(Circunferencia cirN){
        
        String perimetro = String.format("%.2f",2*3.14*cirN.getRadio());
        
        System.out.println("El perímetro de la circunferencia es: "+perimetro+"cm.");
        
        return null;
        
    }
    
}
