package Herramientas;

import java.util.*;

/**
 * 
 */
public class HerramientasDeAdministrador extends HerramientasRol {

    private EditarPersonaje editorPersonajes;
    private GestorDesafiosAdmin desafios;

    public HerramientasDeAdministrador() {
    }

    /**
     * @return
     */
    public EditarPersonaje editarPersonaje() {
        return this.editorPersonajes;
    }

    /**
     * 
     */
    public void crearArmadura() {
        // TODO implement here
    }

    /**
     * 
     */
    public void crearArma() {
        // TODO implement here
    }

    /**
     * @return
     */
    public GestorDesafiosAdmin getDesafios() {
        return this.desafios;
    }

    @Override
    public void show() {

    }
}