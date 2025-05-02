package Herramientas;

import Personajes.Personaje;

public class Jugador extends Usuario {
    private Personaje personaje;
    private boolean block;


    public Jugador(boolean block) {
        this.block = block;
        this.herramientas = new HerramientasDeJugador(this);
    }

    public Jugador() { }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public Personaje getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
        ((HerramientasDeJugador) this.herramientas).getGestorEquipamiento().setPersonaje(personaje);
    }


}