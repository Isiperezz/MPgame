package SistemaPersistencia;

import Personajes.Arma;
import Personajes.Armadura;

import java.util.*;

public class RegistroEquipamiento {

    private Map <String, Equipamiento> equipamiento;

    public Map<String, Equipamiento> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(Map<String, Equipamiento> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public RegistroEquipamiento() {
        this.equipamiento = new HashMap<>();
    }

    public void addEquipment(String id, Equipamiento equipo) {
        equipamiento.put(id, equipo);
    }

    public Equipamiento getById(String id) {
        return equipamiento.get(id).clone();
    }

    public void MostrarArmas() {
        for (String id : equipamiento.keySet()) {
            Equipamiento equip = equipamiento.get(id);
            if (equip instanceof Arma) {
                System.out.print(id + " ");
            }
        }
    }
    public void MostrarArmaduras() {
        for (String id : equipamiento.keySet()) {
            Equipamiento equip = equipamiento.get(id);
            if (equip instanceof Armadura) {
                System.out.print(id + " ");
            }
        }
    }

}