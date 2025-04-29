package Personajes;
import java.util.*;

public class Fortaleza {
    private String nombreFortaleza;
    private int eficacia;

    public Fortaleza() {

    }
    public void initialize(String nombre){
        Random random = new Random();
        this.eficacia = random.nextInt(5) + 1;
        this.nombreFortaleza = nombre;
    }



    public int getEfiacia() {
        return this.eficacia;
    }

    public String getNombre() {
        return this.nombreFortaleza;
    }

}