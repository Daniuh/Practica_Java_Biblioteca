package Principal;

import Controladores.Metodos;
import Modelos.Libro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        metodos.librosExistentes();
        metodos.registrarLibro();
    }
}
