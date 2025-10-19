package logica;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author sergi
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Metodo para registrar Usuario
    public void registrarUsuario(String nombre, String apellido, String dni_ruc, String usuario, String contrasenia, String rolRecivido) {

        Usuario usu = new Usuario();
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setDNI_RUC(dni_ruc);
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contrasenia);

        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecivido);

        if (rolEncontrado != null) {
            usu.setUnRol(rolEncontrado);
        }

        int id = this.buscarUltimoUsuario();
        usu.setId(id + 1);
        controlPersis.registrarUsuario(usu);

    }

    public void registrarProducto(String producto, int stockMinimo, int stockNormal, double precio,
            String marcaRecivida, String categoriaRecivida, String proveedorRecivido) {

        Producto productos = new Producto();
        productos.setDescripcion(producto);
        productos.setStockMinimo(stockMinimo);
        productos.setStock(stockNormal);
        productos.setPrecio(precio);

        Marca marcaEncontrada = new Marca();
        marcaEncontrada = this.traerMarca(marcaRecivida);

        Categoria cateEncontrada = new Categoria();
        cateEncontrada = this.traerCategoria(categoriaRecivida);

        Proveedor proveEncontrado = new Proveedor();
        proveEncontrado = this.traerProveedor(proveedorRecivido);

        if (cateEncontrada != null && marcaEncontrada != null && proveEncontrado != null) {
            productos.setUnaCategoria(cateEncontrada);
            productos.setUnProveedor(proveEncontrado);
            productos.setUnaMarca(marcaEncontrada);
        }

        controlPersis.registrarProducto(productos);
    }

    public void registrarCategoria(String nombreCategoria) {
        Categoria cate = new Categoria();
        cate.setNombreCategoria(nombreCategoria);
        controlPersis.registrarCategoria(cate);
    }

    public void registrarProveedor(String proveedor) {
        Proveedor prove = new Proveedor();
        prove.setNombreProveedor(proveedor);
        controlPersis.registrarProveedor(prove);
    }

    //Metodo para validar el usuario
    public Usuario validarUsuario(String usuario, String contrasenia) {

        //traer lista de usuarios
        Usuario user = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContrasenia().equals(contrasenia)) {
                    user = usu;
                    return user;
                } else {
                    user = null;
                    return user;
                }
            } else {
                user = null;
                //return user;
            }
        }
        return user;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }

    private Rol traerRol(String rolRebivido) {
        List<Rol> listaRoles = controlPersis.traerRoles();

        for (Rol rol : listaRoles) {
            if (rol.getNombreRol().equals(rolRebivido)) {
                return rol;
            }
        }
        return null;
    }

    private Producto traerProductoEncontrado(String productoRecivido) {
        List<Producto> listaProductos = controlPersis.traerProductos();

        for (Producto pd : listaProductos) {
            if (pd.getDescripcion().equals(productoRecivido)) {
                return pd;
            }
        }
        return null;
    }

    private Marca traerMarca(String marcaRevida) {
        List<Marca> listaMarcas = controlPersis.traerMarcas();

        for (Marca mc : listaMarcas) {
            if (mc.getNombreMarca().equals(marcaRevida)) {
                return mc;
            }
        }
        return null;
    }

    private Categoria traerCategoria(String categoriasRecivida) {
        List<Categoria> listaCategorias = controlPersis.traerCategorias();

        for (Categoria cate : listaCategorias) {
            if (cate.getNombreCategoria().equals(categoriasRecivida)) {
                return cate;
            }
        }
        return null;
    }

    private Proveedor traerProveedor(String proveedorRecivido) {
        List<Proveedor> listaProveedores = controlPersis.traerProveedores();

        for (Proveedor prove : listaProveedores) {
            if (prove.getNombreProveedor().equals(proveedorRecivido)) {
                return prove;
            }
        }
        return null;
    }

    private int buscarUltimoUsuario() {
        List<Usuario> listaUsuarios = this.traerUsuarios();

        Usuario usu = listaUsuarios.get(listaUsuarios.size() - 1);
        return usu.getId();
    }

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int idUsu) {
        return controlPersis.traerUsuario(idUsu);
    }

    public void editarProductos(Producto pd, String descriProducto, int stockMinimo, int stockNormal,
            double precio, String marcaRevida, String categoriaRecivida, String proveedorRecivido) {

        pd.setDescripcion(descriProducto);
        pd.setStockMinimo(stockMinimo);
        pd.setStock(stockNormal);
        pd.setPrecio(precio);

        Marca marcaEncontrada = new Marca();
        marcaEncontrada = this.traerMarca(marcaRevida);

        Categoria cateEncontrada = new Categoria();
        cateEncontrada = this.traerCategoria(categoriaRecivida);

        Proveedor proveEncontrado = new Proveedor();
        proveEncontrado = this.traerProveedor(proveedorRecivido);

        if (cateEncontrada != null) {
            pd.setUnaCategoria(cateEncontrada);
            pd.setUnProveedor(proveEncontrado);
            pd.setUnaMarca(marcaEncontrada);
        }
        controlPersis.editarProducto(pd);
    }

    public void editarEntrada(Entrada entrada, String producto, int stockEntrada, double precioEntrada, Date fecha, int stockActual) {

        Producto pd = new Producto();
        pd = this.traerProductoEncontrado(producto);

        if (pd != null) {
            int stockResta = stockActual - entrada.getStockEntrada();
            int nuevoStock = stockResta + stockEntrada;
            pd.setStock(nuevoStock);
            entrada.setUnProducto(pd);
        }
        entrada.setStockEntrada(stockEntrada);
        entrada.setPrecioCompra(precioEntrada);
        entrada.setFechaEntrada(fecha);
        
        controlPersis.editarProducto(pd);
        controlPersis.editarEntrada(entrada);

    }

    public void editarUsuario(Usuario user, String nombre, String apellido, String dni_ruc, String usuario, String contrasenia, String rolRecibido) {
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setDNI_RUC(dni_ruc);
        user.setNombreUsuario(usuario);
        user.setContrasenia(contrasenia);

        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);

        if (rolEncontrado != null) {
            user.setUnRol(rolEncontrado);
        }

        controlPersis.editarUsuario(user);
    }
    
    public void editarCliente(Cliente cliente, String nombre, String apellido, String dni_ruc, String telefono, String correo) {
       cliente.setNombre(nombre);
       cliente.setApellido(apellido);
       cliente.setDNI_RUC(dni_ruc);
       cliente.setTelefono(telefono);
       cliente.setEmail(correo);
       
       controlPersis.editarCliente(cliente);
       
    }

    public List<Categoria> traerCategorias() {
        return controlPersis.traerCategorias();
    }

    public List<Proveedor> traerProveedores() {
        return controlPersis.traerProveedores();
    }

    public List<Producto> traerProductos() {
        return controlPersis.traerProductos();
    }

    public String borrarProducto(int id) {
        
        Producto pd = this.traerProductoEditar(id);
        
        if (pd.getEntradas().isEmpty()) {
            controlPersis.borrarProducto(id);
            return "Producto "+pd.getDescripcion()+ " Eliminado";
        }else {
            return "No se puede eliminar el producto, esta relacionado a entradas";
        }       
    }

    public Producto traerProductoEditar(int id) {
        return controlPersis.traerProducto(id);
    }

    public void registrarMarca(String marca) {
        Marca mc = new Marca();
        mc.setNombreMarca(marca);
        controlPersis.registrarMarca(mc);
    }

    public List<Marca> traerMarcas() {
        return controlPersis.traerMarcas();
    }

    public void registrarEntrada(String productoRecivido, int stockEntrada, double precioEntrada, Date fecha) {

        Entrada entradas = new Entrada();
        entradas.setFechaEntrada(fecha);
        entradas.setPrecioCompra(precioEntrada);
        entradas.setStockEntrada(stockEntrada);

        Producto pdEncontrado = new Producto();
        pdEncontrado = this.traerProductoEncontrado(productoRecivido);

        if (pdEncontrado != null) {
            entradas.setUnProducto(pdEncontrado);

            int stockActual = pdEncontrado.getStock();

            int nuevoStock = stockActual + stockEntrada;

            pdEncontrado.setStock(nuevoStock);

        }
        controlPersis.editarProducto(pdEncontrado);
        controlPersis.registrarEntrada(entradas);

    }

    public List<Entrada> traerEntradas() {
        return controlPersis.traerEntradas();
    }

    public Entrada traerEntrada(int id) {
        return controlPersis.traerEntrada(id);
    }

    public void registrarCliente(String nombre, String apellido, String dni_ruc, String telefono, String correo) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDNI_RUC(dni_ruc);
        cliente.setTelefono(telefono);
        cliente.setEmail(correo);

        int id = this.buscarUltimoCliente();
        cliente.setId(id + 1);

        controlPersis.registrarCliente(cliente);
    }

    private int buscarUltimoCliente() {
        List<Cliente> listaCliente = this.traerClientes();

        if (listaCliente.isEmpty()) {
            return 0;
        } else {

            Cliente cliente = listaCliente.get(listaCliente.size() - 1);
            return cliente.getId();
        }
    }

    public String traerClientePorDNI(String dniRecivido) {

        List<Cliente> listaClientes = controlPersis.traerClientes();

        for (Cliente cl : listaClientes) {
            if (cl.getDNI_RUC().equals(dniRecivido)) {
                //String nombreCompleto = cl.getNombre() +" "+cl.getApellido();
                return cl.getNombre();
            }
        }
        return "Cliente no encontrado";
    }

    public void registrarVenta(int cantidad, String numComprobante, double precioUni, double subtotal, double total, double importe, double cambio, Date fechaRegistro, String cliente, String vendedor, String producto) {

        venta vt = new venta();
        vt.setNomProducto(producto);
        vt.setCantVenta(cantidad);
        vt.setPrecioUntiario(precioUni);
        vt.setSubTotal(subtotal);
        vt.setImporte(importe);
        vt.setCambio(cambio);
        vt.setFechaVenta(fechaRegistro);

        Usuario userEncontrado = new Usuario();
        userEncontrado = this.traerUsuario(vendedor);

        Cliente clienteEncontrado = new Cliente();
        clienteEncontrado = this.traerClienteEncontrado(cliente);

        vt.setUnCliente(clienteEncontrado);
        vt.setUnUsuario(userEncontrado);

        Producto productoEncontrado = new Producto();
        productoEncontrado = this.traerProductoEncontrado(producto);

        Detalle_Venta dv = new Detalle_Venta();
        dv.setNumComprobante(numComprobante);
        dv.setMontoTotal(total);
        dv.setVenta(vt);
        dv.setProducto(productoEncontrado);

        controlPersis.registrarVenta(vt);
        controlPersis.registrarDetalleVenta(dv);
    }

    private Usuario traerUsuario(String vendedor) {

        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

        for (Usuario usu : listaUsuarios) {
            if (usu.getNombre().equals(vendedor)) {
                return usu;
            }
        }
        return null;
    }

    private Cliente traerClienteEncontrado(String cliente) {

        List<Cliente> listaClientes = controlPersis.traerClientes();

        for (Cliente cl : listaClientes) {
            if (cl.getNombre().equals(cliente)) {
                return cl;
            }
        }
        return null;
    }

    public void restarProducto(String producto, int cantidadVenta) {

        Producto pdEncontrado = new Producto();
        pdEncontrado = this.traerProductoEncontrado(producto);

        int stockActual = pdEncontrado.getStock();
        int nuevoStock = stockActual - cantidadVenta;

        pdEncontrado.setStock(nuevoStock);

        controlPersis.editarProducto(pdEncontrado);

    }

    public List<Detalle_Venta> traerDetalleVentas() {
        return controlPersis.traerDetalleVentas();
    }

    public List<venta> traerVenta() {
        return controlPersis.traerVenta();
    }

    public String borrarProvedor(int id) {

        Proveedor prove = this.traerProveedor(id);

        if (prove.getProductos().isEmpty()) {
            System.out.println("proveedor libre");
            controlPersis.borrarProveedor(id);
            return "Proveedor " + prove.getNombreProveedor() + " Eliminado";
        } else {
            return "No se puede eliminar este proveedor, esta relacionado a productos";
        }
    }

    public String borrarMarca(int id) {
        Marca marca = this.traerMarca(id);

        if (marca.getProductos().isEmpty()) {
            System.out.println("marca libre");
            controlPersis.borrarMarca(id);
            return "Marca " + marca.getNombreMarca() + " Eliminado";
        } else {
            return "No se puede eliminar esta Marca, esta relacionada a productos";
        }

    }

    public String borrarCateogira(int id) {
        Categoria cate = this.traerCategoria(id);

        if (cate.getProductos().isEmpty()) {
            System.out.println("Categoria libre");
            controlPersis.borrarCategoria(id);
            return "Categoria " + cate.getNombreCategoria() + " Eliminada";
        } else {
            return "No se puede eliminar esta Categoria, esta relacionada a productos";
        }
    }

    public Proveedor traerProveedor(int id) {
        return controlPersis.traerProveedor(id);
    }

    public Marca traerMarca(int id) {
        return controlPersis.traerMarca(id);
    }

    public Categoria traerCategoria(int id) {
        return controlPersis.traerCategoria(id);
    }

    public int traerComprobante() {
        List<Detalle_Venta> listaDetalleVentas = this.traerDetalleVentas();

        if (listaDetalleVentas.isEmpty()) {
            return 1;
        } else {
            Detalle_Venta dv = listaDetalleVentas.get(listaDetalleVentas.size() - 1);
            int comprobante = Integer.parseInt(dv.getNumComprobante());
            return comprobante + 1;
        }
    }

    /*METODO QUE RETORNA UNA LISTA DE LOS DETALLE_VENTA QUE TENGAN EL MISMO NUMERO DE COMPROBANTE*/
    public List<Detalle_Venta> traerDetalleVentaPorComprobante(String Ncomprobante) {
        List<Detalle_Venta> listaDetalles = this.traerDetalleVentas();
        List<Detalle_Venta> listaDetallePorComprobante = new ArrayList<>();

        for (Detalle_Venta dv : listaDetalles) {
            if (dv.getNumComprobante().equals(Ncomprobante)) {
                listaDetallePorComprobante.add(dv);
            }
        }
        return listaDetallePorComprobante;
    }

    public List<Detalle_Venta> traerDetalleVentaPorFecha(Date fecha) {

        List<Detalle_Venta> listaDetalles = this.traerDetalleVentas();
        List<Detalle_Venta> listaDetallePorFecha = new ArrayList<>();

        for (Detalle_Venta dv : listaDetalles) {
            if (dv.getVenta().getFechaVenta().equals(fecha)) {
                listaDetallePorFecha.add(dv);
            }
        }
        return listaDetallePorFecha;
    }

    /*METODO QUE RETORNA UNA LISTA DE VENTAS POR SU FECHA*/
    public List<venta> traerVentasPorFecha(Date fecha) {
        List<venta> listaVentas = this.traerVenta();
        List<venta> listaVentasPorFecha = new ArrayList<>();

        LocalDate fechaComparar = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        for (venta vt : listaVentas) {
            LocalDate fechaVenta = vt.getFechaVenta().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fechaVenta.equals(fechaComparar)) {
                listaVentasPorFecha.add(vt);
            }
        }
        return listaVentasPorFecha;
    }

    public List<Detalle_Venta> traerDetalleVentaPorSemana(Date fecha) {
        List<Detalle_Venta> listaDetalle = this.traerDetalleVentas();
        List<Detalle_Venta> listaVentasPorSemana = new ArrayList<>();

        LocalDate fechaComparar = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate inicioSemana = fechaComparar.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate finSemana = inicioSemana.plusDays(6);

        for (Detalle_Venta dv : listaDetalle) {
            LocalDate fechaSemana = dv.getVenta().getFechaVenta().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fechaSemana.isAfter(inicioSemana.minusDays(1)) && fechaSemana.isBefore(finSemana.plusDays(1))) {
                listaVentasPorSemana.add(dv);
            }
        }
        return listaVentasPorSemana;
    }

    public List<Detalle_Venta> traerDetalleVentasPorMes(Date fecha) {
        List<Detalle_Venta> listaDetalles = this.traerDetalleVentas();
        List<Detalle_Venta> listaVentasPorMes = new ArrayList<>();

        LocalDate fechaComparar = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        YearMonth mesComparar = YearMonth.from(fechaComparar);

        for (Detalle_Venta dv : listaDetalles) {
            LocalDate fechaVenta = dv.getVenta().getFechaVenta().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            YearMonth mesVenta = YearMonth.from(fechaVenta);

            if (mesVenta.equals(mesComparar)) {
                listaVentasPorMes.add(dv);
            }
        }
        return listaVentasPorMes;
    }

    public List<venta> traerVentasPorSemana(Date fecha) {
        List<venta> listaVentas = this.traerVenta();
        List<venta> listaVentasPorSemana = new ArrayList<>();

        LocalDate fechaComparar = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate inicioSemana = fechaComparar.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate finSemana = inicioSemana.plusDays(6);

        for (venta vt : listaVentas) {
            LocalDate fechaVenta = vt.getFechaVenta().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fechaVenta.isAfter(inicioSemana.minusDays(1)) && fechaVenta.isBefore(finSemana.plusDays(1))) {
                listaVentasPorSemana.add(vt);
            }
        }
        return listaVentasPorSemana;
    }

    public List<venta> traerVentasPorMes(Date fecha) {
        List<venta> listaVentas = this.traerVenta();
        List<venta> listaVentasPorMes = new ArrayList<>();

        LocalDate fechaComparar = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        YearMonth mesComparar = YearMonth.from(fechaComparar);

        for (venta vt : listaVentas) {
            LocalDate fechaVenta = vt.getFechaVenta().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            YearMonth mesVenta = YearMonth.from(fechaVenta);

            if (mesVenta.equals(mesComparar)) {
                listaVentasPorMes.add(vt);
            }
        }
        return listaVentasPorMes;
    }

//    public Map.Entry<Producto, Integer> obtenerProductoMasVendido() {
//        List<venta> ventas = this.traerVenta(); // Obtener todas las ventas
//
//        Map<Producto, Integer> cantidadProductosVendidos = new HashMap<>();
//
//        // Iterar sobre las ventas para contar la cantidad de cada producto vendido
//        for (venta venta : ventas) {
//            for (Detalle_Venta detalle : venta.getListaDetallesVentas()) {
//                Producto producto = detalle.getProducto();
//                int cantidad = detalle.getVenta().getCantVenta();
//
//                cantidadProductosVendidos.put(producto, cantidadProductosVendidos.getOrDefault(producto, 0) + cantidad);
//            }
//        }
//
//        // Encontrar el producto más vendido (el que tiene la mayor cantidad vendida)
//        Map.Entry<Producto, Integer> productoMasVendido = null;
//        int cantidadMaxima = 0;
//
//        for (Map.Entry<Producto, Integer> entry : cantidadProductosVendidos.entrySet()) {
//            if (entry.getValue() > cantidadMaxima) {
//                cantidadMaxima = entry.getValue();
//                productoMasVendido = entry;
//            }
//        }
//
//        return productoMasVendido;
//    }
    public List<Map.Entry<Producto, Integer>> obtenerProductosMasVendidos() {
        List<venta> ventas = this.traerVenta(); // Obtener todas las ventas

        Map<Producto, Integer> cantidadProductosVendidos = new HashMap<>();

        // Iterar sobre las ventas para contar la cantidad de cada producto vendido
        for (venta venta : ventas) {
            for (Detalle_Venta detalle : venta.getListaDetallesVentas()) {
                Producto producto = detalle.getProducto();
                int cantidad = detalle.getVenta().getCantVenta();

                cantidadProductosVendidos.put(producto, cantidadProductosVendidos.getOrDefault(producto, 0) + cantidad);
            }
        }

        // Ordenar el mapa por la cantidad vendida de forma descendente
        List<Map.Entry<Producto, Integer>> listaOrdenada = new ArrayList<>(cantidadProductosVendidos.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Obtener los cinco productos más vendidos
        int maxSize = Math.min(5, listaOrdenada.size());
        return listaOrdenada.subList(0, maxSize);
    }

//    public List<Map.Entry<Usuario, Integer>> obtenerUsuariosMasVentas() {
//        List<Detalle_Venta> detallesVentas = traerDetalleVentas(); // Obtener todos los detalles de venta
//
//        Map<Usuario, Integer> cantidadVentasPorUsuario = new HashMap<>();
//
//        // Contar la cantidad de veces que cada usuario aparece en los detalles de venta
//        for (Detalle_Venta detalle : detallesVentas) {
//            Usuario usuario = detalle.getVenta().getUnUsuario();
//            String numComprobante = detalle.getNumComprobante();
//
//            // Considerar solo un número de comprobante único por usuario (representando una venta)
//            if (!cantidadVentasPorUsuario.containsKey(usuario) && numComprobante != null && !numComprobante.isEmpty()) {
//                cantidadVentasPorUsuario.put(usuario, cantidadVentasPorUsuario.getOrDefault(usuario, 0) + 1);
//            }
//        }
//
//        // Ordenar el mapa por la cantidad de ventas por usuario de forma descendente
//        List<Map.Entry<Usuario, Integer>> listaOrdenada = new ArrayList<>(cantidadVentasPorUsuario.entrySet());
//        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));
//
//        // Obtener los tres usuarios con más ventas
//        int maxSize = Math.min(3, listaOrdenada.size());
//        return listaOrdenada.subList(0, maxSize);
//    }
    public List<Map.Entry<Usuario, Integer>> obtenerUsuariosMasVentas() {
        List<Detalle_Venta> detallesVentas = traerDetalleVentas(); // Obtener todos los detalles de venta

        Map<Usuario, Set<Integer>> ventasPorUsuario = new HashMap<>();

        // Contar la cantidad de veces que cada usuario tiene un número de comprobante único
        for (Detalle_Venta detalle : detallesVentas) {
            Usuario usuario = detalle.getVenta().getUnUsuario();
            String numComprobante = detalle.getNumComprobante();

            if (usuario != null && numComprobante != null && !numComprobante.isEmpty()) {
                // Parsear el número de comprobante a entero
                int numeroComprobante = Integer.parseInt(numComprobante);

                // Almacenar los números de comprobante únicos por usuario usando un conjunto (Set)
                ventasPorUsuario.computeIfAbsent(usuario, k -> new HashSet<>()).add(numeroComprobante);
            }
        }

        // Calcular el total de ventas por usuario
        Map<Usuario, Integer> cantidadVentasPorUsuario = new HashMap<>();
        for (Map.Entry<Usuario, Set<Integer>> entry : ventasPorUsuario.entrySet()) {
            cantidadVentasPorUsuario.put(entry.getKey(), entry.getValue().size());
        }

        // Ordenar el mapa por la cantidad de ventas por usuario de forma descendente
        List<Map.Entry<Usuario, Integer>> listaOrdenada = new ArrayList<>(cantidadVentasPorUsuario.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Obtener los tres usuarios con más ventas
        int maxSize = Math.min(3, listaOrdenada.size());
        return listaOrdenada.subList(0, maxSize);
    }

    public void editCategoria(Categoria cate, String nombreCategoria) {
        cate.setNombreCategoria(nombreCategoria);

        controlPersis.editarCategoria(cate);
    }

    public void editProveedor(Proveedor prove, String nombreProveedor) {
        prove.setNombreProveedor(nombreProveedor);
        controlPersis.editarProveedor(prove);
    }

    public void editMarca(Marca marca, String nombreMarca) {
        marca.setNombreMarca(nombreMarca);
        controlPersis.editarMarca(marca);
    }

    public void borrarEntrada(int id, int stockActual, int stockEntrada, String producto) {
        
        Producto pd = new Producto();
        pd = this.traerProductoEncontrado(producto);
        
        if (pd != null) {
            int nuevoStock = stockActual - stockEntrada;
            pd.setStock(nuevoStock);
        }
        
        controlPersis.editarProducto(pd);
        controlPersis.borrarEntrada(id);
    }

    public Cliente traerCliente(int id) {
        return controlPersis.traerCliente(id);
    }

    public String borrarCliente(int id) {
        Cliente cliente = this.traerCliente(id);
        
        if (cliente.getVenta().isEmpty()) {
            System.out.println("cliente libre");
            controlPersis.borrarCliente(id);
            return "cliente "+cliente.getNombre() + " Eliminado";
        }else {
            return "No se puede eliminar al cliente esta relacionado a ventas";
        }
    }
}
