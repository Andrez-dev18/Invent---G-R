package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Producto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-19T18:52:37", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Entrada.class)
public class Entrada_ { 

    public static volatile SingularAttribute<Entrada, Date> FechaEntrada;
    public static volatile SingularAttribute<Entrada, Producto> unProducto;
    public static volatile SingularAttribute<Entrada, Integer> stockEntrada;
    public static volatile SingularAttribute<Entrada, Double> precioCompra;
    public static volatile SingularAttribute<Entrada, Integer> id;

}