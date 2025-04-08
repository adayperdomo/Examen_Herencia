/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia2;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona {
    private String departamento;

    public Profesor(String nombre, String correo, String departamento) {
        super(nombre, correo);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Departamento: " + departamento);
        System.out.println("------------------------------");
    }
}

