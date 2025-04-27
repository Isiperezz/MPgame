package SistemaPersistencia;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class PersistenciaXML extends InterfazPersistencia {


    public PersistenciaXML() {

    }

    public static PersistenciaXML loadDataFromDisk() throws FileNotFoundException {
        InputStream stream = new FileInputStream("/data/persistencia.xml");
        XMLDecoder decoder = new XMLDecoder(stream);

        return (PersistenciaXML) decoder.readObject();


    }

    @Override
    public void saveDataInDisk() throws FileNotFoundException {
        OutputStream stream = new FileOutputStream("data/persistencia.xml");
        XMLEncoder encoder = new XMLEncoder(stream);

        encoder.writeObject(this);
        encoder.close();

    }

}