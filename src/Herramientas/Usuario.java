package Herramientas;

public abstract class Usuario {
    protected String userName;
    protected String password;

    protected HerramientasRol herramientas;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return this.password;
    }

    public HerramientasRol getHerramientas() {
        return this.herramientas;
    }

    public void setHerramientas(HerramientasRol herramientas) {this.herramientas = herramientas;}

    public void mostrarHerramientas(){
        this.herramientas.show();
    }

    public void setPassword(String password) {
        this.password = password;
    }

}