package SistemaPersistencia;

import java.io.FileNotFoundException;

public abstract class InterfazPersistencia {

    protected final UsersData usersData;
    protected final GameData gameData;

    public InterfazPersistencia() {
        usersData = loadUsersFromDisk();
        gameData = loadGameDataFromDisk();
    }

    protected abstract UsersData loadUsersFromDisk() throws FileNotFoundException;

    protected abstract GameData loadGameDataFromDisk();

    protected abstract void saveDataInDisk();

    public UsersData getUsersData() {
        return usersData;
    }

}