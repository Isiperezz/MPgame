import Herramientas.Jugador;
import Herramientas.Usuario;
import Personajes.Arma;
import Personajes.Personaje;
import SistemaDesafios.Desafio;
import SistemaPersistencia.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersistenciaManager p = PersistenciaManager.getInstance();
        RegistroEquipamiento r = p.getPersistencia().getGameData().getEquipamiento();
        r.MostrarArmas();

        try {
            p.getPersistencia().saveDataInDisk();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}