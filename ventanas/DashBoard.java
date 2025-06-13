package ventanas;
import java.awt.Color;

import javax.swing.JFrame;

import Paneles.TablaPanel;

public class DashBoard extends JFrame {

    public DashBoard(){
        this.setTitle("DashBoard");
        this.setSize(1920,1080);
        this.setVisible(true);
        this.setBackground(Color.GREEN);

        // PANELES TABLA
        TablaPanel miTabla = new TablaPanel();
        this.add(miTabla.getTabla());

        // PANEL MENU LATERAL
    }

   public JFrame getJFrame(){
        return this;
   }
}