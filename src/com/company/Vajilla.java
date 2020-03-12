package com.company;

public class Vajilla extends Empleados{

    private Integer utensillos;

    public Vajilla(String nombre, String apellido, Integer dni, Integer sueldo, Integer utensillos) {
        super(nombre, apellido, dni, sueldo);
        this.utensillos = utensillos;
    }

    @Override
    public void calcularSueldo() {
        Integer sueldoNeto;
        sueldoNeto = sueldo - (utensillos * 5);
        System.out.println("Sueldo: " + sueldoNeto + " frijoles mágicos");
    }
}
