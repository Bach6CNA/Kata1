/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpstms.java.katas;

/**
 *
 * @author richpolis
 */
public class Autor {
    
    private String name;
    private String email;
    private char genero;

    public Autor(String name, String email, char genero) {
        this.name = name;
        this.email = email;
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return "Autor{" + "name=" + name + ", email=" + email + ", genero=" + genero + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
    
}
