public class Arista {
    private Parada paradaOrigen;
    private Parada paradaDestino;
    private double distancia;

    public Arista(Parada paradaOrigen, Parada paradaDestino, double distancia) {
        this.paradaOrigen = paradaOrigen;
        this.paradaDestino = paradaDestino;
        this.distancia = distancia;
    }

    public Parada getParadaOrigen() {
        return paradaOrigen;
    }

    public Parada getParadaDestino() {
        return paradaDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
