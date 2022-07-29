package filmsafe_filmsafe1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name = "trabajadores")
public class Trabajadores implements Serializable {

    //implementar serializable
    private static final long serialVersionUID = 1L;

    @ManyToOne(cascade = (CascadeType.ALL))
    @JoinColumn(name = "idproyecto")
    private Proyectos proyectos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@SequenceGenerator(name="tra_seq", sequenceName="hibernate_sequence", initialValue=1, allocationSize=1)
    @Column(name = "idtrabajador")
    private int idTrabajador;

    @Column(name = "nombre")
    private String nombreTrabajador;

    @Column(name = "apellido")
    private String apellidoTrabajador;

    @Column(name = "puesto_trabajo")
    private String puestodetrabajo;

    @Column(name = "fecha_inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Fechainiciotrabajador;

    @Column(name = "fecha_fin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Fechafintrabajador;

    @Column(name = "positivo")
    private boolean Positivo;
    
    @Column(name = "consentimiento")
    private boolean Consentimiento;

    //constructor vacío
    public Trabajadores() {

    }

    public Trabajadores(Proyectos proyectos, int idTrabajador, String nombreTrabajador, String apellidoTrabajador, String puestodetrabajo, Date Fechainiciotrabajador, Date Fechafintrabajador, boolean Positivo, boolean Consentimiento) {
        this.proyectos = proyectos;
        this.idTrabajador = idTrabajador;
        this.nombreTrabajador = nombreTrabajador;
        this.apellidoTrabajador = apellidoTrabajador;
        this.puestodetrabajo = puestodetrabajo;
        this.Fechainiciotrabajador = Fechainiciotrabajador;
        this.Fechafintrabajador = Fechafintrabajador;
        this.Positivo = Positivo;
        this.Consentimiento = Consentimiento;
    }
    
    

    public Trabajadores(Proyectos proyectos, int idTrabajador, String nombreTrabajador, String apellidoTrabajador, String puestodetrabajo, Date Fechainiciotrabajador, Date Fechafintrabajador) {
        this.proyectos = proyectos;
        this.idTrabajador = idTrabajador;
        this.nombreTrabajador = nombreTrabajador;
        this.apellidoTrabajador = apellidoTrabajador;
        this.puestodetrabajo = puestodetrabajo;
        this.Fechainiciotrabajador = Fechainiciotrabajador;
        this.Fechafintrabajador = Fechafintrabajador;
    }

   
    public Proyectos getProyectos() {
        return proyectos;
    }

    public void setProyectos(Proyectos proyectos) {
        this.proyectos = proyectos;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getApellidoTrabajador() {
        return apellidoTrabajador;
    }

    public void setApellidoTrabajador(String apellidoTrabajador) {
        this.apellidoTrabajador = apellidoTrabajador;
    }

    public String getPuestodetrabajo() {
        return puestodetrabajo;
    }

    public void setPuestodetrabajo(String puestodetrabajo) {
        this.puestodetrabajo = puestodetrabajo;
    }

    public Date getFechainiciotrabajador() {
        return Fechainiciotrabajador;
    }

    public void setFechainiciotrabajador(Date fechainiciotrabajador) {
        Fechainiciotrabajador = fechainiciotrabajador;
    }

    public Date getFechafintrabajador() {
        return Fechafintrabajador;
    }

    public void setFechafintrabajador(Date fechafintrabajador) {
        Fechafintrabajador = fechafintrabajador;
    }

    public boolean isPositivo() {
        return Positivo;
    }

    public void setPositivo(boolean positivo) {
        Positivo = positivo;
    }

    public boolean isConsentimiento() {
        return Consentimiento;
    }

    public void setConsentimiento(boolean Consentimiento) {
        this.Consentimiento = Consentimiento;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "proyectos=" + proyectos + ", idTrabajador=" + idTrabajador + ", nombreTrabajador=" + nombreTrabajador + ", apellidoTrabajador=" + apellidoTrabajador + ", puestodetrabajo=" + puestodetrabajo + ", Fechainiciotrabajador=" + Fechainiciotrabajador + ", Fechafintrabajador=" + Fechafintrabajador + ", Positivo=" + Positivo + ", Consentimiento=" + Consentimiento + '}';
    }
    
    

    

}
