package SistemaPersistencia;

import java.util.*;

/**
 * 
 */
public abstract class InterfazPersistencia {

    /**
     * Default constructor
     */
    public InterfazPersistencia() {
    }

    /**
     * 
     */
    protected UsersData usersData;

    /**
     * 
     */
    protected GameData gameData;

    /**
     * @return
     */
    protected UsersData loadUsersFromDisk() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    protected GameData loadGameDataFromDisk() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    protected void saveDataInDisk() {
        // TODO implement here
    }

    /**
     * @return
     */
    public UsersData getUsersData() {
        // TODO implement here
        return null;
    }

}