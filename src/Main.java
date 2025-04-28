
import Personajes.Armadura;
import SistemaPersistencia.*;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        PersistenciaManager p = PersistenciaManager.getInstance();
        RegistroEquipamiento r = p.getPersistencia().getGameData().getEquipamiento();
        r.mostrarArmaduras();
        try {
            p.getPersistencia().saveDataInDisk();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}