public class Electrodomestico {
    protected String nombre;
    protected int cantidadHoras;
    protected float consumoEnergiaPorHora;

    public Electrodomestico(String nombre, int cantidadHoras, float consumoEnergiaPorHora) {
        this.nombre = nombre;
        this.cantidadHoras = cantidadHoras;
        this.consumoEnergiaPorHora = consumoEnergiaPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
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
                ", cantidadHoras=" + cantidadHoras +
                ", consumoEnergiaPorHora=" + consumoEnergiaPorHora +
                '}';
    }

    public float calcularConsumoSemanal(){
        return 0;
    }
}
