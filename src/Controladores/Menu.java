package Controladores;

import java.util.Scanner;

public class Menu {
    Scanner opcionUsuario = new Scanner(System.in);

    Metodos metodos = new Metodos();

    public void menu(){
        metodos.librosExistentes();

        System.out.println("Bienvenido a la biblioteca G&D" + "\n" + "Estos son los libros que tenemos disponibles actualmente:");
        metodos.librosActuales();

        System.out.println("""
                Elija que opción desea hacer hoy en la biblioteca
                1. Donar libro a la Biblioteca.
                2. Pedir prestado un libro
                3. Mostrar información de los libros
                4. Devolver algun libro que hayas sacado prestado""");

        Integer respuesta = opcionUsuario.nextInt();

    }
}
