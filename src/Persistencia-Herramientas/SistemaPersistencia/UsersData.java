package SistemaPersistencia;

import java.util.*;

/**
 * 
 */
public class UsersData {

    /**
     * Default constructor
     */
    public UsersData() {
    }

    /**
     * 
     */
    private Map <Jugador, Personaje> personajesJugadores;

    /**
     * 
     */
    private Map <String, Usuario> usuarios;

    /**
     * 
     */
    private Login login;

    /**
     * 
     */
    private AlmacenDesafios almacenDesafios;

    /**
     * 
     */
    private List<Jugador> ranking;

    /**
     * @param nick 
     * @return
     */
    public Usuario getUsuarioByNick(String nick) {
        // TODO implement here
        return null;
    }

    /**
     * @param user 
     * @return
     */
    public Personaje getPersonajeUsuario(Jugador user) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Login getLogin() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public AlmacenDesafios getDesafios() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Jugador> getRankingActual() {
        // TODO implement here
        return null;
    }

}