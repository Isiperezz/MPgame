package Personajes;

import SistemaPersistencia.Equipamiento;

public class Armadura implements Equipamiento {

    private String nombreArmadura;
    private int modificadorDefensa = 0;
    private int modificadorAtaque = 0;

    public int getModDefensa() {

        return this.modificadorDefensa;
    }

    public int getModAtaque() {

        return this.modificadorAtaque;
    }

    public boolean tieneModAtaque() {

        return this.modificadorAtaque != 0;
    }


    public Equipamiento clone() {

        return null;
    }

}