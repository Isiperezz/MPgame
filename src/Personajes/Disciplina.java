package Personajes;
import java.util.*;

public class Disciplina extends Habilidades {

    private int costeSangre;

    public Disciplina(String nombre, int ataque, int defensa, int costeSangre) {
        this.nombre = nombre;
        this.valorAtaque = ataque;
        this.valorDefensa = defensa;
        this.costeSangre = costeSangre;
    }

    public int getCosteSangre() {
        return this.costeSangre;
    }
}