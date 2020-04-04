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
public class Horario {
    public String inicio;
    public String fin;
    public int horas;
    
    public Horario(String inicio, String fin){
        String[] datosInicio=null;
        String[] datosFin=null;
        datosInicio=inicio.split(":");
        datosFin=inicio.split(":");
        horas=calculoHoras(Integer.parseInt(datosInicio[0]),Integer.parseInt(datosFin[0]));            
    }
    public static int calculoHoras(int i, int f){
        return i-f;
    }
}
