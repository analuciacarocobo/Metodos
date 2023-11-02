import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class VentanaTexto extends JFrame {
    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;

    public VentanaTexto() {
       
        setTitle("Programa de Texto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

    
        txtTexto = new JTextField(20);
        etiTexto = new JLabel();
        btnVaciar = new JButton("Vaciar");

 
        add(txtTexto);
        add(etiTexto);
        add(btnVaciar);

        btnVaciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			     txtTexto.setText("");
	                etiTexto.setText("");				
			}
        });

        
        txtTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                etiTexto.setText(txtTexto.getText());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VentanaTexto ventana = new VentanaTexto();
                ventana.setVisible(true);
            }
        });
    }
}


