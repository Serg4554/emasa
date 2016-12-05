/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.facade;

import entity.ejb.Aviso;
import java.sql.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nacho
 */
@Stateless
public class AvisoFacade extends AbstractFacade<Aviso> {

    @PersistenceContext(unitName = "Emasa-Soap-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AvisoFacade() {
        super(Aviso.class);
    }

    public List<Aviso> findAvisoPorUsuario(String s) {
        Query q;
        q = em.createNamedQuery("Aviso.findByUsuario");
        q.setParameter("param", s);
        List<Aviso> salida = null;
        try {
            salida = (List<Aviso>) q.getResultList();
        } catch (NoResultException e) {
            salida = null;
        }
        return salida;

    }

    public List<Aviso> findAvisoPorEstado(String s) {
        Query q;
        q = em.createNamedQuery("Aviso.findByEstado");
        q.setParameter("estado", s);
        List<Aviso> salida = null;
        try {
            salida = (List<Aviso>) q.getResultList();
        } catch (NoResultException e) {
            salida = null;
        }
        return salida;

    }

    public List<Aviso> findAvisoPorTipo(String s) {
        Query q;
        q = em.createNamedQuery("Aviso.findByTipo");
        q.setParameter("tipo", s);
        List<Aviso> salida = null;
        try {
            salida = (List<Aviso>) q.getResultList();
        } catch (NoResultException e) {
            salida = null;
        }
        return salida;

    }

    public List<Aviso> findAvisoPorPrioridad(int s) {
        Query q;
        q = em.createNamedQuery("Aviso.findByPrioridad");
        q.setParameter("prioridad", s);
        List<Aviso> salida = null;
        try {
            salida = (List<Aviso>) q.getResultList();
        } catch (NoResultException e) {
            salida = null;
        }
        return salida;
    }

    public List<Aviso> findAvisoEntre(Date fecha1, Date fecha2) {
        Query q;
        q = em.createNamedQuery("Aviso.findByMargen");
        q.setParameter("fecha1", fecha1);
        q.setParameter("fecha2", fecha2);
        List<Aviso> salida = null;
        try {
            salida = (List<Aviso>) q.getResultList();
        } catch (NoResultException e) {
            salida = null;
        }
        return salida;
    }

}
