package SistemaPersistencia;

import java.io.FileNotFoundException;

public abstract class InterfazPersistencia {

    protected UsersData usersData;
    protected GameData gameData;

    public InterfazPersistencia(){
            this.gameData =new GameData();

    }

    public void setUsersData(UsersData usersData) {this.usersData = usersData;}

    public void setGameData(GameData gameData) {this.gameData = gameData;}

    public static InterfazPersistencia loadDataFromDisk() throws FileNotFoundException {
        return null;
    }


    public abstract void saveDataInDisk() throws FileNotFoundException;

    public UsersData getUsersData() {
        return this.usersData;
    }
    public GameData getGameData() {
        return this.gameData;
    }

}