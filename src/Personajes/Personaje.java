
import java.util.*;

/**
 * 
 */
public interface Personaje {

    /**
     * 
     */
    public void Attribute1;

    /**
     * @return
     */
    public String getNombre();

    /**
     * @return
     */
    public List<Arma> getArmas();

    /**
     * @param arma
     */
    public void setArmaActiva(Arma arma);

    /**
     * @return
     */
    public List<Armadura> getArmadura();

    /**
     * @param arm
     */
    public void setArmaduraActiva(Armadura arm);

    /**
     * @return
     */
    public Int getOro();

    /**
     * @return
     */
    public int getSalud();

    /**
     * 
     */
    public void getPoder();

    /**
     * @return
     */
    public List<Debilidades> getDebilidades();

    /**
     * @return
     */
    public List<Fortalezas> getFortalezas();

    /**
     * @return
     */
    public AlmacenEsbirros getEsbirros();

    /**
     * @param name
     */
    public void setName(String name);

    /**
     * @param oro
     */
    public void setOro(int oro);

    /**
     * @param salud
     */
    public void setSalud(int salud);

    /**
     * @param poder
     */
    public void setPoder(int poder);

}