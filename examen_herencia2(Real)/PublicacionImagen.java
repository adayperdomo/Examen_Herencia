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
public class PublicacionImagen extends Publicaciones {
    private String url;

    public PublicacionImagen(String fecha, String autor, String url) {
        super(fecha, autor);
        this.url = url;
    }

    @Override
    public void mostrarContenido() {
        System.out.println("Imagen: " + url);
    }
}
