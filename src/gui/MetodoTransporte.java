/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import app.Main;
/**
 *
 * @author xeon
 */
public class MetodoTransporte extends javax.swing.JFrame {
    Main main;
    /**
     * Creates new form ComplexNumberASYS
     */
    public MetodoTransporte(Main main) {
        initComponents();
        this.main = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFoot1 = new javax.swing.JLabel();
        pnlComplexNumbers = new javax.swing.JPanel();
        lblHOME = new javax.swing.JLabel();
        lblComplexNumbers = new javax.swing.JLabel();
        SeriesFourier = new javax.swing.JLabel();
        lblTema1 = new javax.swing.JLabel();
        lblIndicacion = new javax.swing.JLabel();
        lblIndicacion1 = new javax.swing.JLabel();
        lblFoot = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        lblFoot1.setForeground(new java.awt.Color(51, 204, 255));
        lblFoot1.setText("ITESS-TICS-2023 Ago-Dic");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlComplexNumbers.setBackground(new java.awt.Color(0, 0, 0));
        pnlComplexNumbers.setPreferredSize(new java.awt.Dimension(800, 500));
        pnlComplexNumbers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHOME.setBackground(new java.awt.Color(0, 0, 0));
        lblHOME.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblHOME.setForeground(new java.awt.Color(51, 255, 204));
        lblHOME.setText("Inicio");
        lblHOME.setOpaque(true);
        lblHOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHOMEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHOMEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHOMEMouseExited(evt);
            }
        });
        pnlComplexNumbers.add(lblHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 70, 50));

        lblComplexNumbers.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblComplexNumbers.setForeground(new java.awt.Color(0, 204, 204));
        lblComplexNumbers.setText("Metodo de Transporte y Planeacion de Actividades");
        pnlComplexNumbers.add(lblComplexNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 410, 40));

        SeriesFourier.setBackground(new java.awt.Color(0, 0, 0));
        SeriesFourier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transporte black.png"))); // NOI18N
        SeriesFourier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeriesFourier.setOpaque(true);
        SeriesFourier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeriesFourierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeriesFourierMouseExited(evt);
            }
        });
        pnlComplexNumbers.add(SeriesFourier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 110));

        lblTema1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTema1.setForeground(new java.awt.Color(255, 255, 255));
        lblTema1.setText("Temas 2 y 3.");
        pnlComplexNumbers.add(lblTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 100, -1));

        lblIndicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicacion.setText("1 usando el Diagrama de Gantt");
        pnlComplexNumbers.add(lblIndicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, 20));

        lblIndicacion1.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicacion1.setText("Indicaciones: Resuelve el problema ");
        pnlComplexNumbers.add(lblIndicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 230, 30));

        lblFoot.setForeground(new java.awt.Color(51, 204, 255));
        lblFoot.setText("ERICK FLORES TAPIA");
        pnlComplexNumbers.add(lblFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        pnlComplexNumbers.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(102, 255, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Met.T.png"))); // NOI18N
        pnlComplexNumbers.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 340, 410));

        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PlanAB.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        pnlComplexNumbers.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 350, 370));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Indicaciones: Resuelve el problema con el Metodo de Transporte");
        pnlComplexNumbers.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHOMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseEntered
        // TODO add your handling code here:
        lblHOME.setBackground(Color.yellow);
    }//GEN-LAST:event_lblHOMEMouseEntered

    private void lblHOMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseExited
        // TODO add your handling code here:
        lblHOME.setBackground(Color.black);
    }//GEN-LAST:event_lblHOMEMouseExited

    private void lblHOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseClicked
       // TODO add your handling code here:
       main.metodoTransporte.setVisible(false);
       main.metodoTransporte = null;
       
       main.mainASYS.setVisible(true);
    }//GEN-LAST:event_lblHOMEMouseClicked

    private void SeriesFourierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriesFourierMouseEntered
        SeriesFourier.setBackground(Color.yellow);
    }//GEN-LAST:event_SeriesFourierMouseEntered

    private void SeriesFourierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriesFourierMouseExited
        SeriesFourier.setBackground(Color.black);
    }//GEN-LAST:event_SeriesFourierMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MetodoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ComplexNumbersASYS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SeriesFourier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblComplexNumbers;
    private javax.swing.JLabel lblFoot;
    private javax.swing.JLabel lblFoot1;
    private javax.swing.JLabel lblHOME;
    private javax.swing.JLabel lblIndicacion;
    private javax.swing.JLabel lblIndicacion1;
    private javax.swing.JLabel lblTema1;
    private javax.swing.JPanel pnlComplexNumbers;
    // End of variables declaration//GEN-END:variables
}