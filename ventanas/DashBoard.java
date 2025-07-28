package ventanas;

import java.awt.*;
import javax.swing.*;
import Paneles.*;

public class DashBoard extends JFrame {

    public DashBoard() {
        this.setTitle("Dashboard Principal");
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Panel Lateral (usando la clase PanelLateral)
        PanelLateral panelLateral = new PanelLateral();
        this.add(panelLateral, BorderLayout.WEST);

        // Panel Central (Tabla)
        TablaPanel panelTabla = new TablaPanel();
        this.add(panelTabla, BorderLayout.CENTER);

        this.setVisible(true);
    }
}