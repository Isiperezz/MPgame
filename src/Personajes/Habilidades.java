package Personajes;
import java.util.*;

/**
 * 
 */
public abstract class Habilidades {

    /**
     * Default constructor
     */
    public Habilidades() {
    }

    /**
     * 
     */
    protected String nombre;

    /**
     * 
     */
    protected int valorAtaque;

    /**
     * 
     */
    protected int valorDefensa;

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getValorAtaque() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getValorDefensa() {
        // TODO implement here
        return 0;
    }

}