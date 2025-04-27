package Personajes;


import java.util.Scanner;

public class VampiroFactory extends PersonajeFactory {

    public Personaje crearPersonaje() {
        Scanner scanner = new Scanner(System.in);
        Vampiro vampiro = new Vampiro();
        solicitarDatos(vampiro);
        boolean entradaValida = false;
        System.out.println("Introduzca la edad de su vampiro: ");
        int valorEdad = scanner.nextInt();
        while (!entradaValida) {
            System.out.print("Introduce un número: ");
            if (scanner.hasNextInt()) { // Mira si lo que hay es un entero
                valorEdad = scanner.nextInt();
                entradaValida = true;
            } else {
                System.out.println("Eso no es un número. Inténtalo otra vez.");
                scanner.next();
            }
        }
        vampiro.setEdad(valorEdad);
        System.out.println("Como has seleccionado un vampiro, tendras la habilidad especial: Disciplina");
        Disciplina disciplina = new Disciplina();
        disciplina.inicializate("Disciplina");
        vampiro.setDisciplina(disciplina);




        return vampiro;
    }


}