/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpstms.java.katas;

import java.util.ArrayList;


/**
 *
 * @author richpolis
 */
public class Libro {
    
    private String nombre;
    private ArrayList<Autor> autores;
    private int numAutores;
    private double precio;
    private int cantidadStock;

    public Libro(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = 0;
        this.numAutores = 0;
        this.autores = new ArrayList<Autor>();
    }

    public Libro(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.numAutores = 0;
        this.autores = new ArrayList<Autor>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + '}';
    }
    
    public void printAutores(){
        for(Autor autor: this.autores){
            System.out.println(autor);
        }
    }

    public void addAutor(Autor newAutor){
        this.autores.add(newAutor);
    }
    
}
