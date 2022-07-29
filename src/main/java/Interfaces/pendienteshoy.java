
package Interfaces;

import filmsafe_filmsafe1.Proyectos;
import filmsafe_filmsafe1.Registros;
import filmsafe_filmsafe1.Trabajadores;
import filmsafe_filmsafe1.operaciones;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class pendienteshoy extends javax.swing.JFrame {

    
    public pendienteshoy(Proyectos nuevoproyecto) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Recuperamos los valores que entran por parámetro y los seteamos a elementos swing para su visualización
        int idProyecto=nuevoproyecto.getIdProyecto();
        String nombreProyecto=nuevoproyecto.getNombreProyecto();
        Date fechainicioProyecto=nuevoproyecto.getFechainicioProyecto();
        Date fechafinProyecto=nuevoproyecto.getFechafinProyecto();
    
    
        
        JLnombreproyecto.setText(nombreProyecto);
        JTidproyecto.setText(String.valueOf(idProyecto));
        JTfechainicio.setValue(fechainicioProyecto);
        JTfechafin.setValue(fechafinProyecto);
        
        //Aplicamos un modelo al jTable
        DefaultTableModel modelo=new DefaultTableModel();
        JTABLEpendienteshoy.setModel(modelo);
        
       
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Puesto de trabajo");
        modelo.addColumn("ID");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Fecha de fin");
        
        //Llamamos al método de operaciones que nos retorna la lista con los registros pendientes para el día de hoy
        operaciones traerlistadependientes=new operaciones();
        List listapendientes=traerlistadependientes.listadependienteshoy();
       
        //Recorremos la lista y la seteamos al elemento jTable para que se vean en la interfaz
        Iterator it=listapendientes.iterator();
        
        while (it.hasNext()){
        
        Registros obtener=(Registros) it.next();
        
        Trabajadores nuevotrabajador= obtener.getTrabajador();
        
        String nombreTrabajador=nuevotrabajador.getNombreTrabajador();
        String apellidoTrabajador=nuevotrabajador.getApellidoTrabajador();
        String puestodetrabajo=nuevotrabajador.getPuestodetrabajo();
        int idTrabajador=nuevotrabajador.getIdTrabajador();
        Date fechainicioTrabajador=nuevotrabajador.getFechainiciotrabajador();
        Date fechafinTrabajador=nuevotrabajador.getFechafintrabajador();
        
        
        
        Object[] fila=new Object [6];
        
        fila[0]=nombreTrabajador;
        fila[1]=apellidoTrabajador;
        fila[2]=puestodetrabajo;
        fila[3]=idTrabajador;
        fila[4]=fechainicioTrabajador;
        fila[5]=fechafinTrabajador;
        
        
        modelo.addRow(fila);
        
        
    }

    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTABLEpendienteshoy = new javax.swing.JTable();
        BTNvolver = new javax.swing.JButton();
        BTNiraregistros = new javax.swing.JButton();
        JLidproyecto = new javax.swing.JLabel();
        JTidproyecto = new javax.swing.JTextField();
        JLnombreproyecto = new javax.swing.JLabel();
        JLfechainicio = new javax.swing.JLabel();
        JTfechainicio = new javax.swing.JFormattedTextField();
        JLfechafin = new javax.swing.JLabel();
        JTfechafin = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLtitulo.setText("Pendientes Hoy");

        JTABLEpendienteshoy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Puesto de trabajo", "ID del Trabajador", "Fecha inicio", "Fecha Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTABLEpendienteshoy);

        BTNvolver.setText("Volver a Menú de Proyecto");
        BTNvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNvolverActionPerformed(evt);
            }
        });

        BTNiraregistros.setText("Ir a registros");
        BTNiraregistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNiraregistrosActionPerformed(evt);
            }
        });

        JLidproyecto.setText("Id Proyecto:");

        JTidproyecto.setEnabled(false);

        JLfechainicio.setText("Fecha de inicio:");

        JTfechainicio.setEnabled(false);
        JTfechainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTfechainicioActionPerformed(evt);
            }
        });

        JLfechafin.setText("Fecha de fin:");

        JTfechafin.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(BTNvolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNiraregistros)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLidproyecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(JLfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(JLfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(JLnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(JLtitulo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLidproyecto)
                    .addComponent(JTidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLfechainicio)
                    .addComponent(JLfechafin)
                    .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNiraregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNvolverActionPerformed
        
       
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer)Integer.parseInt(JTidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicio.getValue();
        fechafinProyecto=(Date)JTfechafin.getValue();
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
      
        
        Menuproyecto ir=new Menuproyecto(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
      
        
    }//GEN-LAST:event_BTNvolverActionPerformed

    private void BTNiraregistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNiraregistrosActionPerformed
        
        //Tomamos el modelo del jTable, apuntamos a una fila, la recorremos y seteamos los valores a una nueva instancia de Trabajadores
        DefaultTableModel modelo=(DefaultTableModel) JTABLEpendienteshoy.getModel();
        
        int proyectoapuntar=JTABLEpendienteshoy.getSelectedRow();
        
        modelo.getValueAt(proyectoapuntar,0);
        modelo.getValueAt(proyectoapuntar,1);
        modelo.getValueAt(proyectoapuntar,2);
        modelo.getValueAt(proyectoapuntar,3);
        modelo.getValueAt(proyectoapuntar,4);
        modelo.getValueAt(proyectoapuntar,5);
        
        
        
        String nombrevalor=(String) modelo.getValueAt(proyectoapuntar,0);
        String apellidovalor=(String) modelo.getValueAt(proyectoapuntar,1);
        String puestovalor=(String) modelo.getValueAt(proyectoapuntar,2);
        int idvalor=(Integer) modelo.getValueAt(proyectoapuntar,3);     
        Date fechainiciovalor=(Date) modelo.getValueAt(proyectoapuntar,4);
        Date fechafinvalor=(Date) modelo.getValueAt(proyectoapuntar,5);
        
        

       Trabajadores nuevotrabajador=new Trabajadores();
       
       nuevotrabajador.setIdTrabajador(idvalor);
       nuevotrabajador.setNombreTrabajador(nombrevalor);
       nuevotrabajador.setApellidoTrabajador(apellidovalor);
       nuevotrabajador.setPuestodetrabajo(puestovalor);
       nuevotrabajador.setFechainiciotrabajador(fechainiciovalor);
       nuevotrabajador.setFechafintrabajador(fechafinvalor);
       
       //Tomamos los valores incrustados en elemnentos swing y los seteamos a una nueva instancia de Proyectos
       int idProyecto;
       String nombreProyecto;
       Date fechainicioProyecto;
       Date fechafinProyecto;
        
       
       idProyecto=(Integer) Integer.parseInt(JTidproyecto.getText());
       nombreProyecto= JLnombreproyecto.getText();
       fechainicioProyecto=(Date)JTfechainicio.getValue();
       fechafinProyecto= (Date) JTfechafin.getValue();
       
       Proyectos nuevoproyecto=new Proyectos();
       
       nuevoproyecto.setIdProyecto(idProyecto);
       nuevoproyecto.setNombreProyecto(nombreProyecto);
       nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
       nuevoproyecto.setFechafinProyecto(fechafinProyecto);
       
       
        
        registros ir=new registros(nuevotrabajador,nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
        
       
    }//GEN-LAST:event_BTNiraregistrosActionPerformed

    private void JTfechainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTfechainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTfechainicioActionPerformed

    
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
            java.util.logging.Logger.getLogger(pendienteshoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendienteshoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendienteshoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendienteshoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new pendienteshoy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNiraregistros;
    private javax.swing.JButton BTNvolver;
    private javax.swing.JLabel JLfechafin;
    private javax.swing.JLabel JLfechainicio;
    private javax.swing.JLabel JLidproyecto;
    private javax.swing.JLabel JLnombreproyecto;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JTable JTABLEpendienteshoy;
    private javax.swing.JFormattedTextField JTfechafin;
    private javax.swing.JFormattedTextField JTfechainicio;
    private javax.swing.JTextField JTidproyecto;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
