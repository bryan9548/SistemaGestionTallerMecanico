package modelos;

public class MecanicoBD {

    private int mecanicoId;
    private int empleadoId;
    private String nombre;
    private String telefono;
    private String especialidad;
    private int estado;

    public MecanicoBD() {
    }

    public MecanicoBD(int mecanicoId, int empleadoId, String nombre,
                      String telefono, String especialidad) {

        this.mecanicoId = mecanicoId;
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public int getMecanicoId() {
        return mecanicoId;
    }

    public void setMecanicoId(int mecanicoId) {
        this.mecanicoId = mecanicoId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
public int getEstado() {
    return estado;
}

public void setEstado(int estado) {
    this.estado = estado;
}
}