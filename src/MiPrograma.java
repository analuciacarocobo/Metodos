import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MiPrograma extends JFrame {
	private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;

    public MiPrograma() {
        
        setTitle("Programa de Traspaso de Texto");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        txtTexto = new JTextField(20); 
        etiTexto1 = new JLabel(); 
        etiTexto2 = new JLabel();

        JButton btnTraspasa1 = new JButton("Traspasa 1"); 
        JButton btnTraspasa2 = new JButton("Traspasa 2"); 
        
        add(txtTexto);
        add(etiTexto1);
        add(etiTexto2);
        add(btnTraspasa1);
        add(btnTraspasa2);
        
       
        btnTraspasa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText(); 
                etiTexto1.setText(texto); 
            }
        });

        btnTraspasa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText(); 
                etiTexto2.setText(texto);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MiPrograma().setVisible(true);
            }
        });
    }

}
