package Personajes;
import java.util.*;

/**
 * 
 */
public class Debilidad extends Equipo {

    public Debilidad(String nombre, int sens) {
        this.nombreDebilidad=nombre;
        this.sensibilidad=sens;
    }

    private String nombreDebilidad;
    private int sensibilidad;

    public int getSensibilidad() {
        return this.sensibilidad;
    }

    public String getNombre() {
        return this.nombreDebilidad;
    }

}