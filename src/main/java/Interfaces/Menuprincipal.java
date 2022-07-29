
package Interfaces;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Menuprincipal extends javax.swing.JFrame {

    
    public Menuprincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iranuevoproyecto = new javax.swing.JButton();
        iraproyectosanterioresBTN = new javax.swing.JButton();
        iraproyectosactualesBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menuprincipal");

        iranuevoproyecto.setText("Nuevo Proyecto");
        iranuevoproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iranuevoproyectoActionPerformed(evt);
            }
        });

        iraproyectosanterioresBTN.setText("Proyectos Anteriores");
        iraproyectosanterioresBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iraproyectosanterioresBTNActionPerformed(evt);
            }
        });

        iraproyectosactualesBTN.setText("Proyectos Actuales");
        iraproyectosactualesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iraproyectosactualesBTNActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccionar Proyecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(iraproyectosanterioresBTN)
                .addGap(18, 18, 18)
                .addComponent(iraproyectosactualesBTN)
                .addGap(18, 18, 18)
                .addComponent(iranuevoproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iranuevoproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iraproyectosanterioresBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iraproyectosactualesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iranuevoproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iranuevoproyectoActionPerformed
    
     Nuevoproyecto abrir=new Nuevoproyecto();
     abrir.setVisible(true);
     this.setVisible(false);
        
        
    }//GEN-LAST:event_iranuevoproyectoActionPerformed

    private void iraproyectosanterioresBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iraproyectosanterioresBTNActionPerformed
        
       Proyectosanteriores abrir=new Proyectosanteriores();
       abrir.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_iraproyectosanterioresBTNActionPerformed

    private void iraproyectosactualesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iraproyectosactualesBTNActionPerformed
       
       
        
        // RESCATAR FECHA DE HOY PARA HACER LA RECUPERACIÓN DE REGISTROS
        
        Date hoy= new Date();
        
        hoy.getDate();
        
        SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd");
        formato.setLenient(false);
     
        String diavalor=formato.format(hoy);
        
        Date diadehoy = null;
        
        try {
            diadehoy = formato.parse(diavalor);
             
             
        } catch (ParseException ex) {
        
            Logger.getLogger(registroparticular.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        
        
        
        
        Proyectosactuales abrir=new Proyectosactuales();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_iraproyectosactualesBTNActionPerformed

   
    public static void main(String args[]) {
        
           
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iranuevoproyecto;
    private javax.swing.JButton iraproyectosactualesBTN;
    private javax.swing.JButton iraproyectosanterioresBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
