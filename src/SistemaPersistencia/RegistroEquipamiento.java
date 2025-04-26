package SistemaPersistencia;

import Personajes.Arma;
import Personajes.Armadura;

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

    public void MostrarArmas() {
        for (Map.Entry<String, Equipamiento> entry : equipamiento.entrySet()) {
            String clave = entry.getKey();
            Equipamiento valor = entry.getValue();
            if (valor instanceof Arma) {
                System.out.println(clave);
            }


        }

    }
    public void MostrarArmaduras() {
        for (Map.Entry<String, Equipamiento> entry : equipamiento.entrySet()) {
            String clave = entry.getKey();
            Equipamiento valor = entry.getValue();
            if (valor instanceof Armadura) {
                System.out.println(clave);
            }


        }

    }

}