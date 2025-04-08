/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia2;

/**
 *
 * @author Alumno
 */
public abstract class Publicaciones {
    //Creo el constructor y defino los atributos
    protected String fecha;
    protected String autor;
    
    // Uso los atributos
    public Publicaciones(String fecha, String autor){
        this.fecha = fecha;
        this.autor = autor;
    }
    
    public abstract void mostrarContenido();

    // Método para mostrar información general y luego el contenido específico
    public void mostrarInformacion() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Autor: " + autor);
        mostrarContenido(); // Cada tipo de publicación define cómo se ve su contenido
        System.out.println("------------------------------");
    }
}
