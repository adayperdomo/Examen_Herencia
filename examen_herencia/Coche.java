/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia;

/**
 *
 * @author Usuario
 */
public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("------------------------------");
    }
}


