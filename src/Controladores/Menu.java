package Controladores;

import Modelos.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner opcionUsuario = new Scanner(System.in);

    Metodos metodos = new Metodos();

    public void menu(){
        metodos.librosExistentes();

        System.out.println("Bienvenido a la biblioteca G&D" + "\n" + "Estos son los libros que tenemos disponibles actualmente:");
        metodos.librosActuales();
    }
}
