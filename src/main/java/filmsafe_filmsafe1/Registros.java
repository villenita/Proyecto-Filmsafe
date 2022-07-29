package filmsafe_filmsafe1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "registros")
public class Registros implements Serializable {

    //implementar seiralizable
    private static final long serialVersionUID = 1L;

    @ManyToOne(cascade = (CascadeType.ALL))
    @JoinColumn(name = "idtrabajador")
    private Trabajadores trabajador;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idregistro")
    private int IdRegistro;

    @Column(name = "fecha_registro")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Fecharegistro;

    @Column(name = "estado")
    private String Estado;

    @Column(name = "numero_peticion")
    private int Numeropeticion;

    @Column(name = "observaciones")
    private String Observaciones;

    //constructor vacío
    public Registros() {

    }

    public Trabajadores getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajadores trabajador) {
        this.trabajador = trabajador;
    }

    public int getIdRegistro() {
        return IdRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        IdRegistro = idRegistro;
    }

    public Date getFecharegistro() {
        return Fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        Fecharegistro = fecharegistro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public int getNumeropeticion() {
        return Numeropeticion;
    }

    public void setNumeropeticion(int numeropeticion) {
        Numeropeticion = numeropeticion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Registros [IdRegistro=" + IdRegistro + ", Fecharegistro=" + Fecharegistro + ", Estado=" + Estado
                + ", Numeropeticion=" + Numeropeticion + ", Observaciones=" + Observaciones + "]";
    }

}
