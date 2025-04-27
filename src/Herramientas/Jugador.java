package Herramientas;

import Personajes.Personaje;

public class Jugador extends Usuario {
    private Personaje personaje;


    public Jugador() {
        this.herramientas = new HerramientasDeJugador(this);
    }

    public Personaje getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

}