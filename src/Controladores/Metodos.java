package Controladores;

import Modelos.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    Scanner respuestaUsuarioAutor = new Scanner(System.in);
    Scanner respuestaUsuarioTitulo = new Scanner(System.in);
    Scanner respuestaUsuarioDisponibilidad = new Scanner(System.in);
    ArrayList<Libro> libro = new ArrayList<>();

    public void librosExistentes(){
        libro.add(new Libro("J.K. Rowling", "Harry Potter 1", 350));
        libro.add(new Libro("J.R.R. Tolkien", "El señor de los anillos 1", 350));
        libro.add(new Libro("Paulo Coelho", "El alquimista", 350));
    }

    public void librosActuales(){
        for (Libro libroCreado : libro) {
            System.out.println(libroCreado);
        }
    }

    public void registrarLibro(){
    System.out.println("Ingrese el nombre del libro que desea agregar: ");
    String titulo = respuestaUsuarioTitulo.nextLine();

    System.out.println("Ingrese el nombre del autor: ");
    String autor = respuestaUsuarioAutor.nextLine();

    System.out.println("Ingrese la cantidad de copias: ");
    Integer copias = respuestaUsuarioDisponibilidad.nextInt();

    libro.add(new Libro(titulo, autor, copias));

    System.out.println("Se ha guardado con exito!! " + "\n" + "Así quedó la biblioteca ahora: " + "\n");
        for (Libro libroCreado : libro) {
            System.out.println(libroCreado);
        }

    respuestaUsuarioTitulo.close();
    respuestaUsuarioAutor.close();
    respuestaUsuarioDisponibilidad.close();
    }

    public void prestarLibro(){

    }

    public void devolverLibro(){

    }

    public void mostrarInformacion(){

    }

}
