/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia2;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        // Creación de un array de tipo Persona
        Persona[] registro = new Persona[4];

        registro[0] = new Estudiante("Ana Martínez", "ana.martinez@example.com", "1º ESO");
        registro[1] = new Profesor("Carlos Pérez", "carlos.perez@example.com", "Matemáticas");
        registro[2] = new Estudiante("María Gómez", "maria.gomez@example.com", "4º de Bachillerato");
        registro[3] = new Profesor("Luis Rodríguez", "luis.rodriguez@example.com", "Historia");

        // Recorrer el array e invocar el método mostrarInformación()
        for (Persona persona : registro) {
            persona.mostrarInformacion();
        }
    }
}

