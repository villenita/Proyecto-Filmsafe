package filmsafe_filmsafe1;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {

    
    public static void main (String[] args) {
        System.out.println("inicio del programa");
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		Session session = sessionFactory.openSession();
		
		System.out.println("Configuración realizada");
                
                
                session.close();      
    }
    
     
}