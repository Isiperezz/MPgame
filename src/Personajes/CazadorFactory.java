package Personajes;

import java.util.Scanner;

public class CazadorFactory extends PersonajeFactory {

    // Este metodo crea un objeto de tipo Cazador
    public Personaje crearPersonaje() {
        Cazador cazador = new Cazador();
        cazador.initializeValues();
        solicitarDatos(cazador);
        System.out.println("Tu cazador tendrá un valor de Voluntad, el cual se reducirá cada vez que reciba daño.");
        cazador.setVoluntad(3);
        System.out.println("Como has seleccionado un cazador, dispondrás de la habilidad especial: Talento.");
        Talento talento = new Talento();
        talento.inicializate("Talento");
        cazador.setTalento(talento);
//        Fortaleza fortaleza = new Fortaleza();
//        fortaleza.initialize("Instinto Letal");
//        cazador.getFortalezas().add(fortaleza);
//        Debilidad debilidad = new Debilidad();
//        debilidad.initialize("Fe Quebrada");
//        cazador.getDebilidades().add(debilidad);
//        System.out.println("El cazador tiene la debilidad: " + debilidad.getNombreDebilidad() + " y la fortaleza: " + fortaleza.getNombre());
        return cazador;
    }
}