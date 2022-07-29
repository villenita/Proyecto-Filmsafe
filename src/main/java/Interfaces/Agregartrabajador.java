
package Interfaces;

import filmsafe_filmsafe1.Proyectos;
import filmsafe_filmsafe1.Registros;
import filmsafe_filmsafe1.Trabajadores;
import filmsafe_filmsafe1.operaciones;
import java.util.Date;
import javax.swing.JOptionPane;


public class Agregartrabajador extends javax.swing.JFrame {

   
    public Agregartrabajador(Proyectos nuevoproyecto) {
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Recogemos los valores que han entrado por parámetro desde el menú de proyecto y los seteamos a elementos swing para visualizarlos
        int idProyecto=nuevoproyecto.getIdProyecto();
        String nombreProyecto=nuevoproyecto.getNombreProyecto();
        Date fechainicioProyecto=nuevoproyecto.getFechainicioProyecto();
        Date fechafinProyecto=nuevoproyecto.getFechafinProyecto();
        
        JTidproyecto.setText(String.valueOf(idProyecto));
        JTnombreproyecto.setText(nombreProyecto);
        JTfechainicio.setValue(fechainicioProyecto);
        JTfechafin.setValue(fechafinProyecto);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombretr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpuestodetrabajo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfechainiciotb = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfechafintb = new javax.swing.JFormattedTextField();
        BTNagregartrabajador = new javax.swing.JButton();
        BTNvolveraproyectoactual = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTidproyecto = new javax.swing.JTextField();
        JLfechainicio = new javax.swing.JLabel();
        JTfechainicio = new javax.swing.JFormattedTextField();
        JLfechafin = new javax.swing.JLabel();
        JTfechafin = new javax.swing.JFormattedTextField();
        JLnombreproyecto = new javax.swing.JLabel();
        JTnombreproyecto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Trabajador");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Puesto de Trabajo");

        jLabel5.setText("Fecha Inicio");

        txtfechainiciotb.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel6.setText("Fecha Fin");

        txtfechafintb.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        BTNagregartrabajador.setText("Agregar");
        BTNagregartrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNagregartrabajadorActionPerformed(evt);
            }
        });

        BTNvolveraproyectoactual.setText("Volver");
        BTNvolveraproyectoactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNvolveraproyectoactualActionPerformed(evt);
            }
        });

        jLabel7.setText("Id:");

        JTidproyecto.setEnabled(false);

        JLfechainicio.setText("Fecha de inicio:");

        JTfechainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        JTfechainicio.setEnabled(false);

        JLfechafin.setText("Fecha de fin:");

        JTfechafin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        JTfechafin.setEnabled(false);

        JLnombreproyecto.setText("Nombre del proyecto:");

        JTnombreproyecto.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfechafintb, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfechainiciotb, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnombretr, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpuestodetrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(382, 382, 382))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(BTNvolveraproyectoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNagregartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(JLfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(JLfechafin)
                                .addGap(18, 18, 18)
                                .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JLnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(JTnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombretr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpuestodetrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechainiciotb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechafintb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNagregartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNvolveraproyectoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNagregartrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNagregartrabajadorActionPerformed
        
        
        int idProyecto;
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
       //Volvemos a recoger los datos asociados a los elementos swing y creamos una nueva instancia de Proyectos
       idProyecto=(Integer) Integer.parseInt(JTidproyecto.getText());
       nombreProyecto= JTnombreproyecto.getText();
       fechainicioProyecto=(Date)JTfechainicio.getValue();
       fechafinProyecto= (Date) JTfechafin.getValue();
       
       Proyectos nuevoproyecto=new Proyectos(idProyecto,nombreProyecto,fechainicioProyecto,fechafinProyecto);
       
       nuevoproyecto.setIdProyecto(idProyecto);
       nuevoproyecto.setNombreProyecto(nombreProyecto);
       nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
       nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
      
        //Tomamos los datos del trabajador que el usuario acaba de proporcionar y creamos una nueva instancia de Trabajadores
        String nombreTrabajador;
        String apellidoTrabajador;
        String puestodetrabajo;
        Date Fechainiciotrabajador;
        Date Fechafintrabajador;
        
        
        nombreTrabajador=txtnombretr.getText();
        apellidoTrabajador=txtapellidos.getText();
        puestodetrabajo=txtpuestodetrabajo.getText();
        Fechainiciotrabajador=(Date) txtfechainiciotb.getValue();
        Fechafintrabajador=(Date) txtfechafintb.getValue();
        
        
        Trabajadores nuevotrabajador=new Trabajadores();
        
        nuevotrabajador.setNombreTrabajador(nombreTrabajador);
        nuevotrabajador.setApellidoTrabajador(apellidoTrabajador);
        nuevotrabajador.setPuestodetrabajo(puestodetrabajo);
        nuevotrabajador.setFechainiciotrabajador(Fechainiciotrabajador);
        nuevotrabajador.setFechafintrabajador(Fechafintrabajador);
        nuevotrabajador.setProyectos(nuevoproyecto);
        
        //Llamamos al método de la clase operaciones que creará un nuevo trabajadores asociado al proyecto actual
        operaciones guardar=new operaciones();
        guardar.crearTrabajador(nuevotrabajador);
        
        
        Registros nuevoregistro=new Registros();
        
        nuevoregistro.setTrabajador(nuevotrabajador);
        
        //Aprovechamos para crear todas las citas siguiendo el protocolo estándar
        operaciones guardarcitaspcr=new operaciones();
        guardarcitaspcr.crearcitaspcr(nuevoproyecto, nuevotrabajador, nuevoregistro);
        
        
       
        JOptionPane.showMessageDialog(this, "El trabajador se ha guardado con éxito", "Trabajador guardado", JOptionPane.INFORMATION_MESSAGE);
  
        
        
    }//GEN-LAST:event_BTNagregartrabajadorActionPerformed

    private void BTNvolveraproyectoactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNvolveraproyectoactualActionPerformed
        
        //Tenemos que volver a capturar toda la información para que, al volver a la pantalla anterior, se seteen todos los valores tal y como estaban
        int idProyecto;
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
       
       idProyecto=(Integer) Integer.parseInt(JTidproyecto.getText());
       nombreProyecto= JTnombreproyecto.getText();
       fechainicioProyecto=(Date)JTfechainicio.getValue();
       fechafinProyecto= (Date) JTfechafin.getValue();
       
       Proyectos nuevoproyecto=new Proyectos(idProyecto,nombreProyecto,fechainicioProyecto,fechafinProyecto);
       
       nuevoproyecto.setIdProyecto(idProyecto);
       nuevoproyecto.setNombreProyecto(nombreProyecto);
       nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
       nuevoproyecto.setFechafinProyecto(fechafinProyecto);
       
        
        Menuproyecto ir=new Menuproyecto(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTNvolveraproyectoactualActionPerformed

   
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
            java.util.logging.Logger.getLogger(Agregartrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregartrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregartrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregartrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new PAagregartrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNagregartrabajador;
    private javax.swing.JButton BTNvolveraproyectoactual;
    private javax.swing.JLabel JLfechafin;
    private javax.swing.JLabel JLfechainicio;
    private javax.swing.JLabel JLnombreproyecto;
    private javax.swing.JFormattedTextField JTfechafin;
    private javax.swing.JFormattedTextField JTfechainicio;
    private javax.swing.JTextField JTidproyecto;
    private javax.swing.JTextField JTnombreproyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JFormattedTextField txtfechafintb;
    private javax.swing.JFormattedTextField txtfechainiciotb;
    private javax.swing.JTextField txtnombretr;
    private javax.swing.JTextField txtpuestodetrabajo;
    // End of variables declaration//GEN-END:variables
}
