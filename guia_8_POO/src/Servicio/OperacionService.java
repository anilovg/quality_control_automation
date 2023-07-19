/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.text.DecimalFormat;
import java.util.Scanner;

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
public class OperacionService {
    
    private Scanner read = new Scanner(System.in);
    
    // d)
    public Operacion crearOperacion() {

        System.out.println("Ingrese el 1er número:");
        int numero1 = read.nextInt();
        System.out.println("Ingrese el 2do número:");
        int numero2 = read.nextInt();

        return new Operacion(numero1, numero2);
    }

    // e)
    public Operacion sumar(Operacion opN) {
        int resultado = opN.getNumero1() + opN.getNumero2();

        System.out.println(opN.getNumero1() + " + " + opN.getNumero2() + " = " + resultado);

        return null;
    }
   
    // f)
    public Operacion restar(Operacion opN) {
        int resultado = opN.getNumero1() - opN.getNumero2();
  
        System.out.println(opN.getNumero1() + " - " + opN.getNumero2() + " = " + resultado);
        
        return null;
    }
    
    // g)
    public Operacion multiplicar(Operacion opN) {
        int resultado = opN.getNumero1() * opN.getNumero2();

        System.out.println(opN.getNumero1() + " * " + opN.getNumero2() + " = " + resultado);

        return null;
    }
    
    // h)
    public Operacion dividir(Operacion opN){
       double resultado;
       double num1 = opN.getNumero1();
       double num2 = opN.getNumero2();
       
       DecimalFormat df = new DecimalFormat("#.00"); // para poner 2 decimales después de la coma.
        
        if(num2==0){
            System.out.println("Error, no se puede dividir entre 0.");
        } else {
            resultado = num1 / num2;
            System.out.println(opN.getNumero1() + " / " + opN.getNumero2() + " = " + df.format(resultado));
        }
        
        return null;
    }

}
