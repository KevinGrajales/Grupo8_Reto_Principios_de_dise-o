public interface FuenteReservas {
    boolean yaExiste(String nombreCliente, String tipoHabitacion);

    void registrar(Reservacion reservacion);
}
