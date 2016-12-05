/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import entity.ejb.Aviso;
import entity.facade.AvisoFacade;
import java.sql.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author nacho
 */
@WebService(serviceName = "AvisoWS")
public class AvisoWS {

    @EJB
    private AvisoFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Aviso entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Aviso entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Aviso entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Aviso find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Aviso> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Aviso> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findAvisoPorUsuario")
    public List<Aviso> findAvisoPorUsuario(@WebParam(name = "s") String s) {
        return ejbRef.findAvisoPorUsuario(s);
    }

    @WebMethod(operationName = "findAvisoPorEstado")
    public List<Aviso> findAvisoPorEstado(@WebParam(name = "s") String s) {
        return ejbRef.findAvisoPorEstado(s);
    }

    @WebMethod(operationName = "findAvisoPorTipo")
    public List<Aviso> findAvisoPorTipo(@WebParam(name = "s") String s) {
        return ejbRef.findAvisoPorTipo(s);
    }

    @WebMethod(operationName = "findAvisoPorPrioridad")
    public List<Aviso> findAvisoPorPrioridad(@WebParam(name = "s") int s) {
        return ejbRef.findAvisoPorPrioridad(s);
    }

    @WebMethod(operationName = "findAvisoEntre")
    public List<Aviso> findAvisoEntre(@WebParam(name = "fecha1") Date fecha1, @WebParam(name = "fecha2") Date fecha2) {
        return ejbRef.findAvisoEntre(fecha1, fecha2);
    }
    
}
