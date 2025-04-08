/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia;

/**
 *
 * @author Usuario
 */
public class Camion extends Vehiculo {
    private double capacidadCarga; // en toneladas

    public Camion(String matricula, String marca, String modelo, double capacidadCarga) {
        super(matricula, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Camión:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
        System.out.println("------------------------------");
    }
}
