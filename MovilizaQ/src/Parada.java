import java.util.ArrayList;
import java.util.List;

public class Parada {
    private int numParada;
    private int poblacion;
    private String barrio;
    private String callePrincipal;
    private List<Arista> aristas;

    public Parada(int numParada, String barrio, String callePrincipal) {
        this.numParada = numParada;
        this.barrio = barrio;
        this.callePrincipal = callePrincipal;
        this.poblacion = 0;
        this.aristas = new ArrayList<>();
    }

    public int getNumParada() {
        return numParada;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void agregarArista(Arista arista) {
        aristas.add(arista);
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    @Override
    public String toString() {
        return "Parada " + numParada + " - Barrio: " + barrio + " - Calle Principal: " + callePrincipal + " - Población: " + poblacion;
    }
}
