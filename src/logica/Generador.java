package logica;

import java.util.LinkedList;
import java.util.List;

public class Generador {
//-------------------------------Atributos--------------------------------------
    //private int id;
    private int cantidadNumerosGenerar = 20;
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
        correrGeneradorMultiplicativo(modulo, multiplicador, semilla);  
}
//-------------------------------Metodos----------------------------------------
    public void correrGeneradorLineal() {
        int Xn =this.semilla;
        semillas.add(this.semilla);
        //System.out.printf("la primer semilla es: %d\n",Xn);
        for(int i=0; i<cantidadNumerosGenerar; i++){
            Xn= GCL();
            //System.out.printf("la siguiente semillas es: %d\n",Xn);
            valoresGeneradosNoEstandarizados.add(Xn);
            valoresGeneradosEstandarizados.add(estandarizar(Xn, this.modulo));
            semillas.add(Xn);
        }
    }
        
    public int GCL(){
        int Xn;
        Xn = (this.semilla * this.multiplicador + this.incremento) % this.modulo;
        this.semilla = Xn;
        return Xn;
    }
    
    public void correrGeneradorMultiplicativo(int modulo, int multiplicador, int semilla) {
        int Xn;
        semillas.add(semilla);
        for(int i=0; i<cantidadNumerosGenerar; i++){
            Xn= GCM(modulo, multiplicador, semilla);
            valoresGeneradosNoEstandarizados.add(Xn);
            valoresGeneradosEstandarizados.add(estandarizar(Xn, modulo));
            semillas.add(Xn);
        }
    }
        
    public int GCM(int modulo, int multiplicador, int semilla){
        int Xn;
        Xn = (semilla * multiplicador ) % modulo;
        semilla = Xn;
        return Xn;
    }
        
    private double estandarizar(int Xn, int modulo){
        double estandarizado = (double) Xn / modulo;
        //System.out.printf("el estandarizado es: %f\n",estandarizado);
        return estandarizado;
    }

//--------------------------Getters and Setters---------------------------------

    public double getModulo() {
        return this.modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public double getMultiplicador() {
        return this.multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getIncremento() {
        return this.incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public double getSemilla() {
        return this.semilla;
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

    public List<Integer> getSemillas() {
        return semillas;
    }

    public void setSemillas(List<Integer> semillas) {
        this.semillas = semillas;
    }

    
    
}