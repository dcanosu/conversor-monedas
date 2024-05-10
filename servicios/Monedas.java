package servicios;

import java.io.IOException;
import java.util.Scanner;

public class Monedas {
    private GestorConversor gestorConversor;

    public Monedas(GestorConversor gestorConversor) {
        this.gestorConversor = gestorConversor;
    }

    public void convertirDolarARealBrasileno() {
        Scanner scanner = new Scanner(System.in);
        try {
            String fromCurrency = "USD";
            String toCurrency = "BRL";
            System.out.println("Por favor ingrese la cantidad de dólares que desea convertir: ");
            double cantidadDolares = scanner.nextDouble();
            double resultado = gestorConversor.convertirMoneda(fromCurrency, toCurrency, cantidadDolares);
            mostrarResultado(cantidadDolares, toCurrency, resultado);
        } catch (IOException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }

    public void convertirDolarAPesoColombiano() {
        Scanner scanner = new Scanner(System.in);
        try {
            String fromCurrency = "USD";
            String toCurrency = "COP";
            System.out.println("Por favor ingrese la cantidad de dólares que desea convertir: ");
            double cantidadDolares = scanner.nextDouble();
            double resultado = gestorConversor.convertirMoneda(fromCurrency, toCurrency, cantidadDolares);
            mostrarResultado(cantidadDolares, toCurrency, resultado);
        } catch (IOException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }

    private void mostrarResultado(double cantidadDolares, String toCurrency, double resultado) {
        System.out.println("Convertir de dólar a " + toCurrency + ":");
        System.out.println(cantidadDolares + " dólares equivalen a " + resultado + " " + toCurrency);
    }
}