/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Factura {
    
    private Cliente cliente;
    private Boleta boleta;
    private int cantidad;
    private int sala;

    public Factura(Cliente cliente, Boleta boleta, int cantidad, int sala) {
        this.cliente = cliente;
        this.boleta = boleta;
        this.cantidad = cantidad;
        this.sala = sala;
    }

    public double calcularTotal() {
        double precio = boleta.getTipoFuncion().equals("3D") ? 15000 : 10000;
        double total = cantidad * precio;
        if (cliente.tieneTarjeta()) {
            total *= 0.9; 
        }
        return total;
    }

    public String toString() {
        return "Cliente: " + cliente.getNombre() +
               ", Promotora: " + boleta.getPromotora() +
               ", Función: " + boleta.getTipoFuncion() +
               ", Sala: " + sala +
               ", Total: $" + calcularTotal();
    }

    public Boleta getBoleta() {
        return boleta;
    }
}

