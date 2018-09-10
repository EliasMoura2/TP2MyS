package logica;

/**
 *
 * @author elias
 */
import Visual.ControladoraVisual;
import java.util.LinkedList;
import java.util.List;
public class ControladoraLogica {

//-------------------------------Relaciones-------------------------------------
private List <Generador> generadores = new LinkedList();
    
    public static void main(String[] args) {
        ControladoraVisual miVisual = new ControladoraVisual(); 
        miVisual.crearMenu();
    }

    //Creador del generador lineal
    public Generador altaGenerador(int modulo, int multiplicador, int incremento, int semilla) {
        Generador unGenerador;
            unGenerador = new Generador(modulo, multiplicador, incremento, semilla);
            generadores.add(unGenerador);
        return unGenerador;
    }
    //creador del generador multiplicativo
    public Generador altaGenerador(int modulo, int multiplicador, int semilla) {
        Generador unGenerador;
            unGenerador = new Generador(modulo, multiplicador, semilla);
            generadores.add(unGenerador);
        return unGenerador;
    }

    public List<Generador> getGeneradores() {
        return generadores;
    }

    public void setGeneradores(List<Generador> generadores) {
        this.generadores = generadores;
    }
    
    
    
}
