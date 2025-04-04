package SistemaDesafios;

import Herramientas.Jugador;

public class Desafio {
    private EstadoDesafio estado;
    private final Jugador desafiante;
    private final Jugador desafiado;
    private final int oroApostado;
    private Combate combate;
    private boolean validado;

    public Desafio(Jugador desafiante, Jugador desafiado, int oro) {
        this.estado = new PendienteValidacion();
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.oroApostado = oro;
        this.validado = false;
    }

    public EstadoDesafio getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoDesafio estado) {
        this.estado = estado;
    }


    public void avanzarEstado() {
        this.estado.avanzarEstado(this);
    }


    public void iniciarCombate() {
        // TODO implement here
    }


    public boolean estaValidado() {
        // TODO implement here
        return false;
    }


    public void validarDesafio() {
        // TODO implement here
    }


    public Jugador getDesafiado() {
        // TODO implement here
        return null;
    }

    public Jugador getDesafiante() {
        // TODO implement here
        return null;
    }

    @Override
    public String toString(){
        StringBuilder desafioString = new StringBuilder();
        desafioString.append("Desafio: "+"\n");
        desafioString.append("Estado: "+this.estado.toString()+"\n");
        desafioString.append("Jugador desafiado: "+this.desafiado.getNick()+"\n");
        desafioString.append("Jugador desafiante: "+this.desafiante.getNick()+"\n");
        Integer oro = this.oroApostado;
        desafioString.append("Oro: "+oro+"\n");
        return desafioString.toString();

    }

}