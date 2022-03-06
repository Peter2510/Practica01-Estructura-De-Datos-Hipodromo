/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apuesta;

import ManejoArchivos.ManejoArchivo;
import javax.swing.JOptionPane;

/**
 *
 * @author GORDILLO G
 */
public class VerificacionApuestas {

    private int contador = 0;
    private int[] tmp;
    private int contadorRepetidos = 0;
    private int contadorLibre = 0;
    private ManejoArchivo error = new ManejoArchivo();
    private String lecturaError = "";

    public Apuesta[] verficadorApuestas(Apuesta[] apuesta, int contador2, String erroresA) {

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
                            if (contador == 10) {
                                contadorLibre++;
                            }
                        } else {
                            lecturaError = lecturaError + apuesta[i].toString() + "\n";
                            apuesta[i] = null;
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
            String lecturaTotalErroes = erroresA + lecturaError;
            error.guardarArchivo(lecturaTotalErroes);
        }
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
        System.out.println("Cantidad verificas " + nu);
        return lib;
    }
}

