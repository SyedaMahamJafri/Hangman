/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT_DS;

/**
 *
 * @author LAPTOP
 */
public class Hangman extends javax.swing.JFrame {

    /**
     * Creates new form Hangman
     */
    public Hangman() {
        initComponents();
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
        hangstand = new javax.swing.Box.Filler(new java.awt.Dimension(0, 2), new java.awt.Dimension(0, 2), new java.awt.Dimension(32767, 4));
        hangstand1 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        hangStand2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 4), new java.awt.Dimension(0, 4), new java.awt.Dimension(32767, 4));
        hangstand3 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        START = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hangstand.setBackground(new java.awt.Color(0, 0, 0));
        hangstand.setOpaque(true);
        jPanel1.add(hangstand, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 40, 10, 50));

        hangstand1.setBackground(new java.awt.Color(0, 0, 0));
        hangstand1.setOpaque(true);
        jPanel1.add(hangstand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 317, 220, 8));

        hangStand2.setBackground(new java.awt.Color(0, 0, 0));
        hangStand2.setOpaque(true);
        jPanel1.add(hangStand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 11, 293));

        hangstand3.setBackground(new java.awt.Color(0, 0, 0));
        hangstand3.setOpaque(true);
        jPanel1.add(hangstand3, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 30, 120, 10));

        START.setText("START");
        START.setOpaque(false);
        START.setSelected(true);
        START.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                STARTMousePressed(evt);
            }
        });
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        jPanel1.add(START, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("H_NG_A_");
        jTextArea1.setAlignmentX(1.5F);
        jTextArea1.setAlignmentY(1.5F);
        jTextArea1.setOpaque(false);
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 210, 76));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STARTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STARTMousePressed
        // TODO add your handling code here:
        Hangman1 obj=new Hangman1();
        obj.setVisible(true);
    }//GEN-LAST:event_STARTMousePressed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        // TODO add your handling code here:
        new Hangman1().setVisible(true);
    }//GEN-LAST:event_STARTActionPerformed

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
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hangman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton START;
    private javax.swing.Box.Filler hangStand2;
    private javax.swing.Box.Filler hangstand;
    private javax.swing.Box.Filler hangstand1;
    private javax.swing.Box.Filler hangstand3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
