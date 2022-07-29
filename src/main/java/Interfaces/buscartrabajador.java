/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import filmsafe_filmsafe1.Proyectos;
import filmsafe_filmsafe1.Registros;
import filmsafe_filmsafe1.Trabajadores;
import filmsafe_filmsafe1.operaciones;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class buscartrabajador extends javax.swing.JFrame {

   
    public buscartrabajador(Proyectos nuevoproyecto) {

        initComponents();
        this.setLocationRelativeTo(null);
        
        //Recogemos los valores que han entrado por parámetro y los seteamos a elementos swing para hacerlos visibles en pantalla
        int idProyecto = nuevoproyecto.getIdProyecto();
        String nombreProyecto = nuevoproyecto.getNombreProyecto();
        Date fechainicioProyecto = nuevoproyecto.getFechainicioProyecto();
        Date fechafinProyecto = nuevoproyecto.getFechafinProyecto();
        
        

        JTnombreproyecto.setText(nombreProyecto);
        JTidproyecto.setText(String.valueOf(idProyecto));
        JTfechainicio.setValue(fechainicioProyecto);
        JTfechafin.setValue(fechafinProyecto);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLbuscar = new javax.swing.JLabel();
        JLid = new javax.swing.JLabel();
        JTid = new javax.swing.JTextField();
        JLnombre = new javax.swing.JLabel();
        JTnombre = new javax.swing.JTextField();
        JLapellido = new javax.swing.JLabel();
        JTapellido = new javax.swing.JTextField();
        JLpuestodetrabajo = new javax.swing.JLabel();
        JTpuestodetrabajo = new javax.swing.JTextField();
        JLnumerodepeticion = new javax.swing.JLabel();
        JTnumerodepeticion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTABbuscar = new javax.swing.JTable();
        JBTNbuscar = new javax.swing.JButton();
        JBTNvolver = new javax.swing.JButton();
        JLidproyecto = new javax.swing.JLabel();
        JTidproyecto = new javax.swing.JTextField();
        JLnombreproyecto = new javax.swing.JLabel();
        JTnombreproyecto = new javax.swing.JTextField();
        JLfechainicio = new javax.swing.JLabel();
        JTfechainicio = new javax.swing.JFormattedTextField();
        JLfechafin = new javax.swing.JLabel();
        JTfechafin = new javax.swing.JFormattedTextField();
        iraregistros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLbuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLbuscar.setText("Buscar Trabajador");

        JLid.setText("ID:");

        JLnombre.setText("Nombre:");

        JLapellido.setText("Apellido:");

        JLpuestodetrabajo.setText("Puesto de trabajo:");

        JLnumerodepeticion.setText("Nº de petición:");

        JTABbuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "ID", "Puesto de Trabajo", "Fecha inicio", "Fecha fin"
            }
        ));
        jScrollPane1.setViewportView(JTABbuscar);

        JBTNbuscar.setText("Buscar");
        JBTNbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNbuscarActionPerformed(evt);
            }
        });

        JBTNvolver.setText("Volver");
        JBTNvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNvolverActionPerformed(evt);
            }
        });

        JLidproyecto.setText("Id Proyecto:");

        JTidproyecto.setEnabled(false);

        JLnombreproyecto.setText("Nombre del proyecto:");

        JTnombreproyecto.setEnabled(false);

        JLfechainicio.setText("Fecha inicio:");

        JTfechainicio.setEnabled(false);

        JLfechafin.setText("fecha fin:");

        JTfechafin.setEnabled(false);

        iraregistros.setText("Registros");
        iraregistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iraregistrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JLpuestodetrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(JTpuestodetrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLnumerodepeticion)
                                .addGap(18, 18, 18)
                                .addComponent(JTnumerodepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(JTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(277, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLidproyecto)
                        .addGap(3, 3, 3)
                        .addComponent(JTidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLnombreproyecto)
                        .addGap(8, 8, 8)
                        .addComponent(JTnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLfechafin)
                        .addGap(18, 18, 18)
                        .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(JBTNbuscar)
                .addGap(165, 165, 165)
                .addComponent(iraregistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTNvolver)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(JLbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLbuscar)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLidproyecto)
                        .addComponent(JTidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLfechainicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLid))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLpuestodetrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTpuestodetrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnumerodepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTnumerodepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBTNbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBTNvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iraregistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTNvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNvolverActionPerformed

        int idProyecto;
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;

        idProyecto = (Integer) Integer.parseInt(JTidproyecto.getText());
        nombreProyecto = JTnombreproyecto.getText();
        fechainicioProyecto = (Date) JTfechainicio.getValue();
        fechafinProyecto = (Date) JTfechafin.getValue();

        Proyectos nuevoproyecto = new Proyectos(idProyecto, nombreProyecto, fechainicioProyecto, fechafinProyecto);

        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);

        Menuproyecto ir = new Menuproyecto(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_JBTNvolverActionPerformed
    
  
   
    private void JBTNbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNbuscarActionPerformed

        int idProyecto;
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;

        
        //Recogemos la informaci´no que habíamos alojado en los elementos swing para crear una nueva instancia de Proyectos
        idProyecto = (Integer) Integer.parseInt(JTidproyecto.getText());
        nombreProyecto = JTnombreproyecto.getText();
        fechainicioProyecto = (Date) JTfechainicio.getValue();
        fechafinProyecto = (Date) JTfechafin.getValue();

        Proyectos nuevoproyecto = new Proyectos(idProyecto, nombreProyecto, fechainicioProyecto, fechafinProyecto);

        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);

        
        //Creamos una instancia de Trabajadores y le seteamos los valores que el usuario haya introducido
        String nombreTrabajador;
        String apellidoTrabajador;
        String puestodetrabajo;
        Date Fechainiciotrabajador;
        Date Fechafintrabajador;
        int idTrabajador;

       
        nombreTrabajador = JTnombre.getText();
        apellidoTrabajador = JTapellido.getText();
        puestodetrabajo = JTpuestodetrabajo.getText();
        Fechainiciotrabajador = (Date) JTfechainicio.getValue();
        Fechafintrabajador = (Date) JTfechafin.getValue();

        String idt = "S";

        Trabajadores nuevotrabajador = new Trabajadores();

        nuevotrabajador.setNombreTrabajador(nombreTrabajador);
        nuevotrabajador.setApellidoTrabajador(apellidoTrabajador);
        nuevotrabajador.setPuestodetrabajo(puestodetrabajo);
        nuevotrabajador.setFechainiciotrabajador(Fechainiciotrabajador);
        nuevotrabajador.setFechafintrabajador(Fechafintrabajador);

       
        //Con el condicional creamos una excepción en caso de que no se introduzca ningún valor. De introducirse alguno, se llama al método de operaciones que tiene la lógica de la búsqueda
        try {

            idTrabajador = Integer.parseInt(JTid.getText());
            nuevotrabajador.setIdTrabajador(idTrabajador);
            String idTrabajadorstring = Integer.toString(idTrabajador);  
            idt = "S";

        } catch (NumberFormatException e) {
            idt = "N";
        }
        nuevotrabajador.setProyectos(nuevoproyecto);

        boolean r1 = nombreTrabajador.isEmpty();
        boolean r2 = puestodetrabajo.isEmpty();
        boolean r3 = apellidoTrabajador.isEmpty();

        if (r1 == true && r2 == true && r3 == true && idt == "N") {

            JOptionPane.showMessageDialog(this, "Introduzca algún dato (ID, nombre, apellido o puesto de trabajo)", "Introduzca datos", JOptionPane.INFORMATION_MESSAGE);

        } else {
            operaciones buscar = new operaciones();
            buscar.busquedadetrabajadores(nuevotrabajador);

            DefaultTableModel modelo = new DefaultTableModel();
            JTABbuscar.setModel(modelo);

            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("ID");
            modelo.addColumn("Puesto de trabajo");
            modelo.addColumn("Fecha de inicio");
            modelo.addColumn("Fecha de fin");
            
            //Recorremos la lista resultante de la búsqueda y la seteamos al elemento jTable que preside la interfaz
            operaciones traer = new operaciones();
            List listadetrabajadorespornombre = traer.busquedadetrabajadores(nuevotrabajador);

            Iterator it = listadetrabajadorespornombre.iterator();

            while (it.hasNext()) {

                Trabajadores obtener = (Trabajadores) it.next();

                Object[] fila = new Object[6];

                fila[0] = obtener.getNombreTrabajador();
                fila[1] = obtener.getApellidoTrabajador();
                fila[2] = obtener.getIdTrabajador();
                fila[3] = obtener.getPuestodetrabajo();
                fila[4] = obtener.getFechainiciotrabajador();
                fila[5] = obtener.getFechafintrabajador();
                
                modelo.addRow(fila);

            }


    }//GEN-LAST:event_JBTNbuscarActionPerformed
    }
    private void iraregistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iraregistrosActionPerformed
        
        
        //Recuperamos el modelo de jTable, apuntamos a una fila concreta, la recorremos y seteamos los datos a una nueva instancia de Trabajadores
        DefaultTableModel modelo=(DefaultTableModel) JTABbuscar.getModel();
        
        int proyectoapuntar=JTABbuscar.getSelectedRow();
        
       modelo.getValueAt(proyectoapuntar,0);
       modelo.getValueAt(proyectoapuntar,1);
       modelo.getValueAt(proyectoapuntar,2);
       modelo.getValueAt(proyectoapuntar,3);
       modelo.getValueAt(proyectoapuntar,4);
       modelo.getValueAt(proyectoapuntar,5);
        
       String nombreTrabajador=(String) modelo.getValueAt(proyectoapuntar,0);
       String apellidoTrabajador=(String) modelo.getValueAt(proyectoapuntar,1);
       int idTrabajador=(Integer) modelo.getValueAt(proyectoapuntar,2);
       String puestodetrabajo=(String) modelo.getValueAt(proyectoapuntar,3);
       Date fechainicioTrabajador=(Date) modelo.getValueAt(proyectoapuntar,4);
       Date fechafinTrabajador=(Date) modelo.getValueAt(proyectoapuntar,5);
       
       
       Trabajadores nuevotrabajador= new Trabajadores();
       
       nuevotrabajador.setNombreTrabajador(nombreTrabajador);
       nuevotrabajador.setApellidoTrabajador(apellidoTrabajador);
       nuevotrabajador.setPuestodetrabajo(puestodetrabajo);
       nuevotrabajador.setIdTrabajador(idTrabajador);
       nuevotrabajador.setFechainiciotrabajador(fechainicioTrabajador);
       nuevotrabajador.setFechafintrabajador(fechafinTrabajador);
       
       
      
       //Tomamos los datos de los elementos swing y los seteamos en una nueva instancia de Proyectos
        int idProyecto;
        String nombreProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;

        idProyecto = (Integer) Integer.parseInt(JTidproyecto.getText());
        nombreProyecto = JTnombreproyecto.getText();
        fechainicioProyecto = (Date) JTfechainicio.getValue();
        fechafinProyecto = (Date) JTfechafin.getValue();

        Proyectos nuevoproyecto = new Proyectos(idProyecto, nombreProyecto, fechainicioProyecto, fechafinProyecto);

        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        
       
        
        registros ir = new registros(nuevotrabajador, nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_iraregistrosActionPerformed
    

    
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
            java.util.logging.Logger.getLogger(buscartrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscartrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscartrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscartrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new buscartrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTNbuscar;
    private javax.swing.JButton JBTNvolver;
    private javax.swing.JLabel JLapellido;
    private javax.swing.JLabel JLbuscar;
    private javax.swing.JLabel JLfechafin;
    private javax.swing.JLabel JLfechainicio;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLidproyecto;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLnombreproyecto;
    private javax.swing.JLabel JLnumerodepeticion;
    private javax.swing.JLabel JLpuestodetrabajo;
    private javax.swing.JTable JTABbuscar;
    private javax.swing.JTextField JTapellido;
    private javax.swing.JFormattedTextField JTfechafin;
    private javax.swing.JFormattedTextField JTfechainicio;
    private javax.swing.JTextField JTid;
    private javax.swing.JTextField JTidproyecto;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTnombreproyecto;
    private javax.swing.JTextField JTnumerodepeticion;
    private javax.swing.JTextField JTpuestodetrabajo;
    private javax.swing.JButton iraregistros;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
