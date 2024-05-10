package servicios;

public class Principal {
    public static void main(String[] args) {
        String apiKey = "6b039e45d888194efc48ffc4";
        MenuCompleto menu = new MenuCompleto(apiKey);
        menu.mostrarMenu();
    }
}
