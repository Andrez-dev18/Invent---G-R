package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Producto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-19T18:52:37", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, Integer> id;
    public static volatile SingularAttribute<Marca, String> nombreMarca;
    public static volatile ListAttribute<Marca, Producto> productos;

}