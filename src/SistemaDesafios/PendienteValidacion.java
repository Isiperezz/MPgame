package SistemaDesafios;

/**
 * 
 */
public class PendienteValidacion implements EstadoDesafio {

    /**
     * Default constructor
     */
    public PendienteValidacion() {
    }

    @Override
    public void avanzarEstado(Desafio desafio) {
        desafio.setEstado(new PendienteAceptacion());
    }


}