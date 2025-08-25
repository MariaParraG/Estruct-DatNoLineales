import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiccionarioPersona {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los datos de la persona
        Map<String, String> persona = new HashMap<>();
        
        // Crear objeto Scanner para leer entradas desde la consola
        Scanner sc = new Scanner(System.in);

        // Bucle infinito para permitir al usuario agregar varios datos
        while (true) {
            // Solicitar el nombre del dato que se quiere agregar
            System.out.print("Ingrese el nombre del dato (o 'salir' para terminar): ");
            String clave = sc.nextLine().trim(); // Elimina espacios extras

            // Si el usuario escribe 'salir' (sin importar mayúsculas/minúsculas), termina el bucle
            if (clave.equalsIgnoreCase("salir")) {
                break;
            }

            // Solicitar el valor asociado a la clave ingresada
            System.out.print("Ingrese el valor para '" + clave + "': ");
            String valor = sc.nextLine().trim();

            // Guardar el par clave-valor en el HashMap
            persona.put(clave, valor);

            // Mostrar el diccionario actualizado
            System.out.println("\nDiccionario actualizado:");
            System.out.println(persona);
        }

        // Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
}
