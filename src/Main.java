
import Herramientas.Jugador;
import Personajes.Armadura;
import SistemaDesafios.Desafio;
import SistemaPersistencia.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersistenciaManager p = PersistenciaManager.getInstance();
        Login l = p.getPersistencia().getUsersData().getLogin();
        Jugador j = l.registrarJugador();





    }
}