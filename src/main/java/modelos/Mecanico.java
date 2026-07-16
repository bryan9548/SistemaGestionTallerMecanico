
package modelos;

/**
 *
 * @author oband
 */

public class Mecanico extends Empleado {
    private String specialty;

    public Mecanico(int idPersona, String nombre, String telefono, float sueldoBase, String specialty) {
        super(idPersona, nombre, telefono, sueldoBase);
        this.specialty = specialty;
    }

    @Override
    public float calcularSueldo() {
        return this.sueldoBase + 150.0f; 
    }

    @Override
    public String obtenerDatos() {
        return "Mecanico [Nombre: " + nombre + ", Especialidad: " + specialty + "]";
    }
}
