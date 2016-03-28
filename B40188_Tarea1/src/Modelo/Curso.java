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
public class Curso {
    
     
    private String siglas;
    private String nombre;
    private String creditos;

    public Curso() {
    }

    public Curso(String siglas, String nombre, String creditos) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    
    public String getInformacion(){
        return "Siglas: "+siglas+" Nombre: "+nombre+" Créditos: "+creditos;
    }
    
}

