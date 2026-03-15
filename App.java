public class App {
    public static void main(String[] args) {
        FuenteReservas fuente = new HistorialReservas();
        ValidadorReserva validador = new ValidadorReserva();
        CalculadorTotal calculador = new CalculadorTotal();

        GestorReservas gestor = new GestorReservas(fuente, validador, calculador);
        ControladorReservas controlador = new ControladorReservas(gestor);

        System.out.println(controlador.crearReservacion("Ana", "Suite", 2, 120));
    }
}
