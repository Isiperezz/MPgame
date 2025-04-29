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

    public String getNombreDebilidad() {
        return nombreDebilidad;
    }

    public void setNombreDebilidad(String nombreDebilidad) {
        this.nombreDebilidad = nombreDebilidad;
    }

    public void setSensibilidad(int sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public int getSensibilidad() {
        return this.sensibilidad;
    }


}