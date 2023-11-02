import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class VentanaPrincipal extends JFrame {
	 private JLabel etiNombre;
	    private JLabel etiCiudad;
	    
	    public VentanaPrincipal() {
	    	setTitle("Programa de Etiquetas");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());
	        
	        
	        etiNombre = new JLabel("Nombre: Ana");
	        etiCiudad = new JLabel("Ciudad: Armenia");
	        
	        
	        JButton btnOcultarNombre = new JButton("Ocultar Nombre");
	        JButton btnVisuNombre = new JButton("Visualizar Nombre");
	        JButton btnOcultarCiudad = new JButton("Ocultar Ciudad");
	        JButton btnVisuCiudad = new JButton("Visualizar Ciudad");

	        add(etiNombre);
	        add(etiCiudad);
	        add(btnOcultarNombre);
	        add(btnVisuNombre);
	        add(btnOcultarCiudad);
	        add(btnVisuCiudad);
	        
	        
	        btnOcultarNombre.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                etiNombre.setVisible(false);
	            }
	        });

	        btnVisuNombre.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                etiNombre.setVisible(true);
	            }
	        });

	        btnOcultarCiudad.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                etiCiudad.setVisible(false);
	            }
	        });
	        
	        btnVisuCiudad.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                etiCiudad.setVisible(true);
	            }
	        });
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new VentanaPrincipal().setVisible(true);
	            }
	        });
	    }

}
