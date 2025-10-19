package logica;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author sergi
 */
public class ControlExcel {

    public void exportarExcel(JTable table) throws IOException {
        if (table.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La tabla está vacía, no se puede exportar a Excel.");
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xls");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Guardar archivo");

        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = fileChooser.getSelectedFile().toString().concat(".xls");

            try (Workbook workbook = new HSSFWorkbook(); FileOutputStream fileOutputStream = new FileOutputStream(new File(ruta))) {
                Sheet sheet = workbook.createSheet("Mi hoja de trabajo 1");
                sheet.setDisplayGridlines(false);

                exportarEncabezados(table, sheet);
                exportarDatos(table, sheet);

                for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
                    sheet.autoSizeColumn(columnIndex);
                }

                workbook.write(fileOutputStream);
                fileOutputStream.close();
                Desktop.getDesktop().open(new File(ruta));
            } catch (IOException e) {
                throw e;
            }
        }
    }

    private void exportarEncabezados(JTable table, Sheet sheet) {
        Row headerRow = sheet.createRow(0);
        for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
            Cell headerCell = headerRow.createCell(columnIndex);
            headerCell.setCellValue(table.getColumnName(columnIndex));
        }
    }

    private void exportarDatos(JTable table, Sheet sheet) {
        for (int rowIndex = 0; rowIndex < table.getRowCount(); rowIndex++) {
            Row dataRow = sheet.createRow(rowIndex + 1);
            for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
                Cell dataCell = dataRow.createCell(columnIndex);

                Object cellValue = table.getValueAt(rowIndex, columnIndex);
                if (cellValue instanceof Number) {
                    dataCell.setCellValue(Double.valueOf(cellValue.toString()));
                } else {
                    dataCell.setCellValue(String.valueOf(cellValue));
                }
            }
        }
    }

    public void descargarModeloExcel(JTable table) throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xls");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Guardar modelo de archivo Excel");

        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = fileChooser.getSelectedFile().toString().concat(".xls");

            try (Workbook workbook = new HSSFWorkbook(); FileOutputStream fileOutputStream = new FileOutputStream(new File(ruta))) {
                Sheet sheet = workbook.createSheet("Mi hoja de trabajo 1");
                sheet.setDisplayGridlines(false);

                // Agregar una fila de encabezado con los nombres de las columnas de la tabla
                Row headerRow = sheet.createRow(0);
                for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
                    Cell headerCell = headerRow.createCell(columnIndex);
                    headerCell.setCellValue(table.getColumnName(columnIndex));
                }

                for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
                    sheet.autoSizeColumn(columnIndex);
                }

                workbook.write(fileOutputStream);
                fileOutputStream.close();
                Desktop.getDesktop().open(new File(ruta));
            } catch (IOException e) {
                throw e;
            }
        }
    }

}
