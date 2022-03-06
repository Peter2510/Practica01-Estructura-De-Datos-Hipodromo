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

    private int mayorGanancia = 10;

    /*private Apuesta[] apuestas;
    private int[] resultados; */

    public GenerarGanancia() {
        /*this.apuestas = apuestas;
        this.resultados = resultados;
        getResultados(apuestas, resultados); */
    }

    public Apuesta[] getResultados(Apuesta[] apuestas, int[] resultados) {

        for (int i = 0; i < apuestas.length; i++) {
            
            
            int ganancia = 0;
            
            for (int j = 0; j < 10; j++) {
                if (apuestas[i].getOrdenLlegada()[j] == resultados[j]) {
                    ganancia = ganancia + mayorGanancia - j;
                } else {
                    ganancia = ganancia + 0;
                }
            }
            apuestas[i].setGanancia(ganancia);
        }
        return apuestas;
    }

}
