package modelos;

public class Menus {
    public void menuInicial(){
        System.out.println ("""
            ╔════════════════════════════════════════════╗
            ║     BIENVENIDO AL CONVERSOR DE MONEDAS     ║
            ╠════════════════════════════════════════════╣
            ║                                            ║
            ║ Por favor elija la opción deseada [1-2]    ║
            ║                                            ║            
            ║ 1. Realizar una conversión de divisas      ║                                        
            ║ 2. Salir                                   ║
            ║                                            ║
            ║                                            ║
            ╚════════════════════════════════════════════╝
                    """);
    }

    public void menuDivisas(){
        System.out.println ("""
            ╔════════════════════════════════════════════╗
            ║     BIENVENIDO AL CONVERSOR DE MONEDAS     ║
            ╠════════════════════════════════════════════╣
            ║                                            ║
            ║ Por favor elija la opción deseada [1-7]    ║
            ║                                            ║
            ║ 1. Dólar --> Peso argentino                ║
            ║ 2. Peso argentino --> Dólar                ║
            ║ 3. Dólar --> Real brasileño                ║
            ║ 4. Real brasileño --> Dólar                ║
            ║ 5. Dólar --> Peso colombiano               ║
            ║ 6. Peso colombiano --> Dólar               ║
            ║ 7. Salir                                   ║                                        
            ║                                            ║
            ║                                            ║
            ╚════════════════════════════════════════════╝
                """);
    }

    public void opcionIncorrecta(){
        System.out.println("""
            ╔════════════════════════════════════════════════════════════╗
            ║ **OPCION INVÁLIDA, POR FAVOR INGRESE UNA OPCIÓN CORRECTA** ║
            ╚════════════════════════════════════════════════════════════╝                
                """);
    }

    public void saliendoDelPrograma(){
        System.out.println ("""
            ╔═══════════════════════════════════╗
            ║ SALIENDO DEL PROGRAMA....         ║
            ╚═══════════════════════════════════╝
                """);
    }
}
