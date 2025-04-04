package Personajes;

public class Demonios implements Esbirro {
    private String nombre;
    private int salud;
    private String pacto;
    private AlmacenEsbirros esbirros;

    public String getPacto() {
        return this.pacto;
    }
    public String getName() {
        return this.nombre;
    }
    public int getSalud() {
        return this.salud;
    }
    public AlmacenEsbirros getDemonEsbirros() {
        return this.esbirros;
    }


}