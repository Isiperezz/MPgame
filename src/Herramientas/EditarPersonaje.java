package Herramientas;

import Personajes.Personaje;
import SistemaPersistencia.PersistenciaManager;

public class EditarPersonaje {

    private String tipo;

    public EditarPersonaje() {
    }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public void editarSalud(int nuevoValor) {
        Personaje personaje = PersistenciaManager.getInstance().getPersistencia().getGameData().getPersonaje(tipo);
        personaje.setSalud(nuevoValor);
    }



}