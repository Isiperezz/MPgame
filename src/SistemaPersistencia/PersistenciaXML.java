package SistemaPersistencia;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class PersistenciaXML extends InterfazPersistencia {

    protected UsersData loadUsersFromDisk() throws FileNotFoundException {
        InputStream stream = new FileInputStream("usuarios.xml");
        XMLDecoder decoder = new XMLDecoder(stream);
    }

    protected GameData loadGameDataFromDisk() {
        return null;
    }
    protected void saveDataInDisk() {
    }

}