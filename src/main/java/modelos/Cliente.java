/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author oband
 */
public class Cliente extends Persona {
    private String email;

    public Cliente(int idPersona, String nombre, String telefono, String email) {
        super(idPersona, nombre, telefono);
        this.email = email;
    }
 public String getEmail() { return email; }
    @Override
    public String obtenerDatos() {
        return "Cliente [ID: " + idPersona + ", Nombre: " + nombre + "]";
    }
}