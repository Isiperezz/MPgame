package Personajes;
import java.util.*;

/**
 * 
 */
public class Equipo {

    public Equipo() {
        this.armas= new ArrayList<Arma>();
        this.armaduras=new ArrayList<Armadura>();
        this.armaActiva= null;
        this.armaduraActiva=null;
    }

    private List<Arma> armas;
    private List<Armadura> armaduras;
    private Arma armaActiva;
    private Armadura armaduraActiva;

    public void setArmaActiva(Arma arma) {

        this.armaActiva = arma;
    }

    public void setArmaduraActiva(Armadura armadura) {
       this.armaduraActiva = armadura;
    }

    public List<Armadura> getArmaduras() {

        return this.armaduras;
    }

    public List<Arma> getArmas() {
        return this.armas;
    }

    public void aniadirArma(Arma arma) {

        this.armas.add(arma);
    }

    public void aniadirArmadura(Armadura armadura) {

        this.armaduras.add(armadura);
    }

}