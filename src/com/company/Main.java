package com.company;

public class Main {

    public static void main(String[] args) {

    Empleados empleado = new Empleados("Juan","Perez",32098723,50);
    Vajilla empleado2 = new Vajilla("Roberto", "Bolaños",50702472,45,3);

    empleado.getDatosPersonales();
    empleado.calcularSueldo();

    empleado2.getDatosPersonales();
    empleado2.calcularSueldo();

    }
}
