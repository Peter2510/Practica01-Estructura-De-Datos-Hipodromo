/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoArchivos;

import Apuesta.Apuesta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author GORDILLO G
 */
public class ManejoArchivo {

    private String texto = "";
    private String lectura;
    private int seleccion;
    private Apuesta[] apuestas;
    String[] dividirApuesta;
    private int contador = 0;
    private int contadorL = 1;
    private String errores ="";

    public void crearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            //System.out.println("Archivo creado");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public void escribirArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            // System.out.println("Se escribio correctamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void AgregarAlArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            //System.out.println("Se ha agregado contenido correctamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public String getLectura() {
        return texto;
    }
    
    public void agregarError(){
        
            for (int i = 0; i < dividirApuesta.length; i++) {
                errores+=dividirApuesta[i] + " ";                
            }
            errores+= "Linea " + contadorL + "\n";
    }

    public String guardarArchivo(String lectura) {
        
        String path = "";
        JFileChooser ventanaSeleccionar = new JFileChooser();

        if (ventanaSeleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            File archivo;
            archivo = ventanaSeleccionar.getSelectedFile();

            //crearArchivo(archivo.getAbsolutePath() + ".txt");
            AgregarAlArchivo(archivo.getAbsolutePath() + ".csv", lectura);
            path = archivo.getAbsolutePath();

        }
        return path;
    }

    public void leerLinea() {

        try {
            JFileChooser fc = new JFileChooser();

            seleccion = fc.showOpenDialog(fc);

            if (seleccion == JFileChooser.APPROVE_OPTION) {

                File fichero = fc.getSelectedFile();

                fichero.getAbsolutePath();

                if (fichero.exists()) {

                    try {

                        BufferedReader entrada = new BufferedReader(new FileReader(fichero));
                        BufferedReader entrada1 = new BufferedReader(new FileReader(fichero));

                        //cantidad de lineas de archivo de entrada
                        int cantLineas = (int) entrada1.lines().count();
                        System.out.println("lienas " + cantLineas);

                        //creando el arreglo de las apuestas
                        apuestas = new Apuesta[cantLineas];

                        String bfRead;

                        while ((bfRead = entrada.readLine()) != null) {

                            // leyendo la linea de la apuesta
                            agregarApuesta(bfRead);
                            contadorL++;

                        }

                        entrada.close();

                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace(System.out);
                    } catch (NullPointerException e) {
                        System.out.println(e);
                    } catch (NumberFormatException ex) {

                    } catch (IOException ex) {
                        ex.printStackTrace(System.out);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El archivo no existe");
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void agregarApuesta(String linea) {

        // Obteniendo el valor de la apuesta ingresada
        try {

            dividirApuesta = linea.split(",");
            
            
            // creando la apuesta por jugador
            Apuesta apuesta = new Apuesta(dividirApuesta[0], Double.parseDouble(dividirApuesta[1]), Integer.parseInt(dividirApuesta[2]), Integer.parseInt(dividirApuesta[3]), Integer.parseInt(dividirApuesta[4]), Integer.parseInt(dividirApuesta[5]), Integer.parseInt(dividirApuesta[6]), Integer.parseInt(dividirApuesta[7]), Integer.parseInt(dividirApuesta[8]), Integer.parseInt(dividirApuesta[9]), Integer.parseInt(dividirApuesta[10]), Integer.parseInt(dividirApuesta[11]));
            // Agregando la apuesta al arreglo
            apuestas[contador] = apuesta;
            contador++;
            
            

        } catch (Exception e) {
            agregarError();
        }

    }
    
    // se retorna el array generado
    public Apuesta[] getApuestas() {
        return apuestas;
    }
    
    public int getContador(){
        return contador;
    }
    
    public String getErrores(){
        return errores;
    }

}
