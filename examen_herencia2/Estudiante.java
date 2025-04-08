/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia2;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String correo, String curso) {
        super(nombre, correo);
        this.curso = curso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Curso: " + curso);
        System.out.println("------------------------------");
    }
}
