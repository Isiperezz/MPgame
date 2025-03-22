package Herramientas;

import java.util.*;

/**
 * 
 */
public class HerramientasDeJugador extends HerramientasRol {
    private GestorDesafiosJugador desafios;
    private GestorEquipamiento gestorEquipamiento;
    private Consultas consultas;

    /**
     * Default constructor
     */
    public HerramientasDeJugador(Jugador jugador) {
        this.desafios = new GestorDesafiosJugador(jugador);
        this.gestorEquipamiento = new GestorEquipamiento(jugador.getPersonaje());
        this.consultas = new Consultas();
    }


    public GestorDesafiosJugador getDesafios() {
        return this.desafios;
    }


    public void eliminarCuenta() {
        // TODO implement here
    }


    public void consultarCombates() {
        // TODO implement here
    }


    public void consultarRanking() {
        // TODO implement here
    }


    public void modifcarEquipamiento(Personaje personaje) {
        // TODO implement here
    }

}