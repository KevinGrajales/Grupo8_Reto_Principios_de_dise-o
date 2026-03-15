public class ControladorReservas {
    private final GestorReservas gestor;

    public ControladorReservas(GestorReservas gestor) {
        this.gestor = gestor;
    }

    public String crearReservacion(String nombreCliente, String tipoHabitacion, int noches, double precioNoche) {
        return gestor.crearReservacion(nombreCliente, tipoHabitacion, noches, precioNoche);
    }
}
