package Herramientas;

public abstract class Usuario {
    protected String name;
    protected String password;

    protected HerramientasRol herramientas;

    public String getUserName() {
        return this.name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public HerramientasRol getHerramientas() {
        return this.herramientas;
    }

    public void mostrarHerramientas(){
        this.herramientas.show();
    }

}