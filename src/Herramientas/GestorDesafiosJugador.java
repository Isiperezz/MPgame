package Herramientas;

import SistemaDesafios.Desafio;
import SistemaDesafios.PendienteAceptacion;
import SistemaPersistencia.PersistenciaManager;

import java.util.*;

public class GestorDesafiosJugador {
    private final ArrayList<Desafio> desafios;
    private boolean desafioPendiente;
    private final Jugador jugador;


    public GestorDesafiosJugador(Jugador jugador) {
        this.jugador = jugador;
        this.desafios = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getDesafiosJugador(jugador);
        this.desafioPendiente = false;
        int i = 0;
        while (!this.desafioPendiente && i < this.desafios.size()) {
            if (desafios.get(i).getEstado() instanceof PendienteAceptacion)
                this.desafioPendiente = true;
        }
    }


    public void desafiarJugador(String jugadorDesafiado, int oro) {
        Jugador desafiado = (Jugador)PersistenciaManager.getInstance().getPersistencia().getUsersData().getUsuarioByNick(jugadorDesafiado);
        Desafio desafio = new Desafio(this.jugador, desafiado, oro);
        PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().aniadirDesafio(this.jugador, desafio);
        PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().aniadirDesafio(desafiado, desafio);
    }

    /**
     * @param desafio Desafío
     */
    public void aceptarDesafio(Desafio desafio) {
        if (this.desafioPendiente && desafio.getEstado() instanceof PendienteAceptacion){
            desafio.avanzarEstado();
        }

    }

    public void mostrarDesafios() {
        for (Desafio desafio : this.desafios) {
            if (desafio.getEstado() instanceof PendienteAceptacion){
                System.out.println(desafio.toString());
            }
        }
    }

}