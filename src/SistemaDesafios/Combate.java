package SistemaDesafios;

import Herramientas.Jugador;
import Personajes.*;
import java.util.Random;

public class Combate {

    private Jugador desafiante;
    private Jugador desafiado;
    private Jugador ganador;
    private boolean esEmpate = false;
    private int numRondas = 0;


    public Jugador getGanador() {
        if (this.esEmpate) {
            return null;// cambiar por algo
        }
        else {
            return this.ganador;
        }

    }
    //Logica de vampiros mirar y comprobar que no haya nada raro o falte
    public void empezarCombate() {

        Personaje personajeDesafiante = desafiante.getPersonaje();
        Personaje personajeDesafiado = ganador.getPersonaje();
        inicializarRabiaSiLicantropo(personajeDesafiante);
        inicializarRabiaSiLicantropo(personajeDesafiado);
        int vidaTotalDesafiante = personajeDesafiante.getSalud() + personajeDesafiante.getEsbirros().getSaludTotal();
        int vidaTotalDesafiado = personajeDesafiado.getSalud() + personajeDesafiado.getEsbirros().getSaludTotal();
        Random random = new Random();

        while (vidaTotalDesafiante!= 0 && vidaTotalDesafiado!=0) {
            this.numRondas++;
            int potencialAtaqueDesafiante = calcularPotencial(personajeDesafiante,true);
            int potencialAtaqueDesafiado = calcularPotencial(personajeDesafiado,true);
            int potencialDefensaDesafiante = calcularPotencial(personajeDesafiante,false);
            int potencialDefensaDesafiado = calcularPotencial(personajeDesafiado,false);

            int valorAtaqueDesafiante = calcularExito(potencialAtaqueDesafiante,random);
            int valorDefensaDesafiante = calcularExito(potencialDefensaDesafiante,random);
            int valorAtaqueDesafiado = calcularExito(potencialAtaqueDesafiado,random);
            int valorDefensaDesafiado = calcularExito(potencialDefensaDesafiado,random);

            if (valorAtaqueDesafiante >= valorDefensaDesafiado) {
                vidaTotalDesafiado -= 1;
                aumentarRabiaSiEsLicantropo(personajeDesafiado);
                disminuirTalentoSiEsCazador(personajeDesafiado);
            }
            if (valorAtaqueDesafiado >= valorDefensaDesafiante) {
                vidaTotalDesafiante -= 1;
                aumentarRabiaSiEsLicantropo(personajeDesafiante);
                disminuirTalentoSiEsCazador(personajeDesafiante);
            }


            if (vidaTotalDesafiante <= 0 && vidaTotalDesafiado <= 0) {
                this.esEmpate = true; // Empate
            } else if (vidaTotalDesafiante <= 0) {
                this.ganador = desafiado;
            } else if (vidaTotalDesafiado <= 0) {
                this.ganador = desafiante;
            }
        }


    }

    private static void inicializarRabiaSiLicantropo(Personaje personaje) {
        if (personaje instanceof Licantropo ) {
            ((Licantropo) personaje).setRabia(0);
        }
    }

    private void disminuirTalentoSiEsCazador(Personaje personajeDesafiante) {
        if (personajeDesafiante instanceof Cazador cazador) {
            cazador.disminuirVoluntad();

        }
    }

    private void aumentarRabiaSiEsLicantropo(Personaje personaje) {
        if (personaje instanceof Licantropo licantropo) {
            licantropo.setRabia(licantropo.getRabia() + 1);
        }
    }
    private int calcularExito(int potencial,Random random) {

        int numeroExitos=0;
        for (int i = 0; i < potencial; i++) {
            int numeroAleatorio = random.nextInt(6) + 1; // Entre 1 y 6
            if (numeroAleatorio == 5 || numeroAleatorio == 6) {
                numeroExitos++;
            }

        }
        return numeroExitos;
    }

    public int getNumRondas() {

        return this.numRondas;
    }

    private int calcularPotencial(Personaje personaje, boolean esAtaque) {
        int poderBase = personaje.getPoder();
        // Se obtiene el poder de ataque o defensa del arma y armadura activa
        int poderEquipos = esAtaque ?
                personaje.getArmaActiva().getModificadorAtaque() + personaje.getArmaduraActiva().getModAtaque() :
                personaje.getArmaActiva().getModificadorDefensa() + personaje.getArmaduraActiva().getModDefensa();

        int poderTotal = poderBase + poderEquipos;

        switch (personaje) {
            case Vampiro vampiro -> {
                int valorSangre = vampiro.getPuntosSangre();
                int poderSangre = valorSangre >= 5 ? 2 : 0;
                int costeDisciplina = vampiro.getDisciplina().getCosteSangre();
                int poderDisciplina = valorSangre <= costeDisciplina ?
                        (esAtaque ?
                                vampiro.getDisciplina().getValorAtaque() :
                                vampiro.getDisciplina().getValorDefensa())
                        : 0;
                poderTotal += poderDisciplina + poderSangre;
            }
            case Licantropo licantropo -> {
                int valorRabia = licantropo.getRabia();
                int poderDon = licantropo.getDon().permiteUtilizar(valorRabia) ?
                        (esAtaque ?
                                licantropo.getDon().getValorAtaque() :
                                licantropo.getDon().getValorDefensa())
                        : 0;
                poderTotal += poderDon + valorRabia;
            }
            case Cazador cazador -> {
                int poderTalento = esAtaque ?
                        cazador.getTalento().getValorAtaque() :
                        cazador.getTalento().getValorDefensa();
                poderTotal += poderTalento + cazador.getVoluntad();
            }
            default -> {}
        }

        poderTotal+= personaje.getValorFortalezas();
        poderTotal-= personaje.getValorDebilidades();

        return poderTotal;
    }


}


