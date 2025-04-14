package Personajes;


public class VampiroFactory extends PersonajeFactory {

    public Personaje crearPersonaje() {
        return new Vampiro();
    }

}