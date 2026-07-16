/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author oband
 */
public abstract class Empleado extends Persona {
    protected float sueldoBase;

    public Empleado(int idPersona, String nombre, String telefono, float sueldoBase) {
        super(idPersona, nombre, telefono);
        this.sueldoBase = sueldoBase;
    }

    public abstract float calcularSueldo();
}
