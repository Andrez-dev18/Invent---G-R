
package logica;

/**
 *
 * @author sergi
 */
public class DatosReporteGeneral {
    
    private String nombreReporte;
    private String fechaReporte;
    private int idProducto;
    private int cantidadVenta;
    private String descripcionProducto;
    private double precioUnitario;
    private double subTotal;
    private double total;

    public DatosReporteGeneral() {
    }

    public DatosReporteGeneral(String nombreReporte, String fechaReporte, int idProducto, int cantidadVenta, String descripcionProducto, double precioUnitario, double subTotal, double total) {
        this.nombreReporte = nombreReporte;
        this.fechaReporte = fechaReporte;
        this.idProducto = idProducto;
        this.cantidadVenta = cantidadVenta;
        this.descripcionProducto = descripcionProducto;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.total = total;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
