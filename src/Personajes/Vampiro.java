
import java.util.*;

/**
 * 
 */
public class Vampiro extends Character implements Personaje {

    /**
     * Default constructor
     */
    public Vampiro() {
    }

    /**
     * 
     */
    private Talento habilidad;

    /**
     * 
     */
    private String Nombre;

    /**
     * 
     */
    private Equipo Equipo;

    /**
     * 
     */
    private Modificadores Modificadores;

    /**
     * 
     */
    private AlmacenEsbirros Esbirros;

    /**
     * 
     */
    private int CantidadOro;

    /**
     * 
     */
    private int Poder;

    /**
     * 
     */
    private int Salud;

    /**
     * 
     */
    private Talento Habilidad;

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public List<Arma> getArmas() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void setArmaActiva() {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<Armadura> getArmadura() {
        // TODO implement here
        return null;
    }

    /**
     * @param Armadura
     */
    public void setArmaduraActiva(void Armadura) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Int getOro() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getSalud() {
        // TODO implement here
        return 0;
    }

    /**
     * 
     */
    public void getPoder() {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<Debilidades> getDebilidades() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Fortalezas> getFortalezas() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public AlmacenEsbirros getEsbirros() {
        // TODO implement here
        return null;
    }

}