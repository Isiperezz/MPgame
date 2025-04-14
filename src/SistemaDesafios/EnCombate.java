package SistemaDesafios;

public class EnCombate implements EstadoDesafio {

    public void avanzarEstado(Desafio desafio) {
        EstadoDesafio finalizado=new Finalizado();
        desafio.setEstado(finalizado);
    }



}