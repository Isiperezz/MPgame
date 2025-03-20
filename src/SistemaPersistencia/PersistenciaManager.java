package SistemaPersistencia;

public class PersistenciaManager {

    private static PersistenciaManager instance;
    private final InterfazPersistencia persistencia;

    private PersistenciaManager() {
        persistencia = new PersistenciaXML();
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