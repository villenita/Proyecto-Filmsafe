
package Interfaces;

import com.toedter.calendar.IDateEvaluator;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import filmsafe_filmsafe1.Proyectos;
import filmsafe_filmsafe1.Registros;
import filmsafe_filmsafe1.Trabajadores;
import filmsafe_filmsafe1.operaciones;
import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class registros extends javax.swing.JFrame {
   
    
    public registros(Trabajadores nuevotrabajador, Proyectos nuevoproyecto) {
        
    
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Recogemos los valores que han entrado por parámetro
        String nombreProyecto=nuevoproyecto.getNombreProyecto();
        int idProyecto=nuevoproyecto.getIdProyecto();
        Date fechainicioProyecto=nuevoproyecto.getFechainicioProyecto();
        Date fechafinProyecto=nuevoproyecto.getFechafinProyecto();
        
        String nombreTrabajador=nuevotrabajador.getNombreTrabajador();
        String apellidoTrabajador=nuevotrabajador.getApellidoTrabajador();
        String puestodetrabajo=nuevotrabajador.getPuestodetrabajo();
        int idTrabajador=nuevotrabajador.getIdTrabajador();
        String Consentimientovalor=jComboBox1.getSelectedItem().toString();
        Date fechainicioTrabajador=nuevotrabajador.getFechainiciotrabajador();
        Date fechafinTrabajador=nuevotrabajador.getFechafintrabajador();
        
        
        String idvalor=Integer.toString(idTrabajador);
        String idvalorproyecto=Integer.toString(idProyecto);
        
        //Establecemos los límites máximos y mínimos de fechas seleccionables
        jCalendar2.setMinSelectableDate(fechainicioTrabajador);
        jCalendar2.setMaxSelectableDate(fechafinTrabajador);      
        
        
        //Recuperamos el valor del consentimiento desde la base de datos para que quede correctamente seteado en la interfaz
        operaciones estadoconsentimiento=new operaciones();
         
         boolean consstate=estadoconsentimiento.recuperarconsentimiento(nuevotrabajador);
         
         if(consstate==true){
         
         jComboBox1.setSelectedItem("Sí");}
         
         else{
    
         jComboBox1.setSelectedItem("No");
    
         }
        
       
         
         //Lógica para crear la lista de fechas conforme al protocolo estándar
        int sumartresdias=259200000;
        
        
        long fechaatransformar1 = 0;
        long fechafin=fechafinTrabajador.getTime();
        int numero = 0;
        List<Date> fechas_prot = new ArrayList<Date>();
            
        while (numero < 100) {
            
            if (numero == 0)
            {
                fechaatransformar1=fechainicioTrabajador.getTime();
                 fechas_prot.add(fechainicioTrabajador);       
                 numero = numero +1;
            }
            else
            {
            fechaatransformar1=fechaatransformar1 + sumartresdias;
            Date fecha1=new Date(fechaatransformar1);
            fechas_prot.add(fecha1);
            }
            
            if (fechafin <= fechaatransformar1)
            {
                numero = 100;
            }    
        } 
                
          
        
        //Coloreamos las fechas contenidas en la lista para mostrarlas en verde en el jCalendar de la interfaz
        Calendar c = jCalendar2.getCalendar();
        Calendar c_aux = jCalendar2.getCalendar();
        c.set(Calendar.DAY_OF_MONTH,1);
        int offset = c.get(Calendar.DAY_OF_WEEK);
        int mon = jCalendar2.getMonthChooser().getMonth() + 1;
        int yr = jCalendar2.getYearChooser().getYear();
        int day = jCalendar2.getDayChooser().getDay();
        JPanel jPanel = jCalendar2.getDayChooser().getDayPanel();
        Component component[] = jPanel.getComponents();
        
        Date fecha_max_sel = jCalendar2.getMaxSelectableDate();
        Date fecha_min_sel = jCalendar2.getMinSelectableDate();
        
        LocalDate ld_max_sel = Instant.ofEpochMilli(fecha_max_sel.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ld_min_sel = Instant.ofEpochMilli(fecha_min_sel.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        
        int ld_max_sel_day = ld_max_sel.getDayOfMonth();
        int ld_max_sel_mon = ld_max_sel.getMonthValue();
        int ld_min_sel_day = ld_min_sel.getDayOfMonth();
        int ld_min_sel_mon = ld_min_sel.getMonthValue();
        
        boolean flag_green_min = false;
        boolean flag_green_max = false;
        boolean flag_no_max = false;
        boolean flag_no_min = false;
        
        for (Iterator iterator = fechas_prot.iterator(); iterator.hasNext();) {
            
            Date fecha_aux = (Date) iterator.next();
            
            LocalDate localDate = Instant.ofEpochMilli(fecha_aux.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
            
            int aux_day = localDate.getDayOfMonth(); 
            int aux_mon = localDate.getMonthValue(); 
            int aux_yr = localDate.getYear();
            offset = 12;
            if(mon == aux_mon && yr == aux_yr)
            {
                if (aux_mon == ld_min_sel_mon)
                { 
                    if (aux_day >= ld_min_sel_day)
                    {
                    flag_green_min = true;
                    }
                
                }
                else
                {
                    flag_no_min = true;
                }
                
                if (aux_mon == ld_max_sel_day)
                {
                    if (aux_day <= ld_max_sel_day) 
                    {
                    flag_green_max = true;
                    }
                }
                else
                {
                    flag_no_max = true;
                }
                
                if (flag_no_max == true && flag_no_min == true)
                {
                    component[aux_day+offset].setBackground(Color.green);
                }
                
                if (flag_green_min == true && flag_green_max == true)
                {
                    component[aux_day+offset].setBackground(Color.green);
                }
            
            }
            
        
            
        }
        
    
         
        JLnombre.setText(nombreTrabajador);
        JLapellido.setText(apellidoTrabajador);
        JLid.setText(idvalor);
        JLpuestodetrabajo.setText(puestodetrabajo);
        JTfechacomienzo.setValue(fechainicioTrabajador);
        JTfechafin.setValue(fechafinTrabajador);
       
       
        
        JLnombreproyecto.setText(nombreProyecto);
        JLidproyecto.setText(idvalorproyecto);
        JTfechainicioproyecto.setValue(fechainicioProyecto);
        JTfechafinproyecto.setValue(fechafinProyecto);
        
        Date diadehoy= new Date();
        diadehoy.getDate();
        
        
        //Este condicional determina que en los proyectos antiguos los botones que representan funciones de modificación estén inhabilitados
        int comparacion = fechafinProyecto.compareTo(diadehoy);
        
        
        if (comparacion<0){
        
        JBTNirapendientehoy.setEnabled(false);
        JBTNnuevapcr.setEnabled(false);
        JBTNguardar.setEnabled(false);
        jComboBox1.setEnabled(false);
        }

        
       }
      
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLregistros = new javax.swing.JLabel();
        JLnombre = new javax.swing.JLabel();
        JLid = new javax.swing.JLabel();
        JLapellido = new javax.swing.JLabel();
        JBTNirapendientehoy = new javax.swing.JButton();
        JBTNirabuscar = new javax.swing.JButton();
        JBTNnuevapcr = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        JLconsentimiento = new javax.swing.JLabel();
        JBTNguardar = new javax.swing.JButton();
        JBTNiraregistros = new javax.swing.JButton();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        JLpuestodetrabajo = new javax.swing.JLabel();
        JLfechadecomienzo = new javax.swing.JLabel();
        JLfechafin = new javax.swing.JLabel();
        JTfechacomienzo = new javax.swing.JFormattedTextField();
        JTfechafin = new javax.swing.JFormattedTextField();
        JLnombreproyecto = new javax.swing.JLabel();
        JLidproyecto = new javax.swing.JLabel();
        JLfechainicioproyecto = new javax.swing.JLabel();
        JLfechafinproyecto = new javax.swing.JLabel();
        JTfechainicioproyecto = new javax.swing.JFormattedTextField();
        JTfechafinproyecto = new javax.swing.JFormattedTextField();
        JLetiquetaproyecto = new javax.swing.JLabel();
        JLetiquetaidproyecto = new javax.swing.JLabel();
        JLetiquetaidtrabajador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLregistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLregistros.setText("Registros");

        JLnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLnombre.setText("Nombre");

        JLid.setText("ID");

        JLapellido.setText("Apellido");

        JBTNirapendientehoy.setText("ir a Pendiente Hoy");
        JBTNirapendientehoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNirapendientehoyActionPerformed(evt);
            }
        });

        JBTNirabuscar.setText("ir a Buscar");
        JBTNirabuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNirabuscarActionPerformed(evt);
            }
        });

        JBTNnuevapcr.setText("Programar nueva PCR");
        JBTNnuevapcr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNnuevapcrActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));

        JLconsentimiento.setText("Consentimiento:");

        JBTNguardar.setText("Guardar");
        JBTNguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNguardarActionPerformed(evt);
            }
        });

        JBTNiraregistros.setText("ir a Registro");
        JBTNiraregistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNiraregistrosActionPerformed(evt);
            }
        });

        JLpuestodetrabajo.setText("Puesto de trabajo");

        JLfechadecomienzo.setText("Fecha de comienzo");

        JLfechafin.setText("Fecha de fin");

        JTfechacomienzo.setEnabled(false);

        JTfechafin.setEnabled(false);

        JLnombreproyecto.setText("Proyecto");

        JLidproyecto.setText("ID proyecto");

        JLfechainicioproyecto.setText("Fecha inicio proyecto:");

        JLfechafinproyecto.setText("Fecha fin proyecto:");

        JTfechainicioproyecto.setEnabled(false);

        JTfechafinproyecto.setEnabled(false);

        JLetiquetaproyecto.setText("Nombre del proyecto:");

        JLetiquetaidproyecto.setText("ID proyecto:");

        JLetiquetaidtrabajador.setText("ID trabajador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLetiquetaidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(JLfechadecomienzo)
                                .addGap(18, 18, 18)
                                .addComponent(JTfechacomienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(JLfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(JLconsentimiento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBTNguardar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBTNirapendientehoy, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(JBTNirabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(JBTNnuevapcr)
                                .addGap(49, 49, 49)
                                .addComponent(JBTNiraregistros))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLetiquetaidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(JLetiquetaproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JLidproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(JLfechainicioproyecto))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(JLapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JTfechainicioproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(40, 40, 40)
                                                        .addComponent(JLfechafinproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(JTfechafinproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(JLnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(JLpuestodetrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(829, 829, 829))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(JLregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JLregistros)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombreproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLetiquetaproyecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLidproyecto)
                    .addComponent(JLfechainicioproyecto)
                    .addComponent(JLfechafinproyecto)
                    .addComponent(JTfechainicioproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTfechafinproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLetiquetaidproyecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLconsentimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnombre)
                    .addComponent(JLapellido)
                    .addComponent(JLpuestodetrabajo)
                    .addComponent(JBTNguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTfechacomienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLfechafin)
                    .addComponent(JTfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLid)
                    .addComponent(JLfechadecomienzo)
                    .addComponent(JLetiquetaidtrabajador))
                .addGap(18, 18, 18)
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBTNnuevapcr)
                            .addComponent(JBTNiraregistros)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBTNirapendientehoy)
                            .addComponent(JBTNirabuscar))))
                .addGap(384, 384, 384))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void JBTNguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNguardarActionPerformed
        
        //Recogemos el valor del consentimiento y lo actualizamos en la base de datos
        boolean Consentimiento=true;
        int idTrabajador;
        
        
        String Consentimientovalor=jComboBox1.getSelectedItem().toString();
        
        
        if(Consentimientovalor == "Sí"){
        
            
        Consentimiento=true;
        idTrabajador=Integer.parseInt(JLid.getText());
            
        Trabajadores nuevotrabajador=new Trabajadores();
       
        nuevotrabajador.setIdTrabajador(idTrabajador);
        nuevotrabajador.setConsentimiento(Consentimiento);
        
        
        
        operaciones actualizar=new operaciones();   
        actualizar.actualizarconsentimientoatrue(nuevotrabajador);
        
        JOptionPane.showMessageDialog(this, "El estado del consentimiento se ha modificado con éxito", "Consentimiento actualizado", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
        
        if(Consentimientovalor=="No"){
        
        Consentimiento=false;
        idTrabajador=Integer.parseInt(JLid.getText());
            
        Trabajadores nuevotrabajador=new Trabajadores();
       
        nuevotrabajador.setIdTrabajador(idTrabajador);
        nuevotrabajador.setConsentimiento(Consentimiento);
        
        
        
        operaciones actualizar=new operaciones();
        
        actualizar.actualizarconsentimientoafalse(nuevotrabajador);
       
        JOptionPane.showMessageDialog(this, "El estado del consentimiento se ha modificado con éxito", "Consentimiento actualizado", JOptionPane.INFORMATION_MESSAGE); 
        }
       
        
    }//GEN-LAST:event_JBTNguardarActionPerformed

    private void JBTNiraregistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNiraregistrosActionPerformed
       
      
        //Tomamos la fecha del botón para que la hoja particular de registro apunte a la fecha elegida y la parseamos
        Date dia=jCalendar2.getDate(); 
     
     
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yy");
        formato.setLenient(false);
     
        String diavalor=formato.format(dia);
    
        //Recogemos todos los datos y los seteamos a nuevas instancias de Proyectos y Trabajadores
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer) Integer.parseInt(JLidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicioproyecto.getValue();
        fechafinProyecto=(Date)JTfechafinproyecto.getValue();
        
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
       
        int idTrabajador;
        String nombreTrabajador;
        String apellidoTrabajador;
        String puestodetrabajo;
        Date FechainicioTrabajador;
        Date FechafinTrabajador;
        boolean Consentimiento;
        
        
        idTrabajador=(Integer)Integer.parseInt(JLid.getText());
        nombreTrabajador=JLnombre.getText();
        apellidoTrabajador=JLapellido.getText();
        puestodetrabajo=JLpuestodetrabajo.getText();
        FechainicioTrabajador = (Date) JTfechacomienzo.getValue();
        FechafinTrabajador = (Date) JTfechafin.getValue();
        
        
        String Consentimientovalor=jComboBox1.getSelectedItem().toString();
        Consentimiento=Boolean.parseBoolean(Consentimientovalor);
        
       
        
        Trabajadores nuevotrabajador=new Trabajadores();
        
        nuevotrabajador.setIdTrabajador(idTrabajador);
        nuevotrabajador.setNombreTrabajador(nombreTrabajador);
        nuevotrabajador.setApellidoTrabajador(apellidoTrabajador);
        nuevotrabajador.setPuestodetrabajo(puestodetrabajo);
        nuevotrabajador.setFechainiciotrabajador(FechainicioTrabajador);
        nuevotrabajador.setFechafintrabajador(FechafinTrabajador);
        nuevotrabajador.setConsentimiento(Consentimiento);
        nuevotrabajador.setProyectos(nuevoproyecto);
        
       
        
         DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        
        diavalor=formato.format(dia);
        Date Fechaqueregistrar = null;
        
        try {
            Fechaqueregistrar = formatter.parse(diavalor);
             
             
        } catch (ParseException ex) {
        
            Logger.getLogger(registroparticular.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        
        
        //Traemos desde la base de datos el registro concreto, que se generó al crear el trabajador y lo reescribimos con los datos nuevos
        Registros nuevoregistro=new Registros();
        
        operaciones traerregistro=new operaciones();
        Registros r1 = traerregistro.recuperarregistro(nuevoregistro, nuevotrabajador, diavalor);
        
        Date Fecharegistro=r1.getFecharegistro();
        String estado=r1.getEstado();
        int Numeropeticion=r1.getNumeropeticion();
        String observaciones=r1.getObservaciones();
        int IdRegistro=r1.getIdRegistro();
        
         nuevoregistro= new Registros();
         nuevoregistro.setFecharegistro(Fecharegistro);
         nuevoregistro.setEstado(estado);
         nuevoregistro.setNumeropeticion(Numeropeticion);
         nuevoregistro.setObservaciones(observaciones);
         nuevoregistro.setIdRegistro(IdRegistro);
         
         
        
        registroparticular ir=new registroparticular(nuevotrabajador, nuevoproyecto, diavalor, nuevoregistro);
        ir.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_JBTNiraregistrosActionPerformed

    private void JBTNnuevapcrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNnuevapcrActionPerformed
        
        
        //Utilizamos la lógica del protocolo estándar para pintar de rojo la fecha para la nueva PCR extra
        Calendar c = jCalendar2.getCalendar();
        Calendar c_aux = jCalendar2.getCalendar();
        c.set(Calendar.DAY_OF_MONTH,1);
        int offset = c.get(Calendar.DAY_OF_WEEK);
        int mon = jCalendar2.getMonthChooser().getMonth() + 1;
        int yr = jCalendar2.getYearChooser().getYear();
        int day = jCalendar2.getDayChooser().getDay();
        JPanel jPanel = jCalendar2.getDayChooser().getDayPanel();
        Component component[] = jPanel.getComponents();
        
        Date fecha_max_sel = jCalendar2.getMaxSelectableDate();
        Date fecha_min_sel = jCalendar2.getMinSelectableDate();
        
        LocalDate ld_max_sel = Instant.ofEpochMilli(fecha_max_sel.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ld_min_sel = Instant.ofEpochMilli(fecha_min_sel.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        
        
        
        String fecha;
        
        fecha=JOptionPane.showInputDialog("Introduce una fecha para nueva cita:");
        
        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
         
         Date fechaespecial = null;
        
        try {
            fechaespecial = formatter.parse(fecha);
            
            
             
             
        } catch (ParseException ex) {
        
            Logger.getLogger(registroparticular.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        
        LocalDate localDate = Instant.ofEpochMilli(fechaespecial.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
            
            int aux_day = localDate.getDayOfMonth();
            int aux_mon = localDate.getMonthValue(); 
            int aux_yr = localDate.getYear(); 
            offset = 12;
            
        int ld_max_sel_day = ld_max_sel.getDayOfMonth();
        int ld_max_sel_mon = ld_max_sel.getMonthValue();
        int ld_min_sel_day = ld_min_sel.getDayOfMonth();
        int ld_min_sel_mon = ld_min_sel.getMonthValue();
            
        boolean flag_green_min = false;
        boolean flag_green_max = false;
        boolean flag_no_max = false;
        boolean flag_no_min = false;
        
          if (aux_mon == ld_min_sel_mon)
                { 
                    if (aux_day >= ld_min_sel_day)
                    {
                    flag_green_min = true;
                    }
                
                }
                else
                {
                    flag_no_min = true;
                }
                
                if (aux_mon == ld_max_sel_day)
                {
                    if (aux_day <= ld_max_sel_day) 
                    {
                    flag_green_max = true;
                    }
                }
                else
                {
                    flag_no_max = true;
                }
                
                if (flag_no_max == true && flag_no_min == true)
                {
                    component[aux_day+offset].setBackground(Color.red);
                }
                
                if (flag_green_min == true && flag_green_max == true)
                {
                    component[aux_day+offset].setBackground(Color.red);
                }
                
        //Recogemos todos los datos y los seteamos para crear cada una de las instancias de las tres clases a persistir        
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer) Integer.parseInt(JLidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicioproyecto.getValue();
        fechafinProyecto=(Date)JTfechafinproyecto.getValue();
        
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);  
        
         int idTrabajador;
        String nombreTrabajador;
        String apellidoTrabajador;
        String puestodetrabajo;
        Date FechainicioTrabajador;
        Date FechafinTrabajador;
        
        
        
        idTrabajador=(Integer)Integer.parseInt(JLid.getText());
        nombreTrabajador=JLnombre.getText();
        apellidoTrabajador=JLapellido.getText();
        puestodetrabajo=JLpuestodetrabajo.getText();
        FechainicioTrabajador = (Date) JTfechacomienzo.getValue();
        FechafinTrabajador = (Date) JTfechafin.getValue();
        
        
        Trabajadores nuevotrabajador=new Trabajadores();
        
        nuevotrabajador.setIdTrabajador(idTrabajador);
        nuevotrabajador.setNombreTrabajador(nombreTrabajador);
        nuevotrabajador.setApellidoTrabajador(apellidoTrabajador);
        nuevotrabajador.setPuestodetrabajo(puestodetrabajo);
        nuevotrabajador.setFechainiciotrabajador(FechainicioTrabajador);
        nuevotrabajador.setFechafintrabajador(FechafinTrabajador);
        nuevotrabajador.setProyectos(nuevoproyecto);
        
        Registros nuevoregistro=new Registros();
        
        nuevoregistro.setFecharegistro(fechaespecial);
        nuevoregistro.setTrabajador(nuevotrabajador);
        
        operaciones crearregistroespecial=new operaciones();
        
        crearregistroespecial.crearRegistro(nuevoregistro);
        
        JOptionPane.showMessageDialog(this, "La nueva cita se ha creado con éxito", "Nueva cita creada", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    } 
    private void JBTNirapendientehoyActionPerformed(java.awt.event.ActionEvent evt) {                                                    
       
        
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer) Integer.parseInt(JLidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicioproyecto.getValue();
        fechafinProyecto=(Date)JTfechafinproyecto.getValue();
        
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        
        pendienteshoy ir=new pendienteshoy(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
        
        
    }                                                   

    private void JBTNirabuscarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer) Integer.parseInt(JLidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicioproyecto.getValue();
        fechafinProyecto=(Date)JTfechafinproyecto.getValue();
        
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        
        
        
        buscartrabajador ir=new buscartrabajador(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
   
    }                                             

    
    
    
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
              // new registros().setVisible(true);
            }
        });
    }
   /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        


    // Variables declaration - do not modify                     
    private javax.swing.JButton JBTNguardar;
    private javax.swing.JButton JBTNirabuscar;
    private javax.swing.JButton JBTNirapendientehoy;
    private javax.swing.JButton JBTNiraregistros;
    private javax.swing.JButton JBTNnuevapcr;
    private javax.swing.JLabel JLapellido;
    private javax.swing.JLabel JLconsentimiento;
    private javax.swing.JLabel JLetiquetaidproyecto;
    private javax.swing.JLabel JLetiquetaidtrabajador;
    private javax.swing.JLabel JLetiquetaproyecto;
    private javax.swing.JLabel JLfechadecomienzo;
    private javax.swing.JLabel JLfechafin;
    private javax.swing.JLabel JLfechafinproyecto;
    private javax.swing.JLabel JLfechainicioproyecto;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLidproyecto;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLnombreproyecto;
    private javax.swing.JLabel JLpuestodetrabajo;
    private javax.swing.JLabel JLregistros;
    private javax.swing.JFormattedTextField JTfechacomienzo;
    private javax.swing.JFormattedTextField JTfechafin;
    private javax.swing.JFormattedTextField JTfechafinproyecto;
    private javax.swing.JFormattedTextField JTfechainicioproyecto;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration                   
    
    
    
    

    }//GEN-LAST:event_JBTNnuevapcrActionPerformed
/*
    private void JBTNirapendientehoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNirapendientehoyActionPerformed
       
        
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer) Integer.parseInt(JLidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicioproyecto.getValue();
        fechafinProyecto=(Date)JTfechafinproyecto.getValue();
        
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        
        
        
        pendienteshoy ir=new pendienteshoy(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
        
       
        
    }//GEN-LAST:event_JBTNirapendientehoyActionPerformed

    private void JBTNirabuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNirabuscarActionPerformed
        
        String nombreProyecto;
        int idProyecto;
        Date fechainicioProyecto;
        Date fechafinProyecto;
        
        nombreProyecto=JLnombreproyecto.getText();
        idProyecto=(Integer) Integer.parseInt(JLidproyecto.getText());
        fechainicioProyecto=(Date)JTfechainicioproyecto.getValue();
        fechafinProyecto=(Date)JTfechafinproyecto.getValue();
        
        
        Proyectos nuevoproyecto=new Proyectos();
        
        nuevoproyecto.setNombreProyecto(nombreProyecto);
        nuevoproyecto.setIdProyecto(idProyecto);
        nuevoproyecto.setFechainicioProyecto(fechainicioProyecto);
        nuevoproyecto.setFechafinProyecto(fechafinProyecto);
        
        
        
        
        buscartrabajador ir=new buscartrabajador(nuevoproyecto);
        ir.setVisible(true);
        this.setVisible(false);
   
    }//GEN-LAST:event_JBTNirabuscarActionPerformed

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new registros().setVisible(true);
            }
        });


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTNguardar;
    private javax.swing.JButton JBTNirabuscar;
    private javax.swing.JButton JBTNirapendientehoy;
    private javax.swing.JButton JBTNiraregistros;
    private javax.swing.JButton JBTNnuevapcr;
    private javax.swing.JLabel JLapellido;
    private javax.swing.JLabel JLconsentimiento;
    private javax.swing.JLabel JLetiquetaidproyecto;
    private javax.swing.JLabel JLetiquetaidtrabajador;
    private javax.swing.JLabel JLetiquetaproyecto;
    private javax.swing.JLabel JLfechadecomienzo;
    private javax.swing.JLabel JLfechafin;
    private javax.swing.JLabel JLfechafinproyecto;
    private javax.swing.JLabel JLfechainicioproyecto;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLidproyecto;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLnombreproyecto;
    private javax.swing.JLabel JLpuestodetrabajo;
    private javax.swing.JLabel JLregistros;
    private javax.swing.JFormattedTextField JTfechacomienzo;
    private javax.swing.JFormattedTextField JTfechafin;
    private javax.swing.JFormattedTextField JTfechafinproyecto;
    private javax.swing.JFormattedTextField JTfechainicioproyecto;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
*/


