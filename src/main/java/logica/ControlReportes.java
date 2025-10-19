package logica;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author sergi
 */
public class ControlReportes {    

    public String obtenerRutaRecurso(String nombreRecurso) {
        try {
            URL resourceUrl = getClass().getResource(nombreRecurso);
            if (resourceUrl != null) {
                return resourceUrl.getPath();
            } else {
                return "Recurso no encontrado";
            }
        } catch (Exception e) {
            return "Error al obtener la ruta: " + e.getMessage();
        }
    }

    public void exportarReporteJasper(List<DatosReporteVenta> datosReporteList) {
        try {
            InputStream reportStream = getClass().getResourceAsStream("/reportes/reporteDeVenta.jasper");

            Map<String, Object> params = new HashMap<>();

            JasperPrint jasperPrint;

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(datosReporteList);

            jasperPrint = JasperFillManager.fillReport(reportStream, params, dataSource);

            JOptionPane.showMessageDialog(null, "REPORTE CREADO CON ÉXITO");
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);

        } catch (JRException e) {
            System.err.println("Error al generar el informe: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void exportarReporteJasper2(List<DatosReporteVenta> datosReporteList) {
        try {
            // Cargar el archivo .jasper desde el classpath o la ruta de archivo
            InputStream reportStream = getClass().getResourceAsStream("/reportes/reporteDeVenta.jasper");

            // Convertir la lista de datos en una fuente de datos compatible con JasperReports
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(datosReporteList);

            // Llenar el informe con datos
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportStream, null, dataSource);

            // Mostrar el informe en una ventana (JasperViewer es de uso en entornos de escritorio)
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);

        } catch (JRException e) {
            //e.printStackTrace();
            // Manejo de excepciones en caso de errores al generar el informe
        }
    }

    public void exportarReporteVentaGeneral(List<DatosReporteGeneral> datosReporteList) {
        try {
            // Cargar el archivo .jasper desde el classpath o la ruta de archivo
            InputStream reportStream = getClass().getResourceAsStream("/reportes/ReporteVentaGeneral.jasper");

            // Convertir la lista de datos en una fuente de datos compatible con JasperReports
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(datosReporteList);

            // Llenar el informe con datos
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportStream, null, dataSource);

            // Mostrar el informe en una ventana (JasperViewer es de uso en entornos de escritorio)
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);

        } catch (JRException e) {
            //e.printStackTrace();
            // Manejo de excepciones en caso de errores al generar el informe
        }
    }
    
    public void exportarReporteProductos(List<DatosReporteProductos> datosReporteList) {
        try {
            // Cargar el archivo .jasper desde el classpath o la ruta de archivo
            InputStream reportStream = getClass().getResourceAsStream("/reportes/ReporteProductos.jasper");

            // Convertir la lista de datos en una fuente de datos compatible con JasperReports
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(datosReporteList);

            // Llenar el informe con datos
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportStream, null, dataSource);

            // Mostrar el informe en una ventana (JasperViewer es de uso en entornos de escritorio)
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);

        } catch (JRException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
