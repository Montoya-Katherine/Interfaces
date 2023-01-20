import entidades.ImpOperacion;

public class Main {
    public static void main (String [] args){
        ImpOperacion operacion = new ImpOperacion();
        operacion.Saludar();
        operacion.Operacion();
        operacion.TipoOperacion();
    }
}
