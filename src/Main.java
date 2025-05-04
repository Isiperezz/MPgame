import Herramientas.Manager;
import Personajes.*;
import SistemaPersistencia.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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