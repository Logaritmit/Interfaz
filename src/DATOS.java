import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DATOS extends JFrame {
    private JPanel panel1;
    private JButton cerrarButton;
    private JButton sumarButton;
    private JButton saludarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JButton LImpiarButton;
    private JTextField textField3;
    private JButton unirButton;


    public  DATOS() {
        super("OPERACIONES");
        setContentPane(panel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });

        LImpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");

            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, (valor1 + valor2));
                }
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos");
                }



            }
        });
        unirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre1 = textField1.getText();
                String nombre2 = textField2.getText();
                String resultado = nombre1 + " " + nombre2;


                JOptionPane.showMessageDialog(null, resultado);
            }
        });

        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = DATOS.this.textField3.getText();
                String saludo = "Hola " + nombre;

                JOptionPane.showMessageDialog(null, saludo);
            }
        });
    }
}



