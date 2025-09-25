/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Boleta {
  
    private String promotora;
    private String tipoFuncion;

    public Boleta(String promotora, String tipoFuncion) {
        this.promotora = promotora;
        this.tipoFuncion = tipoFuncion;
    }

    public String getPromotora() {
        return promotora;
    }

    public String getTipoFuncion() {
        return tipoFuncion;
    }
}


