/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_poo;

import Entidad.Operacion;
import Servicio.OperacionService;

/* Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2.
A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main.
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la división y se devuelve el resultado al main.

 * @author Ani
 */
public class ejercicio_3 {
    
    public static void main(String[] args) {
        
     OperacionService op = new OperacionService();
     
     Operacion op1 = op.crearOperacion();
     
     op.sumar(op1);
     op.restar(op1);
     op.multiplicar(op1);
     op.dividir(op1);
        
    }
    
}
