package modelos;

import servicios.ConversorDeMonedas;

public class Prueba {
    public static void main(String[] args) {
        // Menu menu = new Menu();
        // menu.mostrarMenu();
        ConversorDeMonedas dolar = new ConversorDeMonedas();
        dolar.convertirPesoArgentinoADolar();
    }
}
