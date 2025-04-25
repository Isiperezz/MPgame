package SistemaDesafios;

import Herramientas.Jugador;
import Personajes.*;

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
        Personaje personajeDesafiado = desafiado.getPersonaje();
        // Cambiar parametros para que el if no sea tan repetitivo solo haga los calculos especificos en cada personaje
        if (personajeDesafiado instanceof Vampiro) {
            int poderBase = personajeDesafiado.getPoder();
            int poderDisciplina = ((Vampiro) personajeDesafiado).getDisciplina().getValorAtaque();
            int poderEquipos = personajeDesafiado.getArmaActiva().getModAtaque() + personajeDesafiado.getArmaduraActiva().getModAtaque();
            int valorSangre = ((Vampiro) personajeDesafiado).getPuntosSangre();
            if (valorSangre >= 5) {
                poderBase += 2;
            }
            //Cambiar a que si se cumple el if entonces calculo el poder disciplana mejor
            int costeDisciplina = ((Vampiro) personajeDesafiado).getDisciplina().getCosteSangre();
            if (valorSangre <= costeDisciplina) {
                poderDisciplina = 0;
            }

        }



    }

}