/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apuesta;

import Reportes.Reportes;

/**
 *
 * @author GORDILLO G
 */
public class GenerarGanancia {

    private int mayorGanancia = 10,tamaño,pasos,pasosProm;
    private long tInicial,tFinal,tiempoGanancias;
    

    /*private Apuesta[] apuestas;
    private int[] resultados; */

    public GenerarGanancia() {
        /*this.apuestas = apuestas;
        this.resultados = resultados;
        getResultados(apuestas, resultados); */
    }

    public Apuesta[] getResultados(Apuesta[] apuestas, int[] resultados) {
        tInicial=System.nanoTime();
        this.tamaño = apuestas.length;
        
        for (int i = 0; i < apuestas.length; i++) {
            
            
            int ganancia = 0;
            
            for (int j = 0; j < 10; j++) {
                if (apuestas[i].getOrdenLlegada()[j] == resultados[j]) {
                    ganancia = ganancia + mayorGanancia - j;
                    pasos++;
                } else {
                    ganancia = ganancia + 0;
                    pasos++;
                }
            }
            apuestas[i].setGanancia(ganancia);
        }
        tFinal = System.nanoTime();
        
        return apuestas;
    }
    
    public long getTiempoGanancias(){
        
       if(tamaño>0){
           tiempoGanancias = (tFinal-tInicial)/tamaño;
       }else{
           tiempoGanancias = (tFinal-tInicial);
       }
              
     return tiempoGanancias;
    }
    
    public int getPasosGanancias(){
       
        if(tamaño>0){
            pasosProm = pasos/tamaño;
       }else{
            pasosProm = pasos;
       }
        return pasosProm;
    }
    
    public Reportes actualizarReportes(Reportes reporte){
        
        reporte.setTiempoResultados(getTiempoGanancias());
        reporte.setPasosResultados(getPasosGanancias());
        reporte.setMaxpasosResultados(0);
        reporte.setMinpasosResultados(0);
        
        return reporte;
    }

}
