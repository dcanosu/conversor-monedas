package servicios;

import java.io.IOException;

public class GestorConversor {
    private ConversorMonedas conversor;

    public GestorConversor(String apiKey) {
        this.conversor = new ConversorMonedas(apiKey);
    }

    public double convertirMoneda(String fromCurrency, String toCurrency, double cantidadDolares) throws IOException {
        double tasaCambio = conversor.obtenerTasaCambio(fromCurrency, toCurrency);
        return cantidadDolares * tasaCambio;
    }
}
