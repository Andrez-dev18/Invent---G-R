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
import logica.venta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author sergi
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public ClienteJpaController() {
        emf = Persistence.createEntityManagerFactory("inventarioPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) throws PreexistingEntityException, Exception {
        if (cliente.getVenta() == null) {
            cliente.setVenta(new ArrayList<venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<venta> attachedVenta = new ArrayList<venta>();
            for (venta ventaventaToAttach : cliente.getVenta()) {
                ventaventaToAttach = em.getReference(ventaventaToAttach.getClass(), ventaventaToAttach.getIdventa());
                attachedVenta.add(ventaventaToAttach);
            }
            cliente.setVenta(attachedVenta);
            em.persist(cliente);
            for (venta ventaventa : cliente.getVenta()) {
                Cliente oldUnClienteOfVentaventa = ventaventa.getUnCliente();
                ventaventa.setUnCliente(cliente);
                ventaventa = em.merge(ventaventa);
                if (oldUnClienteOfVentaventa != null) {
                    oldUnClienteOfVentaventa.getVenta().remove(ventaventa);
                    oldUnClienteOfVentaventa = em.merge(oldUnClienteOfVentaventa);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCliente(cliente.getId()) != null) {
                throw new PreexistingEntityException("Cliente " + cliente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId());
            List<venta> ventaOld = persistentCliente.getVenta();
            List<venta> ventaNew = cliente.getVenta();
            List<venta> attachedVentaNew = new ArrayList<venta>();
            for (venta ventaNewventaToAttach : ventaNew) {
                ventaNewventaToAttach = em.getReference(ventaNewventaToAttach.getClass(), ventaNewventaToAttach.getIdventa());
                attachedVentaNew.add(ventaNewventaToAttach);
            }
            ventaNew = attachedVentaNew;
            cliente.setVenta(ventaNew);
            cliente = em.merge(cliente);
            for (venta ventaOldventa : ventaOld) {
                if (!ventaNew.contains(ventaOldventa)) {
                    ventaOldventa.setUnCliente(null);
                    ventaOldventa = em.merge(ventaOldventa);
                }
            }
            for (venta ventaNewventa : ventaNew) {
                if (!ventaOld.contains(ventaNewventa)) {
                    Cliente oldUnClienteOfVentaNewventa = ventaNewventa.getUnCliente();
                    ventaNewventa.setUnCliente(cliente);
                    ventaNewventa = em.merge(ventaNewventa);
                    if (oldUnClienteOfVentaNewventa != null && !oldUnClienteOfVentaNewventa.equals(cliente)) {
                        oldUnClienteOfVentaNewventa.getVenta().remove(ventaNewventa);
                        oldUnClienteOfVentaNewventa = em.merge(oldUnClienteOfVentaNewventa);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
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
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<venta> venta = cliente.getVenta();
            for (venta ventaventa : venta) {
                ventaventa.setUnCliente(null);
                ventaventa = em.merge(ventaventa);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
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

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
