package SistemaPersistencia;

import java.util.*;

public class RegistroEquipamiento {

    private Map <String, Equipamiento> equipamiento;

    public RegistroEquipamiento() {
    }

    public void addEquipment(String id, Equipamiento equipo) {
        equipamiento.put(id, equipo);
    }

    public Equipamiento getById(String id) {
        return equipamiento.get(id);
    }

}