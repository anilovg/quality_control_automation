/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_poo;

import Entidad.Persona;
import Servicio.PersonaService;

/* Realizar una clase llamada Persona que tenga los siguientes atributos:
nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
Si el alumno desea añadir algún otro atributo, puede hacerlo.
Los métodos que se implementarán son:
* Un constructor por defecto.
* Un constructor con todos los atributos como parámetro.
* Métodos getters y setters de cada atributo.
* Método crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje.
* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo
de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está
en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos
para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por
debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables,
para después en el main, calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos
son mayores de edad y cuantos menores.

 * @author Ani
 */
public class ejercicio_7 {
    
    public static void main(String[] args){
        
        PersonaService per = new PersonaService();
        int[] IMC = new int[4];
        boolean[] edades = new boolean[4];
        
        Persona p1 = per.crearPersona();
        IMC[0] = (int) per.calcularIMC(p1);
        edades[0] = per.esMayorDeEdad(p1);
       
        Persona p2 = per.crearPersona();
        IMC[1] = (int) per.calcularIMC(p2);
        edades[1] = per.esMayorDeEdad(p2);

        Persona p3 = per.crearPersona();
        IMC[2] = (int) per.calcularIMC(p3);
        edades[2] = per.esMayorDeEdad(p3);

        Persona p4 = per.crearPersona();
        IMC[3] = (int) per.calcularIMC(p4);
        edades[3] = per.esMayorDeEdad(p4);
      
        int bajo = 0;
        int ideal = 0;
        int arriba = 0;

        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < 4; i++) {
            switch (IMC[i]) {
                case -1:
                    bajo += 1;
                    continue;
                case 0:
                    ideal += 1;
                    continue;
                case 1:
                    arriba += 1;
                    continue;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (edades[i] == true) {
                mayor += 1;
            } else {
                menor += 1;
            }
        }
        
        System.out.println("Personas por debajo de su peso ideal: "+bajo
                +"\nPersonas en su peso ideal: "+ideal
        +"\nPersonas por encima de su peso ideal: "+arriba+".\n");
        
        System.out.println("Personas mayores de edad: "+mayor
        +"\nPersonas menores de edad: "+menor);     
        
    }
    
}
