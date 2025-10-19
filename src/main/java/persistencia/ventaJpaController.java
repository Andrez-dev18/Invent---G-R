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
import logica.Cliente;
import logica.Usuario;
import logica.Detalle_Venta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.venta;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author sergi
 */
public class ventaJpaController implements Serializable {

    public ventaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public ventaJpaController() {
        emf = Persistence.createEntityManagerFactory("inventarioPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(venta venta) {
        if (venta.getListaDetallesVentas() == null) {
            venta.setListaDetallesVentas(new ArrayList<Detalle_Venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente unCliente = venta.getUnCliente();
            if (unCliente != null) {
                unCliente = em.getReference(unCliente.getClass(), unCliente.getId());
                venta.setUnCliente(unCliente);
            }
            Usuario unUsuario = venta.getUnUsuario();
            if (unUsuario != null) {
                unUsuario = em.getReference(unUsuario.getClass(), unUsuario.getId());
                venta.setUnUsuario(unUsuario);
            }
            List<Detalle_Venta> attachedListaDetallesVentas = new ArrayList<Detalle_Venta>();
            for (Detalle_Venta listaDetallesVentasDetalle_VentaToAttach : venta.getListaDetallesVentas()) {
                listaDetallesVentasDetalle_VentaToAttach = em.getReference(listaDetallesVentasDetalle_VentaToAttach.getClass(), listaDetallesVentasDetalle_VentaToAttach.getIdDetalle());
                attachedListaDetallesVentas.add(listaDetallesVentasDetalle_VentaToAttach);
            }
            venta.setListaDetallesVentas(attachedListaDetallesVentas);
            em.persist(venta);
            if (unCliente != null) {
                unCliente.getVenta().add(venta);
                unCliente = em.merge(unCliente);
            }
            if (unUsuario != null) {
                unUsuario.getVenta().add(venta);
                unUsuario = em.merge(unUsuario);
            }
            for (Detalle_Venta listaDetallesVentasDetalle_Venta : venta.getListaDetallesVentas()) {
                venta oldVentaOfListaDetallesVentasDetalle_Venta = listaDetallesVentasDetalle_Venta.getVenta();
                listaDetallesVentasDetalle_Venta.setVenta(venta);
                listaDetallesVentasDetalle_Venta = em.merge(listaDetallesVentasDetalle_Venta);
                if (oldVentaOfListaDetallesVentasDetalle_Venta != null) {
                    oldVentaOfListaDetallesVentasDetalle_Venta.getListaDetallesVentas().remove(listaDetallesVentasDetalle_Venta);
                    oldVentaOfListaDetallesVentasDetalle_Venta = em.merge(oldVentaOfListaDetallesVentasDetalle_Venta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(venta venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            venta persistentventa = em.find(venta.class, venta.getIdventa());
            Cliente unClienteOld = persistentventa.getUnCliente();
            Cliente unClienteNew = venta.getUnCliente();
            Usuario unUsuarioOld = persistentventa.getUnUsuario();
            Usuario unUsuarioNew = venta.getUnUsuario();
            List<Detalle_Venta> listaDetallesVentasOld = persistentventa.getListaDetallesVentas();
            List<Detalle_Venta> listaDetallesVentasNew = venta.getListaDetallesVentas();
            if (unClienteNew != null) {
                unClienteNew = em.getReference(unClienteNew.getClass(), unClienteNew.getId());
                venta.setUnCliente(unClienteNew);
            }
            if (unUsuarioNew != null) {
                unUsuarioNew = em.getReference(unUsuarioNew.getClass(), unUsuarioNew.getId());
                venta.setUnUsuario(unUsuarioNew);
            }
            List<Detalle_Venta> attachedListaDetallesVentasNew = new ArrayList<Detalle_Venta>();
            for (Detalle_Venta listaDetallesVentasNewDetalle_VentaToAttach : listaDetallesVentasNew) {
                listaDetallesVentasNewDetalle_VentaToAttach = em.getReference(listaDetallesVentasNewDetalle_VentaToAttach.getClass(), listaDetallesVentasNewDetalle_VentaToAttach.getIdDetalle());
                attachedListaDetallesVentasNew.add(listaDetallesVentasNewDetalle_VentaToAttach);
            }
            listaDetallesVentasNew = attachedListaDetallesVentasNew;
            venta.setListaDetallesVentas(listaDetallesVentasNew);
            venta = em.merge(venta);
            if (unClienteOld != null && !unClienteOld.equals(unClienteNew)) {
                unClienteOld.getVenta().remove(venta);
                unClienteOld = em.merge(unClienteOld);
            }
            if (unClienteNew != null && !unClienteNew.equals(unClienteOld)) {
                unClienteNew.getVenta().add(venta);
                unClienteNew = em.merge(unClienteNew);
            }
            if (unUsuarioOld != null && !unUsuarioOld.equals(unUsuarioNew)) {
                unUsuarioOld.getVenta().remove(venta);
                unUsuarioOld = em.merge(unUsuarioOld);
            }
            if (unUsuarioNew != null && !unUsuarioNew.equals(unUsuarioOld)) {
                unUsuarioNew.getVenta().add(venta);
                unUsuarioNew = em.merge(unUsuarioNew);
            }
            for (Detalle_Venta listaDetallesVentasOldDetalle_Venta : listaDetallesVentasOld) {
                if (!listaDetallesVentasNew.contains(listaDetallesVentasOldDetalle_Venta)) {
                    listaDetallesVentasOldDetalle_Venta.setVenta(null);
                    listaDetallesVentasOldDetalle_Venta = em.merge(listaDetallesVentasOldDetalle_Venta);
                }
            }
            for (Detalle_Venta listaDetallesVentasNewDetalle_Venta : listaDetallesVentasNew) {
                if (!listaDetallesVentasOld.contains(listaDetallesVentasNewDetalle_Venta)) {
                    venta oldVentaOfListaDetallesVentasNewDetalle_Venta = listaDetallesVentasNewDetalle_Venta.getVenta();
                    listaDetallesVentasNewDetalle_Venta.setVenta(venta);
                    listaDetallesVentasNewDetalle_Venta = em.merge(listaDetallesVentasNewDetalle_Venta);
                    if (oldVentaOfListaDetallesVentasNewDetalle_Venta != null && !oldVentaOfListaDetallesVentasNewDetalle_Venta.equals(venta)) {
                        oldVentaOfListaDetallesVentasNewDetalle_Venta.getListaDetallesVentas().remove(listaDetallesVentasNewDetalle_Venta);
                        oldVentaOfListaDetallesVentasNewDetalle_Venta = em.merge(oldVentaOfListaDetallesVentasNewDetalle_Venta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = venta.getIdventa();
                if (findventa(id) == null) {
                    throw new NonexistentEntityException("The venta with id " + id + " no longer exists.");
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
            venta venta;
            try {
                venta = em.getReference(venta.class, id);
                venta.getIdventa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The venta with id " + id + " no longer exists.", enfe);
            }
            Cliente unCliente = venta.getUnCliente();
            if (unCliente != null) {
                unCliente.getVenta().remove(venta);
                unCliente = em.merge(unCliente);
            }
            Usuario unUsuario = venta.getUnUsuario();
            if (unUsuario != null) {
                unUsuario.getVenta().remove(venta);
                unUsuario = em.merge(unUsuario);
            }
            List<Detalle_Venta> listaDetallesVentas = venta.getListaDetallesVentas();
            for (Detalle_Venta listaDetallesVentasDetalle_Venta : listaDetallesVentas) {
                listaDetallesVentasDetalle_Venta.setVenta(null);
                listaDetallesVentasDetalle_Venta = em.merge(listaDetallesVentasDetalle_Venta);
            }
            em.remove(venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<venta> findventaEntities() {
        return findventaEntities(true, -1, -1);
    }

    public List<venta> findventaEntities(int maxResults, int firstResult) {
        return findventaEntities(false, maxResults, firstResult);
    }

    private List<venta> findventaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(venta.class));
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

    public venta findventa(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getventaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<venta> rt = cq.from(venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
