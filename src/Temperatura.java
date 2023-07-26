import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Temperatura extends JFrame {
    private JComboBox TemperaturaOrigen;
    private JComboBox TemperaturaDestino;
    private JButton convertirButton;
    private JButton atrásButton;
    private JPanel panel5;
    private JTextField textField1;
    private JLabel Titulo5;
    private JLabel CantidadConvertida;

    public Temperatura() {
        super("Alura Converter");
        setContentPane(panel5);


        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temperaturaOrigen = (String) TemperaturaOrigen.getSelectedItem();
                String temperaturaDestino = (String) TemperaturaDestino.getSelectedItem();
                double cantidad = Double.parseDouble(textField1.getText());

                double resultado = 0;
                assert temperaturaOrigen != null;
                switch (temperaturaOrigen) {
                    case "Celsius":
                        assert temperaturaDestino != null;
                        switch (temperaturaDestino) {
                            case "Celsius":

                                resultado = cantidad;
                                break;
                            case "Fahrenheit":
                                resultado = (cantidad * 9 / 5) + 32;
                                break;
                            case "Kelvin":
                                resultado = cantidad + 273.15;
                                break;
                        }
                        break;
                    case "Fahrenheit":
                        assert temperaturaDestino != null;
                        switch (temperaturaDestino) {
                            case "Celsius":
                                resultado = (cantidad - 32) * 5 / 9;
                                break;
                            case "Fahrenheit":
                                resultado = cantidad;
                                break;
                            case "Kelvin":
                                resultado = (cantidad + 459.67) * 5 / 9;
                                break;
                        }
                        break;
                    case "Kelvin":
                        assert temperaturaDestino != null;
                        switch (temperaturaDestino) {
                            case "Celsius":
                                resultado = cantidad - 273.15;
                                break;
                            case "Fahrenheit":
                                resultado = (cantidad * 9 / 5) - 459.67;
                                break;
                            case "Kelvin":
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
