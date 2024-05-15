package servicios;

import java.util.Scanner;

import modelos.Menus;
import modelos.Monedas;

public class Opciones extends Menus{
    String asteriscos = ("═".repeat(40));
    private GestorConversor gestorConversor;

    public Opciones(String apiKey) {
        this.gestorConversor = new GestorConversor(apiKey);
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menuInicial();
            int opcionIngresoMenu = scanner.nextInt();
            switch (opcionIngresoMenu) {
                case 1:
                    menuDivisas();
                    int opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println(asteriscos);
                            System.out.println("Convertidor de dólar a peso argentino");
                            System.out.println(asteriscos);
                            Monedas monedas1 = new Monedas(gestorConversor);
                            monedas1.convertirDolarAPesoArgentino();
                            break;
                        case 2:
                            System.out.println(asteriscos);
                            System.out.println("Convertidor de peso argentino a dólar");
                            System.out.println(asteriscos);
                            Monedas monedas2 = new Monedas(gestorConversor);
                            monedas2.convertirPesoArgentinoADolar();
                            break;
                        case 3:
                            System.out.println(asteriscos);
                            System.out.println("Convertidor de dólar a real brasileño");
                            System.out.println(asteriscos);
                            Monedas monedas3 = new Monedas(gestorConversor);
                            monedas3.convertirDolarARealBrasileno();
                            break;
                        case 4:
                            System.out.println(asteriscos);
                            System.out.println("Convertidor de real brasileño a dólar");
                            System.out.println(asteriscos);
                            Monedas monedas4 = new Monedas(gestorConversor);
                            monedas4.convertirRealBrasilenoADolar();
                            break;
                        case 5:
                            System.out.println(asteriscos);
                            System.out.println("Convertidor de dólar a peso colombiano");
                            System.out.println(asteriscos);
                            Monedas monedas5 = new Monedas(gestorConversor);
                            monedas5.convertirDolarAPesoColombiano();
                            break;
                        case 6:
                            System.out.println(asteriscos);
                            System.out.println("Convertidor de peso colombiano a dólar");
                            System.out.println(asteriscos);
                            Monedas monedas6 = new Monedas(gestorConversor);
                            monedas6.convertirPesoColombianoADolar();
                            break;
                        case 7:
                            saliendoDelPrograma();
                            scanner.close();
                            return;
                        default:
                            opcionIncorrecta();
                            break;
                    }
                    break;
                case 2:
                    saliendoDelPrograma();
                    scanner.close();
                    return;
                default:
                    opcionIncorrecta();
                    break;
            }
        }
    }
}
