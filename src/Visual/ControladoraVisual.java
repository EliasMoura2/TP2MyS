package Visual;

import static java.awt.Frame.MAXIMIZED_BOTH;
import logica.ControladoraLogica;

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
}

  
