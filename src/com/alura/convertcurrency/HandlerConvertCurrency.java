package com.alura.convertcurrency;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HandlerConvertCurrency {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/0bee0ac9cc83f4949e06da65/pair/";

    public double convert(String fromCurrency, String toCurrency, double amount) {
        double convertedAmount = 0.0;

        try {
            // Actualizar la URL para incluir both currencies en el endpoint
            String url_str = API_URL + fromCurrency + "/" + toCurrency;
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();

            try (InputStreamReader reader = new InputStreamReader(request.getInputStream())) {
                if (request.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    JsonObject root = JsonParser.parseReader(reader).getAsJsonObject();
                    if ("success".equals(root.get("result").getAsString())) {
                        double exchangeRate = root.get("conversion_rate").getAsDouble();
                        convertedAmount = amount * exchangeRate;
                        System.out.println("Exchange rate (" + fromCurrency + " to " + toCurrency + "): " + exchangeRate);
                    } else {
                        System.out.println("Error en la respuesta de la API: " + root.get("result").getAsString());
                    }
                } else {
                    System.out.println("Error en la respuesta de la API: " + request.getResponseMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error al convertir moneda: " + e.getMessage());
        }

        return convertedAmount;
    }
}
