package Personajes;
import java.util.*;


public abstract class Personaje {

    protected String nombre;
    protected Equipo equipo;
    protected Modificadores modificadores;
    protected AlmacenEsbirros esbirros ;
    protected int cantidadOro;
    protected int poder;
    protected int salud;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo(){
        return this.equipo;
    }
    public int getOro(){

        return this.cantidadOro;
    }
    public int getSalud(){

        return this.salud;
    }
    public int getPoder(){

        return this.poder;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<Debilidad> getDebilidades(){

        return this.modificadores.getDebilidades();

    }
    public List<Fortaleza> getFortalezas(){

        return this.modificadores.getFortalezas();
    }

    public AlmacenEsbirros getEsbirros(){

        return this.esbirros;
    }
    public void setEsbirros(AlmacenEsbirros esbirros) {

        this.esbirros = esbirros;
    }

    public void setOro(int oro){

        this.cantidadOro = oro;
    }
    public void setSalud(int salud){

        this.salud = salud;
    }
    public void setPoder(int poderpersonaje){

        this.poder = poderpersonaje;
    }
    public Arma getArmaActiva(){

        return this.equipo.getArmaActiva();
    }
    public Armadura getArmaduraActiva(){

        return this.equipo.getArmaduraActiva();
    }
    public int getValorFortalezas(){

        int valorFortalezas = 0;
        for (Fortaleza fortaleza : this.modificadores.getFortalezas()) {
            valorFortalezas += fortaleza.getEfiacia();
        }
        return valorFortalezas;
    }
    public int getValorDebilidades(){

        int valorDebilidades = 0;
        for (Debilidad debilidad : this.modificadores.getDebilidades()) {
            valorDebilidades += debilidad.getSensibilidad() ;
        }
        return valorDebilidades;
    }

}