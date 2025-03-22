package Herramientas;

public abstract class Usuario {

    protected HerramientasRol herramientas;

    public void mostrarHerramientas(){
        this.herramientas.show();
    }

}