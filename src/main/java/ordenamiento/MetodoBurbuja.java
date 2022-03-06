/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import Apuesta.Apuesta;

/**
 *
 * @author GORDILLO G
 */
public class MetodoBurbuja {
    
    public Apuesta[] OrdenDescendente(Apuesta[] apuesta){
        Apuesta auxiliar;
        
        for (int i = 0; i < (apuesta.length-1); i++) {
            
            for (int j = 0; j < (apuesta.length-1); j++) {
                if(apuesta[j].getGanancia() < apuesta[j+1].getGanancia()){ // si numero actural mayor numero siguiente
                    auxiliar = apuesta[j];
                    apuesta[j] = apuesta[j+1];
                    apuesta[j+1] = auxiliar;
                }
            }
            
            
        }
        
        return apuesta;
    }
    
    public Apuesta[] OrdenAlfabetico(Apuesta[] apuesta){
        Apuesta auxiliar;
        
        for (int i = 0; i < (apuesta.length-1); i++) {
            
            for (int j = 0; j < (apuesta.length-1); j++) {
                
                if(apuesta[j].getNombre().compareToIgnoreCase(apuesta[j+1].getNombre()) > 0){ // si numero actural mayor numero siguiente
                    auxiliar = apuesta[j];
                    apuesta[j] = apuesta[j+1];
                    apuesta[j+1] = auxiliar;
                }
            }
            
            
        }
        
        return apuesta;
    }
    
}
