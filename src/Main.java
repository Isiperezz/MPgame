

import Herramientas.Jugador;

import Herramientas.Manager;
import SistemaPersistencia.*;

import java.io.FileNotFoundException;
import java.util.Comparator;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        /*
        PersistenciaManager p = PersistenciaManager.getInstance();
        p.getPersistencia().getUsersData().setRanking(new PriorityQueue<>(
                Comparator.comparingInt((Jugador j) -> j.getPersonaje().getOro()).reversed()
        ));
        */
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