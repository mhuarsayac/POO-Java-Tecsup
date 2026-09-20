public class ElectrodomesticoCocina extends Electrodomestico {
    private int cantidadDias;

    public ElectrodomesticoCocina(String nombre, int cantidadHoras, float consumoEnergiaPorHora, int cantidadDias) {
        super(nombre, cantidadHoras, consumoEnergiaPorHora);
        this.cantidadDias = cantidadDias;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    @Override
    public float calcularConsumoSemanal() {
        return super.calcularConsumoSemanal();
    }
}
