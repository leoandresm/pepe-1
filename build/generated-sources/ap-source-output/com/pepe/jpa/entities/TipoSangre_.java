package com.pepe.jpa.entities;

import com.pepe.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-02-23T14:48:02")
@StaticMetamodel(TipoSangre.class)
public class TipoSangre_ { 

    public static volatile SingularAttribute<TipoSangre, Integer> idTipoSangre;
    public static volatile SingularAttribute<TipoSangre, String> nombreTipoSangre;
    public static volatile ListAttribute<TipoSangre, Usuario> usuarioList;

}