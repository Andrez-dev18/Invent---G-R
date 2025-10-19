
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sergi
 */
@Entity
public class venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idventa;  
    
    private String nomProducto;
    private int cantVenta; 
    private double precioUntiario;
    private double subTotal;
    private double importe;
    private double cambio;
    
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;
        
    @ManyToOne
    private Cliente unCliente;

    @ManyToOne
    private Usuario unUsuario;
    
//    @ManyToMany
//    @JoinTable(
//            name="detalle_venta",
//            joinColumns = @JoinColumn(name="idVenta"),
//            inverseJoinColumns = @JoinColumn(name="idProducto")
//    )
//    private List<Producto> listaProductos;
    
    @OneToMany(mappedBy = "venta")
    private List<Detalle_Venta> listaDetallesVentas;
    
    public venta() {
    }

    public venta(int idventa, String nomProducto, int cantVenta, double precioUntiario, double subTotal, double importe, double cambio, Date fechaVenta, Cliente unCliente, Usuario unUsuario, List<Detalle_Venta> listaDetallesVentas) {
        this.idventa = idventa;
        this.nomProducto = nomProducto;
        this.cantVenta = cantVenta;
        this.precioUntiario = precioUntiario;
        this.subTotal = subTotal;
        this.importe = importe;
        this.cambio = cambio;
        this.fechaVenta = fechaVenta;
        this.unCliente = unCliente;
        this.unUsuario = unUsuario;
        this.listaDetallesVentas = listaDetallesVentas;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getCantVenta() {
        return cantVenta;
    }

    public void setCantVenta(int cantVenta) {
        this.cantVenta = cantVenta;
    }

    public double getPrecioUntiario() {
        return precioUntiario;
    }

    public void setPrecioUntiario(double precioUntiario) {
        this.precioUntiario = precioUntiario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public List<Detalle_Venta> getListaDetallesVentas() {
        return listaDetallesVentas;
    }

    public void setListaDetallesVentas(List<Detalle_Venta> listaDetallesVentas) {
        this.listaDetallesVentas = listaDetallesVentas;
    }

    
    
}
