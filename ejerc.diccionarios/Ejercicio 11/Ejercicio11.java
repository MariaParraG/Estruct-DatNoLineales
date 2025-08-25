import java.util.HashMap;
import java.util.Map;

public class DirectorioClientes {
    public static void main(String[] args) {
        String datos = "cedula;nombre;email;telefono;descuento\n" +
                       "1001234567;Luis Gonzalez;luisgonzalez@mail.com;656343576;12.5\n" +
                       "1009876543;Maria Perez;maria@mail.com;3123456789;15";

        String[] lineas = datos.split("\n");
        String[] encabezados = lineas[0].split(";");

        Map<String, Map<String, String>> clientes = new HashMap<>();

        for (int i = 1; i < lineas.length; i++) {
            String[] campos = lineas[i].split(";");
            String cedula = campos[0];

            Map<String, String> info = new HashMap<>();
            for (int j = 1; j < encabezados.length; j++) {
                info.put(encabezados[j], campos[j]);
            }

            clientes.put(cedula, info);
        }

        for (Map.Entry<String, Map<String, String>> cliente : clientes.entrySet()) {
            System.out.println("Cédula: " + cliente.getKey() + ", Datos: " + cliente.getValue());
        }
    }
}
