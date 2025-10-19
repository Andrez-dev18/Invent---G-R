
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author sergi
 */
@Entity
public class Detalle_Venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalle;  
    private String numComprobante;
    @ManyToOne
    private venta venta;
    
    @ManyToOne
    private Producto producto;
       
    double montoTotal;
    
    public Detalle_Venta() {
    }

    public Detalle_Venta(int idDetalle, String numComprobante, venta venta, Producto producto, double montoTotal) {
        this.idDetalle = idDetalle;
        this.numComprobante = numComprobante;
        this.venta = venta;
        this.producto = producto;
        this.montoTotal = montoTotal;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public venta getVenta() {
        return venta;
    }

    public void setVenta(venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
}
