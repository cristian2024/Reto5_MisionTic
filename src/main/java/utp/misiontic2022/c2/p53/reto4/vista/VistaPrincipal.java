/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p53.reto4.vista;



/**
 *
 * @author urano
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private Requerimiento1_Panel requerimiento1=new Requerimiento1_Panel();
    private Requerimiento2_Panel requerimiento2=new Requerimiento2_Panel();
    private Requerimiento3_Panel requerimiento3=new Requerimiento3_Panel();
    String[] requerimientos={"Requerimiento 1", "Requerimiento 2","Requerimiento 3"};
    /**
     * Creates new form Frontera
     */
    public VistaPrincipal() {
        initComponents();
        inicializar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panel2 = new java.awt.Panel();
        jToolBar1 = new javax.swing.JToolBar();
        req1 = new javax.swing.JButton();
        req2 = new javax.swing.JButton();
        req3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        req1.setText("Req. 1");
        req1.setActionCommand("Req. 1");
        req1.setFocusable(false);
        req1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        req1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        req1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req1ActionPerformed(evt);
            }
        });
        jToolBar1.add(req1);

        req2.setText("Req. 2");
        req2.setFocusable(false);
        req2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        req2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        req2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req2ActionPerformed(evt);
            }
        });
        jToolBar1.add(req2);

        req3.setText("Req. 3");
        req3.setFocusable(false);
        req3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        req3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        req3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req3ActionPerformed(evt);
            }
        });
        jToolBar1.add(req3);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void req1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req1ActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(requerimiento1);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_req1ActionPerformed

    private void req2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req2ActionPerformed
        panelPrincipal.setVisible(false);
        System.out.println("hola mundo");
        panelPrincipal.removeAll();
        panelPrincipal.add(requerimiento2);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_req2ActionPerformed

    private void req3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req3ActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(requerimiento3);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_req3ActionPerformed

    /**
     * @param args the command line arguments
     */
    //    public static void main(String args[]) {
    //        /* Set the Nimbus look and feel */
    //        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //         */
    //        try {
    //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //                if ("Nimbus".equals(info.getName())) {
    //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                    break;
    //                }
    //            }
    //        } catch (ClassNotFoundException ex) {
    //            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
    //        //</editor-fold>
    //        //</editor-fold>
    //
    //        /* Create and display the form */
    //        java.awt.EventQueue.invokeLater(new Runnable() {
    //            public void run() {
    //                new VistaPrincipal().setVisible(true);
    //            }
    //        });
    //    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jToolBar1;
    private java.awt.Panel panel2;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton req1;
    private javax.swing.JButton req2;
    private javax.swing.JButton req3;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        panelPrincipal.add(requerimiento1);
    }

    
    
    
            
}
