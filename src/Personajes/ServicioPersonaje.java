
package Personajes;


public class ServicioPersonaje {

    private PersonajeFactory factory;

    public ServicioPersonaje(PersonajeFactory factorycreate) {

        this.factory=factorycreate;
    }
    public Personaje crearPersonaje() {

        Personaje nuevoPersonaje = this.factory.crearPersonaje();

        return nuevoPersonaje;
    }


}