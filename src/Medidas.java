import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Medidas extends JFrame {

    private JComboBox<String> MedidaOrigen;
    private JComboBox<String> MedidaDestino;
    private JButton convertirButton;
    private JButton atrásButton;
    private JPanel panel4;
    private JTextField textField1;
    private JLabel Titulo4;
    private JLabel CantidadConvertida;
    private JButton salirButton;

    private final Map<String, Double> conversiones = new HashMap<>();

    public Medidas() {
        super("Alura Converter");
        setContentPane(panel4);
        initConversiones();

        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cantidadStr = textField1.getText();
                if (cantidadStr.isEmpty()) {
                    JOptionPane.showMessageDialog(Medidas.this, "Debe ingresar un valor para la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String medidaOrigen = (String) MedidaOrigen.getSelectedItem();
                String medidaDestino = (String) MedidaDestino.getSelectedItem();
                double cantidad = Double.parseDouble(cantidadStr);

                double resultado = convertirUnidades(medidaOrigen, medidaDestino, cantidad);

                // Formatear el resultado con 7 decimales
                DecimalFormat decimalFormat = new DecimalFormat("#.#####");
                String resultadoFormateado = decimalFormat.format(resultado);

                CantidadConvertida.setText(medidaDestino + ": " + resultadoFormateado);
            }
        });

        atrásButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Bienvenido dialog = new Bienvenido();
                dialog.setSize(400, 300);
                dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dialog.setVisible(true);
                dispose();
            }
        });

        salirButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent cerrar) {
                JOptionPane.showMessageDialog(null, "Gracias por usar Alura Converter");
                super.mouseClicked(cerrar);
                System.exit(0);
                dispose();
            }
        });
    }

    private void initConversiones() {
        // Definir las conversiones entre diferentes unidades de medida
        conversiones.put("Kilometros", 1.0);
        conversiones.put("Metros", 1000.0);
        conversiones.put("Centimetros", 100000.0);
        conversiones.put("Milimetros", 1000000.0);
        conversiones.put("Micrometros", 1000000000.0);
        conversiones.put("Nanometros", 1000000000000.0);
        conversiones.put("Millas", 0.621371);
        conversiones.put("Yardas", 1093.61);
        conversiones.put("Pies", 3280.84);
        conversiones.put("Pulgadas", 39370.1);
        conversiones.put("Millas nauticas", 0.539957);
    }

    private double convertirUnidades(String medidaOrigen, String medidaDestino, double cantidad) {
        if (medidaOrigen.equals(medidaDestino)) {
            return cantidad;
        }

        double factorOrigen = conversiones.get(medidaOrigen);
        double factorDestino = conversiones.get(medidaDestino);

        return cantidad * (factorDestino / factorOrigen);
    }
}
