/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/* Realizar una clase llamada Cadena que tenga como atributos una frase
(de tipo String) y su longitud.
En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada.
Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 * @author Ani
 */
public class CadenaService {
    
    private Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Cadena generarCadena(){
        
        System.out.println("Ingrese la frase: ");
        String frase = read.next();
        int longitud = frase.length();
        
        return new Cadena(frase, longitud);
        
    }
    
    public Cadena mostrarVocales(Cadena cadenaN){
        int vocales = 0;
        int k = cadenaN.getLongitud();
        String cadenaPrueba = cadenaN.getFrase().toLowerCase();
        
        for (int i = 0; i < k; i++) {
            if(cadenaPrueba.charAt(i)=='a' || cadenaPrueba.charAt(i)=='e' || cadenaPrueba.charAt(i)=='i' || cadenaPrueba.charAt(i)=='o' || cadenaPrueba.charAt(i)=='u'){
            vocales += 1;
            }            
        }
        
        System.out.println("Vocales en la frase: "+vocales);
        
        return null;
    }
    
    public Cadena invertirFrase(Cadena cadenaN){
        String cadenaInvertida = "";
        
        for (int i = cadenaN.getLongitud() -1; i >= 0; i--) {
            cadenaInvertida += cadenaN.getFrase().charAt(i);            
        }
        
        System.out.println("Cadena original: "+cadenaN.getFrase()
        +"\nCadena invertida: "+cadenaInvertida);
        
        return null;
    }
    
    public Cadena vecesRepetidas(Cadena cadenaN){
        System.out.println("Ingrese el carácter a buscar:");
        char X = read.next().charAt(0);
        int caracter = 0;
        
        for (int i = 0; i < cadenaN.getLongitud(); i++) {
            if(cadenaN.getFrase().charAt(i) == X){
                caracter += 1;
            }            
        }
        
        System.out.println("El carácter '"+X+"' se repite "+caracter+" veces.");
        
        return null;
    }
    
    public Cadena compararLongitud(Cadena cadenaN){
        System.out.println("Ingrese la frase a comparar: ");
        String cadCompare = read.next();
        
        if(cadenaN.getLongitud() == cadCompare.length()){
            System.out.println("Ambas frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases no tienen la misma longitud.");
        }
        
        return null;
    }

    public Cadena unirFrases(Cadena cadenaN){
        System.out.println("Ingrese la frase a agregar: ");
        String cadAdd = read.next();
        
        String fraseTotal = cadenaN.getFrase().concat(cadAdd);
        
        System.out.println(fraseTotal);

        return null;
    }

    public Cadena reemplazar(Cadena cadenaN) {
        System.out.println("Ingrese carácter para reemplazar: ");
        char X = read.next().charAt(0);
        String cadenaNew = cadenaN.getFrase();

        cadenaNew = cadenaNew.replace('a', X);
        
        System.out.println(cadenaNew);

        return null;
    }
    
    public Cadena contiene(Cadena cadenaN){
        System.out.println("Ingrese la letra a buscar: ");
        char letra = read.next().charAt(0);
        boolean quest = false;
        
        for (int i = 0; i < cadenaN.getLongitud(); i++) {
            if(cadenaN.getFrase().charAt(i) == letra){
                quest = true;
            }
            
        }
        
        System.out.println("¿Se encuentra la letra "+letra+" en la frase?: "+quest);
        
        return null;
    }
    
}
