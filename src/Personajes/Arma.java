package Personajes;

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

    private String nombreArma;
    private boolean dosManos;
    private int modificadorAtaque;
    private int modificadorDefensa;

    public boolean esDosManos() {
        // TODO implement here
        return false;
    }

    public int getModAtaque() {
        // TODO implement here
        return 0;
    }

    public int getModDefensa() {
        // TODO implement here
        return 0;
    }

    public boolean tieneModDefensa() {
        // TODO implement here
        return false;
    }

    public Arma clone() {
        // TODO implement here
        return null;
    }

    public Equipamiento clone() {
        // TODO implement here
        return null;
    }

}