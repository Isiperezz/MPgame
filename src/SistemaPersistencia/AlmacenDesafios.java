package SistemaPersistencia;

import Herramientas.Jugador;
import SistemaDesafios.Desafio;
import SistemaDesafios.PendienteAceptacion;
import SistemaDesafios.PendienteValidacion;

import java.util.*;


public class AlmacenDesafios {

    private Map <Jugador, List <Desafio>> desafios;

    public AlmacenDesafios() {
        //añadir
    }

    public List<Desafio> getTodosDesafios() {
        List<Desafio> arrDesafios = new ArrayList<>();
        for (Jugador jugador : desafios.keySet()){
            arrDesafios.addAll(desafios.get(jugador));
        }
        return arrDesafios;
    }

    public List<Desafio> getDesafiosJugador(Jugador clave) {
        return desafios.get(clave);
    }

    /**
     * @return
     */
    public List<Desafio> getTodosDesafíosPendientes() {
        List<Desafio> arrDesafios = new ArrayList<>();
        for (Jugador jugador : desafios.keySet()){
            for (Desafio desafio : desafios.get(jugador)){
                if (desafio.getEstado() instanceof PendienteValidacion){
                    arrDesafios.add(desafio);
                }
            }
        }
        return arrDesafios;
    }

    public List<Desafio> getDesafiosPendientesJugador(Jugador clave) {
        List<Desafio> arrDesafiosPendientes = new ArrayList<>();

        for (Desafio desafio : desafios.get(clave)){
            if (desafio.getEstado() instanceof PendienteAceptacion){
                arrDesafiosPendientes.add(desafio);
            }
        }
        return arrDesafiosPendientes;
    }


    public void aniadirDesafio(Jugador clave, Desafio desafio) {
        desafios.get(clave).add(desafio);
    }

}