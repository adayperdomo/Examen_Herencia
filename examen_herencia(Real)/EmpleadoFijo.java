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
public class EmpleadoFijo extends Empleados{
    // Creo el constructor
    private double salarioMensual;

    // Inicio los atributos y utilizo los de la clase Empleados
    public EmpleadoFijo(String nombre, String apellidos, int edad, double salarioMensual) {
        super(nombre, apellidos, edad);
        this.salarioMensual = salarioMensual;
    }
    
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    @Override
    public void mostrarInformación() {
        System.out.println("Empleado Fijo:");
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Salario mensual: " + salarioMensual + " €");
        System.out.println("Salario calculado: " + calcularSalario() + " €");
        System.out.println("------------------------------");
    }
}
