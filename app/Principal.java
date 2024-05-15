package app;

import servicios.Opciones;

public class Principal {
    public static void main(String[] args) {
        String apiKey = "6b039e45d888194efc48ffc4";
        Opciones menu = new Opciones(apiKey);
        menu.mostrarMenu();
    }
}
