/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author oband
 */
public class DetalleOrden {
    private int cantidad;
    private float precioSubtotal;
    private Repuesto repuesto;

    public DetalleOrden(int cantidad, Repuesto repuesto) {
        this.cantidad = cantidad;
        this.repuesto = repuesto;
        this.precioSubtotal = cantidad * repuesto.getPrecio();
    }

    public float getPrecioSubtotal() { return precioSubtotal; }
    public int getCantidad() { return cantidad; }
    public Repuesto getRepuesto() { return repuesto; }
}
