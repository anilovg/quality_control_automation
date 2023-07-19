/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/* Crear una clase Rectangulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del
rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo y
un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 * @author Ani
 */
public class RectanguloService {
    
    private Scanner read = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        System.out.println("Ingrese la base del rectángulo:");
        int base = read.nextInt();
        System.out.println("Ingrese la altura del rectángulo:");
        int altura  =read.nextInt();
        
        return new Rectangulo(base, altura);

    }
    
    public Rectangulo calcularSuperficie(Rectangulo rectN){
        int superficie = rectN.getBase() * rectN.getAltura();
        
        System.out.println("La superficie del rectángulo es de: "+superficie+" cm2.");
        
        return null;
    }
    
    public Rectangulo calcularPerimetro(Rectangulo rectN){
        int perimetro = (rectN.getBase() + rectN.getAltura()) * 2;
        
        System.out.println("El perímetro del rectángulo es de: "+perimetro+" cm.");
        
        return null;
    }
    
    public Rectangulo dibujarRetangulo(Rectangulo rectN){
        int base = rectN.getBase();
        int altura = rectN.getAltura();
        
        System.out.println("\nDibujo del rectángulo:\n");
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                
                if( j == base-1){
                    System.out.println("*\n");
                } else {
                System.out.print("*   ");
                }

            }

        }
        
        return null;
    }
    
}
