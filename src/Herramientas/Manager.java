package Herramientas;

import SistemaPersistencia.PersistenciaManager;

import java.util.*;

public class Manager {
    private Usuario usuarioActual;


    public Manager() {
    }

    public void start() {
        PersistenciaManager p = PersistenciaManager.getInstance();
        String opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Iniciar Sesion\n 2.Registrarse");
        do {
            opcion = sc.nextLine();
        } while (Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 2);
        Usuario user;
        switch (opcion) {
            case "1":
                do {
                    System.out.println("Ingrese su nombre de usuario");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String pass = sc.nextLine();
                    user = p.getPersistencia().getUsersData().getLogin().iniciarSesion(nombre, pass);
                } while (user == null);
                break;
            case "2":
                user = p.getPersistencia().getUsersData().getLogin().registrarJugador();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcion);
        }
        this.usuarioActual = user;
        if (usuarioActual instanceof Jugador) {
            this.runJugador();
        } else {
            this.runAdmin();
        }
    }

    private void runJugador() {
        Scanner sc = new Scanner(System.in);
        this.usuarioActual.getHerramientas().show();

    }

    private void runAdmin() {
        Scanner sc = new Scanner(System.in);
        this.usuarioActual.getHerramientas().show();
    }

}