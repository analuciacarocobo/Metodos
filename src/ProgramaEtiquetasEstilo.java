import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ProgramaEtiquetasEstilo  extends JFrame {
	 private JLabel etiNombre;
	    private JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;

	    public ProgramaEtiquetasEstilo() {
	        setTitle("Programa de Etiqueta y Botones");
	        setSize(400, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(null);  
	        getContentPane().setBackground(new Color(230, 230, 250));  

	        
	        etiNombre = new JLabel("Ana Lucía");
	        etiNombre.setOpaque(true);
	        etiNombre.setBackground(new Color(255, 192, 203)); 
	        etiNombre.setBounds(10, 10, 100, 30);  

	     
	        btnEsquina = new JButton("Esquina");
	        btnEsquina.setBounds(10, 50, 100, 30);
	        btnEsquina.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                etiNombre.setLocation(10, 10);
	            }
	        });

	       
	        btnCentro = new JButton("Centro");
	        btnCentro.setBounds(10, 90, 100, 30);
	        btnCentro.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	                int centerX = (int) (screenSize.getWidth() - etiNombre.getWidth()) / 2;
	                int centerY = (int) (screenSize.getHeight() - etiNombre.getHeight()) / 2;
	                etiNombre.setLocation(centerX, centerY);
	            }
	        });

	   
	        btnAgrandar = new JButton("Agrandar");
	        btnAgrandar.setBounds(10, 130, 100, 30);
	        btnAgrandar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int width = etiNombre.getWidth() + 20;
	                int height = etiNombre.getHeight() + 10;
	                etiNombre.setSize(width, height);
	            }
	        });

	        btnAchicar = new JButton("Achicar");
	        btnAchicar.setBounds(10, 170, 100, 30);
	        btnAchicar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int width = etiNombre.getWidth() - 20;
	                int height = etiNombre.getHeight() - 10;
	                etiNombre.setSize(width, height);
	            }
	        });

	        
	        add(etiNombre);
	        add(btnEsquina);
	        add(btnCentro);
	        add(btnAgrandar);
	        add(btnAchicar);

	        MouseAdapter buttonSizeHandler = new MouseAdapter() {
	            @Override
	            public void mouseEntered(MouseEvent e) {
	                JButton button = (JButton) e.getSource();
	                button.setSize(button.getWidth() + 10, button.getHeight() + 5);
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	                JButton button = (JButton) e.getSource();
	                button.setSize(button.getWidth() - 10, button.getHeight() - 5);
	            }
	        };
	        btnEsquina.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                etiNombre.setLocation(10, 10);
	            }
	        });

	        btnCentro.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	                int centerX = (int) (screenSize.getWidth() - etiNombre.getWidth()) / 2;
	                int centerY = (int) (screenSize.getHeight() - etiNombre.getHeight()) / 2;
	                etiNombre.setLocation(centerX, centerY);
	            }
	        });

	        btnAgrandar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int width = etiNombre.getWidth() + 20;
	                int height = etiNombre.getHeight() + 10;
	                etiNombre.setSize(width, height);
	            }
	        });

	        btnAchicar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int width = etiNombre.getWidth() - 20;
	                int height = etiNombre.getHeight() - 10;
	                etiNombre.setSize(width, height);
	            }
	        });
	        setVisible(true);

	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new ProgramaEtiquetasEstilo());
	    }
	}



