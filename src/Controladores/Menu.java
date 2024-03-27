package Controladores;

import java.util.Scanner;

public class Menu {
    Scanner opcionUsuario = new Scanner(System.in);

    Metodos metodos = new Metodos();
    private Integer respuesta;
    private Boolean validacionRespuesta = false;
    private Integer verificarRespuesta;

    public Integer getRespuesta() {return respuesta;}

    public void setRespuesta(Integer respuesta) {this.respuesta = respuesta;}

    public void capturarRespuesta(){
        System.out.println("""
                Elija que opción desea hacer hoy en la biblioteca
                1. Donar libro a la Biblioteca.
                2. Pedir prestado un libro
                3. Mostrar información de los libros
                4. Devolver algún libro que hayas sacado prestado
                5. Me equivoqué, quiero salir""");

        while (!validacionRespuesta) {
            if (opcionUsuario.hasNextBigInteger()) {
                verificarRespuesta = opcionUsuario.nextInt();
                if (verificarRespuesta > 0 && verificarRespuesta < 6) {
                    setRespuesta(verificarRespuesta);
                }else {
                    System.out.println("Error: Entrada invalida, por favor ingrese un numero que este dentro de la opción");
                    opcionUsuario.next();
                }
                setRespuesta(verificarRespuesta);
                validacionRespuesta = true;
            } else {
                System.out.println("Error: Entrada invalida, por favor ingrese un numero y que este dentro de la opción");
                opcionUsuario.next();
            }
        }
    }

    public void menu(){
        metodos.librosExistentes();

        System.out.println("Bienvenido a la biblioteca G&D" + "\n" + "Estos son los libros que tenemos disponibles actualmente:");
        metodos.librosActuales();

        capturarRespuesta();
        switch (getRespuesta()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: break;
        }
    }
}
