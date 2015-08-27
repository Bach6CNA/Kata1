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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largo = 5;
        Libro libro = new Libro("Java",200,10);
        for(int cont = 0; cont<=largo-1; cont++){
            Autor nuevo = new Autor("Ricardo"+cont,"richpolis@gmail.com",'A');
            libro.addAutor(nuevo);
        }
        
        libro.printAutores();
    }
    
}
