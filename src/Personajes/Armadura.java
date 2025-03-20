
import java.util.*;

/**
 * 
 */
public class Armadura extends Equipo implements Equipamiento {

    /**
     * Default constructor
     */
    public Armadura() {
    }

    /**
     * 
     */
    private String nombreArmadura;

    /**
     * 
     */
    private int modificadorDefensa;

    /**
     * 
     */
    private int modificadorAtaque;

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
    public int getModAtaque() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public boolean tieneModAtaque() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public Armadura clone() {
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