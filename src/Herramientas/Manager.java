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
        System.out.println("1. Iniciar Sesion\n2. Registrarse");
        int opcion = this.readOption(1, 2);
        Scanner sc = new Scanner(System.in);
        Usuario user;
        switch (opcion) {
            case 1:
                do {
                    System.out.println("Ingrese su nombre de usuario");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String pass = sc.nextLine();
                    user = p.getPersistencia().getUsersData().getLogin().iniciarSesion(nombre, pass);
                } while (user == null);
                break;
            case 2:
                user = p.getPersistencia().getUsersData().getLogin().registrarJugador();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcion);
        }
        this.usuarioActual = user;
        if (this.usuarioActual instanceof Jugador) {
            if (((Jugador) this.usuarioActual).isBlock()){
                System.out.println("Cuenta bloqueada");
            } else {
                this.runJugador();
            }
        } else {
            this.runAdmin();
        }
    }

    private void runJugador() {
        int opcion = -1;
        do {
            this.usuarioActual.getHerramientas().show();
            HerramientasDeJugador herrJug = (HerramientasDeJugador) this.usuarioActual.getHerramientas();
            opcion = this.readOption(1,4);
            switch (opcion) {
                case 1:
                    this.desafiosJugador(herrJug.getDesafios());
                    break;
                case 2:
                    this.eleccionDeEquipamiento(herrJug.getGestorEquipamiento());
                    break;
                case 3:
                    this.consultar(herrJug.getConsultas());
                    break;
                case 4:
                    return;
            }
        } while(opcion != 4);
    }

    private void desafiosJugador(GestorDesafiosJugador g){
        System.out.println("1.Aceptar un desafío\n2.Desafiar a un jugador");
        int subopcion = this.readOption(1, 2);
        switch (subopcion) {
            case 1:
                if (g.isDesafioPendiente()) {
                    System.out.println("Desafíos pendientes de aceptación:");
                    g.mostrarDesafiosPendientes();
                    System.out.println("Introduce el índice del desafío:");
                    int desafioIndex = this.readOption(0, g.getNumDesafios());
                    g.aceptarDesafio(desafioIndex);
                } else {
                    System.out.println("No hay desafíos pendientes");
                }
                break;
            case 2:
                System.out.println("Introduce el nombre de un jugador:");
                Scanner sc = new Scanner(System.in);
                String nombre = sc.nextLine();
                Jugador desafiado = (Jugador)PersistenciaManager.getInstance().getPersistencia().getUsersData().getUsuarioByNick(nombre);
                if (desafiado == null){
                    System.out.println("El jugador "+nombre+" no existe");

                } else {
                    System.out.println("Introduzca el oro a apostar");
                    int oro = this.readOption(1, Math.max(((Jugador)this.usuarioActual).getPersonaje().getOro(), desafiado.getPersonaje().getOro()));
                    g.desafiarJugador(desafiado, oro);
                }
        }
    }

    private void consultar(Consultas c){
        System.out.println("1.Consultar ranking de jugadores\n2.Ver todos los jugadores\n3.Ver desafíos antiguos");
        int opcion = this.readOption(1, 2);
        switch (opcion) {
            case 1:
                c.consultarRanking();
                break;
            case 2:
                c.consultarJugadores();
                break;
            case 3:
                c.consultarDesafiosPasados((Jugador) this.usuarioActual);
                break;
        }
    }

    public void eleccionDeEquipamiento(GestorEquipamiento g){
        System.out.println("1.Elegir arma activa\n2.Elegir armadura activa");
        int subopcion = this.readOption(1, 2);
        switch (subopcion) {
            case 1:
                g.elegirArmaActiva();
                break;
            case 2:
                g.elegirArmadura();
                break;
        }
    }

    private void runAdmin() {
        PersistenciaManager p = PersistenciaManager.getInstance();
        int opcion = -1;
        do {
            this.usuarioActual.getHerramientas().show();
            opcion = this.readOption(1, 5);
            HerramientasDeAdministrador herrAdmin = (HerramientasDeAdministrador) this.usuarioActual.getHerramientas();
            switch (opcion) {
                case 1:
                    GestorDesafiosAdmin gestadmin = herrAdmin.getDesafios();
                    gestionarDesafiosAdmin(gestadmin);
                    break;
                case 2:
                    EditarPersonaje edPers = herrAdmin.getEditorPersonajes();
                    gestionarEdicionPersonaje(edPers);
                    break;
                case 3:
                    p.getPersistencia().getUsersData().mostrarJugadores();
                    System.out.println("1.Bloquear un jugador\n2.Desbloquear un jugador");
                    int subopcion = this.readOption(1, 2);
                    switch (subopcion) {
                        case 1:
                            herrAdmin.bloquearJugador();
                            break;
                        case 2:
                            herrAdmin.desbloquearJugador();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1. Crear arma\n 2. Crear armadura");
                    int subopt = this.readOption(1,2);
                    switch (subopt) {
                        case 1:
                            herrAdmin.crearArma();
                            break;
                        case 2:
                            herrAdmin.crearArmadura();
                            break;
                    }
                    break;
                case 5:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }
        } while(opcion != 5);
    }

    private int readOption(int min,int max) {
        Scanner sc = new Scanner(System.in);
        boolean correct;
        int opcion = -1;

        do {
            try {
                opcion = sc.nextInt();
                correct = true;
            } catch (Exception e) {
                correct = false;
                System.out.println("Opción no valida");
            }
        } while (!correct || opcion < min || opcion > max);

        return opcion;
    }

    private void gestionarDesafiosAdmin(GestorDesafiosAdmin gestAdmin) {
        System.out.println("\nGestión de Desafíos\n1. Mostrar todos\n2. Mostrar pendientes\n3. Validar uno\n");

        int subopcion = this.readOption(1, 3);

        switch (subopcion) {
            case 1:
                gestAdmin.mostrarDesafios();
                break;
            case 2:
                gestAdmin.mostrarPendientesValidacion();
                break;
            case 3:
                gestAdmin.mostrarPendientesValidacion();
                System.out.println("Introduzca el índice del desafío a validar");
                int idx = this.readOption(0, gestAdmin.getNumPendientesValidacion());
                Desafio desafio = gestAdmin.getDesafio(idx);
                gestAdmin.validarDesafio(desafio);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + subopcion);
        }
    }

    private void gestionarEdicionPersonaje(EditarPersonaje edPers) {
        Scanner sc = new Scanner (System.in);
        String tipo;
        do {
            System.out.println("Ingrese su tipo de personaje");
            tipo = sc.nextLine();
        } while (!PersistenciaManager.getInstance().getPersistencia().getGameData().getPersonajes().keySet().contains(tipo));
        edPers.setTipo(tipo);
        System.out.print("\nEditar personaje:\n1. Editar salud\n2. Salir\n");

        int subopcion = this.readOption(1, 2);
        do {
            switch (subopcion) {
                case 1:
                    System.out.print("Nuevo valor de salud entre 1 y 5: ");
                    int nuevoValor = this.readOption(1, 5);
                    edPers.editarSalud(nuevoValor);
                    break;
                case 2:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + subopcion);
            }
            subopcion = this.readOption(1, 2);
        } while (subopcion != 2);
    }

}

