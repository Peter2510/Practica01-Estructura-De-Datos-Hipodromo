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
public class Apuesta {
    private String nombre;
    private Double monto;
    private int ganancia;
    private int[] ordenLlegada = new int[10];
    private int pos1Apuesta,pos2Apuesta,pos3Apuesta,pos4Apuesta,pos5Apuesta,pos6Apuesta,pos7Apuesta,pos8Apuesta,pos9Apuesta,pos10Apuesta;

    public Apuesta(String nombre, Double monto, int pos1Apuesta, int pos2Apuesta, int pos3Apuesta, int pos4Apuesta, int pos5Apuesta, int pos6Apuesta, int pos7Apuesta, int pos8Apuesta, int pos9Apuesta, int pos10Apuesta) {
        this.nombre = nombre;
        this.monto = monto;
        this.pos1Apuesta = pos1Apuesta;
        this.pos2Apuesta = pos2Apuesta;
        this.pos3Apuesta = pos3Apuesta;
        this.pos4Apuesta = pos4Apuesta;
        this.pos5Apuesta = pos5Apuesta;
        this.pos6Apuesta = pos6Apuesta;
        this.pos7Apuesta = pos7Apuesta;
        this.pos8Apuesta = pos8Apuesta;
        this.pos9Apuesta = pos9Apuesta;
        this.pos10Apuesta = pos10Apuesta;
        ordenLlegada();
    }
    
    public void ordenLlegada(){
        
        ordenLlegada[0]=pos1Apuesta;
        ordenLlegada[1]=pos2Apuesta;
        ordenLlegada[2]=pos3Apuesta;
        ordenLlegada[3]=pos4Apuesta;
        ordenLlegada[4]=pos5Apuesta;
        ordenLlegada[5]=pos6Apuesta;
        ordenLlegada[6]=pos7Apuesta;
        ordenLlegada[7]=pos8Apuesta;
        ordenLlegada[8]=pos9Apuesta;
        ordenLlegada[9]=pos10Apuesta;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int getPos1Apuesta() {
        return pos1Apuesta;
    }

    public void setPos1Apuesta(int pos1Apuesta) {
        this.pos1Apuesta = pos1Apuesta;
    }

    public int getPos2Apuesta() {
        return pos2Apuesta;
    }

    public void setPos2Apuesta(int pos2Apuesta) {
        this.pos2Apuesta = pos2Apuesta;
    }

    public int getPos3Apuesta() {
        return pos3Apuesta;
    }

    public void setPos3Apuesta(int pos3Apuesta) {
        this.pos3Apuesta = pos3Apuesta;
    }

    public int getPos4Apuesta() {
        return pos4Apuesta;
    }

    public void setPos4Apuesta(int pos4Apuesta) {
        this.pos4Apuesta = pos4Apuesta;
    }

    public int getPos5Apuesta() {
        return pos5Apuesta;
    }

    public void setPos5Apuesta(int pos5Apuesta) {
        this.pos5Apuesta = pos5Apuesta;
    }

    public int getPos6Apuesta() {
        return pos6Apuesta;
    }

    public void setPos6Apuesta(int pos6Apuesta) {
        this.pos6Apuesta = pos6Apuesta;
    }

    public int getPos7Apuesta() {
        return pos7Apuesta;
    }

    public void setPos7Apuesta(int pos7Apuesta) {
        this.pos7Apuesta = pos7Apuesta;
    }

    public int getPos8Apuesta() {
        return pos8Apuesta;
    }

    public void setPos8Apuesta(int pos8Apuesta) {
        this.pos8Apuesta = pos8Apuesta;
    }

    public int getPos9Apuesta() {
        return pos9Apuesta;
    }

    public void setPos9Apuesta(int pos9Apuesta) {
        this.pos9Apuesta = pos9Apuesta;
    }

    public int getPos10Apuesta() {
        return pos10Apuesta;
    }

    public void setPos10Apuesta(int pos10Apuesta) {
        this.pos10Apuesta = pos10Apuesta;
    }

    public int[] getOrdenLlegada() {
        return ordenLlegada;
    }

    public void setOrdenLlegada(int[] ordenLlegada) {
        this.ordenLlegada = ordenLlegada;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return nombre + "," + monto + "," + pos1Apuesta + "," + pos2Apuesta + "," + pos3Apuesta + "," + pos4Apuesta + "," + pos5Apuesta + "," + pos6Apuesta + "," + pos7Apuesta + "," + pos8Apuesta + "," + pos9Apuesta + "," + pos10Apuesta ;
    }
    
       
    
}
