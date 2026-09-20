public class ElectrodomesticoCocina extends Electrodomestico implements IEncendible{
    private int cantidadDiasUsadas;

    public ElectrodomesticoCocina(String nombre, int cantidadHorasUsadas, float consumoEnergiaPorHora, int cantidadDias) {
        super(nombre, cantidadHorasUsadas, consumoEnergiaPorHora);
        this.cantidadDiasUsadas = cantidadDias;
    }

    public int getCantidadDiasUsadas() {
        return cantidadDiasUsadas;
    }

    public void setCantidadDiasUsadas(int cantidadDiasUsadas) {
        this.cantidadDiasUsadas = cantidadDiasUsadas;
    }

    @Override
    public float calcularConsumoSemanal() {
        return super.calcularConsumoSemanal()*cantidadDiasUsadas;
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }
}
