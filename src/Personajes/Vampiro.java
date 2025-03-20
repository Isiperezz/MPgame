package Personajes;
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
    private String nombre;

    /**
     * 
     */
    private Equipo equipo;

    /**
     * 
     */
    private Modificadores modificadores;

    /**
     * 
     */
    private AlmacenEsbirros esbirros;

    /**
     * 
     */
    private int cantidadOro;

    /**
     * 
     */
    private int poder;

    /**
     * 
     */
    private int salud;

    /**
     * 
     */
    private Habilidad habilidad;

    /**
     * 
     */
    private int puntosSangre;

    /**
     * 
     */
    private int edad;

    /**
     * 
     */
    public void getHabilidad() {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getPuntosSangre() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getEdad() {
        // TODO implement here
        return 0;
    }

    /**
     * @param costeSangre
     */
    public void actualizarPuntosSangre(int costeSangre) {
        // TODO implement here
    }

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
     * @param arma
     */
    public void setArmaActiva(Arma arma) {
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
     * @param arm
     */
    public void setArmaduraActiva(Armadura arm) {
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

    /**
     * @param name
     */
    public void setName(String name) {
        // TODO implement here
    }

    /**
     * @param oro
     */
    public void setOro(int oro) {
        // TODO implement here
    }

    /**
     * @param salud
     */
    public void setSalud(int salud) {
        // TODO implement here
    }

    /**
     * @param poder
     */
    public void setPoder(int poder) {
        // TODO implement here
    }

}