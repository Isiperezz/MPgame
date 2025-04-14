package Personajes;

public class CazadorFactory extends PersonajeFactory {

    // Este metodo crea un objeto de tipo Cazador
    public Personaje crearPersonaje() {

        return new Cazador();
    }
}