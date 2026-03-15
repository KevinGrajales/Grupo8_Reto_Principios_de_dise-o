public class Reservacion {
    private final String nombreCliente;
    private final String tipoHabitacion;
    private final int noches;
    private final double precioNoche;

    public Reservacion(String nombreCliente, String tipoHabitacion, int noches, double precioNoche) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.noches = noches;
        this.precioNoche = precioNoche;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public int getNoches() {
        return noches;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }
}
