/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;

import java.awt.Color;
import java.util.ArrayList;



/**
 *
 * @author Adrian
 */
public class Grafica extends javax.swing.JFrame {


    public Grafica() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

//    public Grafica(String def, double[] x, double[] y) {
//        initComponents();
//        this.setLocationRelativeTo(null);
//        
//        grafica.addLegend("SOUTH");
//        grafica.removeAllPlots();      
//        //grafica.addLinePlot(def, x, y);
//        grafica.addLinePlot(def, Color.red, x, y);
//    }
    
    public Grafica(String def, ArrayList<Double> x, ArrayList<Double> y) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        
        double[] cordenadaX = new double[x.size()];
        double[] cordenadaY = new double[y.size()];
        
        int iter = 0;
        for (Object x11: x.toArray()) {
            cordenadaX[iter++] = (double) x11;
        }
        
        int iter2 = 0;
        for (Object y11: y.toArray()) {
            cordenadaY[iter2++] = (double) y11;
        }
                
        grafica.addLegend("SOUTH");
        grafica.removeAllPlots();      
        grafica.addLinePlot(def, Color.red, cordenadaX, cordenadaY);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grafica = new org.math.plot.Plot2DPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gráfica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafica, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafica, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.math.plot.Plot2DPanel grafica;
    // End of variables declaration//GEN-END:variables
}
