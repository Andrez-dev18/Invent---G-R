package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Cliente;
import logica.Detalle_Venta;
import logica.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-19T18:52:37", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(venta.class)
public class venta_ { 

    public static volatile SingularAttribute<venta, Integer> idventa;
    public static volatile SingularAttribute<venta, Double> cambio;
    public static volatile SingularAttribute<venta, Usuario> unUsuario;
    public static volatile ListAttribute<venta, Detalle_Venta> listaDetallesVentas;
    public static volatile SingularAttribute<venta, Double> precioUntiario;
    public static volatile SingularAttribute<venta, String> nomProducto;
    public static volatile SingularAttribute<venta, Double> subTotal;
    public static volatile SingularAttribute<venta, Integer> cantVenta;
    public static volatile SingularAttribute<venta, Double> importe;
    public static volatile SingularAttribute<venta, Cliente> unCliente;
    public static volatile SingularAttribute<venta, Date> fechaVenta;

}