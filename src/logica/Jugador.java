package logica;

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
    
    
    
}
