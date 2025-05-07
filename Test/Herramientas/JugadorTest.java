package Herramientas;

import Personajes.Cazador;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class JugadorTest {

    @Test
    void addNotificación() {
        String notificacion = "Hola";
        Jugador j = new Jugador();
        j.addNotificación(notificacion);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            j.verNotificaciones();

        } finally {
            System.setOut(originalOut);
        }
        String salida = outputStream.toString().trim();
        boolean result = salida.contains("Hola");
        assertTrue(result);
    }

    @Test
    void verNotificaciones() {
        String notificacion = "Adios";
        Jugador j = new Jugador();
        j.addNotificación(notificacion);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            j.verNotificaciones();

        } finally {
            System.setOut(originalOut);
        }
        String salida = outputStream.toString().trim();
        boolean result = salida.contains("Adios");
        assertTrue(result);
        //CASO NO HAY NOTIFICACIONES
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            j.verNotificaciones();

        } finally {
            System.setOut(originalOut);
        }
        salida = outputStream.toString().trim();
        result = salida.isEmpty();
        assertTrue(result);

    }

    @Test
    void testEquals() {
        Jugador j1 = new Jugador("Juan", "Juan");
        Jugador j2 = new Jugador("Pepe", "Pepe");
        Jugador j3 = new Jugador("Jose", "Juan");
        Jugador j4 = new Jugador("Juan", "Juan");
        assertFalse(j1.equals(j2));
        assertFalse(j1.equals(j3));
        assertFalse(j2.equals(j3));
        assertTrue(j1.equals(j4));

    }


    @Test
    void compareTo() {
        Jugador j1 = new Jugador("Juan", "Juan");
        j1.setPersonaje(new Cazador());
        j1.getPersonaje().setOro(100);
        Jugador j2 = new Jugador("Pepe", "Juan");
        j2.setPersonaje(new Cazador());
        j2.getPersonaje().setOro(200);
        assertTrue(j1.compareTo(j2) == 1);
        assertTrue(j2.compareTo(j1) == -1);
        j1.getPersonaje().setOro(200);
        assertTrue(j1.compareTo(j2) == 0);
    }
}