/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apuesta;

import ManejoArchivos.ManejoArchivo;
import Reportes.Reportes;
import javax.swing.JOptionPane;

/**
 *
 * @author GORDILLO G
 */
public class VerificarApuestas {

    private int[] tmp;
    private int contadorRepetidos = 0, contadorLibre = 0, contador = 0, pasosApuestas = 0, promedioPasos = 0, tamañoApuestas;
    
    private String lecturaError = "";
    private long TInicio, TFinal, tiempoApuestas;
    private ManejoArchivo error = new ManejoArchivo();
    private int masPasos = 0, menosPasos = 0;

    public Apuesta[] verficadorApuestas(Apuesta[] apuesta, int contador2, String erroresA,String titulo) {
        this.tamañoApuestas = contador2;
        TInicio = System.nanoTime();
        for (int i = 0; i < contador2; i++) {

            if (apuesta[i].getOrdenLlegada()[0] >= 1 && apuesta[i].getOrdenLlegada()[0] < 11) {

                tmp = new int[10];
                tmp[0] = apuesta[i].getOrdenLlegada()[0];
                contador++;

                for (int j = 1; j < 10; j++) {
                    if (apuesta[i].getOrdenLlegada()[j] > 0 && apuesta[i].getOrdenLlegada()[j] < 11) {
                        if (apuesta[i].getOrdenLlegada()[j] != tmp[0] && apuesta[i].getOrdenLlegada()[j] != tmp[1] && apuesta[i].getOrdenLlegada()[j] != tmp[2] && apuesta[i].getOrdenLlegada()[j] != tmp[3] && apuesta[i].getOrdenLlegada()[j] != tmp[4] && apuesta[i].getOrdenLlegada()[j] != tmp[5] && apuesta[i].getOrdenLlegada()[j] != tmp[6] && apuesta[i].getOrdenLlegada()[j] != tmp[7] && apuesta[i].getOrdenLlegada()[j] != tmp[8] && apuesta[i].getOrdenLlegada()[j] != tmp[9]) {
                            tmp[contador] = apuesta[i].getOrdenLlegada()[j];
                            contador++;
                            pasosApuestas++;
                            if (contador == 10) {
                                contadorLibre++;
                            }
                        } else {
                            lecturaError = lecturaError + apuesta[i].toString() + "\n";
                            apuesta[i] = null;
                            pasosApuestas++;
                            contadorRepetidos++;
                            break;
                        }
                    } else {
                        lecturaError = lecturaError + apuesta[i].toString() + "\n";
                        apuesta[i] = null;
                        contadorRepetidos++;
                        break;
                    }
                }
                contador = 0;
            } else {
                lecturaError = lecturaError + apuesta[i].toString() + "\n";
                apuesta[i] = null;
                contadorRepetidos++;
                break;
            }
            
            

        }

        if (contadorRepetidos >= 1 || erroresA.length() > 3) {
            JOptionPane.showMessageDialog(null, "Se encontraron errores en las apuestas, a continuacion ingresa un nombre y destino para guardar los errrores hallados");
            String lecturaTotalErroes = erroresA + titulo +lecturaError;
            error.guardarArchivo(lecturaTotalErroes);
        }
        TFinal = System.nanoTime();
        System.out.println(tiempoApuestas = (TFinal - TInicio) / tamañoApuestas);
        return apuesta;
    }

    public Apuesta[] correctas(Apuesta[] corregir) {

        int nu = 0;
        Apuesta[] lib = new Apuesta[contadorLibre];

        for (int i = 0; i < corregir.length; i++) {
            if (corregir[i] != null) {
                lib[nu] = corregir[i];
                nu++;
            }
        }
        
        return lib;
    }

    public long getTtotalApuestas() {
        if (tamañoApuestas > 0) {
            tiempoApuestas = (TFinal - TInicio) / tamañoApuestas;
        } else {
            tiempoApuestas = (TFinal - TInicio);
        }

        return tiempoApuestas;
    }

    public int getPromedioPasos() {

        if (tamañoApuestas > 0) {
            promedioPasos = pasosApuestas / tamañoApuestas;
        } else {
            promedioPasos = pasosApuestas;
        }
        return promedioPasos;
    }
    
    public Reportes actualizarReporte(Reportes reporte){
        
        reporte.setTiempoApuestas(getTtotalApuestas());
        reporte.setPasosApuestas(getPromedioPasos());
        reporte.setMaxpasosApuestas(0);
        reporte.setMinpasosApuestas(0);
        
        return reporte;
    }
}
