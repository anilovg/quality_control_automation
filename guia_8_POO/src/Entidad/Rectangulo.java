/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

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
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
    

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
