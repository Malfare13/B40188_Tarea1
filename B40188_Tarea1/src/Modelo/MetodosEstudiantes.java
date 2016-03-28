/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Angelica
 */
public class MetodosEstudiantes {
    
    ArrayList <Estudiante> arrayEstudiante;

    public MetodosEstudiantes() {
        arrayEstudiante = new ArrayList <Estudiante>();
    }
    
    public void agregarEstudiante(String informacion[]){
       Estudiante temporal= new Estudiante(informacion[0],informacion[1]);
       arrayEstudiante.add(temporal);
    }
    public void mostrarInformacion(){
        Estudiante temporal;
        temporal=arrayEstudiante.get(0);
        System.out.println(temporal.getInformacion());
    }
    public void modificarEstudiante(String arreglo[]){
        for(int contador=0;contador<arrayEstudiante.size();contador++){
            if(arrayEstudiante.get(contador).getCarne().equals(arreglo[0])){
                arrayEstudiante.get(contador).setNombre(arreglo[1]);  
            }
        }
    }
    public void eliminarEstudiante(String arreglo[]){
       for(int contador=0;contador<arrayEstudiante.size();contador++){
           if(arrayEstudiante.get(contador).getCarne().equals(arreglo[0])){
               arrayEstudiante.remove(contador);
           }
       } 
    }
     public String[] consultarEstudiante(String carne){
        String arregloDatos[]=new String[2];
        
        for(int contador=0; contador<arrayEstudiante.size();contador ++){
            if(arrayEstudiante.get(contador).getCarne().equals(carne)){
              arregloDatos[0]=arrayEstudiante.get(contador).getNombre();
            }
        }
        return arregloDatos;
    }
 
    public String[] buscar(String carnet){
        String arregloDatos[]=new String[1];
        for(int contador=0;contador<arrayEstudiante.size();contador++){
          arregloDatos[0]=arrayEstudiante.get(contador).getInformacion();
             
            }
    return arregloDatos;  
        }
    
    
    
}
