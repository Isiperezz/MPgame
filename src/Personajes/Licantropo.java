package Personajes;
import java.util.*;

public class Licantropo extends Personaje {

    private Habilidades habilidad;
    private int raza;
    private int peso;
    private int altura;
    private boolean formaBipeda;

    public Habilidades getDon() {
        return this.habilidad;
    }
    public void setDon(Habilidades habilidad) {
        this.habilidad = habilidad;
    }
    public int getRaza() {
        return this.raza;
    }
    public void setRaza(int raza) {
        this.raza = raza;
    }
    public int getPeso() {
        return this.peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getAltura() {
        return this.altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public boolean cambiarForma() {
        formaBipeda = !formaBipeda;
        return formaBipeda;
    }

}

