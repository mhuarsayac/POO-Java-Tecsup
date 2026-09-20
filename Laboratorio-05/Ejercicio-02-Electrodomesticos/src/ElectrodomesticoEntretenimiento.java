public class ElectrodomesticoEntretenimiento extends Electrodomestico {
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
}
