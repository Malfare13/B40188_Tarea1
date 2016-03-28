/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Angelica
 */
public class Estudiante {
    
    private String carne;
    private String nombre;

    public Estudiante() {
    }

    public Estudiante(String carne, String nombre) {
        this.carne = carne;
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getInformacion(){
        return "Carné: "+carne+" Nombre: "+nombre;
    }
    
    
}
