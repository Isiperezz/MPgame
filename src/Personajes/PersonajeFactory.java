package Personajes;

import SistemaPersistencia.Equipamiento;
import SistemaPersistencia.PersistenciaManager;
import SistemaPersistencia.RegistroEquipamiento;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public abstract class PersonajeFactory {

    public abstract Personaje crearPersonaje();


    public void solicitarDatos(Personaje personaje) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("¡Bienvenido a la creación de personaje!");
        System.out.println("Introduzca el nombre del personaje: ");
        String nombre = scanner.nextLine();
        while (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío. Introduzca el nombre de nuevo:");
            nombre = scanner.nextLine().trim();
        }
        personaje.setNombre(nombre);
        System.out.println("Por la estabilidad del juego, los valores de salud y poder se asignarán aleatoriamente, "
                + "así como el oro tendrá un valor inicial.");
        int oro = 100;
        System.out.println("Oro inicial: " + oro + " monedas brillantes");
        personaje.setOro(oro);
        int salud =random.nextInt(5)+1;
        System.out.println("Salud inicial: " + salud + " puntos (entre 1 y 5)");
        personaje.setSalud(5);
        int poder = random.nextInt(5)+1;
        System.out.println("Poder inicial: " + poder + " puntos (entre 1 y 5)");
        personaje.setPoder(poder);

        System.out.println("Su personaje obtendra aleatoriamente un numero aleatorio de esbirros que podran ser de diferentes tipos");
        AlmacenEsbirros almacen = new AlmacenEsbirros();
        int max_esbirros = 5;
        Esbirro esbirro = generarEsbirro(random);
        max_esbirros--;
        almacen.aniadirEsbirro(esbirro);

        while (esbirro instanceof Demonios && max_esbirros>0) {
            AlmacenEsbirros almacenDemonio = ((Demonios) esbirro).getDemonEsbirros();
            esbirro = generarEsbirro(random);
            max_esbirros--;
            almacenDemonio.aniadirEsbirro(esbirro);

         }
        personaje.setEsbirros(almacen);

        RegistroEquipamiento equipamientoDisponible =PersistenciaManager.getInstance().getPersistencia().getGameData().getEquipamiento();
        Map<String, Arma> armasPersonaje = personaje.getEquipo().getArmas();
        Map<String, Armadura> armadurasPersonaje = personaje.getEquipo().getArmaduras();

        insertarArmas(personaje, equipamientoDisponible, scanner, armasPersonaje);
        insertarArmaduras(personaje, equipamientoDisponible, scanner, armadurasPersonaje);

    }

    private void insertarArmaduras(Personaje personaje, RegistroEquipamiento equipamientoDisponible, Scanner scanner, Map<String, Armadura> armadurasPersonaje) {
        for (int i = 0; i <2 ; i++) {
            System.out.println("Seleccione una armadura para su personaje:");
            equipamientoDisponible.mostrarArmaduras();
            String idArmadura = scanner.nextLine();
            Equipamiento armadura = equipamientoDisponible.getById(idArmadura);
            armadurasPersonaje.put(idArmadura, (Armadura) armadura);
            if (i == 0) {
                personaje.getEquipo().setArmaduraActiva(idArmadura);
                System.out.println("Has seleccionado su armadura activa");
            }
            else {
                System.out.println("Has seleccionado su armadura secundaria");

            }

        }
    }

    private void insertarArmas(Personaje personaje, RegistroEquipamiento equipamientoDisponible, Scanner scanner, Map<String, Arma> armasPersonaje) {
        for (int i = 0; i <3 ; i++) {
            System.out.println("Seleccione un arma para su personaje:");
            equipamientoDisponible.mostrarArmas();
            String idArma = scanner.nextLine();
            Equipamiento arma = equipamientoDisponible.getById(idArma);
            armasPersonaje.put(idArma, (Arma) arma);
            if (i == 1) {
                personaje.getEquipo().setArmaActiva(idArma);
                System.out.println("Has seleccionado su arma activa");
            }
            else {
                System.out.println("Has seleccionado su arma secundaria");

            }

        }
    }


    private Esbirro generarEsbirro(Random random) {
        int tipoEsbirro = random.nextInt(3);
        return switch (tipoEsbirro) {
            case 0 -> new Humanos();
            case 1 -> new Demonios();
            case 2 -> new Ghouls();
            default -> throw new IllegalStateException("Tipo de esbirro desconocido: " + tipoEsbirro);
        };
    }



}