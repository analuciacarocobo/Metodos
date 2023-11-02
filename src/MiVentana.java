import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MiVentana extends JFrame implements ActionListener {
    private JTextField txtNombre, txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar, btnDesactivar, btnActivar; 
         
    	  public MiVentana() {
    	      
    	        setTitle("Programa Java");
    	        setSize(400, 200);
    	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	        setLayout(new FlowLayout());
    	        setResizable(false);  

    	      
    	        txtNombre = new JTextField(15);
    	        txtCiudad = new JTextField(15);

    	    
    	        txtFrase = new JLabel();
    	        txtFrase.setFont(new Font("Arial", Font.PLAIN, 14));  

    	        btnAceptar = new JButton("Aceptar");
    	        btnDesactivar = new JButton("Desactivar");
    	        btnActivar = new JButton("Activar");

    	      
    	        btnAceptar.addActionListener(this);
    	        btnDesactivar.addActionListener(this);
    	        btnActivar.addActionListener(this);

    	        
    	        btnAceptar.setBackground(Color.BLUE);
    	        btnAceptar.setForeground(Color.WHITE);
    	        btnAceptar.setFont(new Font("Arial", Font.BOLD, 14));
    	        btnDesactivar.setBackground(Color.RED);
    	        btnDesactivar.setForeground(Color.WHITE);
    	        btnDesactivar.setFont(new Font("Arial", Font.BOLD, 14));
    	        btnActivar.setBackground(Color.GREEN);
    	        btnActivar.setForeground(Color.WHITE);
    	        btnActivar.setFont(new Font("Arial", Font.BOLD, 14));

    	        
    	        add(new JLabel("Nombre: "));
    	        add(txtNombre);
    	        add(new JLabel("Ciudad: "));
    	        add(txtCiudad);
    	        add(btnAceptar);
    	        add(txtFrase);
    	        add(btnDesactivar);
    	        add(btnActivar);

    	       
    	        setVisible(true);
    	        
    	  }

    	        @Override
    	        public void actionPerformed(ActionEvent e) {
    	            if (e.getSource() == btnAceptar) {
    	                String nombre = txtNombre.getText();
    	                String ciudad = txtCiudad.getText();
    	                txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad + ".");
    	            } else if (e.getSource() == btnDesactivar) {
    	                txtNombre.setEnabled(false);
    	                txtCiudad.setEnabled(false);
    	            } else if (e.getSource() == btnActivar) {
    	                txtNombre.setEnabled(true);
    	                txtCiudad.setEnabled(true);
    	            }
    	        }

    	        public static void main(String[] args) {
    	            SwingUtilities.invokeLater(() -> new MiVentana());
    	        }
    
}





    	    

