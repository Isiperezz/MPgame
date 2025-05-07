package SistemaPersistencia;

import Herramientas.Jugador;
import SistemaDesafios.Desafio;
import SistemaDesafios.Finalizado;
import SistemaDesafios.PendienteAceptacion;
import SistemaDesafios.PendienteValidacion;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlmacenDesafiosTest {

    @Test
    void addJugador() {
        Jugador j = new Jugador("Prueba", "");
        AlmacenDesafios almacen = new AlmacenDesafios();
        almacen.setDesafios(new HashMap<>());
        almacen.addJugador(j.getUserName());
        assertTrue(almacen.getDesafios().keySet().contains(j.getUserName()));
        assertNotNull(almacen.getDesafios().get(j.getUserName()));
    }

    @Test
    void getDesafiosJugador() {
        Jugador j = new Jugador("Prueba", "");
        Jugador j2 = new Jugador("Pepe", "");
        AlmacenDesafios almacen = new AlmacenDesafios();
        almacen.setDesafios(new HashMap<>());
        almacen.addJugador(j.getUserName());
        List<Desafio> l0 = new ArrayList<Desafio>();
        l0.add(new Desafio(j, j2, 10));
        l0.add(new Desafio(j, j2, 100));
        l0.add(new Desafio(j, j2, 1000));
        for (int i = 0; i < l0.size(); i++) {
            almacen.aniadirDesafio("Prueba", l0.get(i));
        }
        List<Desafio> l = almacen.getDesafiosJugador(j.getUserName());
        for (Desafio desafio : l) {
            assertTrue(l0.contains(desafio));
        }


    }

    @Test
    void getTodosDesafíosPendientes() {
        Jugador j = new Jugador("Prueba", "");
        Jugador j2 = new Jugador("Pepe", "");
        AlmacenDesafios almacen = new AlmacenDesafios();
        almacen.setDesafios(new HashMap<>());
        almacen.addJugador("Prueba");
        int cont = 0;
        for (int i = 0; i < 1000; i++) {
            Desafio d = new Desafio(j, j2, i);
            if (Math.random() < 0.5) {
                d.setEstado(new PendienteValidacion());
                cont++;
            } else {
                d.setEstado(new PendienteAceptacion());
            }
            almacen.aniadirDesafio("Prueba", d);
        }
        List<Desafio> l = almacen.getTodosDesafíosPendientes();
        assertEquals(l.size(), cont);
    }

    @Test
    void getDesafiosPendientesJugador() {
        Jugador j = new Jugador("Prueba", "");
        Jugador j2 = new Jugador("Pepe", "");
        AlmacenDesafios almacen = new AlmacenDesafios();
        almacen.setDesafios(new HashMap<>());
        almacen.addJugador("Prueba");
        int cont = 0;
        for (int i = 0; i < 1000; i++) {
            Desafio d = new Desafio(j, j2, i);
            if (Math.random() < 0.4) {
                d.setEstado(new PendienteAceptacion());
                cont++;
            } else {
                d.setEstado(new Finalizado());
            }
            almacen.aniadirDesafio("Prueba", d);
        }
        List<Desafio> l = almacen.getDesafiosPendientesJugador(j.getUserName());
        assertEquals(l.size(), cont);
    }

}