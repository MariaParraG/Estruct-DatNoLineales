import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario desde la consola
        Scanner sc = new Scanner(System.in);

        // Crear un HashMap para almacenar los datos del usuario con clave-valor
        Map<String, String> usuario = new HashMap<>();

        // Solicitar al usuario su nombre y guardarlo en el HashMap
        System.out.print("Ingrese su nombre: ");
        usuario.put("nombre", sc.nextLine().trim()); // .trim() elimina espacios extras al inicio o final

        // Solicitar al usuario su edad y guardarla
        System.out.print("Ingrese su edad: ");
        usuario.put("edad", sc.nextLine().trim());

        // Solicitar al usuario su dirección y guardarla
        System.out.print("Ingrese su dirección: ");
        usuario.put("direccion", sc.nextLine().trim());

        // Solicitar al usuario su número de teléfono y guardarlo
        System.out.print("Ingrese su número de teléfono: ");
        usuario.put("telefono", sc.nextLine().trim());

        // Mostrar un mensaje final con todos los datos ingresados
        System.out.println(
            usuario.get("nombre") + " tiene " + usuario.get("edad") +
            " años, vive en " + usuario.get("direccion") +
            " y su número de teléfono es " + usuario.get("telefono") + "."
        );

        // Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
}
