/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    private String nombre;
    private boolean tarjeta;

    public Cliente(String nombre, boolean tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean tieneTarjeta() {
        return tarjeta;
    }
}

    

