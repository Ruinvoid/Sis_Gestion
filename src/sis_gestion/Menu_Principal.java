/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sis_gestion;

import java.awt.BorderLayout;

/**
 *
 * @author SalaA-02
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
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

        jMenuItem14 = new javax.swing.JMenuItem();
        Contenido = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenido.setBackground(new java.awt.Color(244, 231, 215));
        Contenido.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 0, 204));
        jMenuBar1.setBorder(null);
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(159, 34, 64));
        jMenu1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenu1.setLabel("Usuarios");

        jMenuItem1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem1.setLabel("Empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem2.setLabel("Entradas");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem3.setLabel("Salidas");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem4.setLabel("Areas");
        jMenu1.add(jMenuItem4);

        jMenuItem10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem10.setLabel("Aspirantes");
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(159, 34, 64));
        jMenu2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenu2.setLabel("Recursos");

        jMenuItem8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem8.setLabel("Nomina");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem9.setLabel("Vacaciones");
        jMenu2.add(jMenuItem9);

        jMenuItem11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem11.setLabel("Bajas");
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(159, 34, 64));
        jMenu3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenu3.setLabel("Seguro");

        jMenuItem5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem5.setLabel("Beneficiarios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem6.setLabel("Seguro");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem7.setLabel("Comprobantes");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(159, 34, 64));
        jMenu4.setText("Ayuda");
        jMenu4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem12.setText("Acerca de");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem13.setText("Manual");
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(159, 34, 64));
        jMenu5.setText("Salir");
        jMenu5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jMenuItem15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem15.setText("Cerrar");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem16.setText("Cerrar sesion");
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Seguro sg=new Seguro();
        sg.setSize(800,575);
        sg.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(sg, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Beneficiarios benef=new Beneficiarios();
        benef.setSize(800,575);
        benef.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(benef, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
