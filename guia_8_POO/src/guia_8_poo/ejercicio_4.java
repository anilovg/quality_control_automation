/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_poo;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

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
public class ejercicio_4 {

    public static void main(String[] args) {

        RectanguloService rect = new RectanguloService();

        Rectangulo rect1 = rect.crearRectangulo();

        rect.calcularSuperficie(rect1);
        rect.calcularPerimetro(rect1);
        rect.dibujarRetangulo(rect1);

    }

}
