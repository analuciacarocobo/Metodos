import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class EtiquetasNumeros extends JFrame{
	 private JLabel[] etiquetasNumeros;
	    private JTextField txtNumero;
	    private JButton btnBorrar;

	    public EtiquetasNumeros() {
	        setTitle("Etiquetas con Números");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel panel = new JPanel();

	        etiquetasNumeros = new JLabel[10];
	        for (int i = 0; i < 10; i++) {
	            etiquetasNumeros[i] = new JLabel(String.valueOf(i));
	            etiquetasNumeros[i].setName(String.valueOf(i)); 
	            etiquetasNumeros[i].setOpaque(true);
	            etiquetasNumeros[i].setBackground(Color.LIGHT_GRAY);

	            etiquetasNumeros[i].addMouseListener(new MouseAdapter() {
	                @Override
	                public void mouseEntered(MouseEvent e) {
	                    JLabel etiqueta = (JLabel) e.getSource();
	                    String numero = etiqueta.getName();
	                    txtNumero.setText(txtNumero.getText() + numero);
	                }
	            });

	            panel.add(etiquetasNumeros[i]);
	        }

	        txtNumero = new JTextField(15);
	        btnBorrar = new JButton("Borrar");

	        panel.add(txtNumero);
	        panel.add(btnBorrar);

	        add(panel);

	        btnBorrar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txtNumero.setText("");
	            }
	        });

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new EtiquetasNumeros());
	    }
	}



