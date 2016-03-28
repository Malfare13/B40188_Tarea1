/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Cursos;
import Vista.FRM_Estudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angelica
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener{
    
    FRM_Estudiantes FRM_Estudiantes;
    FRM_Cursos FRM_Cursos;

    public Controlador_FRM_MenuPrincipal() {
        FRM_Estudiantes = new FRM_Estudiantes();
        FRM_Cursos = new FRM_Cursos();
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }
        if(e.getActionCommand().equals("Estudiantes")){
            this.FRM_Estudiantes.setVisible(true);
            FRM_Estudiantes.setLocationRelativeTo(null);
        }
        if(e.getActionCommand().equals("Cursos")){
            this.FRM_Cursos.setVisible(true);
            FRM_Cursos.setLocationRelativeTo(null);
        }
        if(e.getActionCommand().equals("Matrícula")){
            
        }
        if(e.getActionCommand().equals("Reportes")){
            
        }

    }
    
}
