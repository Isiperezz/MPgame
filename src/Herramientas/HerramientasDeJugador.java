package Herramientas;

import Personajes.Personaje;

import java.util.*;

/**
 * 
 */
public class HerramientasDeJugador extends HerramientasRol {
    private Jugador user;
    private GestorDesafiosJugador desafios;
    private GestorEquipamiento gestorEquipamiento;
    private Consultas consultas;


    public HerramientasDeJugador(Jugador jugador) {
        this.desafios = new GestorDesafiosJugador(jugador);
        this.gestorEquipamiento = new GestorEquipamiento(jugador.getPersonaje());
        this.consultas = new Consultas();
    }

    public HerramientasDeJugador() { }

    public Jugador getUser() {
        return user;
    }

    public void setUser(Jugador user) {
        this.user = user;
    }

    public void setDesafios(GestorDesafiosJugador desafios) {
        this.desafios = desafios;
    }

    public GestorEquipamiento getGestorEquipamiento() {
        return gestorEquipamiento;
    }

    public void setGestorEquipamiento(GestorEquipamiento gestorEquipamiento) {
        this.gestorEquipamiento = gestorEquipamiento;
    }

    public Consultas getConsultas() {
        return consultas;
    }

    public void setConsultas(Consultas consultas) {
        this.consultas = consultas;
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