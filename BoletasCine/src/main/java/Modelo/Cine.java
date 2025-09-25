/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cine {
    
    private Factura[] facturas;
    private int contador;

    public Cine(int capacidad) {
        facturas = new Factura[capacidad];
        contador = 0;
    }

    public void agregarFactura(Factura f) {
        if (contador < facturas.length) {
            facturas[contador++] = f;
        }
    }

    public void mostrarFacturas() {
        for (int i = 0; i < contador; i++) {
            System.out.println(facturas[i]);
        }
    }

    public double totalPorPromotora(String promotora) {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            if (facturas[i].getBoleta().getPromotora().equals(promotora)) {
                total += facturas[i].calcularTotal();
            }
        }
        return total;
    }

    public String tipoFuncionMasVendido(String promotora) {
        int cont35 = 0, cont3D = 0;
        for (int i = 0; i < contador; i++) {
            if (facturas[i].getBoleta().getPromotora().equals(promotora)) {
                if (facturas[i].getBoleta().getTipoFuncion().equals("35mm")) {
                    cont35 += facturas[i].calcularTotal();
                } else {
                    cont3D += facturas[i].calcularTotal();
                }
            }
        }
        return (cont35 > cont3D) ? "35mm" : "3D";
    }
}

    

