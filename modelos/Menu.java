package modelos;

import java.util.Scanner;

import servicios.ConversorDeMonedas;


public class Menu {
    public void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarOpciones();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Convertidor de dolar a peso argentino");
                    ConversorDeMonedas conversor = new ConversorDeMonedas();
                    conversor.convertirDolarAPesoArgentino(opcion, opcion);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    String raya = ("-".repeat(53));
                    System.out.println();
                    System.out.println(raya);
                    System.out.println("Opción invalida, por favor ingrese una opción válida");
                    System.out.println(raya);
                    System.out.println();
                    break;
            }
        }
        
    }

    private void mostrarOpciones(){

        String astericos = ("*".repeat(43));
        System.out.println(astericos);
        System.out.println("    BIENVENIDO AL CONVERSOR DE MONEDAS    ");
        System.out.println(astericos);
        System.out.println("""
                
                Por favor elija la opción deseada: 

                1). | Dolar           --> Peso argentino  |
                2). | Peso argentino  --> Dolar           |
                3). | Dolar           --> Real brasileño  |
                4). | Real brasileño  --> Dolar           |
                5). | Dolar           --> Peso colombiano |
                6). | Peso colombiano --> Dolar           |

                7). | Salir                               |
                """);
        System.out.println(astericos);
    }

//     public int obtenerOpcionValida() {
//         int opcion;
//         do {
//             System.out.println("Ingrese una opción: ");
//             while (!scanner.hasNextInt()) {
//                 System.out.println("Opción inválida, por favor intente nuevamente.");
//                 scanner.next(); // Limpiar el buffer
//             }
//             opcion = scanner.nextInt();
//             if (opcion < 1 || opcion > 7) {
//                 System.out.println("Opción inválida, por favor intente nuevamente.");
//             }
//         } while (opcion < 1 || opcion > 7);
//         scanner.nextLine(); // Limpiar el buffer
//         return opcion;
//     }
}