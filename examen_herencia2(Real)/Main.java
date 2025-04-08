/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia2;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        // Array de publicaciones
        Publicaciones[] publicaciones = new Publicaciones[3];

        publicaciones[0] = new PublicacionTexto("2025-04-08", "María", "¡Hola a todos!");
        publicaciones[1] = new PublicacionImagen("2025-04-07", "Carlos", "https://imagenes.com/foto.jpg");
        publicaciones[2] = new PublicacionVideo("2025-04-06", "Lucía", "https://videos.com/video.mp4", 120);

        // Recorrer y mostrar la información
        for (Publicaciones pub : publicaciones) {
            pub.mostrarInformacion();
        }
    }
}

