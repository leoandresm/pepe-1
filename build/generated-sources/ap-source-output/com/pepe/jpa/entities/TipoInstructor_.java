package com.pepe.jpa.entities;

import com.pepe.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-02-18T11:25:43")
@StaticMetamodel(TipoInstructor.class)
public class TipoInstructor_ { 

    public static volatile SingularAttribute<TipoInstructor, String> nombreTipoInstructor;
    public static volatile ListAttribute<TipoInstructor, Usuario> usuarioList;
    public static volatile SingularAttribute<TipoInstructor, Integer> idTipoInstructor;

}