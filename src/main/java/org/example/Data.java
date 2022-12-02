package org.example;

public class Data {
    public String usuario;
    public String token;
    private static Data instance = null;
    private Data (){}
    public static Data getInstance(){
        if (instance==null){
            instance = new Data();
        }
        return instance;
    }
    public void password(String token) {
        this.token = token;
    }
    public void login(String usuario) {
        this.usuario = usuario;
    }
    public String toString(){
        return "Usuario: "+usuario+"\n contraseña: "+token;
    }
}
