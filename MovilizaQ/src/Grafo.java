import java.util.*;

public class Grafo {
    private List<Parada> paradas;

    public Grafo() {
        this.paradas = new ArrayList<>();
    }

    public void agregarParada(Parada parada) {
        paradas.add(parada);
    }

    public void agregarArista(Parada origen, Parada destino, double distancia) {
        Arista arista = new Arista(origen, destino, distancia);
        origen.agregarArista(arista);
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    public void ajustarDistanciasPorPoblacion() {
        // Calcular la suma de poblaciones de todos los nodos
        double sumaTotalPoblaciones = paradas.stream()
                .mapToInt(Parada::getPoblacion)
                .sum();

        // Iterar sobre todas las aristas y ajustar distancias según la población
        for (Parada origen : paradas) {
            for (Arista arista : origen.getAristas()) {
                Parada destino = arista.getParadaDestino();
                // Calcular la suma de poblaciones de los nodos conectados por la arista
                int sumaPoblaciones = origen.getPoblacion() + destino.getPoblacion();
                // Comparar con el promedio de la suma total de poblaciones
                if (sumaPoblaciones > sumaTotalPoblaciones / paradas.size()) {
                    // Reducir la distancia en un 40%
                    arista.setDistancia(arista.getDistancia() * 0.6);
                }
            }
        }
    }

    public List<Parada> caminoMasRapido(Parada origen, Parada destino) {
        // Ajustar distancias por población antes de calcular el camino más rápido
        ajustarDistanciasPorPoblacion();

        // Implementación del algoritmo de Dijkstra para encontrar el camino más corto
        Map<Parada, Double> distancias = new HashMap<>();
        Map<Parada, Parada> previos = new HashMap<>();
        PriorityQueue<Parada> queue = new PriorityQueue<>(Comparator.comparing(distancias::get));

        for (Parada parada : paradas) {
            distancias.put(parada, Double.MAX_VALUE);
            previos.put(parada, null);
        }
        distancias.put(origen, 0.0);
        queue.add(origen);

        while (!queue.isEmpty()) {
            Parada actual = queue.poll();

            if (actual.equals(destino)) break;

            for (Arista arista : actual.getAristas()) {
                Parada vecino = arista.getParadaDestino();
                double nuevaDistancia = distancias.get(actual) + arista.getDistancia();
                if (nuevaDistancia < distancias.get(vecino)) {
                    distancias.put(vecino, nuevaDistancia);
                    previos.put(vecino, actual);
                    queue.add(vecino);
                }
            }
        }

        // Construir el camino más corto
        List<Parada> camino = new ArrayList<>();
        for (Parada at = destino; at != null; at = previos.get(at)) {
            camino.add(at);
        }
        Collections.reverse(camino);
        return camino;
    }
}
