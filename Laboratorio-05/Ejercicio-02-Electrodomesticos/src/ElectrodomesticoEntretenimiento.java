public class ElectrodomesticoEntretenimiento extends Electrodomestico implements IEncendible{
    private int cantidadPersonas;

    public ElectrodomesticoEntretenimiento(String nombre, int cantidadHoras, float consumoEnergiaPorHora) {
        super(nombre, cantidadHoras, consumoEnergiaPorHora);
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public float calcularConsumoSemanal() {
        return super.calcularConsumoSemanal();
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }
}
