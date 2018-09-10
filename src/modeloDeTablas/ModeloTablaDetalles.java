package modeloDeTablas;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import logica.Generador;

/**
 *
 * @author elias
 */
public class ModeloTablaDetalles extends AbstractTableModel {
    private String[] nombreColumnas = {"n","semilla","Xn+1","estandarizado"};
    private Object[][] datos;
    
    public ModeloTablaDetalles(Generador unGenerador){
        DecimalFormat f = new DecimalFormat ("0.00");
        datos = new Object[((unGenerador.getSemillas().size())-1)][nombreColumnas.length];
        for (int i=0;i<((unGenerador.getSemillas().size())-1);i++){
            this.datos[i][0]=String.valueOf(i);
            this.datos[i][1]=String.valueOf(unGenerador.getSemillas().get(i).intValue());
            this.datos[i][2]=String.valueOf(unGenerador.getValoresGeneradosNoEstandarizados().get(i).intValue());
            this.datos[i][3]=String.valueOf(f.format(unGenerador.getValoresGeneradosEstandarizados().get(i).doubleValue()));
        }
    }
    
    public ModeloTablaDetalles(){
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
