/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author oband
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenTrabajo {
    private int idOrden;
    private Date fechaIngreso;
    private String estado;
    private float total;
    private List<DetalleOrden> detalles; 

    public OrdenTrabajo(int idOrden) {
        this.idOrden = idOrden;
        this.fechaIngreso = new Date();
        this.estado = "Pendiente";
        this.detalles = new ArrayList<>();
        this.total = 0.0f;
    }

    public void agregarDetalle(DetalleOrden detalle) {
        this.detalles.add(detalle);
        calcularTotal();
    }

    // Método Sobrecargado
    public void agregarDetalle(int cantidad, Repuesto repuesto) {
        DetalleOrden nuevoDetalle = new DetalleOrden(cantidad, repuesto);
        this.detalles.add(nuevoDetalle);
        calcularTotal();
    }

    private void calcularTotal() {
        this.total = (float) detalles.stream()
                                     .mapToDouble(DetalleOrden::getPrecioSubtotal)
                                     .sum();
    }

    public float getTotal() { return total; }
    public List<DetalleOrden> getDetalles() { return detalles; }
    public int getIdOrden() { return idOrden; }
}
