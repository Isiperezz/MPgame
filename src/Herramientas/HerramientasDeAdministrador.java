package Herramientas;

import SistemaPersistencia.PersistenciaManager;

import java.util.*;

public class HerramientasDeAdministrador extends HerramientasRol {

    private EditarPersonaje editorPersonajes;
    private GestorDesafiosAdmin desafios;

    public HerramientasDeAdministrador() {
    }

    public EditarPersonaje getEditorPersonajes() {
        if (editorPersonajes == null) {
            editorPersonajes = new EditarPersonaje();
        }
        return editorPersonajes;
    }

    public void setEditorPersonajes(EditarPersonaje editorPersonajes) {
        this.editorPersonajes = editorPersonajes;
    }

    public void setDesafios(GestorDesafiosAdmin desafios) {
        this.desafios = desafios;
    }

    public void crearArmadura() {
        // TODO implement here
    }

    public void crearArma() {
        // TODO implement here
    }

    public GestorDesafiosAdmin getDesafios() {
        if (desafios == null) {
            desafios = new GestorDesafiosAdmin();
        }
        return this.desafios;
    }

    public void bloquearJugador(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario a bloquear");
        String nick = sc.nextLine();
        Usuario user = PersistenciaManager.getInstance().getPersistencia().getUsersData().getUsuarioByNick(nick);
        if (user == null) {
            System.out.println("No existe un usuario asociado.");
        } else if (user instanceof Jugador j) {
            if (!j.isBlock()) {
                j.setBlock(true);
                System.out.println("El usuario ha sido bloqueado.");
            } else
                System.out.println("El usuario ya está bloqueado.");
        } else {
            System.out.println("El usuario no es un jugador.");
        }
    }

    public void desbloquearJugador(){
        Scanner sc = new Scanner(System.in);
        PersistenciaManager.getInstance().getPersistencia().getUsersData().mostrarBloqueados();
        String nick = sc.nextLine();
        Usuario user = PersistenciaManager.getInstance().getPersistencia().getUsersData().getUsuarioByNick(nick);
        if (user == null) {
            System.out.println("No existe un usuario asociado.");
        } else if (user instanceof  Jugador j) {
            if (j.isBlock()) {
                j.setBlock(false);
                System.out.println("El usuario ha sido desbloqueado.");
            } else
                System.out.println("El usuario no está bloqueado.");
        } else {
            System.out.println("El usuario no es un jugador.");
        }
    }

    @Override
    public void show() {
        System.out.println("1.Gestionar Desafíos\n2.Editar personajes\n3.Bloqueo de usuarios\n4.Crear Equipamiento\n5.Salir");
    }
}