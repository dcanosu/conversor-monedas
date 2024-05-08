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
                    System.out.println("Convertidor de dolar a peso brasileño");
                    ConversorDeMonedas conversor = new ConversorDeMonedas();
                    conversor.convertirDolarARealBrasileno();
                    break;
                case 2:
                    System.out.println("Convertidor de dolar a peso Colombiano");
                    ConversorDeMonedas conversorCop = new ConversorDeMonedas();
                    conversorCop.convertirDolarAPesoColombiano();
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
}