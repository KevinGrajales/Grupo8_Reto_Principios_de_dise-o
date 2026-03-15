public class ValidadorReserva {
    public String validar(int noches, double precioNoche) {
        if (noches <= 0) {
            return "Número de noches inválido";
        }
        if (precioNoche <= 0) {
            return "Precio inválido";
        }
        return null;
    }
}
