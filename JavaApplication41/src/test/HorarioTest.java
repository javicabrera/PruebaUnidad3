/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javaapplication41.Horario;

/**
 *
 * @author 56992
 */
public class HorarioTest {
    
    public void calculoHoras(){
        int esperado=1;
        int inicio=15;
        int fin=17;
        if (Horario.calculoHoras(inicio,fin)==2) {
            System.out.println("Pasa la prueba");
        }
        else{
            System.out.println("Falla");
        }
    }
}
