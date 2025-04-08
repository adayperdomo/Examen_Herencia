/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia;

/**
 *
 * @author Alumno
 */
// Creo la clase y hago que extiende de la clase Empleados
public class EmpleadoHoras extends Empleados{
    private double horasTrabajadas;
    private double precioHoras;

    // Inicio los atributos y utilizo los de la clase Empleados
    public EmpleadoHoras(String nombre, String apellidos, int edad, double horasTrabajadas, double precioHoras) {
        super(nombre, apellidos, edad);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHoras = precioHoras;
    }
    
    @Override
    public double calcularSalario() {
        return horasTrabajadas * precioHoras;
    }

    @Override
    public void mostrarInformación() {
        System.out.println("Empleado por Horas:");
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Precio por hora: " + precioHoras + " €");
        System.out.println("Salario calculado: " + calcularSalario() + " €");
        System.out.println("------------------------------");
    }
}
