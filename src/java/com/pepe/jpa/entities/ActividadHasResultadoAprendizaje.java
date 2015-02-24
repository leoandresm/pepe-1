/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pepe.jpa.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADSI TARDE
 */
@Entity
@Table(name = "actividad_has_resultado_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActividadHasResultadoAprendizaje.findAll", query = "SELECT a FROM ActividadHasResultadoAprendizaje a"),
    @NamedQuery(name = "ActividadHasResultadoAprendizaje.findByIdActividad", query = "SELECT a FROM ActividadHasResultadoAprendizaje a WHERE a.actividadHasResultadoAprendizajePK.idActividad = :idActividad"),
    @NamedQuery(name = "ActividadHasResultadoAprendizaje.findByIdResultadoAprendizaje", query = "SELECT a FROM ActividadHasResultadoAprendizaje a WHERE a.actividadHasResultadoAprendizajePK.idResultadoAprendizaje = :idResultadoAprendizaje")})
public class ActividadHasResultadoAprendizaje implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActividadHasResultadoAprendizajePK actividadHasResultadoAprendizajePK;
    @JoinColumn(name = "id_resultado_aprendizaje", referencedColumnName = "id_resultado_aprendizaje", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ResultadoAprendizaje resultadoAprendizaje;
    @JoinColumn(name = "id_fase", referencedColumnName = "id_fase")
    @ManyToOne(optional = false)
    private Fase idFase;
    @JoinColumn(name = "id_actividad", referencedColumnName = "id_actividad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividad actividad;

    public ActividadHasResultadoAprendizaje() {
    }

    public ActividadHasResultadoAprendizaje(ActividadHasResultadoAprendizajePK actividadHasResultadoAprendizajePK) {
        this.actividadHasResultadoAprendizajePK = actividadHasResultadoAprendizajePK;
    }

    public ActividadHasResultadoAprendizaje(int idActividad, int idResultadoAprendizaje) {
        this.actividadHasResultadoAprendizajePK = new ActividadHasResultadoAprendizajePK(idActividad, idResultadoAprendizaje);
    }

    public ActividadHasResultadoAprendizajePK getActividadHasResultadoAprendizajePK() {
        return actividadHasResultadoAprendizajePK;
    }

    public void setActividadHasResultadoAprendizajePK(ActividadHasResultadoAprendizajePK actividadHasResultadoAprendizajePK) {
        this.actividadHasResultadoAprendizajePK = actividadHasResultadoAprendizajePK;
    }

    public ResultadoAprendizaje getResultadoAprendizaje() {
        return resultadoAprendizaje;
    }

    public void setResultadoAprendizaje(ResultadoAprendizaje resultadoAprendizaje) {
        this.resultadoAprendizaje = resultadoAprendizaje;
    }

    public Fase getIdFase() {
        return idFase;
    }

    public void setIdFase(Fase idFase) {
        this.idFase = idFase;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actividadHasResultadoAprendizajePK != null ? actividadHasResultadoAprendizajePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActividadHasResultadoAprendizaje)) {
            return false;
        }
        ActividadHasResultadoAprendizaje other = (ActividadHasResultadoAprendizaje) object;
        if ((this.actividadHasResultadoAprendizajePK == null && other.actividadHasResultadoAprendizajePK != null) || (this.actividadHasResultadoAprendizajePK != null && !this.actividadHasResultadoAprendizajePK.equals(other.actividadHasResultadoAprendizajePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pepe.jpa.entities.ActividadHasResultadoAprendizaje[ actividadHasResultadoAprendizajePK=" + actividadHasResultadoAprendizajePK + " ]";
    }
    
}