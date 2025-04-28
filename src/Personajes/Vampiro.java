package Personajes;

public class Vampiro extends Personaje {

    private int puntosSangre;
    private Disciplina disciplina;
    private int edad;

    public Vampiro() {
        //this.disciplina = new Disciplina();
    } //esto no te hace falta en el constructor pq lo metes desde fuera con VampiroFactory
    public int getPuntosSangre() {
        return this.puntosSangre;
    }
    public void actualizarPuntosSangre(int sangre) {
        //a los metodos que sean set mejor llamalos set y el nombre literal del atributo para q funcione el XML
        this.puntosSangre = sangre;
    }
    public Disciplina getDisciplina() {

        return this.disciplina;
    }
    public int getEdad() {

        return this.edad;
    }
    public void setEdad(int edad) {

        this.edad = edad;
    }
    public void setDisciplina(Disciplina disciplina) {

        this.disciplina = disciplina;
    }
}