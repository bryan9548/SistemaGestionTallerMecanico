/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author oband
 */
import interfaces.INotificable;

public abstract class Persona implements INotificable {
    protected int idPersona;
    protected String nombre;
    protected String telefono;

    public Persona(int idPersona, String nombre, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.telefono = telefono;
    }
 public int getIdPersona() { return idPersona; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public abstract String obtenerDatos();

    @Override
    public void enviarAlerta(String msg) {
        System.out.println("Notificacion para " + nombre + ": " + msg);
    }
}
