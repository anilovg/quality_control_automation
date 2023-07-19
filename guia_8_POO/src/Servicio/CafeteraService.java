/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/* Programa Nespresso.
Desarrolle una clase Cafetera con los atributos capacidadMaxima (la cantidad máxima de café
que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la
cafetera).
Implemente, al menos, los siguientes métodos:
* Constructor predeterminado o vacío
* Constructor con la capacidad máxima y la cantidad actual
* Métodos getters y setters.
* Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
* Método vaciarCafetera(): pone la cantidad de café actual en cero.
* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.

 * @author Ani
 */
public class CafeteraService {
    
    private Scanner read = new Scanner(System.in);
    
    public Cafetera generarCafetera(){
        
        return new Cafetera(0, 0);
                  
    }

    public Cafetera llenarCafetera(Cafetera cafeteraN){
        cafeteraN.setCantidadActual(100);
        
        System.out.println("La cantidad de café actual es de: "+cafeteraN.getCantidadActual());
                
        return null;
    }
    
    public Cafetera servirTaza(Cafetera cafeteraN){
        System.out.println("Ingrese la capacidad de la taza (entre 1 y 100):");
        int tazaVacia = read.nextInt();
        
        if(cafeteraN.getCantidadActual()<tazaVacia){
            tazaVacia = cafeteraN.getCantidadActual();
            System.out.println("Café insuficiente. La taza tiene "+tazaVacia+" de café.");
            cafeteraN.setCantidadActual(0);
        } else {
            cafeteraN.setCantidadActual(cafeteraN.getCantidadActual()-tazaVacia);
            System.out.println("Taza llenada con éxito."
                    + "\nCafé actual en la cafetera: "+cafeteraN.getCantidadActual());
        }
        
        return null;
    }
    
    public Cafetera vaciarCafetera(Cafetera cafeteraN){
        cafeteraN.setCantidadActual(0);
        System.out.println("La cantidad de café actual es: "+cafeteraN.getCantidadActual());        
        
        return null;
    }
    
    public Cafetera agregarCafe(Cafetera cafeteraN){
        System.out.println("¿Cuánto café agregará a la cafetera?");
        int cafeAgregar = read.nextInt();
        
        if(cafeAgregar+cafeteraN.getCantidadActual()<=100){
            cafeteraN.setCantidadActual(cafeteraN.getCantidadActual()+cafeAgregar);
            System.out.println("La cantidad de café actual es: "+cafeteraN.getCantidadActual());
        } else {
            System.out.println("La cantidad se excede, la cafetera se llenará hasta su límite.");
            cafeteraN.setCantidadActual(100);
            System.out.println("La cantidad de café actual es: "+cafeteraN.getCantidadActual());
        }
        
        return null;
    }
    
    public Cafetera menuCafetera(Cafetera cafeteraN) {
        int opcion;

        do {
            System.out.println("¿Qué desea realizar?"
                    + "\n1. Llenar la cafetera."
                    + "\n2. Servir una taza."
                    + "\n3. Vaciar la cafetera."
                    + "\n4. Agregar café a la cafetera."
                    + "\n5. Salir.");

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    llenarCafetera(cafeteraN);
                    continue;

                case 2:
                    servirTaza(cafeteraN);
                    continue;

                case 3:
                    vaciarCafetera(cafeteraN);
                    continue;

                case 4:
                    agregarCafe(cafeteraN);
                    continue;

                case 5:
                    break;
            }

        } while (opcion != 5);

        return null;

    }
    
}
