/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import filmsafe_filmsafe1.Proyectos;
import filmsafe_filmsafe1.Registros;
import filmsafe_filmsafe1.Trabajadores;
import filmsafe_filmsafe1.operaciones;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class registroparticular extends javax.swing.JFrame {

    
    
    public registroparticular(Trabajadores nuevotrabajador,Proyectos nuevoproyecto, String diavalor, Registros nuevoregistro) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
       
        
        String nombreProyecto=nuevoproyecto.getNombreProyecto();
        int idProyecto=nuevoproyecto.getIdProyecto();
        Date fechainicioProyecto=nuevoproyecto.getFechainicioProyecto();
        Date fechafinProyecto=nuevoproyecto.getFechafinProyecto();
        
        
        
        String nombreTrabajador=nuevotrabajador.getNombreTrabajador();
        String apellidoTrabajador=nuevotrabajador.getApellidoTrabajador();
        String puestodetrabajo=nuevotrabajador.getPuestodetrabajo();
        int idTrabajador=nuevotrabajador.getIdTrabajador();
        boolean Consentimiento=nuevotrabajador.isConsentimiento();
        Date Fechainiciotrabajador=nuevotrabajador.getFechainiciotrabajador();
        Date Fechafintrabajador=nuevotrabajador.getFechafintrabajador();
        
        Date Fecharegistro=nuevoregistro.getFecharegistro();
        String Estado=nuevoregistro.getEstado();
        int Numeropeticion=nuevoregistro.getNumeropeticion();
        String observaciones=nuevoregistro.getObservaciones();
        int IdRegistro=nuevoregistro.getIdRegistro();
       
        
        
        String idvalorproyecto=Integer.toString(idProyecto);
        
        
        
         JTdate.setText(diavalor);
         
         JLnombreproyecto.setText(nombreProyecto);
         JLidproyecto.setText(idvalorproyecto);
         JTfechainicioproyecto.setValue(fechainicioProyecto);
         JTfechafinproyecto.setValue(fechafinProyecto);
        
         
         
         
         JLnombre.setText(nombreTrabajador);
         JLapellido.setText(apellidoTrabajador);
         JLpuestodetrabajo.setText(puestodetrabajo);
         JLidtrabajador.setText(String.valueOf(idTrabajador));
         JTfechainiciotrabajador.setValue(Fechainiciotrabajador);
         JTfechafintrabajador.setValue(Fechafintrabajador);
         
         JCBXestadopcr.setName(Estado);
         JTnumeropeticion.setText(Integer.toString(Numeropeticion));
         JPANELobservaciones.setText(observaciones);
         JTidregistro.setText(String.valueOf(IdRegistro));
         
         
         operaciones estadoconsentimiento=new operaciones();
         
         boolean consstate=estadoconsentimiento.recuperarconsentimiento(nuevotrabajador);
         
         if(consstate==true){
         
         JTconsentimiento.setText("Sí");}
         
         else{
    
         JTconsentimiento.setText("No");
         
         Date diadehoy= new Date();
         diadehoy.getDate();
         
        int comparacion = fechafinProyecto.compareTo(diadehoy);
        
        
        
        if (comparacion<0){
        
        JBTNguardarregistro.setEnabled(false);
        JTnumeropeticion.setEnabled(false);
        JCBXestadopcr.setEnabled(false);
        JPANELobservaciones.setEnabled(false);
        
        
        }
    } 
        operaciones setearestado= new operaciones();     
        String estadoparasetear=setearestado.recuperarestado(nuevoregistro);
        
       if(estadoparasetear!=null){
           
        JCBXestadopcr.setSelectedItem(estadoparasetear);}
       
       else{
       
       JCBXestadopcr.setSelectedItem("No realizada");
       
       }
    
   
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        JLnombre = new javax.swing.JLabel();
        JBTNvolver = new javax.swing.JButton();
        JLapellido = new javax.swing.JLabel();
        JLetiquetaidtrabajador = new javax.swing.JLabel();
        JLetiquetanombreproyecto = new javax.swing.JLabel();
        JLnombreproyecto = new javax.swing.JLabel();
        JLetiquetaidproyecto = new javax.swing.JLabel();
        JBTNguardarregistro = new javax.swing.JButton();
        JLetiquetaregistro = new javax.swing.JLabel();
        JLidproyecto = new javax.swing.JLabel();
        JLetiquetafechainicioproyecto = new javax.swing.JLabel();
        JTfechainicioproyecto = new javax.swing.JFormattedTextField();
        JLetiquetafechafinproyecto = new javax.swing.JLabel();
        JTfechafinproyecto = new javax.swing.JFormattedTextField();
        JLpuestodetrabajo = new javax.swing.JLabel();
        JLetiquetaconsentimiento = new javax.swing.JLabel();
        JTconsentimiento = new javax.swing.JTextField();
        JLidtrabajador = new javax.swing.JLabel();
        JLetiquetafechacomienzotrabajador = new javax.swing.JLabel();
        JTfechainiciotrabajador = new javax.swing.JFormattedTextField();
        JLetiquetafechafintrabajador = new javax.swing.JLabel();
        JTfechafintrabajador = new javax.swing.JFormattedTextField();
        JLetiquetaestado = new javax.swing.JLabel();
        JCBXestadopcr = new javax.swing.JComboBox<>();
        JLetiquetanumeropeticion = new javax.swing.JLabel();
        JTnumeropeticion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JPANELobservaciones = new javax.swing.JTextPane();
        JLetiquetaobservaciones = new javax.swing.JLabel();
        JTdate = new javax.swing.JFormattedTextField();
        JLidregistro = new javax.swing.JLabel();
        JTidregistro = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLnombre.setText("Nombre");
        getContentPane().add(JLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 28));

        JBTNvolver.setText("Volver");
        JBTNvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNvolverActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, 39));

        JLapellido.setText("Apellido");
        getContentPane().add(JLapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 130, 30));

        JLetiquetaidtrabajador.setText("ID Trabajador:");
        getContentPane().add(JLetiquetaidtrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, -1));

        JLetiquetanombreproyecto.setText("Nombre del proyecto:");
        getContentPane().add(JLetiquetanombreproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 160, -1));
        getContentPane().add(JLnombreproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 220, 20));

        JLetiquetaidproyecto.setText("ID proyecto:");
        getContentPane().add(JLetiquetaidproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        JBTNguardarregistro.setText("Guardar registro");
        JBTNguardarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNguardarregistroActionPerformed(evt);
            }
        });
        getContentPane().add(JBTNguardarregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, -1, 39));

        JLetiquetaregistro.setText("Registro:");
        getContentPane().add(JLetiquetaregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 70, -1));
        getContentPane().add(JLidproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, 20));

        JLetiquetafechainicioproyecto.setText("Fecha inicio proyecto:");
        getContentPane().add(JLetiquetafechainicioproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, -1));

        JTfechainicioproyecto.setText("jFormattedTextField1");
        JTfechainicioproyecto.setEnabled(false);
        getContentPane().add(JTfechainicioproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        JLetiquetafechafinproyecto.setText("Fecha fin proyecto:");
        getContentPane().add(JLetiquetafechafinproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 140, -1));

        JTfechafinproyecto.setText("jFormattedTextField1");
        JTfechafinproyecto.setEnabled(false);
        getContentPane().add(JTfechafinproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        JLpuestodetrabajo.setText("Puesto de trabajo");
        getContentPane().add(JLpuestodetrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 150, 20));

        JLetiquetaconsentimiento.setText("Consentimiento:");
        getContentPane().add(JLetiquetaconsentimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 130, -1));

        JTconsentimiento.setText("jTextField1");
        JTconsentimiento.setEnabled(false);
        getContentPane().add(JTconsentimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        JLidtrabajador.setText("jLabel1");
        getContentPane().add(JLidtrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        JLetiquetafechacomienzotrabajador.setText("Fecha inicio:");
        getContentPane().add(JLetiquetafechacomienzotrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 100, -1));

        JTfechainiciotrabajador.setText("jFormattedTextField1");
        JTfechainiciotrabajador.setEnabled(false);
        getContentPane().add(JTfechainiciotrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        JLetiquetafechafintrabajador.setText("Fecha fin:");
        getContentPane().add(JLetiquetafechafintrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 130, -1));

        JTfechafintrabajador.setText("jFormattedTextField1");
        JTfechafintrabajador.setEnabled(false);
        getContentPane().add(JTfechafintrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        JLetiquetaestado.setText("Estado de la PCR:");
        getContentPane().add(JLetiquetaestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, -1));

        JCBXestadopcr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No realizada", "Pendiente", "Positivo", "Negativo" }));
        getContentPane().add(JCBXestadopcr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        JLetiquetanumeropeticion.setText("Nº Petición:");
        getContentPane().add(JLetiquetanumeropeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 100, -1));
        getContentPane().add(JTnumeropeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 120, -1));

        jScrollPane1.setViewportView(JPANELobservaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 720, 200));

        JLetiquetaobservaciones.setText("Observaciones:");
        getContentPane().add(JLetiquetaobservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, -1));

        JTdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        JTdate.setEnabled(false);
        getContentPane().add(JTdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 120, -1));

        JLidregistro.setText("ID registro:");
        getContentPane().add(JLidregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        JTidregistro.setEnabled(false);
        getContentPane().add(JTidregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTNvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNvolverActionPerformed
        
        //Proyectos nuevoproyecto=_proyectoActual;
       
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer)Integer.parseInt(JLidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicioproyecto.getValue();
        fechafinProyecto=(Date)JTfechafinproyecto.getValue();
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        
        
        String nombreTrabajador;
        String apellidoTrabajador;
        String puestodetrabajo;
        int idTrabajador;
        //boolean Consentimiento;
        Date fechainicioTrabajador;
        Date fechafinTrabajador;
        
        
        nombreTrabajador=JLnombre.getText();
        apellidoTrabajador=JLapellido.getText();
        puestodetrabajo=JLpuestodetrabajo.getText();
        idTrabajador=(Integer)Integer.parseInt(JLidtrabajador.getText());
        fechainicioTrabajador=(Date)JTfechainiciotrabajador.getValue();
        fechafinTrabajador=(Date)JTfechafintrabajador.getValue();
        
        
        
        Trabajadores nuevotrabajador=new Trabajadores();
        
        
        nuevotrabajador.setNombreTrabajador(nombreTrabajador);
        nuevotrabajador.setApellidoTrabajador(apellidoTrabajador);
        nuevotrabajador.setPuestodetrabajo(puestodetrabajo);
        nuevotrabajador.setIdTrabajador(idTrabajador);
        nuevotrabajador.setFechainiciotrabajador(fechainicioTrabajador);
        nuevotrabajador.setFechafintrabajador(fechafinTrabajador);
        
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
         
        
        String valordia=JTdate.getText();
         Date date = null;
        
        try {
            date = formatter.parse(valordia);
             
             
        } catch (ParseException ex) {
        
            Logger.getLogger(registroparticular.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        
         Date Fecharegistro=date;
         String Estado=JCBXestadopcr.getSelectedItem().toString();
         int Numeropeticion=Integer.parseInt(JTnumeropeticion.getText());
         String Observaciones=JPANELobservaciones.getText();
         
         Registros nuevoregistro=new Registros();
         
         nuevoregistro.setFecharegistro(Fecharegistro);
         nuevoregistro.setEstado(Estado);
         nuevoregistro.setNumeropeticion(Numeropeticion);
         nuevoregistro.setObservaciones(Observaciones);
        
        
         
        registros iraregistros=new registros(nuevotrabajador, nuevoproyecto);
        iraregistros.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_JBTNvolverActionPerformed

    private void JBTNguardarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNguardarregistroActionPerformed
        
        
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer)Integer.parseInt(JLidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicioproyecto.getValue();
        fechafinProyecto=(Date)JTfechafinproyecto.getValue();
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        
        String nombreTrabajador;
        String apellidoTrabajador;
        String puestodetrabajo;
        int idTrabajador;
        boolean Consentimiento;
        Date fechainicioTrabajador;
        Date fechafinTrabajador;
        boolean positivo;
       
        
        nombreTrabajador=JLnombre.getText();
        apellidoTrabajador=JLapellido.getText();
        puestodetrabajo=JLpuestodetrabajo.getText();
        idTrabajador=(Integer)Integer.parseInt(JLidtrabajador.getText());
        fechainicioTrabajador=(Date)JTfechainiciotrabajador.getValue();
        fechafinTrabajador=(Date)JTfechafintrabajador.getValue();
        
        
        
        
        Trabajadores nuevotrabajador=new Trabajadores();
        
        nuevotrabajador.setNombreTrabajador(nombreTrabajador);
        nuevotrabajador.setApellidoTrabajador(apellidoTrabajador);
        nuevotrabajador.setPuestodetrabajo(puestodetrabajo);
        nuevotrabajador.setIdTrabajador(idTrabajador);
        nuevotrabajador.setFechainiciotrabajador(fechainicioTrabajador);
        nuevotrabajador.setFechafintrabajador(fechafinTrabajador);
        nuevotrabajador.setProyectos(nuevoproyecto);
        
        
        operaciones estadoconsentimiento=new operaciones();
         
         Consentimiento=estadoconsentimiento.recuperarconsentimiento(nuevotrabajador);
        
         nuevotrabajador.setConsentimiento(Consentimiento);
         
         
         Date Fecharegistro;
         String Estado;
         int Numeropeticion;
         String Observaciones;
         int IdRegistro;
         
         
         String valordia=JTdate.getText();
         
         
         DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
         
         Date date = null;
        
        try {
            date = formatter.parse(valordia);
             
             
        } catch (ParseException ex) {
        
            Logger.getLogger(registroparticular.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        
        
         Fecharegistro=date;
         Estado=JCBXestadopcr.getSelectedItem().toString();
         Numeropeticion=Integer.parseInt(JTnumeropeticion.getText());
         Observaciones=JPANELobservaciones.getText();
         IdRegistro=(Integer)Integer.parseInt(JTidregistro.getText());
         
         Registros nuevoregistro=new Registros();
         
         nuevoregistro.setFecharegistro(Fecharegistro);
         nuevoregistro.setEstado(Estado);
         nuevoregistro.setNumeropeticion(Numeropeticion);
         nuevoregistro.setObservaciones(Observaciones);
         nuevoregistro.setIdRegistro(IdRegistro);
         
         
         if(Estado=="Positivo"){
         
         nuevotrabajador.setPositivo(true);
        
         }
         
         else{
         
         nuevotrabajador.setPositivo(false);
         
         }
        
        
        nuevoregistro.setTrabajador(nuevotrabajador);
        
        operaciones guardar=new operaciones();
        
        guardar.actualizarRegistro(nuevoregistro);
        
        JOptionPane.showMessageDialog(this, "El registro se ha guardado con éxito", "Registro guardado", JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_JBTNguardarregistroActionPerformed

    
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
            java.util.logging.Logger.getLogger(registroparticular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroparticular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroparticular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroparticular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new registroparticular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTNguardarregistro;
    private javax.swing.JButton JBTNvolver;
    private javax.swing.JComboBox<String> JCBXestadopcr;
    private javax.swing.JLabel JLapellido;
    private javax.swing.JLabel JLetiquetaconsentimiento;
    private javax.swing.JLabel JLetiquetaestado;
    private javax.swing.JLabel JLetiquetafechacomienzotrabajador;
    private javax.swing.JLabel JLetiquetafechafinproyecto;
    private javax.swing.JLabel JLetiquetafechafintrabajador;
    private javax.swing.JLabel JLetiquetafechainicioproyecto;
    private javax.swing.JLabel JLetiquetaidproyecto;
    private javax.swing.JLabel JLetiquetaidtrabajador;
    private javax.swing.JLabel JLetiquetanombreproyecto;
    private javax.swing.JLabel JLetiquetanumeropeticion;
    private javax.swing.JLabel JLetiquetaobservaciones;
    private javax.swing.JLabel JLetiquetaregistro;
    private javax.swing.JLabel JLidproyecto;
    private javax.swing.JLabel JLidregistro;
    private javax.swing.JLabel JLidtrabajador;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLnombreproyecto;
    private javax.swing.JLabel JLpuestodetrabajo;
    private javax.swing.JTextPane JPANELobservaciones;
    private javax.swing.JTextField JTconsentimiento;
    private javax.swing.JFormattedTextField JTdate;
    private javax.swing.JFormattedTextField JTfechafinproyecto;
    private javax.swing.JFormattedTextField JTfechafintrabajador;
    private javax.swing.JFormattedTextField JTfechainicioproyecto;
    private javax.swing.JFormattedTextField JTfechainiciotrabajador;
    private javax.swing.JTextField JTidregistro;
    private javax.swing.JTextField JTnumeropeticion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
