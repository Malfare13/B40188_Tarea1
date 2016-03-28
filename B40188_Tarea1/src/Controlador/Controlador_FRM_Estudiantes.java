/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.FRM_Estudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angelica
 */
public class Controlador_FRM_Estudiantes implements ActionListener {

    
    MetodosEstudiantes metodosEstudiantes;
    FRM_Estudiantes registro_Estudiantes;

    public Controlador_FRM_Estudiantes( FRM_Estudiantes FRM_Estudiantes) {
        this.registro_Estudiantes = FRM_Estudiantes;
        metodosEstudiantes = new MetodosEstudiantes();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Consultar")){
            registro_Estudiantes.mostrarInformacion(metodosEstudiantes.consultarEstudiante(registro_Estudiantes.devolverCarne()));

        }
        if(e.getActionCommand().equals("Agregar")){
            metodosEstudiantes.agregarEstudiante(registro_Estudiantes.devolverInformacion());
            metodosEstudiantes.mostrarInformacion();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("Modificar");
            this.metodosEstudiantes.modificarEstudiante(this.registro_Estudiantes.devolverInformacion());
        }
        if(e.getActionCommand().equals("Eliminar")){
            metodosEstudiantes.eliminarEstudiante(this.registro_Estudiantes.devolverInformacion());
        }
        if(e.getActionCommand().equals("Consultar")){
            
            String datos[]=this.metodosEstudiantes.consultarEstudiante(this.registro_Estudiantes.devolverCarne());
            System.out.println("devolucion del arreglo"+datos[0]);
             this.registro_Estudiantes.mostrarInformacion(metodosEstudiantes.consultarEstudiante(registro_Estudiantes.devolverCarne()));
        }
    }
    
    

}
