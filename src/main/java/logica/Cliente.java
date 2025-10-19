
package logica;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author sergi
 */
@Entity
public class Cliente extends Persona{
    
    private String telefono;
    private String Email;
    
    @OneToMany(mappedBy = "unCliente")
    private List<venta> venta;

    public Cliente() {
    }

    public Cliente(String telefono, String Email, List<venta> venta, int id, String nombre, String apellido, String DNI_RUC) {
        super(id, nombre, apellido, DNI_RUC);
        this.telefono = telefono;
        this.Email = Email;
        this.venta = venta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<venta> getVenta() {
        return venta;
    }

    public void setVenta(List<venta> venta) {
        this.venta = venta;
    }       
}
