package entidades;

public class ImpLibro implements Libro{
    @Override
    public void Titulo() {
        System.out.println("Título del libro: Harry Potter y la piedra filosofal");
    }

    @Override
    public void CantPaginas() {
        System.out.println("Cantidad de paginas: 254");

    }

    @Override
    public void Autor() {
        System.out.println("Autor: J.K. ROWLING");

    }
}
