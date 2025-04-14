package Personajes;

public class Don extends Habilidades {

    private int valorRabia;

    public Don(String nombre, int ataque, int defensa, int rabia) {
        this.nombre = nombre;
        this.valorAtaque = ataque;
        this.valorDefensa = defensa;
        this.valorRabia = rabia;
    }

    public int getValorRabia() {

        return this.valorRabia;
    }

    public boolean permiteUtilizar(int rabia) {
        //si rabia es mayor o igual al coste de la habilidad, se puede usar
        return rabia >= this.valorRabia;
    }




}