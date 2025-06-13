package Paneles;
import data.Pacientes;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaPanel extends JScrollPane { 
    public TablaPanel() {
        // Columnas y datos
        String[] columnas = {"No. ", "Nombre del paciente", "Edad","Tipo de Consulta","hora","Sintomas"};/* No. nombre edad tipo de consulta hora sintomas */
        Object[][] datos = new Pacientes().getDatos();

        // Crear modelo y tabla
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        
        // Configurar este JScrollPane para contener la tabla
        this.setViewportView(table);
        this.setPreferredSize(new Dimension(1600,1000));
        
    }

    public JScrollPane getTabla(){
        return this;
    }
}
