package Controladores;

import java.util.Scanner;

public class Menu {
    Scanner opcionUsuario = new Scanner(System.in);

    Metodos metodos = new Metodos();
    private Integer respuesta;

    public Integer getRespuesta() {return respuesta;}

    public void setRespuesta(Integer respuesta) {this.respuesta = respuesta;}

    public void capturarRespuesta(){
        boolean validacionRespuesta = false;

        System.out.println("""
                Elija que opción desea hacer hoy en la biblioteca
                1. Donar libro a la Biblioteca.
                2. Pedir prestado un libro
                3. Mostrar información de los libros
                4. Devolver algún libro que hayas sacado prestado
                5. Me equivoqué, quiero salir""");

        while (!validacionRespuesta) {
            if (opcionUsuario.hasNextInt()) {
                Integer verificarRespuesta = opcionUsuario.nextInt();
                int validarNumero = verificarRespuesta;
                if (validarNumero > 0 && validarNumero < 6) {
                    setRespuesta(verificarRespuesta);
                    validacionRespuesta = true;
                }else {
                    System.out.println("Error: Entrada invalida, por favor ingrese un numero que este dentro de la opción");
                }
                setRespuesta(verificarRespuesta);
            } else {
                System.out.println("Error: Entrada invalida, por favor ingrese un numero y que este dentro de la opción");
                opcionUsuario.next();
            }
        }
    }

    public void menu() {
        metodos.librosExistentes();

        System.out.println("Bienvenido a la biblioteca G&D" + "\n" + "Estos son los libros que tenemos disponibles actualmente:");
        metodos.librosActuales();

            capturarRespuesta();
            switch (getRespuesta()) {
                case 1:
                    metodos.registrarLibro();
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
            }
    }

}
