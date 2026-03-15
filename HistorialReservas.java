import java.util.ArrayList;
import java.util.List;

public class HistorialReservas implements FuenteReservas {
    private final List<Reservacion> registros = new ArrayList<>();

    @Override
    public boolean yaExiste(String nombreCliente, String tipoHabitacion) {
        for (Reservacion r : registros) {
            if (r.getNombreCliente().equals(nombreCliente)
                    && r.getTipoHabitacion().equals(tipoHabitacion)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void registrar(Reservacion reservacion) {
        registros.add(reservacion);
    }
}
