import entidades.Libro;

public class Main {
    public static void main(String [] args){
        Libro libro1 = new Libro();
        System.out.println("Ingrese datos del libro N° 1");
        libro1.CrearLibro();
        libro1.CrearAutor();

        Libro libro2 = new Libro();
        System.out.println("Ingrese datos del libro N° 2");
        libro2.CrearLibro();
        libro2.CrearAutor();

        Libro libro3 = new Libro();
        System.out.println("Ingrese datos del libro N° 3");
        libro3.CrearLibro();
        libro3.CrearAutor();

        System.out.println("INFORMACIÓN DE BIBLOTECA");
        libro1.mostrarLibro();
        System.out.println(" ");
        libro2.mostrarLibro();;
        System.out.println(" ");
        libro3.mostrarLibro();
    }
}
