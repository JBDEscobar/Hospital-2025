package Paneles;

import javax.swing.*;
import java.awt.*;

public class PanelLateral extends JPanel {

    public PanelLateral() {
        // Configuración básica del panel
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(200, 600));

        // Título superior
        JLabel titulo = new JLabel("Javier y Jorge JJ");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(titulo);


        this.add(Box.createRigidArea(new Dimension(0, 20)));//Esto es para crear un espacio del titulo y los botones


        String[] nombresBotones = {"No.", "Citas", "Doctores", "NO. de Espera", "Farmacia"};

        for (String nombre : nombresBotones) {
            JButton boton = new JButton(nombre);
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);
            boton.setMaximumSize(new Dimension(150, 40));
            this.add(boton);
            this.add(Box.createRigidArea(new Dimension(0, 10)));
        }
    }
}