
package Interfaces;

import filmsafe_filmsafe1.Proyectos;
import filmsafe_filmsafe1.operaciones;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Proyectosanteriores extends javax.swing.JFrame {

    
    public Proyectosanteriores() {
       
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        //Definimos un modelo concreto para jTable acorde con los datos que vamos a recuperar
        
       DefaultTableModel modelo=new DefaultTableModel();
        JTProyectosanteriores.setModel(modelo);
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Fin");
        
        //Llamamos al método de operaciones que nos va a traer la lista de proyectos antiguos
        operaciones operacion=new operaciones();
        List listaparaguardaranteriores=operacion.setdeproyectosanteriores();
        
        
        //Recorremos la lista y la seteamos al elmento jTable presente en la interfaz
        Iterator it=listaparaguardaranteriores.iterator();
        
        while (it.hasNext()){
        
        Proyectos obtener=(Proyectos) it.next();
        
        Object[] fila=new Object [4];
        
        fila[0]=obtener.getIdProyecto();
        fila[1]=obtener.getNombreProyecto();
        fila[2]=obtener.getFechainicioProyecto();
        fila[3]=obtener.getFechafinProyecto();
        
        //Vamos añadiendo cada una de las filas a la tabla
        modelo.addRow(fila); 
        
        }   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BTNseleccionarproyecto = new javax.swing.JButton();
        volveraselproyectosBTN1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTProyectosanteriores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyectos Anteriores");

        BTNseleccionarproyecto.setText("Seleccionar Proyecto");
        BTNseleccionarproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNseleccionarproyectoActionPerformed(evt);
            }
        });

        volveraselproyectosBTN1.setText("Volver a Menú Principal");
        volveraselproyectosBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volveraselproyectosBTN1ActionPerformed(evt);
            }
        });

        JTProyectosanteriores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha inicio", "Fecha fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTProyectosanteriores);
        if (JTProyectosanteriores.getColumnModel().getColumnCount() > 0) {
            JTProyectosanteriores.getColumnModel().getColumn(0).setResizable(false);
            JTProyectosanteriores.getColumnModel().getColumn(1).setResizable(false);
            JTProyectosanteriores.getColumnModel().getColumn(2).setResizable(false);
            JTProyectosanteriores.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volveraselproyectosBTN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNseleccionarproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volveraselproyectosBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNseleccionarproyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volveraselproyectosBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volveraselproyectosBTN1ActionPerformed
       
        Menuprincipal volver=new Menuprincipal();
        volver.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_volveraselproyectosBTN1ActionPerformed

    private void BTNseleccionarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNseleccionarproyectoActionPerformed
        
        //Recuperamos el modelo de tabla para extraer los datos
        DefaultTableModel modelo=(DefaultTableModel) JTProyectosanteriores.getModel();
        
        
        //Esta línea hace efectiva la preselección del proyecto concreto
        int proyectoapuntar=JTProyectosanteriores.getSelectedRow();
       
        
        //Recorremos y seteamos a una nueva entidad de Proyectos
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
        
    
        
    }//GEN-LAST:event_BTNseleccionarproyectoActionPerformed

    
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
            java.util.logging.Logger.getLogger(Proyectosanteriores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyectosanteriores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyectosanteriores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyectosanteriores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyectosanteriores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNseleccionarproyecto;
    private javax.swing.JTable JTProyectosanteriores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton volveraselproyectosBTN1;
    // End of variables declaration//GEN-END:variables
}
