package Herramientas;

import java.util.*;

/**
 * 
 */
public class HerramientasDeAdministrador extends HerramientasRol {

    private EditarPersonaje editorPersonajes;
    private GestorDesafiosAdmin desafios;

    public HerramientasDeAdministrador() {
        this.editorPersonajes = new EditarPersonaje();
        this.desafios = new GestorDesafiosAdmin();
    }

    public EditarPersonaje getEditorPersonajes() {
        return editorPersonajes;
    }

    public void setEditorPersonajes(EditarPersonaje editorPersonajes) {
        this.editorPersonajes = editorPersonajes;
    }

    public void setDesafios(GestorDesafiosAdmin desafios) {
        this.desafios = desafios;
    }

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
        System.out.println("1.Gestionar Desafíosz\n2.Editar personajes\n3.Bloquear Usuario\n4.Crear Equipamiento");
    }
}