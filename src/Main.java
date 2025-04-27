import Personajes.Arma;
import SistemaPersistencia.PersistenciaManager;
import SistemaPersistencia.RegistroEquipamiento;

import java.io.FileNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersistenciaManager p = PersistenciaManager.getInstance();
        RegistroEquipamiento r = p.getPersistencia().getGameData().getEquipamiento();
        r.addEquipment("Espada", new Arma("Espada", false, 15, 5));
        r.addEquipment("Lanza", new Arma("Lanza", true, 20, 5));
        r.addEquipment("Hacha", new Arma("Hacha", true, 25, 5));
        r.addEquipment("Cuchillo", new Arma("Cuchillo", false, 10, 5));
        r.addEquipment("Guadaña", new Arma("Guadaña", true, 30, 5));
        r.addEquipment("Cenit", new Arma("Cenit", false, 40, 5));
        try {
            p.getPersistencia().saveDataInDisk();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}