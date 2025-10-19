package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author sergi
 */
@Entity
public class Usuario extends Persona implements Serializable{

    private String nombreUsuario;
    private String contrasenia;
    @ManyToOne
    @JoinColumn(name = "fk_rol")
    private Rol unRol;
    
    @OneToMany(mappedBy = "unUsuario")
    private List<venta> venta;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contrasenia, Rol unRol, List<venta> venta, int id, String nombre, String apellido, String DNI_RUC) {
        super(id, nombre, apellido, DNI_RUC);
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.unRol = unRol;
        this.venta = venta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }

    public List<venta> getVenta() {
        return venta;
    }

    public void setVenta(List<venta> venta) {
        this.venta = venta;
    }

  
}
