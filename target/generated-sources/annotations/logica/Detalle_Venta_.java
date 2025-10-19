package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Producto;
import logica.venta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-19T16:34:14", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Detalle_Venta.class)
public class Detalle_Venta_ { 

    public static volatile SingularAttribute<Detalle_Venta, String> numComprobante;
    public static volatile SingularAttribute<Detalle_Venta, venta> venta;
    public static volatile SingularAttribute<Detalle_Venta, Integer> idDetalle;
    public static volatile SingularAttribute<Detalle_Venta, Producto> producto;
    public static volatile SingularAttribute<Detalle_Venta, Double> montoTotal;

}