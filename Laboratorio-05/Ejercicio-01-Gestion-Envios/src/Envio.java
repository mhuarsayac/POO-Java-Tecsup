public class Envio implements IRasteable{
    protected String codigo;
    protected float peso;
    protected float distancia;

    public Envio(String codigo, float peso, float distancia) {
        this.codigo = codigo;
        this.peso = peso;
        this.distancia = distancia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float calcularCosto(){
        return 0;
    }

    @Override
    public String toString() {
        return "\n-Codigo: "+codigo+
                "\n-Peso: "+peso+
                "\n-Distancia: "+distancia;
    }


    @Override
    public void mostrarSeguimiento() {
        System.out.println(toString());
    }
}
