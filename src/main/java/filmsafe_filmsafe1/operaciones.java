 package filmsafe_filmsafe1;

import java.util.Date;
import org.hibernate.SessionBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import Interfaces.Nuevoproyecto;
import Interfaces.Menuprincipal;
import Interfaces.registroparticular;
import com.fasterxml.classmate.AnnotationConfiguration;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import filmsafe_filmsafe1.Proyectos;
import java.io.Serializable;
import javax.imageio.spi.ServiceRegistry;
import filmsafe_filmsafe1.Proyectos;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.query.Query;

public class operaciones {

    private Session session;

   
    public Integer crearProyecto(Proyectos nuevoproyecto) {

        //Guardamos los datos del proyecto que entra por parámetro con session.save, equivalente en HQL a un create. El método devuelve el id del proyecto
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        Integer idProyecto = null;

        session.getTransaction().begin();

        idProyecto = (Integer) session.save(nuevoproyecto);

        session.getTransaction().commit();
        session.close();

        return idProyecto;

    }

    public List setdeproyectosactuales() {
        
        
        //Creamos una query que nos va a devolver la lista de proyectos que se encuentran activos
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.beginTransaction();

        List listaProyectosactuales = session.createQuery("FROM Proyectos as proyecto where proyecto.fechafinProyecto >= current_date + 1").list();

        //Recorremos la lsita
        for (Iterator iterator = listaProyectosactuales.iterator(); iterator.hasNext();) {

            Proyectos proyecto = (Proyectos) iterator.next();
            System.out.println("ID:" + proyecto.getIdProyecto());
            System.out.println("Nombre:" + proyecto.getNombreProyecto());
            System.out.println("Fecha inicio:" + proyecto.getFechainicioProyecto());
            System.out.println("Fecha fin:" + proyecto.getFechafinProyecto());

        }

        session.getTransaction().commit();

        return listaProyectosactuales;

    }

    public List setdeproyectosanteriores() {

        //Creamos una query que nos va a devolver la lista de proyectos ya finalizados
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.beginTransaction();

        List listaProyectosanteriores = session.createQuery("FROM Proyectos as proyecto where proyecto.fechafinProyecto < current_date + 1").list();

        //Recorremos la lista
        for (Iterator iterator = listaProyectosanteriores.iterator(); iterator.hasNext();) {

            Proyectos proyecto = (Proyectos) iterator.next();
            System.out.println("ID:" + proyecto.getIdProyecto());
            System.out.println("Nombre:" + proyecto.getNombreProyecto());
            System.out.println("Fecha inicio:" + proyecto.getFechainicioProyecto());
            System.out.println("Fecha fin:" + proyecto.getFechafinProyecto());

        }

        session.getTransaction().commit();

        return listaProyectosanteriores;

    }

    public Proyectos eliminarProyecto(Proyectos proyectoparaeliminar) {

        //Hacemos un delete apuntando al proyecto que entra por parámetro
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.getTransaction().begin();

        session.delete(proyectoparaeliminar);

        session.getTransaction().commit();
        session.close();

        return proyectoparaeliminar;

    }

    public Integer crearTrabajador(Trabajadores nuevotrabajador) {

        //Creamos un nuevo trabajador con los valores que entran por parámetro
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        Integer idTrabajador = null;

        session.getTransaction().begin();

        idTrabajador = (Integer) session.save(nuevotrabajador);

        session.getTransaction().commit();
        session.close();

       
        return idTrabajador;

    }
    
    public List<Date> crearcitaspcr (Proyectos nuevoproyecto, Trabajadores nuevotrabajador, Registros nuevoregistro){
    
    //Creamos la lista de fechas que determinan el protocolo estándar aprovechando la lógica que utilizamos para pintar las fechas de color verde
    int sumartresdias=259200000;
    
    String nombreProyecto=nuevoproyecto.getNombreProyecto();
    Date fechainicioProyecto=nuevoproyecto.getFechainicioProyecto();
    Date fechafinProyecto=nuevoproyecto.getFechafinProyecto();
    int idProyecto=nuevoproyecto.getIdProyecto();
    
    
    Date fechainicioTrabajador=nuevotrabajador.getFechainiciotrabajador();
    Date fechafinTrabajador=nuevotrabajador.getFechafintrabajador();
    String nombreTrabajador=nuevotrabajador.getNombreTrabajador();
    String apellidoTrabajador=nuevotrabajador.getApellidoTrabajador();
    String puestodetrabajo=nuevotrabajador.getPuestodetrabajo();
    int idTrabajador=nuevotrabajador.getIdTrabajador();
    Proyectos proyectos=nuevotrabajador.getProyectos();
    
    
    
    Trabajadores trabajador=nuevoregistro.getTrabajador();
    
    
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
        
            for (Iterator iterator = fechas_prot.iterator(); iterator.hasNext();) {
            
            Date fecha_aux = (Date) iterator.next();
            
            nuevoregistro.setFecharegistro(fecha_aux);
            nuevoregistro.setTrabajador(trabajador);
            
            operaciones guardar=new operaciones();
            guardar.crearRegistro(nuevoregistro);
           
        }
          
        
        return fechas_prot;
    
    
    }
    
    

    public List busquedadetrabajadores(Trabajadores nuevotrabajador) {

        int idTrabajador = nuevotrabajador.getIdTrabajador();
        String nombreTrabajador = nuevotrabajador.getNombreTrabajador();
        String apellidoTrabajador = nuevotrabajador.getApellidoTrabajador();
        String puestodetrabajo = nuevotrabajador.getPuestodetrabajo();
        Proyectos nuevoproyecto = nuevotrabajador.getProyectos();
        

       

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.beginTransaction();

        //Tenemos en cuenta todas las condiciones posibles en la entrada de datos del usuario para buscar un trabajador
        boolean r1 = nombreTrabajador.isEmpty();

        if (r1 == false) {

            String hql = "FROM Trabajadores as trabajador where trabajador.nombreTrabajador = :nombreTrabajador";
            Query query = session.createQuery(hql);
            query.setParameter("nombreTrabajador", nombreTrabajador);
            List listadetrabajadorespornombre = query.list();

            for (Iterator iterator = listadetrabajadorespornombre.iterator(); iterator.hasNext();) {

                Trabajadores trabajador = (Trabajadores) iterator.next();

                System.out.println("Nombre:" + trabajador.getNombreTrabajador());
                System.out.println("Apellido:" + trabajador.getApellidoTrabajador());
                System.out.println("ID:" + trabajador.getIdTrabajador());
                System.out.println("Puesto de trabajo:" + trabajador.getPuestodetrabajo());

            }

            session.getTransaction().commit();
            return listadetrabajadorespornombre;
        }

        boolean r2 = apellidoTrabajador.isEmpty();

        if (r2 == false) {

            String hql = "FROM Trabajadores as trabajador where trabajador.apellidoTrabajador = :apellidoTrabajador";
            Query query = session.createQuery(hql);
            query.setParameter("apellidoTrabajador", apellidoTrabajador);
            List listadetrabajadorespornombre = query.list();

            for (Iterator iterator = listadetrabajadorespornombre.iterator(); iterator.hasNext();) {

                Trabajadores trabajador = (Trabajadores) iterator.next();

                System.out.println("Nombre:" + trabajador.getNombreTrabajador());
                System.out.println("Apellido:" + trabajador.getApellidoTrabajador());
                System.out.println("ID:" + trabajador.getIdTrabajador());
                System.out.println("Puesto de trabajo:" + trabajador.getPuestodetrabajo());

            }

            session.getTransaction().commit();
            return listadetrabajadorespornombre;
        }

        boolean r3 = puestodetrabajo.isEmpty();

        if (r3 == false) {

            String hql = "FROM Trabajadores as trabajador where trabajador.puestodetrabajo = :puestodetrabajo";
            Query query = session.createQuery(hql);
            query.setParameter("puestodetrabajo", puestodetrabajo);
            List listadetrabajadorespornombre = query.list();

            for (Iterator iterator = listadetrabajadorespornombre.iterator(); iterator.hasNext();) {

                Trabajadores trabajador = (Trabajadores) iterator.next();

                System.out.println("Nombre:" + trabajador.getNombreTrabajador());
                System.out.println("Apellido:" + trabajador.getApellidoTrabajador());
                System.out.println("ID:" + trabajador.getIdTrabajador());
                System.out.println("Puesto de trabajo:" + trabajador.getPuestodetrabajo());

            }

            session.getTransaction().commit();
            return listadetrabajadorespornombre;
        }

        String idTrabajadorstring = Integer.toString(idTrabajador);
        boolean r4 = idTrabajadorstring.isEmpty();

        if (r4 == false) {

            String hql = "FROM Trabajadores as trabajador where trabajador.idTrabajador = :idTrabajador";
            Query query = session.createQuery(hql);
            query.setParameter("idTrabajador", idTrabajador);
            List listadetrabajadorespornombre = query.list();

            for (Iterator iterator = listadetrabajadorespornombre.iterator(); iterator.hasNext();) {

                Trabajadores trabajador = (Trabajadores) iterator.next();

                System.out.println("Nombre:" + trabajador.getNombreTrabajador());
                System.out.println("Apellido:" + trabajador.getApellidoTrabajador());
                System.out.println("ID:" + trabajador.getIdTrabajador());
                System.out.println("Puesto de trabajo:" + trabajador.getPuestodetrabajo());

            }

            session.getTransaction().commit();
            return listadetrabajadorespornombre;
        } else {
        }
        return null;

    }

    public Trabajadores actualizarconsentimientoatrue(Trabajadores nuevotrabajador) {
         
        //El método apunta a un trabajador concreto para modificar el estado del consentimiento a true
        int idTrabajador=nuevotrabajador.getIdTrabajador();
        boolean Consentimiento=true;
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        
        session.beginTransaction();
        
        String hql = "update Trabajadores as trabajador set trabajador.Consentimiento= true where trabajador.idTrabajador= :idTrabajador";
        Query query = session.createQuery(hql);
        query.setParameter("idTrabajador", idTrabajador);
        query.executeUpdate();
        session.getTransaction().commit();
        
        return nuevotrabajador;
        
    
    }
    
    public Trabajadores actualizarconsentimientoafalse(Trabajadores nuevotrabajador) {
        
        ////El método apunta a un trabajador concreto para modificar el estado del consentimiento a true
        int idTrabajador=nuevotrabajador.getIdTrabajador();
        boolean Consentimiento=false;
        
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.beginTransaction();
        
        String hql = "update Trabajadores as trabajador set trabajador.Consentimiento= false where trabajador.idTrabajador= :idTrabajador";
        Query query = session.createQuery(hql);
        query.setParameter("idTrabajador", idTrabajador);
        query.executeUpdate();
        session.getTransaction().commit();
        
        
        
        return nuevotrabajador;
        
    }
    
    public boolean recuperarconsentimiento (Trabajadores nuevotrabajador){
        
        //Extraemos el estado del consentimiento para volver a guardarlo junto a todos los datos del registro 
        int idTrabajador = nuevotrabajador.getIdTrabajador();
    
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.beginTransaction();
        
        String hql = " Select Consentimiento FROM Trabajadores as trabajador where trabajador.idTrabajador = :idTrabajador";
        Query query = session.createQuery(hql);
        query.setParameter("idTrabajador", idTrabajador);
        boolean Consentimiento=(boolean)query.getSingleResult();
        return Consentimiento;
    
    }
    
    public Integer actualizarRegistro(Registros nuevoregistro) {

        //Utilizamos este mñetodo para que los datos se guarden en una de los registros ya creados por el protocolo cuando se agregó el trabajador
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        int IdRegistro = nuevoregistro.getIdRegistro();
        String Observaciones=nuevoregistro.getObservaciones();
        Date Fecharegistro=nuevoregistro.getFecharegistro();
        String Estado=nuevoregistro.getEstado();
        int Numeropeticion=nuevoregistro.getNumeropeticion();

        session.getTransaction().begin();

       
       
       String hql = " Update Registros set Observaciones=:Observaciones, Fecharegistro=:Fecharegistro, Estado=:Estado, Numeropeticion=:Numeropeticion where IdRegistro=:IdRegistro";
       Query query = session.createQuery(hql);
       query.setParameter("Observaciones", Observaciones);
       query.setParameter("Fecharegistro", Fecharegistro);
       query.setParameter("Estado", Estado);
       query.setParameter("Numeropeticion", Numeropeticion);
       query.setParameter("IdRegistro", IdRegistro);
       query.executeUpdate();

        session.getTransaction().commit();
        session.close();

        // terminar();
        System.out.println("Registro guardado");
        return IdRegistro;
    
    }  
    
    public Registros recuperarregistro(Registros nuevoregistro,Trabajadores nuevotrabajador, String diavalor)  {
    
        //Recuperamos un registro para setear los datos en la interfaz y que persistan en el flujo de pantallas
        Date Fechaqueregistrar=null;
        
        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        try {
            Fechaqueregistrar = formatter.parse(diavalor);
                        
             
        } catch (ParseException ex) {
        
            Logger.getLogger(registroparticular.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        int idTrabajador= nuevotrabajador.getIdTrabajador();
        Date Fecharegistro= Fechaqueregistrar;
        
    
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.beginTransaction();
        
        
      
        String hql = "FROM Registros as registro where registro.trabajador=:id1 and registro.Fecharegistro=:id2";
        
       
         Query query = session.createQuery(hql);
         query.setParameter("id1", nuevotrabajador);
         query.setParameter("id2", Fecharegistro);
         
         List valoresderegistro = query.list();
         
         for (Iterator iterator = valoresderegistro.iterator(); iterator.hasNext();) {

                nuevoregistro = (Registros) iterator.next();

               
            }
         
         
         session.getTransaction().commit();
         
         
         System.out.println( "Esta es la salida de la búsqueda en la BD"+ " "+nuevoregistro);
         
        return nuevoregistro;
    
            }
    
   
    
      
     public List listadependienteshoy (){
     
     //Solicitamos los registros pendientes con fecha de hoy para crear la lista de Pendientes hoy
     SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.beginTransaction();

        List listapendientes = session.createQuery("FROM Registros as registro where registro.Fecharegistro = current_date").list();

        for (Iterator iterator = listapendientes.iterator(); iterator.hasNext();) {

            Registros nuevoregistro = (Registros) iterator.next();
            System.out.println("Trabajador:" + nuevoregistro.getTrabajador());
            System.out.println("ID:" + nuevoregistro.getIdRegistro());
            

        }

        session.getTransaction().commit();

        return listapendientes;
    
     
     }
     
    public Integer crearRegistro(Registros nuevoregistro){
        
        
        //Crea un nuevo registro extra, independiente de los que generó el protocolo cuando se creó el trabajador
         SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        Integer IdRegistro = null;

        session.getTransaction().begin();

        IdRegistro = (Integer) session.save(nuevoregistro);

        session.getTransaction().commit();
        session.close();

       
        System.out.println("Trabajador guardado");
        return IdRegistro;
    
    }
      public String recuperarestado (Registros nuevoregistro){
        
        //Recuperamos el estado de la prueba PCR para setear sus valores en la interfaz y que se persistan en el flujo de pantallas
        int IdRegistro=nuevoregistro.getIdRegistro();
        String Estado=null;
       
    
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory.openSession();

        session.beginTransaction();
        
        String hql = " Select Estado FROM Registros as registro where registro.IdRegistro =:IdRegistro";
        Query query = session.createQuery(hql);
        query.setParameter("IdRegistro",IdRegistro);
        Estado=(String)query.getSingleResult();
        session.getTransaction().commit();
        
        return Estado;
    
    }

    
    
    
}