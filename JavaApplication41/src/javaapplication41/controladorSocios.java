/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.util.ArrayList;

/**
 *
 * @author 56992
 */
public class controladorSocios {
    private ArrayList<Socio> clientes;
    
    public boolean confirmarIdentidad(){
        return true;
    }
    public void aplicarViolacionCod(int rut){
        getCliente(rut).setRut(getCliente(rut).getMulta()+20000);
    }
    
    public Socio getCliente(int rut){
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getRut()==rut)
                return clientes.get(i);
        }
        return null;
    }
    public void aplicarDsctoRestaurant(int rut){

    }
}
