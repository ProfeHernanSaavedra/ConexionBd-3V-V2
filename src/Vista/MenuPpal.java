/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

/**
 *
 * @author USRVI-LC2
 */
public class MenuPpal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPpal
     */
    public MenuPpal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmi_ingresarCarrera = new javax.swing.JMenuItem();
        jmi_listarCarrera = new javax.swing.JMenuItem();
        jmi_eliminarCarrera = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Opciones");

        jMenu3.setText("Carrera");

        jmi_ingresarCarrera.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_ingresarCarrera.setText("Ingresar");
        jmi_ingresarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ingresarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_ingresarCarrera);

        jmi_listarCarrera.setText("Listar");
        jmi_listarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_listarCarrera);

        jmi_eliminarCarrera.setText("Elminar Carrera");
        jmi_eliminarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_eliminarCarrera);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_salir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jmi_ingresarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ingresarCarreraActionPerformed
        
        Form_Carrera fc = new Form_Carrera();
        fc.setVisible(true);
        
        
    }//GEN-LAST:event_jmi_ingresarCarreraActionPerformed

    private void jmi_listarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarCarreraActionPerformed
         Form_listarCarrera flc = new Form_listarCarrera();
        flc.setVisible(true);
    }//GEN-LAST:event_jmi_listarCarreraActionPerformed

    private void jmi_eliminarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarCarreraActionPerformed
        Frame_eliminarCarrera fec = new Frame_eliminarCarrera();
        fec.setVisible(true);
    }//GEN-LAST:event_jmi_eliminarCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            
            public void run() {
                
                final MenuPpal frame = new MenuPpal();
 
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
 
                //frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                 frame.setVisible(true);
                
                
               //new MenuPpal().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmi_eliminarCarrera;
    private javax.swing.JMenuItem jmi_ingresarCarrera;
    private javax.swing.JMenuItem jmi_listarCarrera;
    private javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}