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
    List <Integer> binarios = new LinkedList();
//Variables globales para recorrer listas
    private int indiceEstandarizado =0; //usarlo sobre la lista estandarizada... cada vez que se utilize hay que incrementarlo para que no se repitan los valores... ejemplo: valoresGeneradosEstandarizados.get(indiceEstandarizado) ---->esto retorna una copia del elemento que este en esa posicion de la lista
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
        semillas.add(this.semilla);
        //System.out.printf("la primer semilla es: %d\n",Xn);
        for(int i=0; i<cantidadNumerosGenerar; i++){
            Xn= GCL();
            //System.out.printf("la siguiente semillas es: %d\n",Xn);
            valoresGeneradosNoEstandarizados.add(Xn);
            valoresGeneradosEstandarizados.add(estandarizar(Xn, this.modulo));
            semillas.add(Xn);
        }
        cargarLBinarios();
    }
    
       
    public int GCL(){
        int Xn;
        Xn = (this.semilla * this.multiplicador + this.incremento) % this.modulo;
        this.semilla = Xn;
        return Xn;
    }     

    public void correrGeneradorMultiplicativo() {
        int Xn;
        semillas.add(this.semilla);
        for(int i=0; i<cantidadNumerosGenerar; i++){
            Xn= GCM();
            valoresGeneradosNoEstandarizados.add(Xn);
            valoresGeneradosEstandarizados.add(estandarizar(Xn, modulo));
            semillas.add(Xn);
        }
        cargarLBinarios();
    }
        
    public int GCM(){
        int Xn;
        Xn = (this.semilla * this.multiplicador ) % this.modulo;
        this.semilla = Xn;
        return Xn;
    }
        
    private double estandarizar(int Xn, int modulo){
        double estandarizado = (double) Xn / modulo;
        return estandarizado;
    }

    public void cargarLBinarios (){
        for(int i=0;i<valoresGeneradosEstandarizados.size();i++){
            if (valoresGeneradosEstandarizados.get(i)<0.5){
                binarios.add(0);
            }else{
                binarios.add(1);
            }
        }
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

    public List<Integer> getBinarios() {
        return binarios;
    }

    public void setBinarios(List<Integer> binarios) {
        this.binarios = binarios;
    }

    /*
    METODOS AGREGADOS POR CARLOS
    */
    
    public int obtenerEnteroEnRango(int max, int min, double RND){
        return (int)((max-min+1)*RND+min);
    }
    
    public int obtenerCantidadJugadores(int max, int min){
        int retorno = this.obtenerEnteroEnRango(max, min, obtenerRND());
        return retorno;
    }
    
    public double obtenerRND(){//para obtener un numero estandarizado de la lista usemos este metodo...
        double retorno=this.valoresGeneradosEstandarizados.get(this.indiceEstandarizado);
        this.indiceEstandarizado++;
        return retorno;
    }
    
    public double obtenerRNDDinero(){//para obtener un numero estandarizado de la lista usemos este metodo...
        double aux=1, retorno=1;
        boolean bandera=false;
        while(!bandera){
            aux=this.valoresGeneradosEstandarizados.get(this.indiceEstandarizado);
            if(aux<=0.4 && aux>0){
                retorno =aux;
                bandera=true;
            }
            this.indiceEstandarizado++;
        }
        return retorno;
    }
    
}