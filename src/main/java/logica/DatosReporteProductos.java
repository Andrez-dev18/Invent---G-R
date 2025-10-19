
package logica;

/**
 *
 * @author sergi
 */
public class DatosReporteProductos {
    
    private int idProducto;
    private String fechaReporte;
    private String descripcionProducto;
    private int stockMin;
    private int stockActual;
    private double precio;
    private String MARCA;
    private String CATEGORIA;
    private String PROVEEDOR;
    private int totalProductos;

    public DatosReporteProductos() {
    }

    public DatosReporteProductos(int idProducto, String fechaReporte, String descripcionProducto, int stockMin, int stockActual, double precio, String MARCA, String CATEGORIA, String PROVEEDOR, int totalProductos) {
        this.idProducto = idProducto;
        this.fechaReporte = fechaReporte;
        this.descripcionProducto = descripcionProducto;
        this.stockMin = stockMin;
        this.stockActual = stockActual;
        this.precio = precio;
        this.MARCA = MARCA;
        this.CATEGORIA = CATEGORIA;
        this.PROVEEDOR = PROVEEDOR;
        this.totalProductos = totalProductos;
    }

   
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    public String getPROVEEDOR() {
        return PROVEEDOR;
    }

    public void setPROVEEDOR(String PROVEEDOR) {
        this.PROVEEDOR = PROVEEDOR;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    

    
}
