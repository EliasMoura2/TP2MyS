package logica;

/**
 *
 * @author elias
 */
import Visual.ControladoraVisual;
import java.util.LinkedList;
import java.util.List;
public class ControladoraLogica {

    /**
     * @param args the command line arguments
     */
        private int cantidadNumerosGenerar = 20000;
    List <Double> valoresGeneradosNoEstandarizados = new LinkedList();
    List <Double> valoresGeneradosEstandarizados = new LinkedList();
    
    double modulo;
    double multiplicador;
    double incremento;
    double semilla;
    
    public static void main(String[] args) {
        ControladoraVisual miVisual = new ControladoraVisual(); 
        miVisual.crearMenu();
    }

        
    public void setearGenerador(double semilla, double incremento, double multiplicador, double modulo, int generadorSeleccionado) throws Exception{
        this.semilla = semilla;
        this.incremento = incremento;
        this.multiplicador = multiplicador;
        this.modulo = modulo;
        correrGenerador();
        //this.generadorSeleccionado = generadorSeleccionado;
        //this.validarVariablesGenerador();
        //this.indiceValoresGenerados=0;
    }

    public void correrGenerador() {
        double valor;
        for(int i=0; i<cantidadNumerosGenerar; i++){
            valor = GCL();
            valoresGeneradosNoEstandarizados.add(valor);
            valoresGeneradosEstandarizados.add(estandarizar(valor));
        }
    }
        
    public double GCL(){
        double retorno;
        retorno = (semilla * multiplicador + incremento) % modulo;
        semilla = retorno;
        return retorno;
    }
        
    private double estandarizar(double valor){
        double estandarizado = valor/this.modulo;
        return estandarizado;
    }
    
}
