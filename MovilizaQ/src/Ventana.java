import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Ventana {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextArea textArea1;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JButton ingresarPoblacionButton;
    private JButton norteButton;
    private JButton centroButton;
    private JButton surButton;
    private JTextField textBarrioinicial;
    private JTextField textBarrio2;
    private JTextField textBarrio3;
    private JTextField textBarrio4;
    private JTextField textBarrio5;
    private JTextField textBarrio6;
    private JTextField textBarrio7;
    private JTextField textBarrio8;
    private JTextField textBarrio9;
    private JTextField textBarrioFinal;
    private Grafo grafo;

    public Ventana() {
        grafo = new Grafo(); // Inicializar el grafo

        ingresarPoblacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarPoblacion();
            }
        });

        norteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configurarParadasNorte();
            }
        });

        centroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configurarParadasCentro();
            }
        });

        surButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configurarParadasSur();
            }
        });
    }

    private void configurarParadasNorte() {
        grafo = new Grafo(); // Reiniciar el grafo para la configuración del norte

        // Crear paradas
        Parada parada1 = new Parada(1, "Plan Techo", "Estadio Barrial");
        Parada parada2 = new Parada(2, "Rancho Alto", "Principal");
        Parada parada3 = new Parada(3, "San Jose Obrero", "Camino Nono");
        Parada parada4 = new Parada(4, "Mena de Hierro", "Machala");
        Parada parada5 = new Parada(5, "Condado", "Redondel San Franc");
        Parada parada6 = new Parada(6, "Ofelia", "Ofelia");
        Parada parada7 = new Parada(7, "Cotocollao", "Rigoberto Heredia");
        Parada parada8 = new Parada(8, "Carcelen", "Av.Diego de Vasquez");
        Parada parada9 = new Parada(9, "Terminal Carcelen", "Intercambiador Carcelen");
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

        actualizarTextosParadas(parada1, parada2, parada3, parada4, parada5, parada6, parada7, parada8, parada9, parada10);
    }

    private void configurarParadasCentro() {
        grafo = new Grafo(); // Reiniciar el grafo para la configuración del centro

        // Crear paradas
        Parada parada1 = new Parada(1, "Cola Amazonas", "Jose Monroy 2");
        Parada parada2 = new Parada(2, "Centro Histórico", "Estacion San Francisco");
        Parada parada3 = new Parada(3, "El Ejido", "Estacion La Alameda");
        Parada parada4 = new Parada(4, "La Tola / La Tola Alta", "Valparaiso");
        Parada parada5 = new Parada(5, "Barrio Paluco", "Gonzalo Escudero y Tomas Rousseau");
        Parada parada6 = new Parada(6, "Mariscal Sucre", "Juan Leon Mera y N21");
        Parada parada7 = new Parada(7, "Miraflores", "Versalles y Jeronimo Carreon");
        Parada parada8 = new Parada(8, "El Panecillo / San Sebastián", "5 de Junio Y Francisco Quijano 2");
        Parada parada9 = new Parada(9, "San Roque", "De Los Libertadores Y S7");
        Parada parada10 = new Parada(10, "La Vicentina", "Melchor de Benavides Y Obelisco Vicentina");

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
        grafo.agregarArista(parada1, parada2, 2.1);
        grafo.agregarArista(parada1, parada7, 3.4);
        grafo.agregarArista(parada1, parada9, 8.1);
        grafo.agregarArista(parada2, parada9, 3.1);
        grafo.agregarArista(parada2, parada3, 2.4);
        grafo.agregarArista(parada2, parada8, 1.5);
        grafo.agregarArista(parada2, parada4, 2.5);
        grafo.agregarArista(parada3, parada4, 1.9);
        grafo.agregarArista(parada3, parada7, 1.9);
        grafo.agregarArista(parada3, parada10, 3.0);
        grafo.agregarArista(parada4, parada8, 3.0);
        grafo.agregarArista(parada4, parada5, 3.6);
        grafo.agregarArista(parada5, parada10, 8.9);
        grafo.agregarArista(parada6, parada10, 2.6);
        grafo.agregarArista(parada6, parada7, 2.1);

        actualizarTextosParadas(parada1, parada2, parada3, parada4, parada5, parada6, parada7, parada8, parada9, parada10);
    }

    private void configurarParadasSur() {
        grafo = new Grafo(); // Reiniciar el grafo para la configuración del sur

        // Crear paradas
        Parada parada1 = new Parada(1, "La Magdalena", "Av. Mariscal Sucre");
        Parada parada2 = new Parada(2, "Chimbacalle", "Pedro Vicente Maldonado");
        Parada parada3 = new Parada(3, "La Mena", "La Raya");
        Parada parada4 = new Parada(4, "Santa Anita", "Av. 6 de Diciembre");
        Parada parada5 = new Parada(5, "La Ecuatoriana", "Avenida Maldonado");
        Parada parada6 = new Parada(6, "Turubamba", "Avenida Mariscal Sucre");
        Parada parada7 = new Parada(7, "Guamaní", "Avenida Maldonado");
        Parada parada8 = new Parada(8, "Quitumbe", "Terminal Quitumbe");
        Parada parada9 = new Parada(9, "Solanda", "Avenida Cardenal de la Torre");
        Parada parada10 = new Parada(10, "La Victoria", "Avenida Mariscal Sucre");

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
        grafo.agregarArista(parada1, parada2, 3.0);
        grafo.agregarArista(parada2, parada3, 2.5);
        grafo.agregarArista(parada3, parada4, 4.0);
        grafo.agregarArista(parada4, parada5, 3.5);
        grafo.agregarArista(parada5, parada6, 2.0);
        grafo.agregarArista(parada6, parada7, 2.2);
        grafo.agregarArista(parada7, parada8, 3.5);
        grafo.agregarArista(parada8, parada9, 4.0);
        grafo.agregarArista(parada9, parada10, 2.0);

        actualizarTextosParadas(parada1, parada2, parada3, parada4, parada5, parada6, parada7, parada8, parada9, parada10);
    }

    private void actualizarTextosParadas(Parada... paradas) {
        textBarrioinicial.setText(paradas[0].getBarrio());
        textBarrio2.setText(paradas[1].getBarrio());
        textBarrio3.setText(paradas[2].getBarrio());
        textBarrio4.setText(paradas[3].getBarrio());
        textBarrio5.setText(paradas[4].getBarrio());
        textBarrio6.setText(paradas[5].getBarrio());
        textBarrio7.setText(paradas[6].getBarrio());
        textBarrio8.setText(paradas[7].getBarrio());
        textBarrio9.setText(paradas[8].getBarrio());
        textBarrioFinal.setText(paradas[9].getBarrio());
    }

    private void ingresarPoblacion() {
        try {
            Parada parada1 = grafo.getParadas().get(0);
            parada1.setPoblacion(Integer.parseInt(textField1.getText()));

            Parada parada2 = grafo.getParadas().get(1);
            parada2.setPoblacion(Integer.parseInt(textField2.getText()));

            Parada parada3 = grafo.getParadas().get(2);
            parada3.setPoblacion(Integer.parseInt(textField3.getText()));

            Parada parada4 = grafo.getParadas().get(3);
            parada4.setPoblacion(Integer.parseInt(textField4.getText()));

            Parada parada5 = grafo.getParadas().get(4);
            parada5.setPoblacion(Integer.parseInt(textField5.getText()));

            Parada parada6 = grafo.getParadas().get(5);
            parada6.setPoblacion(Integer.parseInt(textField6.getText()));

            Parada parada7 = grafo.getParadas().get(6);
            parada7.setPoblacion(Integer.parseInt(textField7.getText()));

            Parada parada8 = grafo.getParadas().get(7);
            parada8.setPoblacion(Integer.parseInt(textField8.getText()));

            Parada parada9 = grafo.getParadas().get(8);
            parada9.setPoblacion(Integer.parseInt(textField9.getText()));

            Parada parada10 = grafo.getParadas().get(9);
            parada10.setPoblacion(Integer.parseInt(textField10.getText()));

            // Imprimir la ruta óptima en el JTextArea
            imprimirRutaOptima();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en todos los campos de población.");
        }
    }

    private void imprimirRutaOptima() {
        Parada origen = grafo.getParadas().get(0);  // Asumiendo que la parada 1 es el origen
        Parada destino = grafo.getParadas().get(grafo.getParadas().size() - 1);  // Asumiendo que la parada 10 es el destino
        List<Parada> caminoMasRapido = grafo.caminoMasRapido(origen, destino);

        StringBuilder sb = new StringBuilder();
        sb.append("Camino más rápido de ").append(origen.getBarrio()).append(" a ").append(destino.getBarrio()).append(":\n");
        for (Parada parada : caminoMasRapido) {
            sb.append(parada).append("\n");
        }
        textArea1.setText(sb.toString());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        Ventana ventana = new Ventana();
        frame.setContentPane(ventana.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
