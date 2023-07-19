/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.text.DecimalFormat;
import java.util.Scanner;

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
public class PersonaService {
    
    private Scanner read = new Scanner(System.in, "ISO-8859-1");
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese nombre:");
        String nombre = read.next();
        System.out.println("Ingrese edad:");
        int edad = read.nextInt();
        char sexo = 'X';
        
        do {
            System.out.println("Ingrese sexo:"
                    + "\n1.Hombre"
                    + "\n2.Mujer"
                    + "\n3.Otro");

            switch (read.nextInt()) {
                case 1:
                    sexo = 'H';
                    break;
                case 2:
                    sexo = 'M';
                    break;
                case 3:
                    sexo = 'O';
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while(sexo == 'X');
        
        System.out.println("Ingrese peso:");
        double peso = read.nextDouble();
        System.out.println("Ingrese altura:");
        double altura = read.nextDouble();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public double calcularIMC(Persona personaN){
        DecimalFormat df = new DecimalFormat("#.00");
        
        double peso = personaN.getPeso();
        double altura = personaN.getAltura();
        
        double IMC = peso/(altura*altura);
        
        System.out.println("El IMC de "+personaN.getNombre()+" es "+ df.format(IMC)+".");
        
        if (IMC < 20.00) {
            System.out.println("Resultado: -1\n");
            IMC = -1;
        } else if (IMC > 25) {
            System.out.println("Resultado: 1\n");
            IMC = 1;
        } else {
            System.out.println("Resultado: 0\n");
            IMC = 0;
        }
        
        return IMC;
    }
    
    public boolean esMayorDeEdad(Persona personaN){
        boolean mayor = false;
        
        if (personaN.getEdad() >= 18) {
            mayor = true;
        }
        
        System.out.println("Mayor de edad: "+mayor+"\n");
        
        return mayor;
    }
    
}
