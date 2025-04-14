package Personajes;
import java.util.*;

public class Modificadores {

    public Modificadores() {
        this.debilidades= new ArrayList<Debilidad>();
        this.fortalezas= new ArrayList<Fortaleza>();
    }

    private List<Debilidad> debilidades;
    private List<Fortaleza> fortalezas;


    public List<Debilidad> getDebilidades() {
        return this.debilidades;
    }

    public List<Fortaleza> getFortalezas() {
        return this.fortalezas;
    }

    public void aniadirFortaleza(String nombre, int eficacia) {
        Fortaleza fortaleza= new Fortaleza(nombre,eficacia);
        this.fortalezas.add(fortaleza);
    }

    public void aniadirDebildad(String nombre, int sens) {
        Debilidad debilidad= new Debilidad(nombre,sens);
        this.debilidades.add(debilidad);
    }

}