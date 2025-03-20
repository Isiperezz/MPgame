package Personajes;
import java.util.*;

/**
 * 
 */
public abstract class PersonajeFactory {

    /**
     * Default constructor
     */
    public PersonajeFactory() {
    }

    /**
     * @return
     */
    public abstract Personaje crearPersonaje();

}