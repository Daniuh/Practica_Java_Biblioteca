package Modelos;

public class Libro {

    static Integer contador = 0;
    private Integer id;
    private String autor;
    private String titulo;
    private Integer ejemplaresDisponibles;

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
        return STR."id: \{id}\n Autor: \{autor}\n Titulo: \{titulo}\n Copias: \{ejemplaresDisponibles}\n";
    }
}
