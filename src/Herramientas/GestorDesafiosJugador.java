package Herramientas;

import SistemaDesafios.Desafio;
import SistemaDesafios.PendienteAceptacion;
import SistemaPersistencia.PersistenciaManager;

import java.util.ArrayList;
import java.util.List;

public class GestorDesafiosJugador {
    private List<Desafio> desafios;
    private Jugador jugador;


    public GestorDesafiosJugador(Jugador jugador) {
        this.jugador = jugador;
        this.desafios = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getDesafiosJugador(jugador.getUserName());

        if (this.desafios == null){
            PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().addJugador(jugador.getUserName());
            this.desafios = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getDesafiosJugador(jugador.getUserName());
        }
    }

    public GestorDesafiosJugador(){
    }

    public List<Desafio> getDesafios() {
        return desafios;
    }

    public void setDesafios(List<Desafio> desafios) {
        this.desafios = desafios;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void desafiarJugador(Jugador desafiado, int oro) {
        Desafio desafio = new Desafio(this.jugador, desafiado, oro);
        PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().aniadirDesafio(this.jugador.getUserName(), desafio);
        PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().aniadirDesafio(desafiado.getUserName(), desafio);
    }

    public void aceptarDesafio(int desafioIndex) {
        Desafio desafio = desafios.get(desafioIndex);
        if (desafio.getEstado() instanceof PendienteAceptacion){
            desafio.avanzarEstado();
        }

    }

    public void mostrarDesafiosPendientes() {
        int i = 0;
        for (Desafio desafio : this.desafios) {
            System.out.println(i);
            if (desafio.getEstado() instanceof PendienteAceptacion && desafio.getDesafiante() != this.jugador){
                System.out.println(desafio.toString());
            }
            i++;
        }
    }

    public boolean hasDesafiosPendientes() {
        for (Desafio d : this.desafios) {
            if (d.getEstado() instanceof PendienteAceptacion && d.getDesafiado() == this.jugador){
                return true;
            }
        }
        return false;
    }

    public int getNumDesafios(){
        return this.desafios.size();
    }

}