public class EnvioAereo extends Envio implements IRasteable {
    private float costoSeguro;

    public EnvioAereo(String codigo, float peso, float distancia, float costoSeguro) {
        super(codigo, peso, distancia);
        this.costoSeguro = costoSeguro;
    }

    public float getCostoSeguro() {
        return costoSeguro;
    }

    public void setCostoSeguro(float costoSeguro) {
        this.costoSeguro = costoSeguro;
    }

    @Override
    public float calcularCosto() {
        return (peso * 8 + distancia * 1.2f + costoSeguro);
    }

    @Override
    public void mostrarSeguimiento() {
        System.out.print("\nInformacion del Envio Aereo");
        super.mostrarSeguimiento();
        System.out.println("-Costo seguro: " + costoSeguro);
        System.out.println("Su costo final es: " + calcularCosto());
    }
}
