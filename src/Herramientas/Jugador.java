package Herramientas;

import Personajes.Personaje;

public class Jugador extends Usuario {
    private Personaje personaje;

    /**
     * Default constructor
     */
    public Jugador() {
        this.herramientas = new HerramientasDeJugador(this);
    }

    public HerramientasRol getHerramientas() {
        return this.herramientas;
    }

    public Personaje getPersonaje() {
        return this.personaje;
    }

}