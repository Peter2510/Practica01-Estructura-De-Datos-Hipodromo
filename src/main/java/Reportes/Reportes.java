    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

/**
 *
 * @author GORDILLO G
 */
public class Reportes {
    
    
    private long tiempoApuestas=0,tiempoResultados=0,tiempoOrdenamiento=0;
    private int pasosApuestas=0, pasosResultados=0, pasosOrdenamientos=0;
    private int MaxpasosApuestas=0, MaxpasosResultados=0, MaxpasosOrdenamientos=0;
    private int MinpasosApuestas=0, MinpasosResultados=0, MinpasosOrdenamientos=0;

    
    public String getReporteApuestas() {
        
        String titulo = "REPORTE VERIFICAR APUESTAS\n";
        String cuerpo = "Tiempo promedio verificar apuestas: " + getTiempoApuestas() + " NanoSegundos" + "\n"
                + "Promedio de pasos en verificar las apuestas: " + getPasosApuestas() +"\n"
                + "Maximo de pasos " + getMaxpasosApuestas()+ "\n" +
                "Minimo de pasos" + getMinpasosApuestas() +" \n\n";
        
        String reporteApuestas = titulo + cuerpo;
        return reporteApuestas;
    }

    public String getReporteResultados() {
        
        String titulo = "REPORTE VERIFICAR RESULTADOS FINALES\n";
        String cuerpo = "Tiempo promedio verificar resultados: " + getTiempoResultados()+ " NanoSegundos" + "\n"
                + "Promedio de pasos en verificar los resultados: " + getPasosResultados() +"\n"
                + "Maximo de pasos " + getMaxpasosResultados()+ "\n" +
                "Minimo de pasos" + getMinpasosResultados() +" \n\n";
        String reporteResultados = titulo + cuerpo;
        return reporteResultados;
    }

    public String getReporteOrdenamiento() {
        
        String titulo = "REPORTE ORDENAMIENTO\n";
        String cuerpo = "Tiempo promedio en ordenar: " + getTiempoOrdenamiento()+ " NanoSegundos" + "\n"
                + "Promedio de pasos en ordenar: " + getPasosOrdenamientos() +"\n"
                + "Maximo de pasos " + getMaxpasosOrdenamientos()+ "\n" +
                "Minimo de pasos" + getMinpasosOrdenamientos()+" \n\n";
        String reporteOrdenamiento = titulo + cuerpo;
        
        return reporteOrdenamiento;
        
    }  
    
    public String getReportes(){
        
        String reportes = getReporteApuestas() + getReporteResultados() + getReporteOrdenamiento();
        
     return reportes;
    }

    public long getTiempoApuestas() {
        return tiempoApuestas;
    }

    public void setTiempoApuestas(long tiempoApuestas) {
        this.tiempoApuestas = tiempoApuestas;
    }

    public long getTiempoResultados() {
        return tiempoResultados;
    }

    public void setTiempoResultados(long tiempoResultados) {
        this.tiempoResultados = tiempoResultados;
    }

    public long getTiempoOrdenamiento() {
        return tiempoOrdenamiento;
    }

    public void setTiempoOrdenamiento(long tiempoOrdenamiento) {
        this.tiempoOrdenamiento = tiempoOrdenamiento;
    }

    public int getPasosApuestas() {
        return pasosApuestas;
    }

    public void setPasosApuestas(int pasosApuestas) {
        this.pasosApuestas = pasosApuestas;
    }

    public int getPasosResultados() {
        return pasosResultados;
    }

    public void setPasosResultados(int pasosResultados) {
        this.pasosResultados = pasosResultados;
    }

    public int getPasosOrdenamientos() {
        return pasosOrdenamientos;
    }

    public void setPasosOrdenamientos(int pasosOrdenamientos) {
        this.pasosOrdenamientos = pasosOrdenamientos;
    }

    public int getMaxpasosApuestas() {
        return MaxpasosApuestas;
    }

    public void setMaxpasosApuestas(int MaxpasosApuestas) {
        this.MaxpasosApuestas = MaxpasosApuestas;
    }

    public int getMaxpasosResultados() {
        return MaxpasosResultados;
    }

    public void setMaxpasosResultados(int MaxpasosResultados) {
        this.MaxpasosResultados = MaxpasosResultados;
    }

    public int getMaxpasosOrdenamientos() {
        return MaxpasosOrdenamientos;
    }

    public void setMaxpasosOrdenamientos(int MaxpasosOrdenamientos) {
        this.MaxpasosOrdenamientos = MaxpasosOrdenamientos;
    }

    public int getMinpasosApuestas() {
        return MinpasosApuestas;
    }

    public void setMinpasosApuestas(int MinpasosApuestas) {
        this.MinpasosApuestas = MinpasosApuestas;
    }

    public int getMinpasosResultados() {
        return MinpasosResultados;
    }

    public void setMinpasosResultados(int MinpasosResultados) {
        this.MinpasosResultados = MinpasosResultados;
    }

    public int getMinpasosOrdenamientos() {
        return MinpasosOrdenamientos;
    }

    public void setMinpasosOrdenamientos(int MinpasosOrdenamientos) {
        this.MinpasosOrdenamientos = MinpasosOrdenamientos;
    }
    
    

    
    
    
    
}
