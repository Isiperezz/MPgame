package Personajes;

import java.util.Random;

public class Debilidad {

    private String nombreDebilidad;
    private int sensibilidad;


    public Debilidad() {

    }

    public void initialize(String nombre) {
        Random random = new Random();
        this.nombreDebilidad= nombre;
        this.sensibilidad = random.nextInt(5) + 1;
    }

    public int getSensibilidad() {
        return this.sensibilidad;
    }

    public String getNombre() {
        return this.nombreDebilidad;
    }

}