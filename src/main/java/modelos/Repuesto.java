/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author oband
 */
public class Repuesto {
    private int idRepuesto;
    private String nombre;
    private float precio;

    public Repuesto(int idRepuesto, String nombre, float precio) {
        this.idRepuesto = idRepuesto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public float getPrecio() { return precio; }
    public String getNombre() { return nombre; }
}
