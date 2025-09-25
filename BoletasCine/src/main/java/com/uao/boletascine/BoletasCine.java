/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.boletascine;

import javax.swing.JOptionPane;
import Modelo.Cliente;
import Modelo.Boleta;
import Modelo.Factura;
import Modelo.Cine;
/**
 *
 * @author Usuario
 */
public class BoletasCine {
   


    public static void main(String[] args) {
        Cine cine = new Cine(10); 

        int numFacturas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas facturas desea registrar?"));

        for (int i = 0; i < numFacturas; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre del cliente " + (i+1) + ":");
            int resp = JOptionPane.showConfirmDialog(null, "¿Tiene tarjeta de descuento?", 
                                                     "Cliente " + (i+1), JOptionPane.YES_NO_OPTION);
            boolean tarjeta = (resp == JOptionPane.YES_OPTION);
            Cliente cliente = new Cliente(nombre, tarjeta);

            String promotora = JOptionPane.showInputDialog("Promotora (Cine Colombia / Royal Films):");
            String tipoFuncion = JOptionPane.showInputDialog("Tipo de función (35mm / 3D):");

            Boleta boleta = new Boleta(promotora, tipoFuncion);

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de boletas:"));
            int sala = Integer.parseInt(JOptionPane.showInputDialog("Sala (1-6):"));

            Factura factura = new Factura(cliente, boleta, cantidad, sala);
            cine.agregarFactura(factura);
        }

        cine.mostrarFacturas();

        
        System.out.println("Total Cine Colombia: $" + cine.totalPorPromotora("Cine Colombia"));
        System.out.println("Total Royal Films: $" + cine.totalPorPromotora("Royal Films"));
        System.out.println("Más vendido en Cine Colombia: " + cine.tipoFuncionMasVendido("Cine Colombia"));
    }
}


    