package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Categoria;
import logica.Cliente;
import logica.Detalle_Venta;
import logica.Entrada;
import logica.Marca;
import logica.Producto;
import logica.Proveedor;
import logica.Rol;
import logica.Usuario;
import logica.venta;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author sergi
 */
public class ControladoraPersistencia {

    UsuarioJpaController usuJPA = new UsuarioJpaController();
    RolJpaController rolJPA = new RolJpaController();
    ProductoJpaController productoJPA = new ProductoJpaController();
    CategoriaJpaController categoriaJPA = new CategoriaJpaController();
    ProveedorJpaController proveedorJPA = new ProveedorJpaController();
    MarcaJpaController marcaJPA = new MarcaJpaController();
    EntradaJpaController entradaJPA = new EntradaJpaController();
    ClienteJpaController clienteJPA = new ClienteJpaController();
    ventaJpaController ventaJPA = new ventaJpaController();
    Detalle_VentaJpaController detalleVentaJPA = new Detalle_VentaJpaController();

    public void registrarUsuario(Usuario usu) {
        try {
            usuJPA.create(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> traerUsuarios() {
        return usuJPA.findUsuarioEntities();
    }

    public List<Rol> traerRoles() {
        return rolJPA.findRolEntities();
    }

    public void borrarUsuario(int id) {
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException e) {
        }
    }

    public Usuario traerUsuario(int idUsu) {
        return usuJPA.findUsuario(idUsu);
    }

    public void editarUsuario(Usuario user) {
        try {
            usuJPA.edit(user);
        } catch (Exception e) {
        }
    }

    public void registrarProducto(Producto pd) {
        productoJPA.create(pd);
    }

    public void registrarCategoria(Categoria cate) {
        categoriaJPA.create(cate);
    }

    public void registrarProveedor(Proveedor prove) {
        proveedorJPA.create(prove);
    }

    public List<Categoria> traerCategorias() {
        return categoriaJPA.findCategoriaEntities();
    }

    public List<Proveedor> traerProveedores() {
        return proveedorJPA.findProveedorEntities();
    }

    public List<Producto> traerProductos() {
        return productoJPA.findProductoEntities();
    }

    public void borrarProducto(int id) {
        try {
            productoJPA.destroy(id);
        } catch (NonexistentEntityException e) {
            System.out.println(e.getMessage());
        }
    }

    public Producto traerProducto(int id) {
        return productoJPA.findProducto(id);
    }

    public void registrarMarca(Marca mc) {
        marcaJPA.create(mc);
    }

    public List<Marca> traerMarcas() {
        return marcaJPA.findMarcaEntities();
    }

    public void editarProducto(Producto pd) {
        try {
            productoJPA.edit(pd);
        } catch (Exception e) {
        }
    }

    public void registrarEntrada(Entrada entradas) {
        entradaJPA.create(entradas);
        
    }

    public List<Entrada> traerEntradas() {
       return entradaJPA.findEntradaEntities();
    }

    public void registrarCliente(Cliente cliente) {
        try {
            clienteJPA.create(cliente);
        } catch (Exception e) {
        }
    }

    public List<Cliente> traerClientes() {
       return clienteJPA.findClienteEntities();
    }

    public void registrarVenta(venta vt) {
        ventaJPA.create(vt);
    }

    public void registrarDetalleVenta(Detalle_Venta dv) {
        detalleVentaJPA.create(dv);
    }

    public List<Detalle_Venta> traerDetalleVentas() {
        return detalleVentaJPA.findDetalle_VentaEntities();
    }

    public void borrarProveedor(int id) {
        try {
            proveedorJPA.destroy(id);
        } catch (NonexistentEntityException e) {
            
        }
    }

    public Proveedor traerProveedor(int id) {
        return proveedorJPA.findProveedor(id);
    }

    public List<venta> traerVenta() {
        return ventaJPA.findventaEntities();
    }

    public Marca traerMarca(int id) {
        return marcaJPA.findMarca(id);
    }
    
    public Categoria traerCategoria(int id){
        return categoriaJPA.findCategoria(id);
    }

    public void borrarMarca(int id) {
        try {
            marcaJPA.destroy(id);
        } catch (NonexistentEntityException e) {
        }
    }
    
    public void borrarCategoria(int id){
        try {
            categoriaJPA.destroy(id);
        } catch (NonexistentEntityException e) {
        }
    }

    public void editarCategoria(Categoria cate) {
        try {
            categoriaJPA.edit(cate);
        } catch (Exception e) {
        }
    }

    public void editarProveedor(Proveedor prove) {
        try {
            proveedorJPA.edit(prove);
        } catch (Exception e) {
        }
    }
    
    public void editarMarca(Marca marca){
        try {
            marcaJPA.edit(marca);
        } catch (Exception e) {
        }
    }

    public Entrada traerEntrada(int id) {
       return entradaJPA.findEntrada(id);
    }

    public void editarEntrada(Entrada entrada) {
        try {
            entradaJPA.edit(entrada);
        } catch (Exception e) {
        }
    }

    public void borrarEntrada(int id) {
        try {
            entradaJPA.destroy(id);
        } catch (Exception e) {
        }
    }

    public Cliente traerCliente(int id) {
        return clienteJPA.findCliente(id);
    }

    public void editarCliente(Cliente cliente) {
        try {
            clienteJPA.edit(cliente);
        } catch (Exception e) {
        }
    }

    public void borrarCliente(int id) {
        try {
            clienteJPA.destroy(id);
        } catch (Exception e) {
        }
 
    }

}
