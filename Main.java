import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.scene.paint.Color;

public class Main {
    public static void main(String[] args) {
        // crear una ventana con JFrame 
        JFrame miVentana = new JFrame();// crea una ventana
        miVentana.setTitle("Hospital SCL"); // ponle un titulo
        miVentana.setSize(900,700);// dale un tamaño
        
        // Crear un texto con JLabel
        JLabel texto = new JLabel(); // crea un JLabel(etiqueta de texto)
        texto.setText("hola mundo"); // signa el texto a la etiqueta 
        miVentana.add(texto); // añade el texto a mi ventana 
        
        miVentana.setVisible(true);// muestra la ventana 
    }
    
}