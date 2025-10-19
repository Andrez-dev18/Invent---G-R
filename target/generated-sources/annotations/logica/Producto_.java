package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Categoria;
import logica.Detalle_Venta;
import logica.Entrada;
import logica.Marca;
import logica.Proveedor;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-19T16:34:14", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ extends Item_ {

    public static volatile SingularAttribute<Producto, Integer> stockMinimo;
    public static volatile ListAttribute<Producto, Detalle_Venta> listaDetallesVentas;
    public static volatile SingularAttribute<Producto, Marca> unaMarca;
    public static volatile ListAttribute<Producto, Entrada> entradas;
    public static volatile SingularAttribute<Producto, Categoria> unaCategoria;
    public static volatile SingularAttribute<Producto, Proveedor> unProveedor;

}