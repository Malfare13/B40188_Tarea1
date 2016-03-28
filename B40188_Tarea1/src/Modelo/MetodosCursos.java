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
public class MetodosCursos {
    
     ArrayList <Curso> arrayCurso;

    public MetodosCursos() {
        arrayCurso = new ArrayList <Curso>();
    }
    
    public void agregarCurso(String informacion[]){
       Curso temporal= new Curso(informacion[0],informacion[1],informacion[2]);
       arrayCurso.add(temporal);
    }
    public void mostrarInformacion(){
        Curso temporal;
        temporal=arrayCurso.get(0);
        System.out.println(temporal.getInformacion());
    }
    public void modificarCurso(String arreglo[]){
        for(int contador=0;contador<arrayCurso.size();contador++){
            if(arrayCurso.get(contador).getSiglas().equals(arreglo[0])){
                arrayCurso.get(contador).setNombre(arreglo[1]);
                arrayCurso.get(contador).setNombre(arreglo[2]);  
            }
            }
        }
    
    public void eliminarCurso(String arreglo[]){
       for(int contador=0;contador<arrayCurso.size();contador++){
           if(arrayCurso.get(contador).getSiglas().equals(arreglo[0])){
               arrayCurso.remove(contador);
           }
       } 
    }
     public String[] consultarCurso(String siglas){
        String arregloDatos[]=new String[2];
        
        for(int contador=0; contador<arrayCurso.size();contador ++){
            if(arrayCurso.get(contador).getSiglas().equals(siglas)){
              arregloDatos[0]=arrayCurso.get(contador).getNombre();
              arregloDatos[1]=arrayCurso.get(contador).getCreditos();
            }
        }
        return arregloDatos;
    }
 
    public String[] buscar(String siglas){
        String arregloDatos[]=new String[1];
        for(int contador=0;contador<arrayCurso.size();contador++){
          arregloDatos[0]=arrayCurso.get(contador).getInformacion();
             
            }
    return arregloDatos;  
        }
}
