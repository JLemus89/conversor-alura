import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Bienvenido extends JFrame{
    private JPanel panel1;
    private JComboBox comboBox1;
    private JButton salirButton;



    public Bienvenido() {
        super("Alura Converter");
        setContentPane(panel1);

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboBox1.getSelectedItem();
                System.out.println(seleccion);
                assert seleccion != null;
                switch (seleccion) {
                    case "\uD83D\uDCB1 Divisas":
                        Divisas dialog = new Divisas();
                        dialog.setSize(400, 300);
                        dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        dialog.setVisible(true);
                        dispose();
                        break;
                    case "\uD83D\uDCCF Longitud":
                        Medidas dialog2 = new Medidas();
                        dialog2.setSize(400, 300);
                        dialog2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        dialog2.setVisible(true);
                        dispose();
                        break;
                    case "\uD83C\uDF21\uFE0F Temperatura":
                        Temperatura dialog3 = new Temperatura();
                        dialog3.setSize(400, 300);
                        dialog3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        dialog3.setVisible(true);
                        dispose();
                        break;
                }
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
