public class GestorReservas {
    private final FuenteReservas fuenteReservas;
    private final ValidadorReserva validador;
    private final CalculadorTotal calculador;

    public GestorReservas(
            FuenteReservas fuenteReservas,
            ValidadorReserva validador,
            CalculadorTotal calculador) {
        this.fuenteReservas = fuenteReservas;
        this.validador = validador;
        this.calculador = calculador;
    }

    public String crearReservacion(String nombreCliente, String tipoHabitacion, int noches, double precioNoche) {
        String error = validador.validar(noches, precioNoche);
        if (error != null) {
            return error;
        }

        if (fuenteReservas.yaExiste(nombreCliente, tipoHabitacion)) {
            return "La reserva ya existe";
        }

        double total = calculador.calcular(noches, precioNoche);
        Reservacion reservacion = new Reservacion(nombreCliente, tipoHabitacion, noches, precioNoche);
        fuenteReservas.registrar(reservacion);

        return "Reserva creada. Total: " + total;
    }
}
