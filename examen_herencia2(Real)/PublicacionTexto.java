/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia2;

/**
 *
 * @author Alumno
 */
// Creo la clase y hago que extiende de la clase Publicaciones
public class PublicacionTexto extends Publicaciones {
    private String mensaje;

    public PublicacionTexto(String fecha, String autor, String mensaje) {
        super(fecha, autor);
        this.mensaje = mensaje;
    }

    @Override
    public void mostrarContenido() {
        System.out.println("Mensaje: " + mensaje);
    }
}
