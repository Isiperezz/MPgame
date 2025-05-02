package SistemaPersistencia;

import Herramientas.Jugador;
import SistemaDesafios.Desafio;
import SistemaDesafios.PendienteAceptacion;
import SistemaDesafios.PendienteValidacion;

import java.util.*;


public class AlmacenDesafios {

    private Map <Jugador, List <Desafio>> desafios;

    public void addJugador(Jugador clave) {
        this.desafios.put(clave, new ArrayList<Desafio>());
    }

    public Map<Jugador, List<Desafio>> getDesafios() {
        return desafios;
    }

    public AlmacenDesafios() {
        //añadir
    }

    public List<Desafio> getTodosDesafios() {
        List<Desafio> arrDesafios = new ArrayList<>();
        Set<Desafio> setDesafios = new HashSet<>();
        for (Jugador jugador : desafios.keySet()){
            for (Desafio desafio : desafios.get(jugador)){
                if (!setDesafios.contains(desafio)){
                    setDesafios.add(desafio);
                    arrDesafios.add(desafio);
                }
            }
        }
        return arrDesafios;
    }

    public List<Desafio> getDesafiosJugador(Jugador clave) {
        return desafios.get(clave);
    }

    public void setDesafios(Map<Jugador, List<Desafio>> desafios) {
        this.desafios = desafios;
    }


    /**
     * @return
     */
    public List<Desafio> getTodosDesafíosPendientes() {
        List<Desafio> arrDesafios = new ArrayList<>();
        Set<Desafio> setDesafios = new HashSet<>();
        for (Jugador jugador : desafios.keySet()){
            for (Desafio desafio : desafios.get(jugador)){
                if (desafio.getEstado() instanceof PendienteValidacion && !setDesafios.contains(desafio)){
                    setDesafios.add(desafio);
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