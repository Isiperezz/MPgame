package Personajes;

public class LicantropoFactory extends PersonajeFactory {

    public Personaje crearPersonaje() {

        return new Licantropo();
    }

}