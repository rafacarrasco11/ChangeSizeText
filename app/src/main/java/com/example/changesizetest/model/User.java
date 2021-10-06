package com.example.changesizetest.model;

import java.io.Serializable;

/**
 * Clase que guarda la informacion del login del usuario
 *
 * Esta clase debe implementar la interfaz serializable porque esta contenida
 * dentro de la clase Message que se envia por un Intent
 * ERROR --> Parcelable encountered IOException writing serializable object (name = com.example.changesizetest.model.Message)
 */
public class User implements Serializable {
    private String name;
    private String user;

    public User(String name, String user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
