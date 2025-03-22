package Herramientas;

import SistemaDesafios.Desafio;
import SistemaDesafios.PendienteAceptacion;
import SistemaPersistencia.PersistenciaManager;

import java.util.*;

/**
 * 
 */
public class GestorDesafiosJugador {
    private ArrayList<Desafio> desafios;
    private boolean desafioPendiente;


    public GestorDesafiosJugador(Jugador jugador) {
        this.desafios = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getDesafiosJugador(jugador);
        this.desafioPendiente = false;
        int i = 0;
        while (!this.desafioPendiente && i < this.desafios.size()) {
            if (desafios.get(i),getEstado() instanceof PendienteAceptacion)
                this.desafioPendiente = true;
        }
    }


    public void desafiarJugador(String jugador) {
        // TODO implement here
    }

    /**
     * @param desafio Desafío
     */
    public void aceptarDesafio(Desafio desafio) {
        // TODO implement here
    }

    /**
     * 
     */
    public void mostrarDesafios() {
        // TODO implement here
    }

}