package logica;

/**
 *
 * @author sergi
 */
public class DatosReporteVenta {

    private String numComprobante;
    private String fechaVenta;
    private String nombre;
    private String nombreVendedor;
    private int idProducto;
    private int cantidadVenta;
    private String descripcionProducto;
    private double precioUnitario;
    private double subTotal;
    private double importe;
    private double cambio;
    private double total;

    public DatosReporteVenta() {
    }

    public DatosReporteVenta(String numComprobante, String fechaVenta, String nombre, String nombreVendedor, int idProducto, int cantidadVenta, String descripcionProducto, double precioUnitario, double subTotal, double importe, double cambio, double total) {
        this.numComprobante = numComprobante;
        this.fechaVenta = fechaVenta;
        this.nombre = nombre;
        this.nombreVendedor = nombreVendedor;
        this.idProducto = idProducto;
        this.cantidadVenta = cantidadVenta;
        this.descripcionProducto = descripcionProducto;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.importe = importe;
        this.cambio = cambio;
        this.total = total;
    }   

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
