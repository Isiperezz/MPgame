package SistemaDesafios;

import Herramientas.Jugador;

import java.util.*;

public class Combate {

    private Jugador desafiante;
    private Jugador desafiado;
    private Jugador ganador;
    private int numRondas;


    public Jugador getGanador() {

        return this.ganador;
    }

    public void empezarCombate() {
        // TODO implement here
    }

    public int getNumRondas() {

        return this.numRondas;
    }

    private void calcularPotenciales() {
        int potencialDesafiante=desafiante.getPersonaje().getPoder();
        int potencialDesafiado=desafiado.getPersonaje().getPoder();


    }

}