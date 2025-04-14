package Personajes;

public abstract class Habilidades {


    protected String nombre;
    protected int valorAtaque;
    protected int valorDefensa;

    public String getName() {

        return this.nombre;
    }

    public int getValorAtaque() {

        return this.valorAtaque;
    }

    public int getValorDefensa() {

        return this.valorDefensa;
    }

}