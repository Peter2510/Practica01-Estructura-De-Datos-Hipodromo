/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Apuesta.*;
import ManejoArchivos.ManejoArchivo;
import Reportes.Reportes;
import javax.swing.JOptionPane;
import ordenamiento.MetodoBurbuja;

/**
 *
 * @author GORDILLO G
 */
public class IngresarPosiciones extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private int[] posiciones = new int[10];
    private Apuesta[] apuestas;
    private Reportes reportes;
    private ManejoArchivo escribir = new ManejoArchivo();
    private String titulo = "Puntos,Nombre,Monto Apostado,Posicion 1 apostada,Posicion 2 apostada, Posicion3 apostada, Posicion 4 apostada, Posicion 5 apostada,Posicion 6 apostada,Posicion 7 apostada,Posicion 8 apostada,Posicion 9 apostada,Posicion 10 apostada\n";
    public IngresarPosiciones(Apuesta[] apuestas,Reportes reporte) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ingresar resultados");
        this.apuestas = apuestas;
        this.reportes = reporte;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pos1 = new javax.swing.JTextField();
        pos3 = new javax.swing.JTextField();
        pos2 = new javax.swing.JTextField();
        pos5 = new javax.swing.JTextField();
        pos6 = new javax.swing.JTextField();
        pos7 = new javax.swing.JTextField();
        pos4 = new javax.swing.JTextField();
        pos8 = new javax.swing.JTextField();
        pos9 = new javax.swing.JTextField();
        pos10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnIngrear = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        alfabetico = new javax.swing.JButton();
        porPuntaje = new javax.swing.JButton();
        ordenar = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dubai", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Primera posicion, caballo No.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(24, 110, 176, 24);

        jLabel2.setFont(new java.awt.Font("Dubai", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seguda posicion, caballo No.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(24, 156, 174, 24);

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tercera posicion, caballo No.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(26, 199, 174, 24);

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuarta posicion, caballo No.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(26, 242, 169, 24);

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexta posicion, caballo No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(24, 338, 176, 24);

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quinta posicion, caballo No.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(24, 288, 176, 24);

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Septima posicion, caballo No.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(24, 389, 179, 24);

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Octava posicion, caballo No.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(24, 435, 171, 24);

        jLabel9.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Novena posicion, caballo No.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(27, 474, 176, 24);

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Decima posicion, caballo No.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(32, 517, 174, 24);

        pos1.setText("1");
        jPanel1.add(pos1);
        pos1.setBounds(218, 109, 36, 24);

        pos3.setText("3");
        jPanel1.add(pos3);
        pos3.setBounds(218, 198, 36, 24);

        pos2.setText("2");
        jPanel1.add(pos2);
        pos2.setBounds(219, 155, 36, 24);

        pos5.setText("5");
        jPanel1.add(pos5);
        pos5.setBounds(218, 287, 36, 24);

        pos6.setText("6");
        jPanel1.add(pos6);
        pos6.setBounds(218, 337, 36, 24);

        pos7.setText("7");
        jPanel1.add(pos7);
        pos7.setBounds(221, 388, 36, 24);

        pos4.setText("4");
        jPanel1.add(pos4);
        pos4.setBounds(218, 241, 36, 24);

        pos8.setText("8");
        jPanel1.add(pos8);
        pos8.setBounds(221, 434, 36, 24);

        pos9.setText("9");
        jPanel1.add(pos9);
        pos9.setBounds(221, 473, 36, 24);

        pos10.setText("10");
        jPanel1.add(pos10);
        pos10.setBounds(224, 516, 36, 24);

        jLabel11.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ingreso de las posiciones de entrada de los caballos");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(120, 10, 519, 42);

        btnIngrear.setBackground(new java.awt.Color(255, 255, 255));
        btnIngrear.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        btnIngrear.setForeground(new java.awt.Color(255, 255, 255));
        btnIngrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        btnIngrear.setText("Generar resultados");
        btnIngrear.setBorder(null);
        btnIngrear.setBorderPainted(false);
        btnIngrear.setContentAreaFilled(false);
        btnIngrear.setFocusPainted(false);
        btnIngrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngrear);
        btnIngrear.setBounds(440, 450, 210, 48);

        jLabel12.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ordenar a los participantes por:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(390, 70, 248, 32);

        alfabetico.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        alfabetico.setForeground(new java.awt.Color(255, 255, 255));
        alfabetico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sort.png"))); // NOI18N
        alfabetico.setText("Orden alfabético");
        alfabetico.setBorder(null);
        alfabetico.setBorderPainted(false);
        alfabetico.setContentAreaFilled(false);
        alfabetico.setFocusPainted(false);
        alfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfabeticoActionPerformed(evt);
            }
        });
        jPanel1.add(alfabetico);
        alfabetico.setBounds(360, 140, 180, 40);

        porPuntaje.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        porPuntaje.setForeground(new java.awt.Color(255, 255, 255));
        porPuntaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/token.png"))); // NOI18N
        porPuntaje.setText("Por puntaje obtenido");
        porPuntaje.setBorder(null);
        porPuntaje.setBorderPainted(false);
        porPuntaje.setContentAreaFilled(false);
        porPuntaje.setFocusPainted(false);
        porPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porPuntajeActionPerformed(evt);
            }
        });
        jPanel1.add(porPuntaje);
        porPuntaje.setBounds(570, 140, 240, 40);

        ordenar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        ordenar.setForeground(new java.awt.Color(255, 255, 255));
        ordenar.setText("Puntaje obtenido");
        jPanel1.add(ordenar);
        ordenar.setBounds(660, 70, 177, 32);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/posicion1.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(-190, 0, 1040, 610);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngrearActionPerformed

        try {
            posiciones[0] = Integer.valueOf(pos1.getText());
            posiciones[1] = Integer.valueOf(pos2.getText());
            posiciones[2] = Integer.valueOf(pos3.getText());
            posiciones[3] = Integer.valueOf(pos4.getText());
            posiciones[4] = Integer.valueOf(pos5.getText());
            posiciones[5] = Integer.valueOf(pos6.getText());
            posiciones[6] = Integer.valueOf(pos7.getText());
            posiciones[7] = Integer.valueOf(pos8.getText());
            posiciones[8] = Integer.valueOf(pos9.getText());
            posiciones[9] = Integer.valueOf(pos10.getText());

            verificarPosiciones pos = new verificarPosiciones();

            if (!pos.verificarRepitencia(posiciones)) {
                GenerarGanancia ganancia = new GenerarGanancia();
                ganancia.getResultados(apuestas, posiciones);
                Reportes reporte2 = ganancia.actualizarReportes(reportes);

                if (ordenar.getText().equals("Puntaje obtenido")) {
                    MetodoBurbuja num = new MetodoBurbuja();
                    Apuesta[] porNumero = num.OrdenDescendente(apuestas);
                    Reportes reporte3 = num.actualizarReportes(reporte2);
                    String lectura = "";
                    for (int i = 0; i < porNumero.length; i++) {
                        lectura += porNumero[i].getGanancia() + ", " + porNumero[i].toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null,"Selecciona un nombre y ubicacion para guardar los resultados ordenados por puntaje");
                    lectura = "ORDENADO POR PUNTEO \n"+titulo + lectura;
                    escribir.guardarArchivo(lectura);
                    JOptionPane.showMessageDialog(null,"Selecciona un nombre y ubicacion para guardar los reportes generados");
                    escribir.guardarArchivo(reporte3.getReportes());

                } else {
                    MetodoBurbuja letra = new MetodoBurbuja();
                    Apuesta[] porAlfabeto = letra.OrdenAlfabetico(apuestas);
                    Reportes reporte3 = letra.actualizarReportes(reporte2);
                    String lectura = "";
                    for (int i = 0; i < porAlfabeto.length; i++) {
                        lectura += porAlfabeto[i].getGanancia() + ", " + porAlfabeto[i].toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null,"Selecciona un nombre y ubicacion para guardar los resultados ordenados alfabéticamente");
                    lectura = "ORDENADO ALFABETICAMENTE \n"+titulo + lectura;
                    escribir.guardarArchivo(lectura);
                    JOptionPane.showMessageDialog(null,"Selecciona un nombre y ubicacion para guardar los reportes generados");
                    escribir.guardarArchivo(reporte3.getReportes());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las posiciones no pueden ser repetidas y estar en el rango de 1 a 10");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Asegurate de llenar todas las posiciones con numeros enteros");
        }

    }//GEN-LAST:event_btnIngrearActionPerformed

    private void porPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porPuntajeActionPerformed
        ordenar.setText("Puntaje obtenido");
    }//GEN-LAST:event_porPuntajeActionPerformed

    private void alfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfabeticoActionPerformed
        ordenar.setText("Orden alfabético");
    }//GEN-LAST:event_alfabeticoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alfabetico;
    private javax.swing.JButton btnIngrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ordenar;
    private javax.swing.JButton porPuntaje;
    private javax.swing.JTextField pos1;
    private javax.swing.JTextField pos10;
    private javax.swing.JTextField pos2;
    private javax.swing.JTextField pos3;
    private javax.swing.JTextField pos4;
    private javax.swing.JTextField pos5;
    private javax.swing.JTextField pos6;
    private javax.swing.JTextField pos7;
    private javax.swing.JTextField pos8;
    private javax.swing.JTextField pos9;
    // End of variables declaration//GEN-END:variables
}
