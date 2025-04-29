package Personajes;


import SistemaPersistencia.PersistenciaManager;

public class Cazador extends Personaje {
    private int voluntad;
    private Talento talento;

    public Talento getTalento() {

        return this.talento;
    }
    public void setTalento(Talento talento) {

        this.talento = talento;
    }
    public int getVoluntad() {

        return this.voluntad;
    }

    public void disminuirVoluntad() {

        this.voluntad -= 1;
    }
    public void setVoluntad(int voluntad) {

        this.voluntad = voluntad;
    }


    @Override
    public void initializeSalud() {
        this.salud = PersistenciaManager.getInstance().getPersistencia().getGameData().getPersonaje("Cazador").getSalud();
    }
}