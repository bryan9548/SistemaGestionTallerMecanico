/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author oband
 */

public class Vehiculo {

    private String placa;
    private int marcaId;
    private String modelo;
    private int anio;
    private int clienteId;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(String placa, int marcaId, String modelo, int anio, int clienteId) {
        this.placa = placa;
        this.marcaId = marcaId;
        this.modelo = modelo;
        this.anio = anio;
        this.clienteId = clienteId;
    }

    // Getters y Setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(int marcaId) {
        this.marcaId = marcaId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}