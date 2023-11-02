import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CambioColorEtiqueta extends JFrame {
    private JLabel etiTexto;
    private JButton btnAzul, btnRojo, btnVerde, btnFondoAzul, btnFondoRojo, btnFondoVerde, btnTransparente, btnOpaca;
    private boolean opaca = true;

    public CambioColorEtiqueta() {
        setTitle("Cambio de Color de Etiqueta");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        etiTexto = new JLabel("Azul Cielo");
        btnAzul = new JButton("Azul");
        btnRojo = new JButton("Rojo");
        btnVerde = new JButton("Verde");
        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoVerde = new JButton("Fondo Verde");
        btnTransparente = new JButton("Transparente");
        btnOpaca = new JButton("Opaca");

        panel.add(etiTexto);
        panel.add(btnAzul);
        panel.add(btnRojo);
        panel.add(btnVerde);
        panel.add(btnFondoAzul);
        panel.add(btnFondoRojo);
        panel.add(btnFondoVerde);
        panel.add(btnTransparente);
        panel.add(btnOpaca);

        add(panel);

        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.BLUE);
            }
        });

        btnRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.RED);
            }
        });

        btnVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.GREEN);
            }
        });

        btnFondoAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.BLUE);
            }
        });

        btnFondoRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.RED);
            }
        });

        btnFondoVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.GREEN);
            }
        });

        btnTransparente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(false);
                etiTexto.repaint(); // Forzar la actualización
            }
        });

        btnOpaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(true);
                etiTexto.repaint(); // Forzar la actualización
            }
        });

        etiTexto.setOpaque(true);
        etiTexto.setBackground(Color.WHITE);
        etiTexto.setForeground(Color.BLACK);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CambioColorEtiqueta());
    }
}

  