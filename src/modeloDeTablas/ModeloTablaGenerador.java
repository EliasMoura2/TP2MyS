
package modeloDeTablas;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import logica.Generador;

/**
 *
 * @author elias
 */
public class ModeloTablaGenerador extends AbstractTableModel {
    private String[] nombreColumnas = {"n","semilla","valor sin estandarizar","valor estandarizado"};
    private Object[][] datos;
    
    public ModeloTablaGenerador(Generador unGenerador, List<Double> semillas, List <Double> valoresNoEstandarizados, List <Double> valoresEstandarizados){
        //DecimalFormat f = new DecimalFormat ("##.00");
        //double subtotal=0;
        datos = new Object[semillas.size()][nombreColumnas.length];
        for (int i=0;i<semillas.size();i++){
            this.datos[i][0]=String.valueOf(i);
            this.datos[i][1]=String.valueOf(semillas.get(i).doubleValue());
            this.datos[i][2]=String.valueOf(valoresNoEstandarizados.get(i).doubleValue());
            this.datos[i][3]=String.valueOf(valoresEstandarizados.get(i).doubleValue());
        }
    }
    
    public ModeloTablaGenerador(){
    }

    @Override
    public int getRowCount() {
        return datos.length;
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datos[rowIndex][columnIndex]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override 
    public String getColumnName(int column){
    return this.nombreColumnas[column];
    }
}
