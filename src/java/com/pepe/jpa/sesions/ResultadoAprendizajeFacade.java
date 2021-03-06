/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pepe.jpa.sesions;

import com.pepe.jpa.entities.Competencia;
import com.pepe.jpa.entities.ResultadoAprendizaje;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ADSI TARDE
 */
@Stateless
public class ResultadoAprendizajeFacade extends AbstractFacade<ResultadoAprendizaje> {

    @PersistenceContext(unitName = "pepeAplicacionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResultadoAprendizajeFacade() {
        super(ResultadoAprendizaje.class);
    }
//@NamedQuery(name = "ResultadoAprendizaje.consultaRA", query = "SELECT r FROM ResultadoAprendizaje r WHERE r.idCompetencia.idCompetencia = :idCompetencia AND r.estado = 1"),
    public List<ResultadoAprendizaje> consulta(Competencia c) {
        Query q = getEntityManager().createNamedQuery("ResultadoAprendizaje.consultaRA");
        q.setParameter("idCompetencia", c.getIdCompetencia());
        try {
            return q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<ResultadoAprendizaje> consulta() {
        Query q = getEntityManager().createNamedQuery("ResultadoAprendizaje.consultaRA1");
        q.setParameter("idEstado", true);
        try {
            return q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
