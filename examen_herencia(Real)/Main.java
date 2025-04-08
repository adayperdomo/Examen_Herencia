/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        // Crear array de empleados
        Empleados[] empleados = new Empleados[4];

        empleados[0] = new EmpleadoFijo("Ana", "García", 30, 1800);
        empleados[1] = new EmpleadoHoras("Luis", "Martínez", 25, 120, 12.5);
        empleados[2] = new EmpleadoFijo("Carlos", "Pérez", 45, 2200);
        empleados[3] = new EmpleadoHoras("Lucía", "Rodríguez", 20, 80, 10.0);

        // Mostrar información de todos los empleados
        for (Empleados empleado : empleados) {
            empleado.mostrarInformación();
        }
    }
}

