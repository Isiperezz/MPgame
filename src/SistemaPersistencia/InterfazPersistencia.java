package SistemaPersistencia;

import java.io.FileNotFoundException;

public abstract class InterfazPersistencia {

    protected final UsersData usersData;
    protected final GameData gameData;

    public static InterfazPersistencia loadDataFromDisk() throws FileNotFoundException {
        return null;
    }


    protected abstract void saveDataInDisk() throws FileNotFoundException;

    public UsersData getUsersData() {
        return usersData;
    }

}