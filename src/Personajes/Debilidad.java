package Personajes;

public class Debilidad extends Equipo {

    private String nombreDebilidad;
    private int sensibilidad;


    public Debilidad(String nombre, int sens) {
        this.nombreDebilidad=nombre;
        this.sensibilidad=sens;
    }

    public int getSensibilidad() {
        return this.sensibilidad;
    }

    public String getNombre() {
        return this.nombreDebilidad;
    }

}