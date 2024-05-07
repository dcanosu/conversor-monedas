package app;
import servicios.ConversorDeMonedas;

public class Main {
    public static void main(String[] args) {
        ConversorDeMonedas conversor = new ConversorDeMonedas();

        // Ejemplo de conversión
        double cantidad = 100.0;
        String deMoneda = "USD";
        String aMoneda = "EUR";
        double resultado = conversor.convertir(cantidad, deMoneda, aMoneda);
        System.out.println(cantidad + " " + deMoneda + " equivale a " + resultado + " " + aMoneda);
    }
}