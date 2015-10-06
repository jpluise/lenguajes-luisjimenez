/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author T-107
 */
public class Direccion { //Se agrego public, se ve en todos los paquetes

    private String calle;        //Atributos
    private String municipio;
    private String colonia;

    public Direccion() {
    }
/**
 * este constructor sirve para una direccion
 * @param calle el primer parametro es el valor de la calle
 * @param municipio el sgundo es el valor de municipio
 * @param colonia el tercero es el valor de colonia
 */
    public Direccion(String calle, String municipio, String colonia) {
        this.calle = calle;
        this.municipio = municipio;
        this.colonia = colonia;
    }
    
    

    /**
     * *
     * @return este metodo te regresa el valor que tiene el atributo calle 
     */
    public String getCalle() {
        return calle;

    }
/**
 * 
 * @param c en este metodo debes de poner dentro del parentesis el valor que desees que tenga la calle 
 */
    public void setCalle(String c) {

        this.calle = c;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String m) {

        this.municipio = m;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String col) {

       this.colonia = col;
    }

}
