/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apuesta;

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
        System.out.println(tFinal = (tFinal-tInicial)/tamaño);
        System.out.println(pasosProm = pasos/tamaño);
        return apuestas;
    }
    
    public long getTiempoGanancias(){
        
       if(tamaño>0){
           tFinal = (tFinal-tInicial)/tamaño;
       }else{
           tFinal = (tFinal-tInicial);
       }
              
     return tFinal;
    }
    
    public int getPasosGanancias(){
       
        if(tamaño>0){
            pasosProm = pasos/tamaño;
       }else{
            pasosProm = pasos;
       }
        return pasosProm;
    }

}
