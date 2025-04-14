package Personajes;

import java.util.*;

public class AlmacenEsbirros{
    private List<Esbirro> esbirros;

    public List<Esbirro> getEsbirro() {
        return this.esbirros;
    }

    public void añadirEsbirro(Esbirro esbirro, int salud) {

        this.esbirros.add(esbirro);


    }

}