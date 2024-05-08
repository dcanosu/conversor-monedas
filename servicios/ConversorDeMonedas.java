package servicios;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConversorDeMonedas {

    private static final String API_KEY = "6b039e45d888194efc48ffc4"; // Obtén tu propia clave de la API ExchangeRate-API

    public void convertirDolarARealBrasileno() {
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD");
            double tasaCambioBRL = obtenerTasaCambio(url, "BRL");
            System.out.println(tasaCambioBRL);

            System.out.println("Por favor ingrese la cantidad de dólares que desea convertir: ");
            Scanner scanner = new Scanner(System.in);
            double cantidadDolares = scanner.nextDouble();

            double equivalenteEnBRL = cantidadDolares * tasaCambioBRL;

            System.out.println("Convertir de dólar a real brasileño:");
            System.out.println(cantidadDolares + " dólares equivalen a " + equivalenteEnBRL + " reales brasileños.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double obtenerTasaCambio(URL url, String currencyCode) throws IOException {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Parsear la respuesta JSON utilizando Gson
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(new InputStreamReader(request.getInputStream()), JsonObject.class);

        // Acceder al objeto de tasas de conversión
        if (jsonObject.has("conversion_rates")) {
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            if (conversionRates.has(currencyCode)) {
                return conversionRates.get(currencyCode).getAsDouble();
            } else {
                System.out.println("La moneda " + currencyCode + " no está disponible en la respuesta JSON.");
            }
        } else {
            System.out.println("La respuesta JSON no contiene el objeto 'conversion_rates'.");
        }

        return -1;
    }

    public void convertirDolarAPesoColombiano() {
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD");
            double tasaCambioCOP = obtenerTasaCambio(url, "COP");
            System.out.println(tasaCambioCOP);

            System.out.println("Por favor ingrese la cantidad de dólares que desea convertir: ");
            Scanner scanner = new Scanner(System.in);
            double cantidadDolares = scanner.nextDouble();

            double equivalenteEnCOP = cantidadDolares * tasaCambioCOP;

            System.out.println("Convertir de dólar a real brasileño:");
            System.out.println(cantidadDolares + " dólares equivalen a " + equivalenteEnCOP + " reales brasileños.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
}



    // public void convertirDolarARealBrasileno() {
    //     try {
    //         URL url = new URL("https://v6.exchangeratesapi.io/latest?base=USD&access_key=" + API_KEY);
    //         double tasaCambioBRL = obtenerTasaCambio(url, "BRL");
    //         System.out.println("Convertir de dólar a real brasileño");
    //         // Lógica para convertir de dólar a real brasileño utilizando la tasa de cambio obtenida
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // public void convertirRealBrasilenoADolar() {
    //     try {
    //         URL url = new URL("https://v6.exchangeratesapi.io/latest?base=BRL&access_key=" + API_KEY);
    //         double tasaCambioUSD = obtenerTasaCambio(url, "USD");
    //         System.out.println("Convertir de real brasileño a dólar");
    //         // Lógica para convertir de real brasileño a dólar utilizando la tasa de cambio obtenida
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // public void convertirDolarAPesoColombiano() {
    //     try {
    //         URL url = new URL("https://v6.exchangeratesapi.io/latest?base=USD&access_key=" + API_KEY);
    //         double tasaCambioCOP = obtenerTasaCambio(url, "COP");
    //         System.out.println("Convertir de dólar a peso colombiano");
    //         // Lógica para convertir de dólar a peso colombiano utilizando la tasa de cambio obtenida
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // public void convertirPesoColombianoADolar() {
    //     try {
    //         URL url = new URL("https://v6.exchangeratesapi.io/latest?base=COP&access_key=" + API_KEY);
    //         double tasaCambioUSD = obtenerTasaCambio(url, "USD");
    //         System.out.println("Convertir de peso colombiano a dólar");
    //         // Lógica para convertir de peso colombiano a dólar utilizando la tasa de cambio obtenida
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // private double obtenerTasaCambio(URL url, String currencyCode) throws IOException {
    //     try {
    //         HttpURLConnection con = (HttpURLConnection) url.openConnection();
    //         con.setRequestMethod("GET");

    //         BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    //         StringBuilder response = new StringBuilder();
    //         String inputLine;
    //         while ((inputLine = in.readLine()) != null) {
    //             response.append(inputLine);
    //         }
    //         in.close();

    //         // Parsear la respuesta JSON para obtener las tasas de cambio
    //         JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
    //         if (jsonObject.has("rates")) {
    //             JsonObject rates = jsonObject.getAsJsonObject("rates");
    //             if (rates.has(currencyCode)) {
    //                 return rates.get(currencyCode).getAsDouble();
    //             } else {
    //                 System.out.println("La moneda " + currencyCode + " no está disponible en la respuesta JSON.");
    //             }
    //         } else {
    //             System.out.println("La respuesta JSON no contiene el objeto 'rates'.");
    //         }
    //     } catch (JsonIOException e) {
    //         System.out.println("Error al analizar el JSON: " + e.getMessage());
    //     }
    //     return -1; // Manejo del caso de error, devolviendo un valor predeterminado
    // }

// double pesoArgentino = 0;
// System.out.println("Convertir de dólar a peso argentino");
// Scanner scanner = new Scanner(System.in);
// System.out.println("Por favor ingrese el número de dólares que desea convertir: ");
// double cantidadDolares = scanner.nextDouble();
// scanner.close(); // Cerrar el scanner después de usarlo
// double resultado = cantidadDolares * pesoArgentino;
// System.out.println("El resultado de la conversión es: " + resultado);