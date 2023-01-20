import entidades.ImpVehiculo;

public class Main {
    public static  void main ( String [] args){
        ImpVehiculo objetoAuto = new ImpVehiculo();
        objetoAuto.pedirDatos();
        objetoAuto.Marca();
        objetoAuto.Velocidad();
        objetoAuto.Color();
        objetoAuto.Patente();
        objetoAuto.MarcaCubierta();
        System.out.println(" ");

        ImpVehiculo objetoMoto = new ImpVehiculo("ZANELLA",250,"NEGRO","A123AA", "BRIGESTONE");
        objetoMoto.Marca();
        objetoMoto.Velocidad();
        objetoMoto.Color();
        objetoMoto.Patente();
        objetoMoto.MarcaCubierta();
    }
}
