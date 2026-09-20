public class Electrodomestico implements IEncendible{
    protected String nombre;
    protected int cantidadHorasUsadas;
    protected float consumoEnergiaPorHora;

    public Electrodomestico(String nombre, int cantidadHorasUsadas, float consumoEnergiaPorHora) {
        this.nombre = nombre;
        this.cantidadHorasUsadas = cantidadHorasUsadas;
        this.consumoEnergiaPorHora = consumoEnergiaPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHorasUsadas() {
        return cantidadHorasUsadas;
    }

    public void setCantidadHorasUsadas(int cantidadHorasUsadas) {
        this.cantidadHorasUsadas = cantidadHorasUsadas;
    }

    public float getConsumoEnergiaPorHora() {
        return consumoEnergiaPorHora;
    }

    public void setConsumoEnergiaPorHora(float consumoEnergiaPorHora) {
        this.consumoEnergiaPorHora = consumoEnergiaPorHora;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "nombre='" + nombre + '\'' +
                ", cantidadHoras=" + cantidadHorasUsadas +
                ", consumoEnergiaPorHora=" + consumoEnergiaPorHora +
                '}';
    }

    public float calcularConsumoSemanal(){
        return consumoEnergiaPorHora*cantidadHorasUsadas;
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }
}
