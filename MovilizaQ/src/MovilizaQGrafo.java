/*import java.util.List;
import java.util.Scanner;

public class MovilizaQGrafo {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Crear paradas
        Parada parada1 = new Parada(1, "Plan Techo", "Estadio Barrial");
        Parada parada2 = new Parada(2, "Rancho Alto", "Principal");
        Parada parada3 = new Parada(3, "San Jose Obrero", "Camino Nono");
        Parada parada4 = new Parada(4, "Mena de Hierro", "Machala");
        Parada parada5 = new Parada(5, "Coandado", "Redondel San Franc");
        Parada parada6 = new Parada(6, "Ofelia", "Ofelia");
        Parada parada7 = new Parada(7, "Cotocollao", "Rigoberto Heredia");
        Parada parada8 = new Parada(8, "Carcelen", "Av.Diego de Vasquez");
        Parada parada9 = new Parada(9, "Terminal Carcelen", "Intercabiador Carcelen");
        Parada parada10 = new Parada(10, "La Bota", "Intercambiador Carapungo");

        // Agregar paradas al grafo
        grafo.agregarParada(parada1);
        grafo.agregarParada(parada2);
        grafo.agregarParada(parada3);
        grafo.agregarParada(parada4);
        grafo.agregarParada(parada5);
        grafo.agregarParada(parada6);
        grafo.agregarParada(parada7);
        grafo.agregarParada(parada8);
        grafo.agregarParada(parada9);
        grafo.agregarParada(parada10);

        // Crear aristas
        grafo.agregarArista(parada1, parada2, 4.4);
        grafo.agregarArista(parada1, parada3, 5.1);
        grafo.agregarArista(parada3, parada4, 2.0);
        grafo.agregarArista(parada2, parada4, 4.9);
        grafo.agregarArista(parada3, parada7, 4.7);
        grafo.agregarArista(parada4, parada7, 2.4);
        grafo.agregarArista(parada2, parada5, 2.7);
        grafo.agregarArista(parada5, parada4, 2.5);
        grafo.agregarArista(parada4, parada6, 2.6);
        grafo.agregarArista(parada5, parada6, 3.2);
        grafo.agregarArista(parada7, parada6, 1.5);
        grafo.agregarArista(parada6, parada8, 2.0);
        grafo.agregarArista(parada8, parada9, 2.0);
        grafo.agregarArista(parada6, parada9, 3.9);
        grafo.agregarArista(parada6, parada10, 5.7);
        grafo.agregarArista(parada7, parada10, 7.5);
        grafo.agregarArista(parada9, parada10, 1.8);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar población a los barrios");
            System.out.println("2. Modificar población de barrios");
            System.out.println("3. Imprimir ruta óptima (Dijkstra)");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarPoblacion(grafo, scanner);
                    break;
                case 2:
                    modificarPoblacion(grafo, scanner);
                    break;
                case 3:
                    imprimirRutaOptima(grafo);
                    break;

                default:
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void ingresarPoblacion(Grafo grafo, Scanner scanner) {
        for (Parada parada : grafo.getParadas()) {
            if (parada.getPoblacion() == 0) {
                System.out.print("Ingrese la población para " + parada.getBarrio() + ": ");
                int poblacion = scanner.nextInt();
                parada.setPoblacion(poblacion);
            }
        }
    }

    private static void modificarPoblacion(Grafo grafo, Scanner scanner) {
        for (Parada parada : grafo.getParadas()) {
            System.out.print("Ingrese la nueva población para " + parada.getBarrio() + ": ");
            int poblacion = scanner.nextInt();
            parada.setPoblacion(poblacion);
        }
    }

    private static void imprimirRutaOptima(Grafo grafo) {
        Parada origen = grafo.getParadas().get(0);  // Asumiendo que la parada 1 es el origen
        Parada destino = grafo.getParadas().get(grafo.getParadas().size() - 1);  // Asumiendo que la parada 10 es el destino
        List<Parada> caminoMasRapido = grafo.caminoMasRapido(origen, destino);
        System.out.println("Camino más rápido de " + origen.getBarrio() + " a " + destino.getBarrio() + ":");
        for (Parada parada : caminoMasRapido) {
            System.out.println(parada);
        }
    }
}
*/