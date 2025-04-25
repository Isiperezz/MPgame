package Personajes;
import java.util.*;

public class Licantropo extends Personaje {

    private Don don;
    private int raza;
    private int peso;
    private int altura;
    private boolean formaBipeda;
    private int rabia = 0;

    public Don getDon() {
        return this.don;
    }
    public void setDon(Habilidades habilidad) {
        this.don = (Don)habilidad;
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
    public void setAltura(int altura){
            this.altura = altura;
    }
    public boolean cambiarForma() {
        formaBipeda = !formaBipeda;
        return formaBipeda;
    }

    public int getRabia() {
        return this.rabia;
    }
    public void setRabia(int rabia) {
        this.rabia = rabia;
    }
}

