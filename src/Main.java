

import Herramientas.Jugador;

import Herramientas.Manager;
import Personajes.Personaje;
import SistemaPersistencia.*;
import java.util.Map;
import java.io.FileNotFoundException;
import java.util.Comparator;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PersistenciaManager p = PersistenciaManager.getInstance();

        Manager m = new Manager();
        m.start();
        try {
            p.getPersistencia().saveDataInDisk();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}