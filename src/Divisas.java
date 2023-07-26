import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Divisas extends JFrame {

    private JComboBox MonedaOrigen;
    private JComboBox MonedaDestino;
    private JButton convertirButton;
    private JButton atrásButton;
    private JPanel panel3;
    private JTextField textField1;
    private JLabel Titulo3;
    private JLabel CantidadConvertida;
    private JButton salirButton;

    public Divisas() {
        super("Alura Converter");
        setContentPane(panel3);
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fromCurrency = (String) MonedaOrigen.getSelectedItem();
                String toCurrency = (String) MonedaDestino.getSelectedItem();
                double amount = Double.parseDouble(textField1.getText());

                try {
                    String apiUrl = "https://v6.exchangerate-api.com/v6/fe40a0b6f78de6373dba3c0c/latest/" + fromCurrency;
                    URL url = new URL(apiUrl);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");

                    int responseCode = conn.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();

                        JSONObject jsonResponse = new JSONObject(response.toString());
                        JSONObject rates = jsonResponse.getJSONObject("conversion_rates");

                        double exchangeRate = rates.getDouble(toCurrency);
                        double convertedAmount = amount * exchangeRate;

                        CantidadConvertida.setText(String.valueOf(convertedAmount));
                    } else {
                        CantidadConvertida.setText("Error: Unable to fetch exchange rates.");
                    }
                } catch (Exception ex) {
                    CantidadConvertida.setText("Error: " + ex.getMessage());
                }
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


}
