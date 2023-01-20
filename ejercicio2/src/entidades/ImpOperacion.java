package entidades;

import java.util.Scanner;

public class ImpOperacion implements Operacion, Suma{
    private int numero1;
    private int nummero2;
    private int resultado;
    @Override
    public void Saludar() {
        System.out.println("Esto es una operacion matamatica");
    }

    @Override
    public void TipoOperacion() {
        System.out.println("Tipo de operacion: SUMA");

    }

    @Override
    public void Operacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valor de numero 1: ");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese valor de numero 2: ");
        nummero2 = scanner.nextInt();

        resultado= numero1 + nummero2;

        System.out.println("El resultado de la suma de " + numero1 + " y " + nummero2 + " es: " + resultado) ;




    }
}
