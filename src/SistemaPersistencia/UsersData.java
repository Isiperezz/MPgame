package SistemaPersistencia;

import Herramientas.Jugador;
import Herramientas.Usuario;
import Personajes.Personaje;

import java.util.*;

public class UsersData {

    private Map <Jugador, Personaje> personajesJugadores;
    private Map <String, Usuario> usuarios;
    private final Login login;
    private final AlmacenDesafios almacenDesafios;
    private List<Jugador> ranking;

    public UsersData() {
        login = new Login();
        almacenDesafios = new AlmacenDesafios();
    }

    public Usuario getUsuarioByNick(String nick) {
        return usuarios.get(nick);
    }

    public Personaje getPersonajeUsuario(Jugador user) {
        return personajesJugadores.get(user);
    }

    public Login getLogin() {
        return login;
    }

    public AlmacenDesafios getDesafios() {
        return almacenDesafios;
    }

    public List<Jugador> getRankingActual() {
        return ranking;
    }

}