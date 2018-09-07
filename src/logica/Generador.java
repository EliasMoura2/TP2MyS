
package logica;

import java.util.LinkedList;
import java.util.List;


public class Generador {
//-------------------------------Atributos--------------------------------------
    //private int id;
    private int cantidadNumerosGenerar = 20000;
    double modulo;
    double multiplicador;
    double incremento;
    double semilla;
    List <Double> valoresGeneradosNoEstandarizados = new LinkedList();
    List <Double> valoresGeneradosEstandarizados = new LinkedList();
    List <Double> semillas = new LinkedList();
//-----------------------------Constructores------------------------------------
public Generador (){}
    
public Generador(int modulo, int multiplicador, int incremento, int semilla) {
        this.modulo = modulo;
        this.multiplicador = multiplicador;
        this.incremento = incremento;
        this.semilla = semilla;
        correrGeneradorLineal();
        
}

public Generador(int modulo, int multiplicador, int semilla) {
        this.modulo = modulo;
        this.multiplicador = multiplicador;
        this.semilla = semilla;
        correrGeneradorMultiplicativo();
}
//-------------------------------Metodos----------------------------------------
    public void correrGeneradorLineal() {
        double valor;
        //semillas.add(semilla);
        for(int i=0; i<cantidadNumerosGenerar; i++){
            valor = GCL();
            semillas.add(valor);
            valoresGeneradosNoEstandarizados.add(valor);
            valoresGeneradosEstandarizados.add(estandarizar(valor));
        }
    }
        
    public double GCL(){
        double retorno;
        retorno = (this.semilla * this.multiplicador + this.incremento) % this.modulo;
        this.semilla = retorno;
        return retorno;
    }
    
    public void correrGeneradorMultiplicativo() {
        double valor;
        for(int i=0; i<cantidadNumerosGenerar; i++){
            valor = GCL();
            valoresGeneradosNoEstandarizados.add(valor);
            valoresGeneradosEstandarizados.add(estandarizar(valor));
        }
    }
        
    public double GCM(){
        double retorno;
        retorno = (this.semilla * this.multiplicador ) % this.modulo;
        this.semilla = retorno;
        return retorno;
    }
        
    private double estandarizar(double valor){
        double estandarizado = valor/this.modulo;
        return estandarizado;
    }

//--------------------------Getters and Setters---------------------------------

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public double getSemilla() {
        return semilla;
    }

    public void setSemilla(double semilla) {
        this.semilla = semilla;
    }

    public List<Double> getValoresGeneradosNoEstandarizados() {
        return valoresGeneradosNoEstandarizados;
    }

    public void setValoresGeneradosNoEstandarizados(List<Double> valoresGeneradosNoEstandarizados) {
        this.valoresGeneradosNoEstandarizados = valoresGeneradosNoEstandarizados;
    }

    public List<Double> getValoresGeneradosEstandarizados() {
        return valoresGeneradosEstandarizados;
    }

    public void setValoresGeneradosEstandarizados(List<Double> valoresGeneradosEstandarizados) {
        this.valoresGeneradosEstandarizados = valoresGeneradosEstandarizados;
    }
    
}