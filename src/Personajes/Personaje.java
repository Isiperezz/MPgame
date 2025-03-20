
import java.util.*;

/**
 * 
 */
public interface Personaje {

    /**
     * @return
     */
    public String getNombre();

    /**
     * @return
     */
    public List<Arma> getArmas();

    /**
     * 
     */
    public void setArmaActiva();

    /**
     * @return
     */
    public List<Armadura> getArmadura();

    /**
     * @param Armadura
     */
    public void setArmaduraActiva(void Armadura);

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

}