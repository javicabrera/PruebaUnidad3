/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

/**
 *
 * @author 56992
 */
public class Socio {
    private int rut;
    private static int multa;
    private int membresia;
    private int cuentaRestaurant;

    public Socio(int rut, int multa, int membresia, int cuentaRestaurant) {
        this.rut = rut;
        this.multa = multa;
        this.membresia = membresia;
        this.cuentaRestaurant = cuentaRestaurant;
    }          
    
    public void pagarMulta(int saldo){}
    public void comprarEnRestaurant(int compras){}
    public void saldarRestaurant(){
        this.cuentaRestaurant=0;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getMulta() {
        return multa;
    }

    public static void setMulta(int multa) {
        this.multa = multa;
    }

    public int getMembresia() {
        return membresia;
    }

    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }

    public int getCuentaRestaurant() {
        return cuentaRestaurant;
    }

    public void setCuentaRestaurant(int cuentaRestaurant) {
        this.cuentaRestaurant = cuentaRestaurant;
    }
    
}
