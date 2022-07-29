
package Interfaces;


import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import filmsafe_filmsafe1.Proyectos;
import filmsafe_filmsafe1.operaciones;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import filmsafe_filmsafe1.operaciones;
import javax.swing.JOptionPane;


public class Nuevoproyecto extends javax.swing.JFrame {

    
    public Nuevoproyecto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        volveraselproyectosBTN3 = new javax.swing.JButton();
        crearproyectoBTN = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtfechacomienzo = new javax.swing.JFormattedTextField();
        txtfechafin = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevo Proyecto");

        jLabel2.setText("Nombre del Proyecto:");

        jLabel3.setText("Fecha de comienzo:");

        jLabel4.setText("Fecha de Fin:");

        volveraselproyectosBTN3.setText("Volver a sel. de proyectos");
        volveraselproyectosBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volveraselproyectosBTN3ActionPerformed(evt);
            }
        });

        crearproyectoBTN.setText("Crear Proyecto");
        crearproyectoBTN.setActionCommand("Crar Proyecto");
        crearproyectoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearproyectoBTNActionPerformed(evt);
            }
        });

        txtfechacomienzo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtfechacomienzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechacomienzoActionPerformed(evt);
            }
        });

        txtfechafin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombre)
                                    .addComponent(txtfechacomienzo)
                                    .addComponent(txtfechafin, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(volveraselproyectosBTN3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearproyectoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfechacomienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volveraselproyectosBTN3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(crearproyectoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volveraselproyectosBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volveraselproyectosBTN3ActionPerformed
        
        
        Menuprincipal volver=new Menuprincipal();
        volver.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_volveraselproyectosBTN3ActionPerformed

    private void crearproyectoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearproyectoBTNActionPerformed
      
        
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        //Tomamos los datos del proyecto que están seteados en elementos swing y creamos una nueva instancia de proyectos
        nombreProyecto=txtnombre.getText();
        fechainicioProyecto=(Date) txtfechacomienzo.getValue();
        fechafinProyecto=(Date) txtfechafin.getValue();
         
        Proyectos nuevoproyecto=new Proyectos(nombreProyecto,fechainicioProyecto,fechafinProyecto);
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        //Llamamos al método de operaciones correspondiente para persistir el proyecto nuevo
        operaciones guardar=new operaciones();
        guardar.crearProyecto(nuevoproyecto);
       
        JOptionPane.showMessageDialog(this, "El proyecto se ha guardado con éxito", "Proyecto guardado", JOptionPane.INFORMATION_MESSAGE);
        
        
        Proyectosactuales ir=new Proyectosactuales();
        ir.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_crearproyectoBTNActionPerformed

    private void txtfechacomienzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechacomienzoActionPerformed
       
        
    }//GEN-LAST:event_txtfechacomienzoActionPerformed

    
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
            java.util.logging.Logger.getLogger(Nuevoproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevoproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevoproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevoproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevoproyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearproyectoBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField txtfechacomienzo;
    private javax.swing.JFormattedTextField txtfechafin;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JButton volveraselproyectosBTN3;
    // End of variables declaration//GEN-END:variables
}
