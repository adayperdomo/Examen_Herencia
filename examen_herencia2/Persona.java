/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia2;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String nombre;
    protected String correo;

    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Método abstracto: cada subclase debe implementar cómo mostrar la información
    public abstract void mostrarInformacion();
}
