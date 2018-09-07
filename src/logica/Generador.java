
package logica;

import java.util.LinkedList;
import java.util.List;


public class Generador {
//-------------------------------Atributos--------------------------------------
    private int id;
    private int modulo;
    private int multiplicador;
    private int incremento;
    private int semilla;
    private List<Integer> Secuencia = new LinkedList();
//-----------------------------Constructores------------------------------------
public Generador (){}
    
public Generador(int id, int modulo, int multiplicador, int incremento, int semilla) {
        this.id = id;
        this.modulo = modulo;
        this.multiplicador = multiplicador;
        this.incremento = incremento;
        this.semilla = semilla;
        
}

public Generador(int id, int modulo, int multiplicador, int semilla) {
        this.id = id;
        this.modulo = modulo;
        this.multiplicador = multiplicador;
        this.semilla = semilla;
       
}


//-------------------------------Metodos----------------------------------------


    
}