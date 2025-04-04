package Herramientas;

import SistemaDesafios.Desafio;
import SistemaDesafios.PendienteValidacion;
import SistemaPersistencia.PersistenciaManager;

import java.util.ArrayList;

/**
 * 
 */
public class GestorDesafiosAdmin {

    private List<Desafio> desafios;
    private List<Desafio> desafiosPendientesValidacion

    public GestorDesafiosAdmin() {
        this.desafios = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getTodosDesafios();
        this.desafiosPendientesValidacion = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getTodosDesafíosPendientes();
    }

    public void validarDesafio(Desafio desafio) {
        if (desafio.getEstado() instanceof PendienteValidacion){
            desafio.avanzarEstado();
        }
    }

    public void getDesafio(int desafioIndex){
        return desafios.get(desafioIndex);
    }

    public void mostrarDesafios() {
        int i = 0;
        for (Desafio desafio : desafios) {
            System.out.println(i);
            System.out.println(desafio.toString());
        }
    }

}