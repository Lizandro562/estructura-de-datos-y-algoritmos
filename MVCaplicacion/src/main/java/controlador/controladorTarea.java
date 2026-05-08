/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Acer
 */
import modelo.tarea;
import vista.ventanaTarea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class controladorTarea implements ActionListener{
    private ventanaTarea vista;

    public controladorTarea(ventanaTarea vista) {
        this.vista = vista;
        // Escuchamos los botones
        this.vista.btnRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            // Lógica simple de registro
            String cod = vista.txtCodigo.getText();
            String tit = vista.txtTitulo.getText();
            
            if(cod.isEmpty() || tit.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Completa los campos");
            } else {
                vista.modeloTabla.addRow(new Object[]{
                    cod, tit, vista.txtCurso.getText(), 
                    vista.txtFecha.getText(), vista.cbEstado.getSelectedItem()
                });
                limpiar();
            }
        }
    }
    
    private void limpiar() {
        vista.txtCodigo.setText("");
        vista.txtTitulo.setText("");
        vista.txtCurso.setText("");
        vista.txtFecha.setText("");
    }
}
