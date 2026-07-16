/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author oband
 */
public class Administrador extends Empleado {
    private String area;

    public Administrador(int idPersona, String nombre, String telefono, float sueldoBase, String area) {
        super(idPersona, nombre, telefono, sueldoBase);
        this.area = area;
    }

    @Override
    public float calcularSueldo() {
        return this.sueldoBase; 
    }

    @Override
    public String obtenerDatos() {
        return "Administrador [Nombre: " + nombre + ", Area: " + area + "]";
    }
}
