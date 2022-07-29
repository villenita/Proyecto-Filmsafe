package filmsafe_filmsafe1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import Interfaces.Nuevoproyecto;

@Entity
@Table(name = "proyectos")
public class Proyectos implements Serializable {

    //implementar serializable
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproyecto")
    private int idProyecto;

    @Column(name = "nombre")
    private String nombreProyecto;

    @Column(name = "fecha_inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechainicioProyecto;

    @Column(name = "fecha_fin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechafinProyecto;

    //constructor vacío
    public Proyectos() {

    }

    public Proyectos(int idProyecto, String nombreProyecto, Date fechainicioProyecto, Date fechafinProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.fechainicioProyecto = fechainicioProyecto;
        this.fechafinProyecto = fechafinProyecto;
    }

    public Proyectos(String nombreProyecto, Date fechainicioProyecto, Date fechafinProyecto) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Date getFechainicioProyecto() {
        return fechainicioProyecto;
    }

    public void setFechainicioProyecto(Date fechainicioProyecto) {
        this.fechainicioProyecto = fechainicioProyecto;
    }

    public Date getFechafinProyecto() {
        return fechafinProyecto;
    }

    public void setFechafinProyecto(Date fechafinProyecto) {
        this.fechafinProyecto = fechafinProyecto;
    }

    @Override
    public String toString() {
        return "Proyectos [idProyecto=" + idProyecto + ", nombreProyecto=" + nombreProyecto + ", fechainicioProyecto="
                + fechainicioProyecto + ", fechafinProyecto=" + fechafinProyecto + "]";
    }

}
