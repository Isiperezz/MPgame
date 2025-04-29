package Personajes;
import java.util.*;

public class Equipo {

    public Equipo() {

    }

    private Map<String, Arma> armas;
    private Map<String, Armadura> armaduras;
    private Arma armaActiva;
    private Armadura armaduraActiva;

    public void setArmaActiva(String name) {
        this.armaActiva = armas.get(name);
    }

    public void setArmaduraActiva(String name) {
        this.armaduraActiva = armaduras.get(name);
    }

    public void setArmas(Map<String, Arma> armas) {
        this.armas = armas;
    }

    public void setArmaduras(Map<String, Armadura> armaduras) {
        this.armaduras = armaduras;
    }

    public Map<String, Armadura> getArmaduras() {

        return this.armaduras;
    }

    public Map<String, Arma> getArmas() {
        return this.armas;
    }

    public void aniadirArma(String name, Arma arma) {
        this.armas.put(name, arma);
    }

    public void aniadirArmadura(String name, Armadura armadura) {

        this.armaduras.put(name, armadura);
    }
    public Arma getArmaActiva() {

        return this.armaActiva;
    }
    public Armadura getArmaduraActiva() {

        return this.armaduraActiva;
    }

}