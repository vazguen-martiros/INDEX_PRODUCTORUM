package com.dev.mrvazguen.indexproductorum.data.model;

import androidx.annotation.AttrRes;
 

public class Usuari {
    String nombre;
    String email;
    String pasword;

    public  Usuari(String email,String userId){
        this.nombre = nombre;
        this.email = email;
    }

    public  Usuari(String nombre,String email,String pasword) {
        this(nombre,email);
        this.pasword= pasword;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

}
