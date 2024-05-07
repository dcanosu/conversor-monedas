package servicios;

import java.util.Scanner;

public class ConversorDeMonedas {

    public void convertirDolarAPesoArgentino(double dolar, double pesoArgentino) {
        System.out.println("Convertir de dólar a peso argentino");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el número de dólares que desea convertir: ");
        double cantidadDolares = scanner.nextDouble();
        scanner.close(); // Cerrar el scanner después de usarlo
        double resultado = cantidadDolares * pesoArgentino;
        System.out.println("El resultado de la conversión es: " + resultado);
    }
}
    

//     public void convertirPesoArgentinoADolar() {
//         System.out.println("Convertir de peso argentino a dólar");
//         // Lógica para convertir de peso argentino a dólar
//     }

//     public void convertirDolarARealBrasileno() {
//         System.out.println("Convertir de dólar a real brasileño");
//         // Lógica para convertir de dólar a real brasileño
//     }

//     public void convertirRealBrasilenoADolar() {
//         System.out.println("Convertir de real brasileño a dólar");
//         // Lógica para convertir de real brasileño a dólar
//     }

//     public void convertirDolarAPesoColombiano() {
//         System.out.println("Convertir de dólar a peso colombiano");
//         // Lógica para convertir de dólar a peso colombiano
//     }

//     public void convertirPesoColombianoADolar() {
//         System.out.println("Convertir de peso colombiano a dólar");
//         // Lógica para convertir de peso colombiano a dólar
//     }
// }
