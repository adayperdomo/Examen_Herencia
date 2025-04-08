/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia;

/**
 *
 * @author Usuario
 */
public class Moto extends Vehiculo {
    private int cilindrada; // en cc

    public Moto(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("------------------------------");
    }
}
