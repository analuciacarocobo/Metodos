import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ConcatenaPalabras extends JFrame {
	 private JTextField txtPalabra1, txtPalabra2;
	    private JLabel etiTexto;

	    public ConcatenaPalabras() {
	        setTitle("Concatenación de Palabras");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel panel = new JPanel();

	        txtPalabra1 = new JTextField(15);
	        txtPalabra2 = new JTextField(15);
	        etiTexto = new JLabel("Resultado: ");
	        JButton btnConcatena = new JButton("Concatenar");

	        panel.add(new JLabel("Palabra 1: "));
	        panel.add(txtPalabra1);
	        panel.add(new JLabel("Palabra 2: "));
	        panel.add(txtPalabra2);
	        panel.add(btnConcatena);
	        panel.add(etiTexto);

	        add(panel);

	        btnConcatena.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String palabra1 = txtPalabra1.getText();
	                String palabra2 = txtPalabra2.getText();
	                String resultado = palabra1 + palabra2;
	                etiTexto.setText("Resultado: " + resultado);
	            }
	        });

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new ConcatenaPalabras());
	    }
	}



