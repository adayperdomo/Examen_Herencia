/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_herencia;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {

        // Creación de un array de Vehiculo con distintos tipos de objetos
        Vehiculo[] flota = new Vehiculo[3];
        
        flota[0] = new Coche("ABC123", "Toyota", "Corolla", 4);
        flota[1] = new Camion("DEF456", "Volvo", "FH", 12.5);
        flota[2] = new Moto("GHI789", "Yamaha", "MT-07", 689);

        // Recorrer el array y mostrar la información de cada vehículo
        for (Vehiculo vehiculo : flota) {
            vehiculo.mostrarInformacion();
        }
    }
}
