/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_poo;

import Entidad.Libro;
import Servicio.LibroService;

/* Crear una clase llamada Libro que contenga los siguientes atributos:
    -ISBN  -Título  -Autor -Número de páginas
    Un constructor con todos los atributos pasados por parámetro y un constructor vacío.
    Crear un método para cargar un libro pidiendo los datos al usuario y luego informar
    mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 * @author Ani
 */
public class ejercicio_1 {

    public static void main(String[] args) {
        
        LibroService ls = new LibroService();
        
        Libro libro1 = ls.cargarLibro();
        
        ls.mostrarDatos(libro1);        
        
    }
    
}
