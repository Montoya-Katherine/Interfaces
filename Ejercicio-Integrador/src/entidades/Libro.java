package entidades;

import java.util.Scanner;

public class Libro implements Bibloteca{
    private String nombre;
    private String apellido;
    private String titulo;
    private int paginas;

    public Libro() {
    }

    @Override
    public void CrearAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del autor: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del autor: ");
        apellido = scanner.nextLine();

    }

    @Override
    public void CrearLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál és el título del libro? - Ingrese respuesta");
        titulo = scanner.nextLine();
        System.out.println("¿Cuál és la cantidad de páginas? - Ingrese respuesta");
        paginas = scanner.nextInt();

    }

    public void mostrarLibro(){
        System.out.println("Titulo del libro: " + titulo +
                '\n' + "Autor: " + nombre + " "+ apellido +
                '\n' + "Cantidad de páginas: " + paginas) ;
    }
}
