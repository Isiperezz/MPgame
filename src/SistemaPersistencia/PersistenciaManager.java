package SistemaPersistencia;

import java.io.FileNotFoundException;

public class PersistenciaManager {

    private static PersistenciaManager instance;
    private final InterfazPersistencia persistencia;

    private PersistenciaManager() {
        try {
            persistencia = PersistenciaXML.loadDataFromDisk();
        }catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PersistenciaManager getInstance() {
        if (instance == null){
            instance = new PersistenciaManager();
        }
        return instance;
    }

    public InterfazPersistencia getPersistencia() {
        return persistencia;
    }

}