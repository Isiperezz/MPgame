package SistemaDesafios;

import Herramientas.Jugador;
import SistemaPersistencia.AlmacenDesafios;
import SistemaPersistencia.PersistenciaManager;
import SistemaPersistencia.UsersData;

public class Finalizado implements EstadoDesafio {


    public void avanzarEstado(Desafio desafio) {
        PersistenciaManager persistencia = PersistenciaManager.getInstance();
        UsersData usersData = persistencia.getPersistencia().getUsersData();
        AlmacenDesafios almacenDesafios = usersData.getDesafios();
        Jugador desafiado = desafio.getDesafiado();
        almacenDesafios.aniadirDesafio(desafiado, desafio);
        Jugador desafiante = desafio.getDesafiante();
        almacenDesafios.aniadirDesafio(desafiante, desafio);


    }

}