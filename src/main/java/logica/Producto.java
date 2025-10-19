
package logica;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author sergi
 */
@Entity
public class Producto extends Item{
 
    private int stockMinimo;
    
    @ManyToOne
    private Proveedor unProveedor;
    @ManyToOne
    private Categoria unaCategoria;
    @ManyToOne
    private Marca unaMarca;
    @OneToMany(mappedBy = "unProducto")
    private List<Entrada> entradas;
    
    @OneToMany(mappedBy = "producto")
    private List<Detalle_Venta> listaDetallesVentas;
       
    public Producto() {
    }

    public Producto(int stockMinimo, Proveedor unProveedor, Categoria unaCategoria, Marca unaMarca, List<Entrada> entradas, List<Detalle_Venta> listaDetallesVentas, int id, String descripcion, int stock, double precio) {
        super(id, descripcion, stock, precio);
        this.stockMinimo = stockMinimo;
        this.unProveedor = unProveedor;
        this.unaCategoria = unaCategoria;
        this.unaMarca = unaMarca;
        this.entradas = entradas;
        this.listaDetallesVentas = listaDetallesVentas;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public Proveedor getUnProveedor() {
        return unProveedor;
    }

    public void setUnProveedor(Proveedor unProveedor) {
        this.unProveedor = unProveedor;
    }

    public Categoria getUnaCategoria() {
        return unaCategoria;
    }

    public void setUnaCategoria(Categoria unaCategoria) {
        this.unaCategoria = unaCategoria;
    }

    public Marca getUnaMarca() {
        return unaMarca;
    }

    public void setUnaMarca(Marca unaMarca) {
        this.unaMarca = unaMarca;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public List<Detalle_Venta> getListaDetallesVentas() {
        return listaDetallesVentas;
    }

    public void setListaDetallesVentas(List<Detalle_Venta> listaDetallesVentas) {
        this.listaDetallesVentas = listaDetallesVentas;
    }
   
    
    
}
