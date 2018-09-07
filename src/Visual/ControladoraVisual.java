package Visual;

import static java.awt.Frame.MAXIMIZED_BOTH;
import logica.ControladoraLogica;
import logica.Generador;
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

    public Generador altaGenerador(int modulo, int multiplicador, int semilla) throws Exception {
        return this.miLogica.altaGenerador(modulo, multiplicador, semilla);
    }
}

  
