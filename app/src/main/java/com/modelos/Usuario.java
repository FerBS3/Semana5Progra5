package com.modelos;

public class Usuario {
    private String nombre;
    private int edad;
    private int ingresos;
    private int altura;
    private String genero;

    public Usuario() {
        this.nombre = "Fernando Racista con Gonzalo";
        this.edad = 20;
        this.ingresos = 10;
        this.altura = 180;
        this.genero = "racista";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
