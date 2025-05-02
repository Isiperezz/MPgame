package Herramientas;

import SistemaDesafios.Desafio;
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
        PersistenciaManager p = PersistenciaManager.getInstance();
        this.usuarioActual.getHerramientas().show();
        String opcion;
        do {
            opcion = sc.nextLine();
        } while (Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 4);
        HerramientasDeAdministrador herradmin = new HerramientasDeAdministrador();

        switch (opcion) {
            case "1":
                GestorDesafiosAdmin gestadmin = herradmin.getDesafios();
                gestionarDesafiosAdmin(gestadmin,sc);
                break;
            case "2":
                EditarPersonaje edpers = herradmin.getEditorPersonajes();
                gestionarEdicionPersonaje(edpers,sc);
                break;
            case "3":
                System.out.println("Ingrese el nombre de usuario a bloquear");
                String nick = sc.nextLine();
                Usuario user = p.getPersistencia().getUsersData().getUsuarioByNick(nick);
                if (user == null) {
                    System.out.println("No existe un usuario asociado.");
                }else if(user instanceof Jugador) {
                    Jugador j = (Jugador) user;
                    if (!j.isBlock()) {
                        j.setBlock(true);
                        System.out.println("El usuario ha sido bloqueado.");
                    } else
                        System.out.println("El usuario ya está bloqueado.");
                } else {
                    System.out.println("El usuario no es un jugador.");
                }
                break;
            case "4":

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcion);
        }
    }

    private void gestionarDesafiosAdmin(GestorDesafiosAdmin gestadmin, Scanner sc) {
        String subopcion;
        System.out.println("\nGestión de Desafíos\n1. Mostrar todos\n2. Mostrar pendientes\n3. Validar uno\n");
        do {
            subopcion = sc.nextLine();
        } while (Integer.parseInt(subopcion) < 1 || Integer.parseInt(subopcion) > 3);
        switch (subopcion) {
            case "1":
                gestadmin.mostrarDesafios();
                break;
            case "2":
                gestadmin.mostrarPendientesValidacion();
                break;
            case "3":
                gestadmin.mostrarPendientesValidacion();
                String indice;
                int idx;
                do {
                    System.out.print("Introduce el índice del desafío a validar: ");
                    indice = sc.nextLine();
                } while (!indice.matches("\\d+"));  //para comprobar q es un numero en string y q no se rompa
                idx = Integer.parseInt(indice);
                if (idx >= 0 && idx < gestadmin.lenPendientesValidacion()) {
                    Desafio desafio = gestadmin.getDesafio(idx);
                    gestadmin.validarDesafio(desafio);
                    System.out.println("Desafío validado.");
                } else {
                    System.out.println("Índice fuera de rango.");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + subopcion);
        }
    }

    private void gestionarEdicionPersonaje(EditarPersonaje edpers, Scanner sc) {
        System.out.println("Ingrese su tipo de personaje");
        String tipo = sc.nextLine();
        edpers.setTipo(tipo);
        String subopcion;
        do {
            System.out.print("\nEditar personaje:\n1. Editar salud\n2. Salir\n");
            subopcion = sc.nextLine();
            switch (subopcion) {
                case "1":
                    System.out.print("Nuevo valor de salud: ");
                    String valor = sc.nextLine();
                    if (valor.matches("\\d+")) {    //esto verifica que sea un numero dentro de q es un String
                        int nuevaSalud = Integer.parseInt(valor);
                        edpers.editarSalud(nuevaSalud);
                    }
                    break;
                case "2":
                    break;
                default:
                    System.out.println("Opcion no válida.");
            }
        } while (Integer.parseInt(subopcion) != 2);
    }

}

