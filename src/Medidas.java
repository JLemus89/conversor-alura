import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Medidas extends JFrame  {
    private JComboBox MedidaOrigen;
    private JComboBox MedidaDestino;
    private JButton convertirButton;
    private JButton atrásButton;
    private JPanel panel4;
    private JTextField textField1;
    private JLabel Titulo4;
    private JLabel CantidadConvertida;

    public Medidas() {
        super("Alura Converter");
        setContentPane(panel4);

        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medidaOrigen = (String) MedidaOrigen.getSelectedItem();
                String medidaDestino = (String) MedidaDestino.getSelectedItem();
                double cantidad = Double.parseDouble(textField1.getText());
                double resultado = 0;
                assert medidaOrigen != null;
                switch (medidaOrigen) {
                    case "Kilometros":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad;
                                break;
                            case "Metros":
                                resultado = cantidad * 1000;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 100000;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 1000000;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 1000000000;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 1000000000000.0;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.621371;
                                break;
                            case "Yardas":
                                resultado = cantidad * 1093.61;
                                break;
                            case "Pies":
                                resultado = cantidad * 3280.84;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 39370.1;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.539957;
                                break;
                        }
                        break;
                    case "Metros":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 0.001;
                                break;
                            case "Metros":
                                resultado = cantidad;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 100;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 1000;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 1000000;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 1000000000;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.000621371;
                                break;
                            case "Yardas":
                                resultado = cantidad * 1.09361;
                                break;
                            case "Pies":
                                resultado = cantidad * 3.28084;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 39.3701;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.000539957;
                                break;
                        }
                        break;
                    case "Centimetros":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 0.00001;
                                break;
                            case "Metros":
                                resultado = cantidad * 0.01;
                                break;
                            case "Centimetros":
                                resultado = cantidad;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 10;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 10000;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 10000000;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.0000062137;
                                break;
                            case "Yardas":
                                resultado = cantidad * 0.0109361;
                                break;
                            case "Pies":
                                resultado = cantidad * 0.0328084;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 0.393701;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.00000539957;
                                break;
                        }
                        break;
                    case "Milimetros":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 0.000001;
                                break;
                            case "Metros":
                                resultado = cantidad * 0.001;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 0.1;
                                break;
                            case "Milimetros":
                                resultado = cantidad;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 1000;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 1000000;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.00000062137;
                                break;
                            case "Yardas":
                                resultado = cantidad * 0.00109361;
                                break;
                            case "Pies":
                                resultado = cantidad * 0.00328084;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 0.0393701;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.000000539957;
                                break;
                        }
                        break;
                    case "Micrometros":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 0.000000001;
                                break;
                            case "Metros":
                                resultado = cantidad * 0.000001;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 0.0001;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 0.001;
                                break;
                            case "Micrometros":
                                resultado = cantidad;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 1000;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.00000000062137;
                                break;
                            case "Yardas":
                                resultado = cantidad * 0.00000109361;
                                break;
                            case "Pies":
                                resultado = cantidad * 0.00000328084;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 0.0000393701;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.000000000539957;
                                break;
                        }
                        break;
                    case "Nanometros":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 0.000000000001;
                                break;
                            case "Metros":
                                resultado = cantidad * 0.000000001;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 0.0000001;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 0.000001;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 0.001;
                                break;
                            case "Nanometros":
                                resultado = cantidad;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.00000000000062137;
                                break;
                            case "Yardas":
                                resultado = cantidad * 0.00000000109361;
                                break;
                            case "Pies":
                                resultado = cantidad * 0.00000000328084;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 0.0000000393701;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.000000000000539957;
                                break;
                        }
                        break;
                    case "Millas":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 1.60934;
                                break;
                            case "Metros":
                                resultado = cantidad * 1609.34;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 160934;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 1609340;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 1609340000;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 1609340000000.0;
                                break;
                            case "Millas":
                                resultado = cantidad;
                                break;
                            case "Yardas":
                                resultado = cantidad * 1760;
                                break;
                            case "Pies":
                                resultado = cantidad * 5280;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 63360;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.868976;
                                break;
                        }
                        break;
                    case "Yardas":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 0.0009144;
                                break;
                            case "Metros":
                                resultado = cantidad * 0.9144;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 91.44;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 914.4;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 914400;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 914400000;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.000568182;
                                break;
                            case "Yardas":
                                resultado = cantidad;
                                break;
                            case "Pies":
                                resultado = cantidad * 3;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 36;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.000493737;
                                break;
                        }
                        break;
                    case "Pies":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 0.0003048;
                                break;
                            case "Metros":
                                resultado = cantidad * 0.3048;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 30.48;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 304.8;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 304800;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 304800000;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.000189394;
                                break;
                            case "Yardas":
                                resultado = cantidad * 0.333333;
                                break;
                            case "Pies":
                                resultado = cantidad;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 12;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.000164579;
                                break;
                        }
                        break;
                    case "Pulgadas":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 0.0000254;
                                break;
                            case "Metros":
                                resultado = cantidad * 0.0254;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 2.54;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 25.4;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 25400;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 25400000;
                                break;
                            case "Millas":
                                resultado = cantidad * 0.0000157828;
                                break;
                            case "Yardas":
                                resultado = cantidad * 0.0277778;
                                break;
                            case "Pies":
                                resultado = cantidad * 0.0833333;
                                break;
                            case "Pulgadas":
                                resultado = cantidad;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad * 0.0000137149;
                                break;
                        }
                        break;
                    case "Millas nauticas":
                        switch (medidaDestino) {
                            case "Kilometros":
                                resultado = cantidad * 1.852;
                                break;
                            case "Metros":
                                resultado = cantidad * 1852;
                                break;
                            case "Centimetros":
                                resultado = cantidad * 185200;
                                break;
                            case "Milimetros":
                                resultado = cantidad * 1852000;
                                break;
                            case "Micrometros":
                                resultado = cantidad * 1852000000;
                                break;
                            case "Nanometros":
                                resultado = cantidad * 1852000000000.0;
                                break;
                            case "Millas":
                                resultado = cantidad * 1.15078;
                                break;
                            case "Yardas":
                                resultado = cantidad * 2025.37;
                                break;
                            case "Pies":
                                resultado = cantidad * 6076.12;
                                break;
                            case "Pulgadas":
                                resultado = cantidad * 72913.4;
                                break;
                            case "Millas nauticas":
                                resultado = cantidad;
                                break;
                        }
                        break;
            }
                CantidadConvertida.setText(String.valueOf(resultado));
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
    }
}
