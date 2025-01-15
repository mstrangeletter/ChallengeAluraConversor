package com.alura.convertcurrency;

import java.util.Scanner;

import static java.lang.System.*;

public class MenuConvertCurrency {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(in)) {
            HandlerConvertCurrency converter = new HandlerConvertCurrency();

            while (true) {
                mostrarMenu();

                int option = scanner.nextInt();
                String fromCurrency = obtenerMonedaOrigen(option);
                String toCurrency = obtenerMonedaDestino(option);

                if (fromCurrency.isEmpty() || toCurrency.isEmpty()) {
                    out.println("Opción no válida. Por favor, selecciona una opción del menú.");
                    continue;
                }

                if (option == 9) {
                    out.println("Gracias por usar el Conversor de Moneda. ¡Hasta pronto!");
                    exit(0);
                }

                out.print("Introduce el monto a convertir: ");
                if (!scanner.hasNextDouble()) {
                    out.println("Por favor, introduce un número válido.");
                    scanner.next(); // Limpiar el input inválido
                    continue;
                }
                double amount = scanner.nextDouble();
                double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
                out.println("\n" + amount + " " + fromCurrency + " son equivalentes a " + convertedAmount + " " + toCurrency);
            }
        }
    }

    private static void mostrarMenu() {
        out.println("************************************************");
        out.println("Sea bienvenido/a al Conversor de Moneda =]");
        out.println();
        out.println("1. Dolar => Peso Chileno");
        out.println("2. Peso Chileno => Dolar");
        out.println("3. Dolar => Real Brasileño");
        out.println("4. Real Brasileño => Dolar");
        out.println("5. Dolar => Peso Argentino");
        out.println("6. Peso Argentino => Dolar");
        out.println("7. Dolar => Peso Colombiano");
        out.println("8. Peso Colombiano => Dolar");
        out.println("9. Salir");
        out.println();
        out.print("Elíja una opción válida: ");
        out.println("************************************************");
    }

    private static String obtenerMonedaOrigen(int option) {
        switch (option) {
            case 1: case 3: case 5: case 7: return "USD";
            case 2: return "CLP";
            case 4: return "BRL";
            case 6: return "ARS";
            case 8: return "COP";
            default: return "";
        }
    }

    private static String obtenerMonedaDestino(int option) {
        switch (option) {
            case 1: return "CLP";
            case 2: case 4: case 6: case 8: return "USD";
            case 3: return "BRL";
            case 5: return "ARS";
            case 7: return "COP";
            default: return "";
        }
    }
}
