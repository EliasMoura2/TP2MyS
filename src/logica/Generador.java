package logica;

import java.util.LinkedList;
import java.util.List;

public class Generador {
//-------------------------------Atributos--------------------------------------
    //private int id;
    private int cantidadNumerosGenerar = 20000;
    int modulo;
    int multiplicador;
    int incremento;
    int semilla;
    List <Integer> valoresGeneradosNoEstandarizados = new LinkedList();
    List <Double> valoresGeneradosEstandarizados = new LinkedList();
    List <Integer> semillas = new LinkedList();
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
        int Xn;
        semillas.add(semilla);
        for(int i=0; i<cantidadNumerosGenerar; i++){
            Xn= GCL(this.modulo, this.multiplicador, this.incremento, this.semilla);
            valoresGeneradosNoEstandarizados.add(Xn);
            valoresGeneradosEstandarizados.add(estandarizar(Xn));
            semillas.add(Xn);
        }
    }
        
    public int GCL(int modulo, int multiplicador, int incremento, int semilla){
        int Xn;
        Xn = (semilla * multiplicador + incremento) % modulo;
        this.semilla = Xn;
        return Xn;
    }
    
    public void correrGeneradorMultiplicativo() {
        int Xn;
        semillas.add(semilla);
        for(int i=0; i<cantidadNumerosGenerar; i++){
            Xn= GCM(this.modulo, this.multiplicador, this.semilla);
            valoresGeneradosNoEstandarizados.add(Xn);
            valoresGeneradosEstandarizados.add(estandarizar(Xn));
            semillas.add(Xn);
        }
    }
        
    public int GCM(int modulo, int multiplicador, int semilla){
        int Xn;
        Xn = (this.semilla * this.multiplicador ) % this.modulo;
        this.semilla = Xn;
        return Xn;
    }
        
    private double estandarizar(int Xn){
        double estandarizado = Xn/this.modulo;
        return estandarizado;
    }

//--------------------------Getters and Setters---------------------------------

    public double getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public double getSemilla() {
        return semilla;
    }

    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

    public List<Integer> getValoresGeneradosNoEstandarizados() {
        return valoresGeneradosNoEstandarizados;
    }

    public void setValoresGeneradosNoEstandarizados(List<Integer> valoresGeneradosNoEstandarizados) {
        this.valoresGeneradosNoEstandarizados = valoresGeneradosNoEstandarizados;
    }

    public List<Double> getValoresGeneradosEstandarizados() {
        return valoresGeneradosEstandarizados;
    }

    public void setValoresGeneradosEstandarizados(List<Double> valoresGeneradosEstandarizados) {
        this.valoresGeneradosEstandarizados = valoresGeneradosEstandarizados;
    }
    
}