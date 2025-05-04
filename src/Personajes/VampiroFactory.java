package Personajes;


import java.util.Random;
import java.util.Scanner;

public class VampiroFactory extends PersonajeFactory {

    public Personaje crearPersonaje() {
        Scanner scanner = new Scanner(System.in);
        Vampiro vampiro = new Vampiro();
        vampiro.initializeValues();
        solicitarDatos(vampiro);
        boolean entradaValida = false;
        int valorEdad = 0;
        while (!entradaValida) {
            System.out.print("Introduce un la edad de tu vampiro: ");
            if (scanner.hasNextInt()) { // Mira si lo que hay es un entero
                valorEdad = scanner.nextInt();
                entradaValida = true;
            } else {
                System.out.println("Eso no es un número. Inténtalo otra vez.");
                scanner.next();
            }
        }
        vampiro.setEdad(valorEdad);
        System.out.println("Como has seleccionado un vampiro, dispondrás de la habilidad especial: Disciplina");
        Disciplina disciplina = new Disciplina();
        disciplina.inicializate("Disciplina");
        vampiro.setDisciplina(disciplina);
        System.out.println("Tu vampiro tendrá un valor de Sangre, el cual se utilizará para activar sus disciplinas.");
        Random random = new Random();
        int sangre = random.nextInt(10)+1;
        vampiro.setPuntosSangre(sangre);
//        Fortaleza fortaleza = new Fortaleza();
//        fortaleza.initialize("Voluntad de la Noche");
//        vampiro.getFortalezas().add(fortaleza);
//        Debilidad debilidad = new Debilidad();
//        debilidad.initialize("El Beso del Alba");
//        vampiro.getDebilidades().add(debilidad);
//        System.out.println("El vampiro tiene la debilidad: " + debilidad.getNombreDebilidad() + " y la fortaleza: " + fortaleza.getNombre());


        return vampiro;
    }


}