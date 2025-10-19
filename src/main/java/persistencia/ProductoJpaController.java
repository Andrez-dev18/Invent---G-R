/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Proveedor;
import logica.Categoria;
import logica.Marca;
import logica.Entrada;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Detalle_Venta;
import logica.Producto;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author sergi
 */
public class ProductoJpaController implements Serializable {

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
        public ProductoJpaController() {
        emf = Persistence.createEntityManagerFactory("inventarioPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) {
        if (producto.getEntradas() == null) {
            producto.setEntradas(new ArrayList<Entrada>());
        }
        if (producto.getListaDetallesVentas() == null) {
            producto.setListaDetallesVentas(new ArrayList<Detalle_Venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proveedor unProveedor = producto.getUnProveedor();
            if (unProveedor != null) {
                unProveedor = em.getReference(unProveedor.getClass(), unProveedor.getId());
                producto.setUnProveedor(unProveedor);
            }
            Categoria unaCategoria = producto.getUnaCategoria();
            if (unaCategoria != null) {
                unaCategoria = em.getReference(unaCategoria.getClass(), unaCategoria.getId());
                producto.setUnaCategoria(unaCategoria);
            }
            Marca unaMarca = producto.getUnaMarca();
            if (unaMarca != null) {
                unaMarca = em.getReference(unaMarca.getClass(), unaMarca.getId());
                producto.setUnaMarca(unaMarca);
            }
            List<Entrada> attachedEntradas = new ArrayList<Entrada>();
            for (Entrada entradasEntradaToAttach : producto.getEntradas()) {
                entradasEntradaToAttach = em.getReference(entradasEntradaToAttach.getClass(), entradasEntradaToAttach.getId());
                attachedEntradas.add(entradasEntradaToAttach);
            }
            producto.setEntradas(attachedEntradas);
            List<Detalle_Venta> attachedListaDetallesVentas = new ArrayList<Detalle_Venta>();
            for (Detalle_Venta listaDetallesVentasDetalle_VentaToAttach : producto.getListaDetallesVentas()) {
                listaDetallesVentasDetalle_VentaToAttach = em.getReference(listaDetallesVentasDetalle_VentaToAttach.getClass(), listaDetallesVentasDetalle_VentaToAttach.getIdDetalle());
                attachedListaDetallesVentas.add(listaDetallesVentasDetalle_VentaToAttach);
            }
            producto.setListaDetallesVentas(attachedListaDetallesVentas);
            em.persist(producto);
            if (unProveedor != null) {
                unProveedor.getProductos().add(producto);
                unProveedor = em.merge(unProveedor);
            }
            if (unaCategoria != null) {
                unaCategoria.getProductos().add(producto);
                unaCategoria = em.merge(unaCategoria);
            }
            if (unaMarca != null) {
                unaMarca.getProductos().add(producto);
                unaMarca = em.merge(unaMarca);
            }
            for (Entrada entradasEntrada : producto.getEntradas()) {
                Producto oldUnProductoOfEntradasEntrada = entradasEntrada.getUnProducto();
                entradasEntrada.setUnProducto(producto);
                entradasEntrada = em.merge(entradasEntrada);
                if (oldUnProductoOfEntradasEntrada != null) {
                    oldUnProductoOfEntradasEntrada.getEntradas().remove(entradasEntrada);
                    oldUnProductoOfEntradasEntrada = em.merge(oldUnProductoOfEntradasEntrada);
                }
            }
            for (Detalle_Venta listaDetallesVentasDetalle_Venta : producto.getListaDetallesVentas()) {
                Producto oldProductoOfListaDetallesVentasDetalle_Venta = listaDetallesVentasDetalle_Venta.getProducto();
                listaDetallesVentasDetalle_Venta.setProducto(producto);
                listaDetallesVentasDetalle_Venta = em.merge(listaDetallesVentasDetalle_Venta);
                if (oldProductoOfListaDetallesVentasDetalle_Venta != null) {
                    oldProductoOfListaDetallesVentasDetalle_Venta.getListaDetallesVentas().remove(listaDetallesVentasDetalle_Venta);
                    oldProductoOfListaDetallesVentasDetalle_Venta = em.merge(oldProductoOfListaDetallesVentasDetalle_Venta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getId());
            Proveedor unProveedorOld = persistentProducto.getUnProveedor();
            Proveedor unProveedorNew = producto.getUnProveedor();
            Categoria unaCategoriaOld = persistentProducto.getUnaCategoria();
            Categoria unaCategoriaNew = producto.getUnaCategoria();
            Marca unaMarcaOld = persistentProducto.getUnaMarca();
            Marca unaMarcaNew = producto.getUnaMarca();
            List<Entrada> entradasOld = persistentProducto.getEntradas();
            List<Entrada> entradasNew = producto.getEntradas();
            List<Detalle_Venta> listaDetallesVentasOld = persistentProducto.getListaDetallesVentas();
            List<Detalle_Venta> listaDetallesVentasNew = producto.getListaDetallesVentas();
            if (unProveedorNew != null) {
                unProveedorNew = em.getReference(unProveedorNew.getClass(), unProveedorNew.getId());
                producto.setUnProveedor(unProveedorNew);
            }
            if (unaCategoriaNew != null) {
                unaCategoriaNew = em.getReference(unaCategoriaNew.getClass(), unaCategoriaNew.getId());
                producto.setUnaCategoria(unaCategoriaNew);
            }
            if (unaMarcaNew != null) {
                unaMarcaNew = em.getReference(unaMarcaNew.getClass(), unaMarcaNew.getId());
                producto.setUnaMarca(unaMarcaNew);
            }
            List<Entrada> attachedEntradasNew = new ArrayList<Entrada>();
            for (Entrada entradasNewEntradaToAttach : entradasNew) {
                entradasNewEntradaToAttach = em.getReference(entradasNewEntradaToAttach.getClass(), entradasNewEntradaToAttach.getId());
                attachedEntradasNew.add(entradasNewEntradaToAttach);
            }
            entradasNew = attachedEntradasNew;
            producto.setEntradas(entradasNew);
            List<Detalle_Venta> attachedListaDetallesVentasNew = new ArrayList<Detalle_Venta>();
            for (Detalle_Venta listaDetallesVentasNewDetalle_VentaToAttach : listaDetallesVentasNew) {
                listaDetallesVentasNewDetalle_VentaToAttach = em.getReference(listaDetallesVentasNewDetalle_VentaToAttach.getClass(), listaDetallesVentasNewDetalle_VentaToAttach.getIdDetalle());
                attachedListaDetallesVentasNew.add(listaDetallesVentasNewDetalle_VentaToAttach);
            }
            listaDetallesVentasNew = attachedListaDetallesVentasNew;
            producto.setListaDetallesVentas(listaDetallesVentasNew);
            producto = em.merge(producto);
            if (unProveedorOld != null && !unProveedorOld.equals(unProveedorNew)) {
                unProveedorOld.getProductos().remove(producto);
                unProveedorOld = em.merge(unProveedorOld);
            }
            if (unProveedorNew != null && !unProveedorNew.equals(unProveedorOld)) {
                unProveedorNew.getProductos().add(producto);
                unProveedorNew = em.merge(unProveedorNew);
            }
            if (unaCategoriaOld != null && !unaCategoriaOld.equals(unaCategoriaNew)) {
                unaCategoriaOld.getProductos().remove(producto);
                unaCategoriaOld = em.merge(unaCategoriaOld);
            }
            if (unaCategoriaNew != null && !unaCategoriaNew.equals(unaCategoriaOld)) {
                unaCategoriaNew.getProductos().add(producto);
                unaCategoriaNew = em.merge(unaCategoriaNew);
            }
            if (unaMarcaOld != null && !unaMarcaOld.equals(unaMarcaNew)) {
                unaMarcaOld.getProductos().remove(producto);
                unaMarcaOld = em.merge(unaMarcaOld);
            }
            if (unaMarcaNew != null && !unaMarcaNew.equals(unaMarcaOld)) {
                unaMarcaNew.getProductos().add(producto);
                unaMarcaNew = em.merge(unaMarcaNew);
            }
            for (Entrada entradasOldEntrada : entradasOld) {
                if (!entradasNew.contains(entradasOldEntrada)) {
                    entradasOldEntrada.setUnProducto(null);
                    entradasOldEntrada = em.merge(entradasOldEntrada);
                }
            }
            for (Entrada entradasNewEntrada : entradasNew) {
                if (!entradasOld.contains(entradasNewEntrada)) {
                    Producto oldUnProductoOfEntradasNewEntrada = entradasNewEntrada.getUnProducto();
                    entradasNewEntrada.setUnProducto(producto);
                    entradasNewEntrada = em.merge(entradasNewEntrada);
                    if (oldUnProductoOfEntradasNewEntrada != null && !oldUnProductoOfEntradasNewEntrada.equals(producto)) {
                        oldUnProductoOfEntradasNewEntrada.getEntradas().remove(entradasNewEntrada);
                        oldUnProductoOfEntradasNewEntrada = em.merge(oldUnProductoOfEntradasNewEntrada);
                    }
                }
            }
            for (Detalle_Venta listaDetallesVentasOldDetalle_Venta : listaDetallesVentasOld) {
                if (!listaDetallesVentasNew.contains(listaDetallesVentasOldDetalle_Venta)) {
                    listaDetallesVentasOldDetalle_Venta.setProducto(null);
                    listaDetallesVentasOldDetalle_Venta = em.merge(listaDetallesVentasOldDetalle_Venta);
                }
            }
            for (Detalle_Venta listaDetallesVentasNewDetalle_Venta : listaDetallesVentasNew) {
                if (!listaDetallesVentasOld.contains(listaDetallesVentasNewDetalle_Venta)) {
                    Producto oldProductoOfListaDetallesVentasNewDetalle_Venta = listaDetallesVentasNewDetalle_Venta.getProducto();
                    listaDetallesVentasNewDetalle_Venta.setProducto(producto);
                    listaDetallesVentasNewDetalle_Venta = em.merge(listaDetallesVentasNewDetalle_Venta);
                    if (oldProductoOfListaDetallesVentasNewDetalle_Venta != null && !oldProductoOfListaDetallesVentasNewDetalle_Venta.equals(producto)) {
                        oldProductoOfListaDetallesVentasNewDetalle_Venta.getListaDetallesVentas().remove(listaDetallesVentasNewDetalle_Venta);
                        oldProductoOfListaDetallesVentasNewDetalle_Venta = em.merge(oldProductoOfListaDetallesVentasNewDetalle_Venta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = producto.getId();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            Proveedor unProveedor = producto.getUnProveedor();
            if (unProveedor != null) {
                unProveedor.getProductos().remove(producto);
                unProveedor = em.merge(unProveedor);
            }
            Categoria unaCategoria = producto.getUnaCategoria();
            if (unaCategoria != null) {
                unaCategoria.getProductos().remove(producto);
                unaCategoria = em.merge(unaCategoria);
            }
            Marca unaMarca = producto.getUnaMarca();
            if (unaMarca != null) {
                unaMarca.getProductos().remove(producto);
                unaMarca = em.merge(unaMarca);
            }
            List<Entrada> entradas = producto.getEntradas();
            for (Entrada entradasEntrada : entradas) {
                entradasEntrada.setUnProducto(null);
                entradasEntrada = em.merge(entradasEntrada);
            }
            List<Detalle_Venta> listaDetallesVentas = producto.getListaDetallesVentas();
            for (Detalle_Venta listaDetallesVentasDetalle_Venta : listaDetallesVentas) {
                listaDetallesVentasDetalle_Venta.setProducto(null);
                listaDetallesVentasDetalle_Venta = em.merge(listaDetallesVentasDetalle_Venta);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Producto findProducto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
