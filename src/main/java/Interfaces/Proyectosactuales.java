
package Interfaces;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import Interfaces.Nuevoproyecto;
import filmsafe_filmsafe1.operaciones;
import filmsafe_filmsafe1.Proyectos;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Proyectosactuales extends javax.swing.JFrame {

    
    public Proyectosactuales() {
        
        initComponents();
        this.setLocationRelativeTo(null);
       
        //Definimos un modelo para el jTable acorde con los datos que vamos a recibir desde la llamada a la BD
        DefaultTableModel modelo=new DefaultTableModel();
        JTProyectosactuales.setModel(modelo);
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Fin");
        
        //Llamamos al método de operaciones setdeproyectosactuales, que nos trae la lista que deberemos setear en el jTable de la interfaz
        operaciones operacion=new operaciones();
        List listaparaguardaractuales=operacion.setdeproyectosactuales();
        
        
        //REcorremos la lista y la seteamos al jTable
        Iterator it=listaparaguardaractuales.iterator();
        
        while (it.hasNext()){
        
        Proyectos obtener=(Proyectos) it.next();
        
        Object[] fila=new Object [4];
        
        fila[0]=obtener.getIdProyecto();
        fila[1]=obtener.getNombreProyecto();
        fila[2]=obtener.getFechainicioProyecto();
        fila[3]=obtener.getFechafinProyecto();
        
        //Vamos agregando cada una de las filas
        modelo.addRow(fila);
        
        }
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        volveraselproyectosBTN2 = new javax.swing.JButton();
        seleccionarproyecto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTProyectosactuales = new javax.swing.JTable();
        eliminarproyecto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyectos Actuales");

        volveraselproyectosBTN2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        volveraselproyectosBTN2.setText("Volver a sel. de Proyectos");
        volveraselproyectosBTN2.setToolTipText("");
        volveraselproyectosBTN2.setFocusPainted(false);
        volveraselproyectosBTN2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        volveraselproyectosBTN2.setMargin(new java.awt.Insets(1, 14, 1, 14));
        volveraselproyectosBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volveraselproyectosBTN2ActionPerformed(evt);
            }
        });

        seleccionarproyecto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        seleccionarproyecto.setText("Seleccionar Proyecto");
        seleccionarproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarproyectoActionPerformed(evt);
            }
        });

        JTProyectosactuales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha Inicio", "Fecha Fin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTProyectosactuales);
        if (JTProyectosactuales.getColumnModel().getColumnCount() > 0) {
            JTProyectosactuales.getColumnModel().getColumn(0).setResizable(false);
            JTProyectosactuales.getColumnModel().getColumn(1).setResizable(false);
            JTProyectosactuales.getColumnModel().getColumn(2).setResizable(false);
            JTProyectosactuales.getColumnModel().getColumn(3).setResizable(false);
        }

        eliminarproyecto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        eliminarproyecto.setText("Eliminar Proyecto");
        eliminarproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarproyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volveraselproyectosBTN2)
                        .addGap(41, 41, 41)
                        .addComponent(seleccionarproyecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarproyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seleccionarproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(volveraselproyectosBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volveraselproyectosBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volveraselproyectosBTN2ActionPerformed
        
        Menuprincipal volver=new Menuprincipal();
        volver.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_volveraselproyectosBTN2ActionPerformed

    private void eliminarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarproyectoActionPerformed
        
        //Traemos el modelo del jTable y preseleccionamos una de sus filas correspondiente a un proyecti
        DefaultTableModel modelo=(DefaultTableModel) JTProyectosactuales.getModel();
        
        int filaparaeliminar=JTProyectosactuales.getSelectedRow();
        
        
        //Recorremos y extraemos los datos del proyecto que queremos eliminar
        modelo.getValueAt(filaparaeliminar,0);
        modelo.getValueAt(filaparaeliminar,1);
        modelo.getValueAt(filaparaeliminar,2);
        modelo.getValueAt(filaparaeliminar,3);
        
        
        int idvalor=(Integer) modelo.getValueAt(filaparaeliminar,0);
        String nombrevalor=(String) modelo.getValueAt(filaparaeliminar,1);
        Date fechainiciovalor=(Date) modelo.getValueAt(filaparaeliminar,2);
        Date fechafinvalor= (Date)modelo.getValueAt(filaparaeliminar,3);
        
        
        //Seteamos los valores a una nueva entidad de Proyectos
        Proyectos proyectoparaeliminar=new Proyectos();
      
        proyectoparaeliminar.setIdProyecto(idvalor);
        proyectoparaeliminar.setNombreProyecto(nombrevalor);
        proyectoparaeliminar.setFechainicioProyecto(fechainiciovalor);
        proyectoparaeliminar.setFechafinProyecto(fechafinvalor);
        
       
       String [] arraydebotones={"Eliminar","Cancelar"};
        
                      
       int botonseleccionado= JOptionPane.showOptionDialog(null, "¿Está seguro de que desea eliminar este proyecto? Se eliminarán todas las tablas y registros que contenga", "Eliminar proyecto", 0, JOptionPane.QUESTION_MESSAGE, null, arraydebotones, null);
       
       
       //Eliminamos el proyecto gracias al método eliminarProyecto de la clase operaciones
       if (botonseleccionado==0) {
    
        operaciones eliminar=new operaciones();
        eliminar.eliminarProyecto(proyectoparaeliminar);
        modelo.removeRow(filaparaeliminar);
    
                                 }
       
       else{}
           
      
    }//GEN-LAST:event_eliminarproyectoActionPerformed

    private void seleccionarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarproyectoActionPerformed
        
        
        //Tomamos el modelo de la tabla y preseleccionamos una de sus filas correspondiente a un proyecto
        DefaultTableModel modelo=(DefaultTableModel) JTProyectosactuales.getModel();
        
        int proyectoapuntar=JTProyectosactuales.getSelectedRow();
        
        
        //Recorremos y vamos seteando la información en una nueva instancia de Proyectos
        modelo.getValueAt(proyectoapuntar,0);
        modelo.getValueAt(proyectoapuntar,1);
        modelo.getValueAt(proyectoapuntar,2);
        modelo.getValueAt(proyectoapuntar,3);
        
        int idvalor=(Integer) modelo.getValueAt(proyectoapuntar,0);
        String nombrevalor=(String) modelo.getValueAt(proyectoapuntar,1);
        Date fechainiciovalor=(Date) modelo.getValueAt(proyectoapuntar,2);
        Date fechafinvalor=(Date) modelo.getValueAt(proyectoapuntar,3);
        
        

       Proyectos nuevoproyecto=new Proyectos();
       
       nuevoproyecto.setIdProyecto(idvalor);
       nuevoproyecto.setNombreProyecto(nombrevalor);
       nuevoproyecto.setFechainicioProyecto(fechainiciovalor);
       nuevoproyecto.setFechafinProyecto(fechafinvalor);
        
        
       Menuproyecto iraproyectoactual=new Menuproyecto(nuevoproyecto);
       iraproyectoactual.setVisible(true);
       this.setVisible(false);
         
        
    }//GEN-LAST:event_seleccionarproyectoActionPerformed

   
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
            java.util.logging.Logger.getLogger(Proyectosactuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyectosactuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyectosactuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyectosactuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyectosactuales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTProyectosactuales;
    private javax.swing.JButton eliminarproyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton seleccionarproyecto;
    private javax.swing.JButton volveraselproyectosBTN2;
    // End of variables declaration//GEN-END:variables
}
