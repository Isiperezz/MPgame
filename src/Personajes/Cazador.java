package Personajes;


public class Cazador extends Personaje {
    private int voluntad;
    private Talento talento;

    public Talento getTalento() {

        return this.talento;
    }
    public void setTalento(String nombre, int ataque, int defensa) {

        this.talento = new Talento(nombre, ataque, defensa);
    }
    public int getVoluntad() {

        return this.voluntad;
    }

    public void disminuirVoluntad() {

        this.voluntad -= 1;
    }


}