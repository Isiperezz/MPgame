package SistemaPersistencia;

import Personajes.Personaje;

import java.util.*;

public class GameData {

    private Map<String, Personaje> personajes;
    private RegistroEquipamiento equipamiento;

    public GameData() {
    }

    public RegistroEquipamiento getEquipamiento() {
        return equipamiento;
    }

    public Personaje getPersonaje(String key) {
        return personajes.get(key);
    }

}