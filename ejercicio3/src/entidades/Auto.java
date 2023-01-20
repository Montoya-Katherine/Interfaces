package entidades;

public interface Auto extends Vehiculo{
    public void Marca();
    @Override
    void Velocidad();

    @Override
    void Color();

    @Override
    void Patente();
}
