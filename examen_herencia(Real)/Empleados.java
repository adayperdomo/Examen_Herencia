/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia;

/**
 *
 * @author Alumno
 */
public abstract class Empleados {
    //Creo el constructor y defino los atributos
    protected String nombre;
    protected String apellidos;
    protected int edad;

    // Uso los atributos
    public Empleados(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public abstract double calcularSalario();
    
    public abstract void mostrarInformación();
}
