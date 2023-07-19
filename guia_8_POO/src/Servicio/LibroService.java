/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/* Crear una clase llamada Libro que contenga los siguientes atributos:
    -ISBN  -Título  -Autor -Número de páginas
    Un constructor con todos los atributos pasados por parámetro y un constructor vacío.
    Crear un método para cargar un libro pidiendo los datos al usuario y luego informar
    mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 * @author Ani
 */
public class LibroService {
    
    private Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Libro cargarLibro(){
        
        System.out.println("Ingrese el ISBN del libro:");
        String ISBN = read.nextLine();
        System.out.println("Ingrese el título del libro:");
        String titulo = read.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = read.nextLine();
        System.out.println("Ingrese el número de páginas del libro:");
        int numPaginas = read.nextInt();
        
        return new Libro(ISBN, titulo, autor, numPaginas);
        
    }
    
    public Libro mostrarDatos(Libro libroN){
        
        System.out.println("Título: "+libroN.getTitulo()
        + "\nAutor: "+libroN.getAutor()
        + "\nISBN: "+libroN.getISBN()
        + "\nNúmero de páginas: "+libroN.getNumPaginas());        
        
        return null;
    }    
}
