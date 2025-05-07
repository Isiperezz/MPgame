package Herramientas;

import Personajes.AlmacenEsbirros;
import Personajes.Arma;
import Personajes.Equipo;
import Personajes.Vampiro;
import SistemaDesafios.Desafio;
import SistemaDesafios.Finalizado;
import SistemaDesafios.PendienteAceptacion;
import SistemaDesafios.PendienteValidacion;
import SistemaPersistencia.PersistenciaManager;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestorDesafiosJugadorTest {

    @Test
    void desafiarJugador() {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        HerramientasDeJugador h = new HerramientasDeJugador(jugador1);
        jugador1.setHerramientas(h);

        h.getDesafios().desafiarJugador(jugador2, 1000);
        List<Desafio> l1 = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getDesafiosJugador(jugador1.getUserName());
        List<Desafio> l2 = PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().getDesafiosJugador(jugador2.getUserName());
        Desafio desafioIgual = new Desafio(jugador1, jugador2, 1000);
        assertTrue(desafioIgual.equals(l1.get(0)));
        assertTrue(desafioIgual.equals(l2.get(0)));
        assertEquals(l1.get(0).getDesafiado(), jugador2);
        assertEquals(l2.get(0).getDesafiado(), jugador2);
        assertEquals(l1.get(0).getDesafiante(), l2.get(0).getDesafiante());
        assertTrue(l1.get(0).getEstado().getClass() == PendienteValidacion.class);
    }

    @Test
    void aceptarDesafio() {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        HerramientasDeJugador h = new HerramientasDeJugador(jugador1);
        jugador1.setHerramientas(h);

        Desafio desafio = new Desafio(jugador1, jugador2, 1000);
        desafio.setEstado(new PendienteAceptacion());
        h.getDesafios().getDesafios().add(desafio);

        assertEquals(h.getDesafios().getDesafios().size(), 1);
        assertEquals(h.getDesafios().getDesafios().get(0), desafio);
    }

    @Test
    void hasDesafiosPendientes() {
        Jugador j1 = new Jugador("J1", "prueba");
        Jugador j2 = new Jugador("J2", "prueba");
        Desafio desafio = new Desafio(j1, j2, 1000);
        desafio.setEstado(new PendienteAceptacion());
        PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().aniadirDesafio(j1.getUserName(), desafio);
        PersistenciaManager.getInstance().getPersistencia().getUsersData().getDesafios().aniadirDesafio(j2.getUserName(), desafio);

        GestorDesafiosJugador g1 = new GestorDesafiosJugador(j1);
        GestorDesafiosJugador g2 = new GestorDesafiosJugador(j2);
        assertEquals(false, g1.hasDesafiosPendientes());
        assertEquals(true, g2.hasDesafiosPendientes());

    }
}