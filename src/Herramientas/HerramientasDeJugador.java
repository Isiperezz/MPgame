package Herramientas;

import Personajes.Personaje;

import java.util.*;

/**
 * 
 */
public class HerramientasDeJugador extends HerramientasRol {
    private final GestorDesafiosJugador desafios;
    private final GestorEquipamiento gestorEquipamiento;
    private final Consultas consultas;


    public HerramientasDeJugador(Jugador jugador) {
        this.desafios = new GestorDesafiosJugador(jugador);
        this.gestorEquipamiento = new GestorEquipamiento(jugador.getPersonaje());
        this.consultas = new Consultas();
    }

    @Override
    public void show(){
        System.out.println("1: Gestionar desafíos"+"\n"+"2: Gestionar equipamiento"+"\n"+"3: Consultas");
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