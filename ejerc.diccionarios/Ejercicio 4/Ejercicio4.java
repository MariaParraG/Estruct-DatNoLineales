import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FormatoFecha {
    public static void main(String[] args) {
        // Crear un HashMap para relacionar los números de mes con su nombre en español
        Map<String, String> meses = new HashMap<>();
        meses.put("01", "enero");
        meses.put("02", "febrero");
        meses.put("03", "marzo");
        meses.put("04", "abril");
        meses.put("05", "mayo");
        meses.put("06", "junio");
        meses.put("07", "julio");
        meses.put("08", "agosto");
        meses.put("09", "septiembre");
        meses.put("10", "octubre");
        meses.put("11", "noviembre");
        meses.put("12", "diciembre");

        // Crear un objeto Scanner para leer datos desde la consola
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese la fecha en formato dd/mm/aaaa
        System.out.print("Ingrese una fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine().trim();  // .trim() elimina espacios extra

        // Dividir la fecha en partes: día, mes y año
        String[] partes = fecha.split("/");

        // Verificar que la fecha tenga tres partes y que el mes sea válido
        if (partes.length == 3 && meses.containsKey(partes[1])) {
            // Convertir el día a entero para quitar ceros a la izquierda
            int dia = Integer.parseInt(partes[0]);
            // Imprimir la fecha en formato "día de mes de año"
            System.out.println(dia + " de " + meses.get(partes[1]) + " de " + partes[2]);
        } else {
            // Mensaje de error si el mes no es válido o el formato está incorrecto
            System.out.println("El mes ingresado no es válido.");
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}
