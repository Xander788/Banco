/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author danny
 */
public enum Estado {
    ACTIVA("Activa"),NOACTIVA("No Activa");
    private final String estados;

    private Estado(String estados) {
        this.estados = estados;
    }

    public String getEstados() {
        return estados;
    }

    @Override
    public String toString() {
        return estados;
    }
    
    
    
    
}
