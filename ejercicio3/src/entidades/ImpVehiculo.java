package entidades;

import java.util.Scanner;

public class ImpVehiculo implements Auto, Moto{
    private String marca;
    private int velocidad;
    private String color;
    private String patente;
    private String marcaCubierta;

    public ImpVehiculo() {
    }

    public ImpVehiculo(String marca, int velocidad,
                       String color, String patente, String marcaCubierta) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.color = color;
        this.patente = patente;
        this.marcaCubierta = marcaCubierta;
    }

    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar MARCA");
        marca = scanner.nextLine();

        System.out.println("Ingrese COLOR");
        color = scanner.nextLine();
        System.out.println("Ingrese la PATENTE");
        patente = scanner.nextLine();
        System.out.println("Ingrese MARCA DE CUBIERTA");
        marcaCubierta = scanner.nextLine();
        System.out.println("Ingrese su VELOCIDAD");
        velocidad = scanner.nextInt();
    }

    @Override
    public void Marca() {
        System.out.println("Marca del rodado " + marca);
    }

    @Override
    public void Velocidad() {
        System.out.println("Velocidad del rodado " + velocidad);

    }

    @Override
    public void Color() {
        System.out.println("Color del rodado " + color);

    }

    @Override
    public void Patente() {
        System.out.println("Patente= " + patente);

    }

    @Override
    public void MarcaCubierta() {
        System.out.println("Marca de cubierta= " + marcaCubierta);

    }
}
