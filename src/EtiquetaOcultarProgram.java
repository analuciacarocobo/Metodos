import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class EtiquetaOcultarProgram extends JFrame {
	private JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;
	
	   public EtiquetaOcultarProgram() {
	   
	        setTitle("Programa de Etiquetas y Ocultar");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());
	        setResizable(false);  

	   
	        etiPal1 = new JLabel("Hola");
	        etiPal2 = new JLabel("Cómo estás");
	        etiPal3 = new JLabel("Holi");
	        etiPal4 = new JLabel("Jeje");

	      
	        etiOcultar = new JLabel("Ocultar");
	        etiOcultar.setFont(new Font("Arial", Font.BOLD, 18));  
	        etiOcultar.setOpaque(true);
	        etiOcultar.setBackground(Color.RED);  
	        etiOcultar.setForeground(Color.WHITE); 
	        etiOcultar.addMouseListener(new MouseAdapter(){
	            @Override
	            public void mouseEntered(MouseEvent e) {
	          
	                etiPal1.setVisible(false);
	                etiPal2.setVisible(false);
	                etiPal3.setVisible(false);
	                etiPal4.setVisible(false);
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	                etiPal1.setVisible(true);
	                etiPal2.setVisible(true);
	                etiPal3.setVisible(true);
	                etiPal4.setVisible(true);
	            }
	        });

	        add(etiPal1);
	        add(etiPal2);
	        add(etiPal3);
	        add(etiPal4);
	        add(etiOcultar);

	        
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new EtiquetaOcultarProgram());
	    }
	}



