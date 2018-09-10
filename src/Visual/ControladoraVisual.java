package Visual;

import logica.ControladoraLogica;
import logica.Generador;
import java.util.List;
/**
 *
 * @author elias
 */
public class ControladoraVisual {
    private ControladoraLogica miLogica = new ControladoraLogica();
    
    public void crearMenu() {
        MenuPrincipal miMenu = new MenuPrincipal(this);
        miMenu.setLocationRelativeTo(null);
        miMenu.show();
    }
    
    public Generador altaGenerador(int modulo, int multiplicador, int incremento, int semilla) {
        return this.miLogica.altaGenerador(modulo, multiplicador, incremento, semilla);
    }

    public Generador altaGenerador(int modulo, int multiplicador, int semilla) {
        return this.miLogica.altaGenerador(modulo, multiplicador, semilla);
    }
}

  
