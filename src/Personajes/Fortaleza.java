package Personajes;
import java.util.*;

/**
 * 
 */
public class Fortaleza extends Equipo {

    public Fortaleza(String nombre, int eficacia) {
        this.nombreFortaleza=nombre;
        this.eficacia=eficacia;
    }

    private String nombreFortaleza;
    private int eficacia;

    public int getEfiacia() {
        return this.eficacia;
    }

    public String getNombre() {
        return this.nombreFortaleza;
    }

}