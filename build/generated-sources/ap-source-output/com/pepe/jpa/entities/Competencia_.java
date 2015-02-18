package com.pepe.jpa.entities;

import com.pepe.jpa.entities.ConocimientoConceptoPrincipios;
import com.pepe.jpa.entities.ConocimientoProceso;
import com.pepe.jpa.entities.CriteriosEvaluacion;
import com.pepe.jpa.entities.Programa;
import com.pepe.jpa.entities.ResultadoAprendizaje;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-02-18T11:25:43")
@StaticMetamodel(Competencia.class)
public class Competencia_ { 

    public static volatile SingularAttribute<Competencia, String> codigo;
    public static volatile SingularAttribute<Competencia, Short> estado;
    public static volatile SingularAttribute<Competencia, String> nombreCompetencia;
    public static volatile ListAttribute<Competencia, CriteriosEvaluacion> criteriosEvaluacionList;
    public static volatile ListAttribute<Competencia, ConocimientoProceso> conocimientoProcesoList;
    public static volatile SingularAttribute<Competencia, Integer> duracionEstimadaHoras;
    public static volatile ListAttribute<Competencia, Programa> programaList;
    public static volatile ListAttribute<Competencia, ConocimientoConceptoPrincipios> conocimientoConceptoPrincipiosList;
    public static volatile ListAttribute<Competencia, ResultadoAprendizaje> resultadoAprendizajeList;
    public static volatile SingularAttribute<Competencia, Integer> idCompetencia;

}