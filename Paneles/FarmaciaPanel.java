package Paneles;

import javax.swing.*;
import java.awt.*;

public class FarmaciaPanel extends JPanel {

    public FarmaciaPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(240, 248, 255)); // Color azul claro

        // Título
        JLabel titulo = new JLabel("Gestión de Farmacia", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(0, 0, 139)); // Azul oscuro
        add(titulo, BorderLayout.NORTH);

        // Área de contenido
        JPanel contenido = new JPanel();
        contenido.add(new JLabel("Funcionalidades de farmacia irán aquí"));
        add(contenido, BorderLayout.CENTER);

        // Botón para volver (opcional)
        JButton btnVolver = new JButton("Volver al Dashboard");
        add(btnVolver, BorderLayout.SOUTH);
    }
}