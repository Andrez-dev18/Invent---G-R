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
import logica.Rol;
import logica.venta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author sergi
 */
public class UsuarioJpaController implements Serializable {

    public UsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public UsuarioJpaController() {
        emf = Persistence.createEntityManagerFactory("inventarioPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) throws PreexistingEntityException, Exception {
        if (usuario.getVenta() == null) {
            usuario.setVenta(new ArrayList<venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol unRol = usuario.getUnRol();
            if (unRol != null) {
                unRol = em.getReference(unRol.getClass(), unRol.getId());
                usuario.setUnRol(unRol);
            }
            List<venta> attachedVenta = new ArrayList<venta>();
            for (venta ventaventaToAttach : usuario.getVenta()) {
                ventaventaToAttach = em.getReference(ventaventaToAttach.getClass(), ventaventaToAttach.getIdventa());
                attachedVenta.add(ventaventaToAttach);
            }
            usuario.setVenta(attachedVenta);
            em.persist(usuario);
            if (unRol != null) {
                unRol.getListaUsuarios().add(usuario);
                unRol = em.merge(unRol);
            }
            for (venta ventaventa : usuario.getVenta()) {
                Usuario oldUnUsuarioOfVentaventa = ventaventa.getUnUsuario();
                ventaventa.setUnUsuario(usuario);
                ventaventa = em.merge(ventaventa);
                if (oldUnUsuarioOfVentaventa != null) {
                    oldUnUsuarioOfVentaventa.getVenta().remove(ventaventa);
                    oldUnUsuarioOfVentaventa = em.merge(oldUnUsuarioOfVentaventa);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUsuario(usuario.getId()) != null) {
                throw new PreexistingEntityException("Usuario " + usuario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario persistentUsuario = em.find(Usuario.class, usuario.getId());
            Rol unRolOld = persistentUsuario.getUnRol();
            Rol unRolNew = usuario.getUnRol();
            List<venta> ventaOld = persistentUsuario.getVenta();
            List<venta> ventaNew = usuario.getVenta();
            if (unRolNew != null) {
                unRolNew = em.getReference(unRolNew.getClass(), unRolNew.getId());
                usuario.setUnRol(unRolNew);
            }
            List<venta> attachedVentaNew = new ArrayList<venta>();
            for (venta ventaNewventaToAttach : ventaNew) {
                ventaNewventaToAttach = em.getReference(ventaNewventaToAttach.getClass(), ventaNewventaToAttach.getIdventa());
                attachedVentaNew.add(ventaNewventaToAttach);
            }
            ventaNew = attachedVentaNew;
            usuario.setVenta(ventaNew);
            usuario = em.merge(usuario);
            if (unRolOld != null && !unRolOld.equals(unRolNew)) {
                unRolOld.getListaUsuarios().remove(usuario);
                unRolOld = em.merge(unRolOld);
            }
            if (unRolNew != null && !unRolNew.equals(unRolOld)) {
                unRolNew.getListaUsuarios().add(usuario);
                unRolNew = em.merge(unRolNew);
            }
            for (venta ventaOldventa : ventaOld) {
                if (!ventaNew.contains(ventaOldventa)) {
                    ventaOldventa.setUnUsuario(null);
                    ventaOldventa = em.merge(ventaOldventa);
                }
            }
            for (venta ventaNewventa : ventaNew) {
                if (!ventaOld.contains(ventaNewventa)) {
                    Usuario oldUnUsuarioOfVentaNewventa = ventaNewventa.getUnUsuario();
                    ventaNewventa.setUnUsuario(usuario);
                    ventaNewventa = em.merge(ventaNewventa);
                    if (oldUnUsuarioOfVentaNewventa != null && !oldUnUsuarioOfVentaNewventa.equals(usuario)) {
                        oldUnUsuarioOfVentaNewventa.getVenta().remove(ventaNewventa);
                        oldUnUsuarioOfVentaNewventa = em.merge(oldUnUsuarioOfVentaNewventa);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = usuario.getId();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
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
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            Rol unRol = usuario.getUnRol();
            if (unRol != null) {
                unRol.getListaUsuarios().remove(usuario);
                unRol = em.merge(unRol);
            }
            List<venta> venta = usuario.getVenta();
            for (venta ventaventa : venta) {
                ventaventa.setUnUsuario(null);
                ventaventa = em.merge(ventaventa);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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

    public Usuario findUsuario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
