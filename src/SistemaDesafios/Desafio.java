package SistemaDesafios;

import Herramientas.Jugador;

public class Desafio {
    private EstadoDesafio estado;
    private Jugador desafiante;
    private Jugador desafiado;
    private int oroApostado;
    private Combate combate;
    private boolean validado;

    public Desafio() {
    }

    public EstadoDesafio getEstado() {
        return this.estado;
    }
    
    public void setEstado(EstadoDesafio estado) {
        this.estado = estado;
    }

    /**
     * 
     */
    public void avanzarEstado() {
        // TODO implement here
    }

    /**
     * 
     */
    public void iniciarCombate() {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean estaValidado() {
        // TODO implement here
        return false;
    }

    /**
     * 
     */
    public void validarDesafio() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Jugador getDesafiado() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Jugador getDesafiante() {
        // TODO implement here
        return null;
    }

}