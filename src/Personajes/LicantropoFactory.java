package Personajes;

import java.util.Scanner;

public class LicantropoFactory extends PersonajeFactory {

    public Personaje crearPersonaje() {
        Licantropo licantropo = new Licantropo();
        licantropo.initializeSalud();
        solicitarDatos(licantropo);
        licantropo.setRabia(0);
        licantropo.setPeso(90);
        licantropo.setAltura(50);
        System.out.println("Como has seleccionado un licantropo, tendras la habilidad especial: Don");
        Don don = new Don();
        don.inicializate("Don");
        licantropo.setDon(don);
        licantropo.setFormaBipeda(false);
        System.out.println("Tu licantropo podra cambiar de forma aumentando su peso y altura");
        Fortaleza fortaleza = new Fortaleza();
        fortaleza.initialize("Furia Primigenia");
        licantropo.getFortalezas().add(fortaleza);
        Debilidad debilidad = new Debilidad();
        debilidad.initialize("Lazo Lunar");
        licantropo.getDebilidades().add(debilidad);
        System.out.println("El licantropo tiene la debilidad: " + debilidad.getNombreDebilidad() + " y la fortaleza: " + fortaleza.getNombre());

        return licantropo;
    }

}