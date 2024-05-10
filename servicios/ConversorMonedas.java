package servicios;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConversorMonedas {
    private String API_KEY;

    public ConversorMonedas(String apiKey) {
        this.API_KEY = apiKey;
    }

    public double obtenerTasaCambio(String fromCurrency, String currencyCode) throws IOException {
        URL url = new URL("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + fromCurrency);
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
                throw new IllegalArgumentException("La moneda " + currencyCode + " no está disponible en la respuesta JSON.");
            }
        } else {
            throw new IllegalArgumentException("La respuesta JSON no contiene el objeto 'conversion_rates'.");
        }
    }
}
