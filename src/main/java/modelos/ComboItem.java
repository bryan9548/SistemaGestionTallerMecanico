package modelos;

public class ComboItem {
    private int id;
    private String texto;
    private double valor;

    public ComboItem(int id, String texto, double valor) {
        this.id = id;
        this.texto = texto;
        this.valor = valor;
    }

    public int getId() { return id; }
    public double getValor() { return valor; }

    @Override
    public String toString() {
        return texto;
    }
}