/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/* Crear una clase llamada Libro que contenga los siguientes atributos:
    -ISBN  -Título  -Autor -Número de páginas
    Un constructor con todos los atributos pasados por parámetro y un constructor vacío.
    Crear un método para cargar un libro pidiendo los datos al usuario y luego informar
    mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 * @author Ani
 */
public class Libro {
    
    // Atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
   
}
