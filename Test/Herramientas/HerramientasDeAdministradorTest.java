package Herramientas;

import Personajes.Arma;
import Personajes.Armadura;
import SistemaPersistencia.PersistenciaManager;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HerramientasDeAdministradorTest {

    @Test
    void crearArmadura() {
        String datos = "Armadura de lata\n1\n2";
        ByteArrayInputStream in = new ByteArrayInputStream(datos.getBytes());
        System.setIn(in);
        HerramientasDeAdministrador h = new HerramientasDeAdministrador();
        h.crearArmadura();
        //Comprobar guardado en persistencia y valores
        Armadura armaCreada = (Armadura) PersistenciaManager.getInstance().getPersistencia().getGameData().getEquipamiento().getById("Armadura de lata");
        assertNotNull(armaCreada);
        assertEquals(armaCreada.getNombreArmadura(),"Armadura de lata");
        assertEquals(armaCreada.getModificadorAtaque(),1);
        assertEquals(armaCreada.getModificadorDefensa(),2);
    }

    @Test
    void crearArma() {
        String datos = "Arco\nTRUE\n1\n2";
        ByteArrayInputStream in = new ByteArrayInputStream(datos.getBytes());
        System.setIn(in);
        HerramientasDeAdministrador h = new HerramientasDeAdministrador();
        h.crearArma();
        //Comprobar guardado en persistencia y valores
        Arma armaCreada = (Arma) PersistenciaManager.getInstance().getPersistencia().getGameData().getEquipamiento().getById("Arco");
        assertNotNull(armaCreada);
        assertTrue(armaCreada.isDosManos());
        assertEquals(armaCreada.getNombreArma(),"Arco");
        assertEquals(armaCreada.getModificadorAtaque(),1);
        assertEquals(armaCreada.getModificadorDefensa(),2);
    }

    @Test
    void bloquearJugador() {
        Jugador j = new Jugador("Prueba", "");
        PersistenciaManager.getInstance().getPersistencia().getUsersData().addNewUser(j);
        HerramientasDeAdministrador h = new HerramientasDeAdministrador();
        String datos = "Prueba";
        ByteArrayInputStream in = new ByteArrayInputStream(datos.getBytes());
        System.setIn(in);
        h.bloquearJugador();
        assertTrue(j.isBlock());
        //CASO JUGADOR NO EXISTE
        datos = "No Existe";
        in = new ByteArrayInputStream(datos.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            h.bloquearJugador();

        } finally {
            System.setOut(originalOut);
        }
        String salida = outputStream.toString().trim();
        boolean result = salida.contains("No existe un usuario asociado.");
        assertTrue(result);
    }

    @Test
    void desbloquearJugador() {
        Jugador j = new Jugador("Prueba", "");
        j.setBlock(true);
        PersistenciaManager.getInstance().getPersistencia().getUsersData().addNewUser(j);
        HerramientasDeAdministrador h = new HerramientasDeAdministrador();
        String datos = "Prueba";
        ByteArrayInputStream in = new ByteArrayInputStream(datos.getBytes());
        System.setIn(in);
        h.desbloquearJugador();
        assertFalse(j.isBlock());
        //CASO JUGADOR NO ESTABA BLOQUEADO
        in = new ByteArrayInputStream(datos.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            h.desbloquearJugador();

        } finally {
            System.setOut(originalOut);
        }
        String salida = outputStream.toString().trim();
        boolean result = salida.contains("El usuario no está bloqueado.");
        assertTrue(result);
    }
}