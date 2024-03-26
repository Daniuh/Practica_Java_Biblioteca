package Modelos;

import java.util.ArrayList;

public class Libro {

    static Integer contador = 0;
    private Integer id = 0;
    private String autor = "";
    private String titulo = "";
    private Integer ejemplaresDisponibles = 0;

    public Libro(String autor, String titulo, Integer ejemplaresDisponibles) {
        this.id = ++contador;
        this.autor = autor;
        this.titulo = titulo;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public String getAutor() {return autor;}
    public String getTitulo() {return titulo;}
    public Integer getEjemplaresDisponibles() {return ejemplaresDisponibles;}

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                " Autor: " + autor + "\n" +
                " Titulo: " + titulo + "\n" +
                " Copias: " + ejemplaresDisponibles + "\n";
    }
}
