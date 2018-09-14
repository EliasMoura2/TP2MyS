package logica;

import java.util.LinkedList;

/**
 *
 * @author elias
 */
public class Jugador {
    private int numero;
    private float dinero;
    private float apuestaDinero;
    private float apuestaRonda; //Se guarda cua es la apuesta por ronda deveria se un vector
    private int numeroApuesta;
    private String colorApuesta;
    private LinkedList<Integer> secuenciaApuestasNoEstandar = new LinkedList();
    private LinkedList<Double> secuenciaApuestasEstandar = new LinkedList();
    private LinkedList<Integer> numerosApostados = new LinkedList();//numeros de 0-36  ||  37-38 color  ||  39-40 paridad
    private int indice = 0; //indice para recorrer la lista de secuenciaApuestasEstandar 

    public Jugador(int numero) {
        this.numero=numero;
    }

    public Jugador(float dinero, float apuestaDinero, float apuestaRonda, int numeroApuesta, String colorApuesta) {
        this.dinero = dinero;
        this.apuestaDinero = apuestaDinero;
        this.apuestaRonda = apuestaRonda;
        this.numeroApuesta = numeroApuesta;
        this.colorApuesta = colorApuesta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public float getApuestaDinero() {
        return apuestaDinero;
    }

    public void setApuestaDinero(float apuestaDinero) {
        this.apuestaDinero = apuestaDinero;
    }

    public float getApuestaRonda() {
        return apuestaRonda;
    }

    public void setApuestaRonda(float apuestaRonda) {
        this.apuestaRonda = apuestaRonda;
    }

    public int getNumeroApuesta() {
        return numeroApuesta;
    }

    public void setNumeroApuesta(int numeroApuesta) {
        this.numeroApuesta = numeroApuesta;
    }

    public String getColorApuesta() {
        return colorApuesta;
    }

    public void setColorApuesta(String colorApuesta) {
        this.colorApuesta = colorApuesta;
    }

    public LinkedList<Integer> getSecuenciaApuestasNoEstandar() {
        return secuenciaApuestasNoEstandar;
    }

    public void setSecuenciaApuestasNoEstandar(LinkedList<Integer> secuenciaApuestasNoEstandar) {
        this.secuenciaApuestasNoEstandar = secuenciaApuestasNoEstandar;
    }
    
    public LinkedList<Double> getSecuenciaApuestasEstandar() {
        return secuenciaApuestasEstandar;
    }

    public void setSecuenciaApuestasEstandar(LinkedList<Double> secuenciaApuestasEstandar) {
        this.secuenciaApuestasEstandar = secuenciaApuestasEstandar;
    }

    public LinkedList<Integer> getNumerosApostados() {
        return numerosApostados;
    }

    public void setNumerosApostados(LinkedList<Integer> numerosApostados) {
        this.numerosApostados = numerosApostados;
    }
    
    public int generarSemilla(int modulo, double RND){
        int retorno=1;
        modulo--;//xq segun la formula debe ser menor al modulo la semilla
        retorno = (int)((modulo-1+1)*RND+1);
        return retorno;
    }
    
    //utilizando algun valor de la secuencia generada por el usuario se obtiene la semilla para comenzar esta secuencia. 
    public void generarSecuenciaApuestasNoEstandar(int modulo, int multiplicador, int incremento, double RND){
        this.secuenciaApuestasNoEstandar.clear();
        int semilla = this.generarSemilla(modulo, RND);
        System.out.println("valor semilla "+semilla);
        for(int i = 0;i<modulo;i++){
            semilla = ((multiplicador*semilla+incremento)%modulo);
            this.secuenciaApuestasNoEstandar.add(semilla);
        }
    }
    
    public void generarSecuenciaApuestasEstandar(int modulo){
        this.secuenciaApuestasEstandar.clear();
        for(Integer aux : this.secuenciaApuestasNoEstandar){
            this.secuenciaApuestasEstandar.add(this.estandarizar(aux.intValue(), modulo));
        }
    }
    
    private double estandarizar(int Xn, int modulo){
        double estandarizado = (double) Xn / modulo;
        return estandarizado;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    

    public void generarNumerosApostados(){//carga la lista de numeros apostados
        this.numerosApostados.clear();
        for(Double aux : this.secuenciaApuestasEstandar){
            int numeroApostado = this.generarNumeroApostado(aux);
            this.numerosApostados.add(numeroApostado);
            //this.indice++; por ahora no uso este indice
        }
    }
    
    public int generarNumeroApostado(double RND){//se utiliza para cargar la lista de numeros apostados
        int retorno=1;
        retorno = (int)((40-1+1)*RND+0);//hasta 40 xq [1-36=numeros ; 37-38=rojo-negro ; 39-40=par-impar]
        return retorno;
    }
    
    /*
    
    */
    
//    public int elegirDondeApostar(){//para que determine si se quiere apostar a los numeros, color o paridad
//        int dondeApostar= (int)((3-1)*this.secuenciaApuestasEstandar.get(indice)+1);
//        indice++;
//        return dondeApostar;
//    }
    
    public int elegirMontoApuesta(double porcentaje){//para determinar cuanto dinero apostar
        int max =(int) (this.dinero*porcentaje);
        int montoApuesta =(int) ((max-1+1)*this.secuenciaApuestasEstandar.get(indice)+1);
        this.apuestaDinero=montoApuesta;
        indice++;
        return montoApuesta;
    }
       
//    public String elegirValorApuesta(/*int dondeApostar*/){//para determinar a que numero, o a que color o a que paridad apostar
//      //INCREMENTAR LOS INDICES ME PARECE QUE NO ES NECESARIO.. LO HAGO POR LAS DUDAS, DESPUES ME FIJO QUE PASA SI LO QUITO
////       int numero, paridad, color;
////       String retorno;
////        switch(dondeApostar){
////            case 1:
////                numero = (int)((36-0+1)*this.secuenciaApuestasEstandar.get(indice)+0);
////                indice++;
////                retorno = String.valueOf(numero);
////                return retorno;
////            case 2:
////                paridad = (int)((1-0+1)*this.secuenciaApuestasEstandar.get(indice)+0);//par=0 impar =1
////                indice++;
////                if(paridad==1){
////                    retorno = "Impar";
////                }else{
////                    retorno = "Par";
////                }
////                return retorno;
////            case 3:
////                color = (int)((1-0+1)*this.secuenciaApuestasEstandar.get(indice)+0);//negro=0, rojo =1
////                indice++;
////                if(color==1){
////                    retorno = "Rojo";
////                }else{
////                    retorno = "Negro";
////                }
////                return retorno;
////        }
//        return "1";
//    }
    public String evaluarApuesta(int numero){
        String retorno = "Nada que apostar?";
        if(numero >=0 && numero<=36){
            retorno = String.valueOf(numero);
        }
        if(numero==37){
            retorno="Rojo";
        }
        if(numero==38){
            retorno="Negro";
        }
        if(numero==39){
            retorno ="Par";
         }
        if(numero==40){
            retorno="Impar";
         }
        return retorno;
    }
    
//    @Override
//    public String toString(){
//        return String.valueOf(this.getDinero());
//    }
    
    /*
    
    */
//PARA HACER PRUEBAS    
    public void imprimirSecuencias(){
        System.out.println("numero jugador "+ this.numero);
        for(Integer aux:this.secuenciaApuestasNoEstandar){
            System.out.println(aux.intValue());
        }
        for(Double aux:this.secuenciaApuestasEstandar){
            System.out.println(aux.doubleValue());
        }
        for(int aux:this.numerosApostados){
            System.out.println("Numero apostado: "+aux);
            System.out.println(this.evaluarApuesta(aux));
        }
        System.out.println("------------------------------------------------------------------------");
    }
    
    
}
