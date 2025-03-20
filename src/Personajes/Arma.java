
import java.util.*;

/**
 * 
 */
public class Arma extends Equipo implements Equipamiento {

    /**
     * Default constructor
     */
    public Arma() {
    }

    /**
     * 
     */
    private String nombreArma;

    /**
     * 
     */
    private boolean dosManos;

    /**
     * 
     */
    private int modificadorAtaque;

    /**
     * 
     */
    private int modificadorDefensa;

    /**
     * @return
     */
    public boolean esDosManos() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public int getModAtaque() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getModDefensa() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public boolean tieneModDefensa() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public Arma clone() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Equipamiento clone() {
        // TODO implement here
        return null;
    }

}