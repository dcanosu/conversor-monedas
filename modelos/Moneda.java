package modelos;

public class Moneda {
    private String nombre;
    private double tasaDeCambio; // La tasa de cambio con respecto al dólar

    public Moneda(String nombre, double tasaDeCambio) {
        this.nombre = nombre;
        this.tasaDeCambio = tasaDeCambio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }
}