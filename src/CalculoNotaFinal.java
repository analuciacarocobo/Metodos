import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CalculoNotaFinal extends JFrame {
	 private JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
	    private JLabel etiNotaFinal, etiResultado;

	    public CalculoNotaFinal() {
	        setTitle("Calculo de Nota Final");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel panel = new JPanel();

	        txtPrimerTrimestre = new JTextField(5);
	        txtSegundoTrimestre = new JTextField(5);
	        txtTercerTrimestre = new JTextField(5);
	        etiNotaFinal = new JLabel("Nota Final: ");
	        etiResultado = new JLabel("Resultado: ");
	        JButton btnCalcular = new JButton("Calcular");

	        panel.add(new JLabel("Primer Trimestre: "));
	        panel.add(txtPrimerTrimestre);
	        panel.add(new JLabel("Segundo Trimestre: "));
	        panel.add(txtSegundoTrimestre);
	        panel.add(new JLabel("Tercer Trimestre: "));
	        panel.add(txtTercerTrimestre);
	        panel.add(btnCalcular);
	        panel.add(etiNotaFinal);
	        panel.add(etiResultado);

	        add(panel);

	        btnCalcular.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double primerTrimestre = Double.parseDouble(txtPrimerTrimestre.getText());
	                    double segundoTrimestre = Double.parseDouble(txtSegundoTrimestre.getText());
	                    double tercerTrimestre = Double.parseDouble(txtTercerTrimestre.getText());

	                    double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3.0;
	                    etiNotaFinal.setText("Nota Final: " + notaFinal);

	                    if (notaFinal < 5) {
	                        etiResultado.setText("Resultado: SUSPENSO");
	                        etiResultado.setForeground(Color.RED);
	                    } else {
	                        etiResultado.setText("Resultado: APROBADO");
	                        etiResultado.setForeground(Color.BLACK);
	                    }
	                } catch (NumberFormatException ex) {
	                    etiNotaFinal.setText("Nota Final: Error");
	                    etiResultado.setText("Resultado: Error");
	                }
	            }
	        });

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new CalculoNotaFinal());
	    }
	}


