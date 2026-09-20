public class ElectrodomesticoEntretenimiento extends Electrodomestico implements IEncendible{
    private int cantidadPersonas;

    public ElectrodomesticoEntretenimiento(String nombre, int cantidadHorasUsadas, float consumoEnergiaPorHora) {
        super(nombre, cantidadHorasUsadas, consumoEnergiaPorHora);
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public float calcularConsumoSemanal() {
        return super.calcularConsumoSemanal()*7;
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }
}
