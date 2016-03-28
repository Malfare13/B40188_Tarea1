/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_Cursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angelica
 */
public class Controlador_FRM_Cursos implements ActionListener {
   
    
     MetodosCursos metodosCursos;
    FRM_Cursos registro_Cursos;

    public Controlador_FRM_Cursos( FRM_Cursos FRM_Cursos) {
        this.registro_Cursos = FRM_Cursos;
        metodosCursos = new MetodosCursos();
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Consultar")){
            registro_Cursos.mostrarInformacion(metodosCursos.consultarCurso(registro_Cursos.devolverSiglas()));

        }
        if(e.getActionCommand().equals("Agregar")){
            metodosCursos.agregarCurso(registro_Cursos.devolverInformacion());
            metodosCursos.mostrarInformacion();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("Modificar");
            this.metodosCursos.modificarCurso(this.registro_Cursos.devolverInformacion());
        }
        if(e.getActionCommand().equals("Eliminar")){
            metodosCursos.eliminarCurso(this.registro_Cursos.devolverInformacion());
        }
        if(e.getActionCommand().equals("Buscar")){
            
            String datos[]=this.metodosCursos.consultarCurso(this.registro_Cursos.devolverSiglas());
            System.out.println("devolucion del arreglo"+datos[0]);
             this.registro_Cursos.mostrarInformacion(metodosCursos.consultarCurso(registro_Cursos.devolverSiglas()));
        }
}
   } 
