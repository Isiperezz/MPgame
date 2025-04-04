package SistemaDesafios;

/**
 * 
 */
public class PendienteAceptacion implements EstadoDesafio {

    /**
     * Default constructor
     */
    public PendienteAceptacion() {
    }

    @Override
    public void avanzarEstado(Desafio desafio) {
        desafio.setEstado(new EnCombate());
    }


}