public class EnvioTerrestre extends Envio implements IRasteable {
    private boolean esPrioritario;

    public EnvioTerrestre(String codigo, float peso, float distancia, boolean esPrioritario) {
        super(codigo, peso, distancia);
        this.esPrioritario = esPrioritario;
    }

    public boolean getEsPrioritario() {
        return esPrioritario;
    }

    public void setEsPrioritario(boolean esPrioritario) {
        this.esPrioritario = esPrioritario;
    }

    @Override
    public float calcularCosto() {
        return (peso * 4 + distancia * 0.50f);
    }

    @Override
    public void mostrarSeguimiento() {
        System.out.print("\nInformacion del Envio Terrestre");
        super.mostrarSeguimiento();
        System.out.println("-Es prioritario: " + esPrioritario);
        System.out.println("Su costo final es: " + calcularCosto());
    }
}
