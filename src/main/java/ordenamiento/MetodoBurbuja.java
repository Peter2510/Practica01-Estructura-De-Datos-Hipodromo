/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import Apuesta.Apuesta;
import Reportes.Reportes;

/**
 *
 * @author GORDILLO G
 */
public class MetodoBurbuja {

    private long tInicial, tFinal, TiempoOrdenamiento;
    private int pasos, promPasos, tamaño;

    public Apuesta[] OrdenDescendente(Apuesta[] apuesta) {
        Apuesta auxiliar;
        this.tamaño = apuesta.length;
        tInicial = System.nanoTime();
        for (int i = 0; i < (apuesta.length - 1); i++) {

            for (int j = 0; j < (apuesta.length - 1); j++) {
                if (apuesta[j].getGanancia() < apuesta[j + 1].getGanancia()) { // si numero actural mayor numero siguiente
                    auxiliar = apuesta[j];
                    apuesta[j] = apuesta[j + 1];
                    apuesta[j + 1] = auxiliar;
                    pasos++;
                }
            }
        }
        tFinal = System.nanoTime();
        return apuesta;
    }

    public Apuesta[] OrdenAlfabetico(Apuesta[] apuesta) {
        Apuesta auxiliar;

        tInicial = System.nanoTime();
        for (int i = 0; i < (apuesta.length - 1); i++) {

            for (int j = 0; j < (apuesta.length - 1); j++) {

                if (apuesta[j].getNombre().compareToIgnoreCase(apuesta[j + 1].getNombre()) > 0) { // si numero actural mayor numero siguiente
                    auxiliar = apuesta[j];
                    apuesta[j] = apuesta[j + 1];
                    apuesta[j + 1] = auxiliar;
                    pasos++;
                }
            }

        }
        tFinal = System.nanoTime();
        return apuesta;
    }

    public int getPasosOrdenamiento() {

        if (tamaño > 0) {
            promPasos = pasos / tamaño;
        } else {
            promPasos = pasos;
        }

        return promPasos;
    }
    
    public long getTiempoOrdenamiento(){
        
        if (tamaño > 0) {
            TiempoOrdenamiento = (tFinal - tInicial)/tamaño;
        } else {
            TiempoOrdenamiento = (tFinal - tInicial);
        }       
        
        return TiempoOrdenamiento;
    }
    
    public Reportes actualizarReportes(Reportes reporte){
        
        reporte.setTiempoOrdenamiento(getTiempoOrdenamiento());
        reporte.setPasosOrdenamientos(getPasosOrdenamiento());
        reporte.setMaxpasosOrdenamientos(0);
        reporte.setMinpasosOrdenamientos(0);
        
        return reporte;
    }
    
}
