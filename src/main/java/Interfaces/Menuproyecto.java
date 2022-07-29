
package Interfaces;
import Interfaces.Proyectosactuales;
import filmsafe_filmsafe1.Proyectos;
import filmsafe_filmsafe1.operaciones;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Menuproyecto extends javax.swing.JFrame {

   
    
    public Menuproyecto(Proyectos nuevoproyecto) {
        initComponents();
        this.setLocationRelativeTo(null);
    
    
    
    int idProyecto=nuevoproyecto.getIdProyecto();
    String nombreProyecto=nuevoproyecto.getNombreProyecto();
    Date fechainicioProyecto=nuevoproyecto.getFechainicioProyecto();
    Date fechafinProyecto=nuevoproyecto.getFechafinProyecto();
    
    
        
    JLtituloproyectoactual.setText(nombreProyecto);
    JTidproyecto.setText(String.valueOf(idProyecto));
    JTfechainicio.setValue(fechainicioProyecto);
    JTfechafin.setValue(fechafinProyecto);
    
    
    Date diadehoy= new Date();
    diadehoy.getDate();
    
    
    
    SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd");
    
     
        String diavalor=formato.format(diadehoy);
        
        DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
         
         Date hoy = null;
        
        try {
            hoy = formatter.parse(diavalor);
           
            
             
        } catch (ParseException ex) {
        
            Logger.getLogger(registroparticular.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
    
        int comparacion = fechafinProyecto.compareTo(hoy);
        
        
        
        if (comparacion<0){
        
        JBpendientehoy.setEnabled(false);
        BTNagregartrabajador.setEnabled(false);
        
        }
        
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtituloproyectoactual = new javax.swing.JLabel();
        JBpendientehoy = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();
        BTNagregartrabajador = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTidproyecto = new javax.swing.JTextField();
        JLfechainicio = new javax.swing.JLabel();
        JLfechafin = new javax.swing.JLabel();
        JTfechainicio = new javax.swing.JFormattedTextField();
        JTfechafin = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLtituloproyectoactual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLtituloproyectoactual.setText("jLabel1");

        JBpendientehoy.setText("Pendiente Hoy");
        JBpendientehoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpendientehoyActionPerformed(evt);
            }
        });

        JBbuscar.setText("Buscar");
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        BTNagregartrabajador.setText("Agregar Trabajador");
        BTNagregartrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNagregartrabajadorActionPerformed(evt);
            }
        });

        jButton2.setText("Volver a Menú Principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Id Proyecto:");

        JTidproyecto.setEnabled(false);

        JLfechainicio.setText("Fecha de inicio:");

        JLfechafin.setText("Fecha de fin:");

        JTfechainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        JTfechainicio.setEnabled(false);

        JTfechafin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        JTfechafin.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(JLtituloproyectoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBpendientehoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTNagregartrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(JTidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLfechainicio)
                                .addGap(18, 18, 18)
                                .addComponent(JTfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(JLfechafin)
                                .addGap(18, 18, 18)
                                .addComponent(JTfechafin)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(JLtituloproyectoactual)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfechainicio)
                    .addComponent(JLfechafin)
                    .addComponent(JTfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBpendientehoy)
                    .addComponent(BTNagregartrabajador))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBbuscar)
                    .addComponent(jButton2))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Menuprincipal volver=new Menuprincipal();
        volver.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BTNagregartrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNagregartrabajadorActionPerformed
        
        
        int idProyecto;
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
       
       idProyecto=(Integer) Integer.parseInt(JTidproyecto.getText());
       nombreProyecto= JLtituloproyectoactual.getText();
       fechainicioProyecto=(Date)JTfechainicio.getValue();
       fechafinProyecto= (Date) JTfechafin.getValue();
       
       Proyectos nuevoproyecto=new Proyectos(idProyecto,nombreProyecto,fechainicioProyecto,fechafinProyecto);
       
       nuevoproyecto.setIdProyecto(idProyecto);
       nuevoproyecto.setNombreProyecto(nombreProyecto);
       nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
       nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        
        
        Agregartrabajador ir=new Agregartrabajador(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTNagregartrabajadorActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
       
        int idProyecto;
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
       
       idProyecto=(Integer) Integer.parseInt(JTidproyecto.getText());
       nombreProyecto= JLtituloproyectoactual.getText();
       fechainicioProyecto=(Date)JTfechainicio.getValue();
       fechafinProyecto= (Date) JTfechafin.getValue();
       
       Proyectos nuevoproyecto=new Proyectos(idProyecto,nombreProyecto,fechainicioProyecto,fechafinProyecto);
       
       nuevoproyecto.setIdProyecto(idProyecto);
       nuevoproyecto.setNombreProyecto(nombreProyecto);
       nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
       nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
       buscartrabajador ir=new buscartrabajador(nuevoproyecto);
       ir.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JBpendientehoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpendientehoyActionPerformed
        
        Date hoy= new Date();
        
        hoy.getDate();
        
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yy");
        formato.setLenient(false);
     
        String diavalor=formato.format(hoy);
        
        Date diadehoy = null;
        
        try {
            diadehoy = formato.parse(diavalor);
             
             
        } catch (ParseException ex) {
        
            Logger.getLogger(registroparticular.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        
       
        int idProyecto;
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
       
       idProyecto=(Integer) Integer.parseInt(JTidproyecto.getText());
       nombreProyecto= JLtituloproyectoactual.getText();
       fechainicioProyecto=(Date)JTfechainicio.getValue();
       fechafinProyecto= (Date) JTfechafin.getValue();
       
       Proyectos nuevoproyecto=new Proyectos();
       
       nuevoproyecto.setIdProyecto(idProyecto);
       nuevoproyecto.setNombreProyecto(nombreProyecto);
       nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
       nuevoproyecto.setFechafinProyecto(fechafinProyecto);
     
        pendienteshoy ir=new pendienteshoy(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
     
        
    }//GEN-LAST:event_JBpendientehoyActionPerformed

   
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
            java.util.logging.Logger.getLogger(Menuproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new proyectoactual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNagregartrabajador;
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBpendientehoy;
    private javax.swing.JLabel JLfechafin;
    private javax.swing.JLabel JLfechainicio;
    private javax.swing.JLabel JLtituloproyectoactual;
    private javax.swing.JFormattedTextField JTfechafin;
    private javax.swing.JFormattedTextField JTfechainicio;
    private javax.swing.JTextField JTidproyecto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
