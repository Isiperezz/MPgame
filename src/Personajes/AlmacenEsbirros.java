package Personajes;

import java.util.*;

public class AlmacenEsbirros{
    private List<Esbirro> esbirros;

    public List<Esbirro> getEsbirro() {
        return this.esbirros;
    }

    public void aniadirEsbirro(Esbirro esbirro) {

        this.esbirros.add(esbirro);


    }
    public int getSaludTotal(){
        int saludTotal = 0;
        for (Esbirro esbirro : this.esbirros) {
            saludTotal += esbirro.getSalud();
            if (esbirro instanceof Demonios) {
                saludTotal +=((Demonios) esbirro).getDemonEsbirros().getSaludTotal();
            }
        }
        return saludTotal;
    }

}