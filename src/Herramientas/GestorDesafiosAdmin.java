package Herramientas;

import SistemaDesafios.Desafio;
import SistemaDesafios.PendienteValidacion;
import SistemaPersistencia.PersistenciaManager;

import java.util.List;


public class GestorDesafiosAdmin {

    private final List<Desafio> desafios;
    private final List<Desafio> desafiosPendientesValidacion;

    public GestorDesafiosAdmin() {
        this.desafios = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getTodosDesafios();
        this.desafiosPendientesValidacion = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getTodosDesafíosPendientes();
    }

    public void validarDesafio(Desafio desafio) {
        if (desafio.getEstado() instanceof PendienteValidacion){
            desafio.avanzarEstado();
        }
    }

    public Desafio getDesafio(int desafioIndex){
        return desafios.get(desafioIndex);
    }

    public void mostrarDesafios() {
        int i = 0;
        for (Desafio desafio : desafios) {
            System.out.println(i);
            System.out.println(desafio.toString());
            i++;
        }
    }

    public void mostrarPendientesValidacion() {
        int i = 0;
        for (Desafio desafio : desafiosPendientesValidacion) {
            System.out.println(i);
            System.out.println(desafio.toString());
            i++;
        }
    }

}