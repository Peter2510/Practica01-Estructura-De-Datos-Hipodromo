/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apuesta;

import javax.swing.JOptionPane;

/**
 *
 * @author GORDILLO G
 */
public class verificarPosiciones {

    public boolean verificarRepitencia(int[] resultados) {

        for (int i = 0; i < 10; i++) {

            if (resultados[i] > 0 && resultados[i] < 11) {

                for (int j = i + 1; j < 10; j++) {

                    if (resultados[j] > 0 && resultados[j] < 11) {

                        if (resultados[i] == resultados[j]) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }else{
                return true;
            }
            
        }

        return false;
    }
}
