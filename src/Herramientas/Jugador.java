package Herramientas;

import Personajes.Personaje;

public class Jugador extends Usuario {
    private Personaje personaje;
    private boolean block;


    public Jugador(String name, String pass) {
        this.block = false;
        this.userName = name;
        this.password = pass;
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

    @Override
    public boolean equals(Object o){
        if (o == null)
            return false;
        else if (o instanceof Jugador){
            if (o == this)
                return true;
            else
                return ((Jugador) o).getUserName().equals(this.getUserName()) && ((Jugador) o).getPassword().equals(this.getPassword());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.userName.hashCode() + this.password.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Jugador){
            if (this.personaje.getOro() == ((Jugador) o).getPersonaje().getOro())
                return 0;
            else if (this.personaje.getOro() < ((Jugador) o).getPersonaje().getOro())
                return 1;
            else
                return -1;
        }
        return 0;
    }


}