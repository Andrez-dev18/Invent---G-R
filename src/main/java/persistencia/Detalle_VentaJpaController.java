/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Detalle_Venta;
import logica.Producto;
import logica.venta;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author sergi
 */
public class Detalle_VentaJpaController implements Serializable {

    public Detalle_VentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
        public Detalle_VentaJpaController() {
        emf = Persistence.createEntityManagerFactory("inventarioPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Venta detalle_Venta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto = detalle_Venta.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getId());
                detalle_Venta.setProducto(producto);
            }
            venta venta = detalle_Venta.getVenta();
            if (venta != null) {
                venta = em.getReference(venta.getClass(), venta.getIdventa());
                detalle_Venta.setVenta(venta);
            }
            em.persist(detalle_Venta);
            if (producto != null) {
                producto.getListaDetallesVentas().add(detalle_Venta);
                producto = em.merge(producto);
            }
            if (venta != null) {
                venta.getListaDetallesVentas().add(detalle_Venta);
                venta = em.merge(venta);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Venta detalle_Venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Detalle_Venta persistentDetalle_Venta = em.find(Detalle_Venta.class, detalle_Venta.getIdDetalle());
            Producto productoOld = persistentDetalle_Venta.getProducto();
            Producto productoNew = detalle_Venta.getProducto();
            venta ventaOld = persistentDetalle_Venta.getVenta();
            venta ventaNew = detalle_Venta.getVenta();
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getId());
                detalle_Venta.setProducto(productoNew);
            }
            if (ventaNew != null) {
                ventaNew = em.getReference(ventaNew.getClass(), ventaNew.getIdventa());
                detalle_Venta.setVenta(ventaNew);
            }
            detalle_Venta = em.merge(detalle_Venta);
            if (productoOld != null && !productoOld.equals(productoNew)) {
                productoOld.getListaDetallesVentas().remove(detalle_Venta);
                productoOld = em.merge(productoOld);
            }
            if (productoNew != null && !productoNew.equals(productoOld)) {
                productoNew.getListaDetallesVentas().add(detalle_Venta);
                productoNew = em.merge(productoNew);
            }
            if (ventaOld != null && !ventaOld.equals(ventaNew)) {
                ventaOld.getListaDetallesVentas().remove(detalle_Venta);
                ventaOld = em.merge(ventaOld);
            }
            if (ventaNew != null && !ventaNew.equals(ventaOld)) {
                ventaNew.getListaDetallesVentas().add(detalle_Venta);
                ventaNew = em.merge(ventaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = detalle_Venta.getIdDetalle();
                if (findDetalle_Venta(id) == null) {
                    throw new NonexistentEntityException("The detalle_Venta with id " + id + " no longer exists.");
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
            Detalle_Venta detalle_Venta;
            try {
                detalle_Venta = em.getReference(Detalle_Venta.class, id);
                detalle_Venta.getIdDetalle();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Venta with id " + id + " no longer exists.", enfe);
            }
            Producto producto = detalle_Venta.getProducto();
            if (producto != null) {
                producto.getListaDetallesVentas().remove(detalle_Venta);
                producto = em.merge(producto);
            }
            venta venta = detalle_Venta.getVenta();
            if (venta != null) {
                venta.getListaDetallesVentas().remove(detalle_Venta);
                venta = em.merge(venta);
            }
            em.remove(detalle_Venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Venta> findDetalle_VentaEntities() {
        return findDetalle_VentaEntities(true, -1, -1);
    }

    public List<Detalle_Venta> findDetalle_VentaEntities(int maxResults, int firstResult) {
        return findDetalle_VentaEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Venta> findDetalle_VentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Venta.class));
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

    public Detalle_Venta findDetalle_Venta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_VentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Venta> rt = cq.from(Detalle_Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
