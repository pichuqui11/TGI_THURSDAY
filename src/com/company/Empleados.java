package com.company;

import java.sql.SQLOutput;

public class Empleados {

    private String nombre;
    private String apellido;
    private Integer dni;
    protected Integer sueldo;

    public Empleados(String nombre, String apellido, Integer dni, Integer sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public void getDatosPersonales (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
    }
    public void calcularSueldo () {
        System.out.println("Sueldo: " + sueldo + " frijoles mágicos");
    }
}
