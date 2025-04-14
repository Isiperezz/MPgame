package Personajes;
import SistemaPersistencia.Equipamiento;

import java.util.*;

public class Arma implements Equipamiento {

    private String nombreArma;
    private boolean dosManos;
    private int modificadorAtaque;
    private int modificadorDefensa;

    public boolean esDosManos() {

        return this.dosManos;
    }

    public int getModAtaque() {

        return this.modificadorAtaque;
    }

    public int getModDefensa() {

        return this.modificadorDefensa;
    }

    public boolean tieneModDefensa() {

        return this.modificadorDefensa != 0;
    }

    public Arma clone() {

        return null;
    }

    public Equipamiento clone() {

        return null;
    }

}