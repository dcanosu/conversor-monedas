package servicios;
import java.util.Scanner;

public class MenuCompleto {
    private GestorConversor gestorConversor;

    public MenuCompleto(String apiKey) {
        this.gestorConversor = new GestorConversor(apiKey);
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarOpciones();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Convertidor de dólar a real brasileño");
                    Monedas monedas1 = new Monedas(gestorConversor);
                    monedas1.convertirDolarARealBrasileno();
                    break;
                case 2:
                    System.out.println("Convertidor de dólar a peso colombiano");
                    Monedas monedas2 = new Monedas(gestorConversor);
                    monedas2.convertirDolarAPesoColombiano();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, por favor ingrese una opción válida");
                    break;
            }
        }
    }

    private void mostrarOpciones() {
        String asteriscos = "*".repeat(43);
        System.out.println(asteriscos);
        System.out.println("    BIENVENIDO AL CONVERSOR DE MONEDAS    ");
        System.out.println(asteriscos);
        System.out.println("""
                
                Por favor elija la opción deseada: 

                1). | Dólar --> Real brasileño  |
                2). | Dólar --> Peso colombiano |
                3). | Salir                      |

                """);
        System.out.println(asteriscos);
    }
}
