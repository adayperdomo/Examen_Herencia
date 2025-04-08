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
public class PublicacionVideo extends Publicaciones {
    private String url;
    private int duracion; // en segundos

    public PublicacionVideo(String fecha, String autor, String url, int duracion) {
        super(fecha, autor);
        this.url = url;
        this.duracion = duracion;
    }

    @Override
    public void mostrarContenido() {
        System.out.println("Video: " + url);
        System.out.println("Duración: " + duracion + " segundos");
    }
}
