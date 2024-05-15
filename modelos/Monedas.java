package modelos;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

import servicios.GestorConversor;

public class Monedas {
    private GestorConversor gestorConversor;

    public Monedas(GestorConversor gestorConversor) {
        this.gestorConversor = gestorConversor;
    }

    public void convertirMoneda(String descripcionCurrency, String fromCurrency, String descripcionToCurrency, String toCurrency, String descripcion) {
        try {
            System.out.println("Por favor ingrese la cantidad de " + descripcionCurrency + "["+fromCurrency+"]" + " que desea convertir a " + descripcionToCurrency+"["+toCurrency+"]" + ": ");
            Scanner scanner = new Scanner(System.in);
            double cantidad = scanner.nextDouble();
            double resultado = gestorConversor.convertirMoneda(fromCurrency, toCurrency, cantidad);
            mostrarResultado(descripcion, cantidad, toCurrency, fromCurrency, resultado);
        } catch (IOException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }

    private void mostrarResultado(String descripcion, double cantidad, String toCurrency, String fromCurrency, double resultado) {
        DecimalFormat formato = new DecimalFormat("#,###.#");
        formato.setGroupingUsed(true);
        String cantidadFormateada = formato.format(cantidad);
        String resultadoFormateado = formato.format(resultado);
        System.out.println("╔"+"═".repeat(descripcion.length())+"╗");
        System.out.println("║"+ descripcion +"║");     
        System.out.println("╚"+"═".repeat(descripcion.length())+"╝"); 
        System.out.println("""
            ║                                    ║
            ║ Cantidad convertida: %s %-3s
            ║-------------------------------------                              
            ║ Resultado: %s %-3s                   
            ╚════════════════════════════════════╝
            """
            .formatted(cantidadFormateada, fromCurrency, resultadoFormateado, toCurrency));
    }
    
    public void convertirDolarAPesoArgentino() {
        convertirMoneda("dolares","USD","pesos argentinos", "ARS", "Convertir de dólar a peso argentino:");
    }
    public void convertirPesoArgentinoADolar() {
        convertirMoneda("pesos argentinos","ARS", "dolares","USD", "Convertir de peso argentino a dólar:");
    }

    public void convertirDolarARealBrasileno() {
        convertirMoneda("dolares","USD", "reales brasileños","BRL", "Convertir de dólar a reales brasileño:");
    }

    public void convertirRealBrasilenoADolar() {
        convertirMoneda("reales brasileños","BRL","dolares", "USD", "Convertir de real brasileño a dólar:");
    }

    public void convertirDolarAPesoColombiano() {
        convertirMoneda("dolares","USD", "pesos colombianos","COP", "Convertir de dólar a peso colombiano:");
    }

    public void convertirPesoColombianoADolar() {
        convertirMoneda("pesos colombianos","COP","dolares", "USD", "Convertir de peso colombiano a dólar:");
    }
}
