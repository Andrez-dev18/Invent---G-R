package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sergi
 */
@Entity
public class Entrada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Producto unProducto;

    private int stockEntrada;
    private double precioCompra;

    @Temporal(TemporalType.DATE)
    private Date FechaEntrada;

    public Entrada() {
    }

    public Entrada(int id, Producto unProducto, int stockEntrada, double precioCompra, Date FechaEntrada) {
        this.id = id;
        this.unProducto = unProducto;
        this.stockEntrada = stockEntrada;
        this.precioCompra = precioCompra;
        this.FechaEntrada = FechaEntrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    public int getStockEntrada() {
        return stockEntrada;
    }

    public void setStockEntrada(int stockEntrada) {
        this.stockEntrada = stockEntrada;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Date getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(Date FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

}
