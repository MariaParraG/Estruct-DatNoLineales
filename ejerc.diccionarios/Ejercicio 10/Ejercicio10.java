// Importa las librerías necesarias
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionClientes {
    public static void main(String[] args) {
        // Diccionario principal donde se almacenan los clientes
        // La clave es el NIF (String) y el valor es otro Map con los datos del cliente
        Map<String, Map<String, Object>> clientes = new HashMap<>();
        Scanner sc = new Scanner(System.in); // Objeto para leer datos por consola

        // Bucle infinito para mostrar el menú hasta que el usuario decida salir
        while (true) {
            // Menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Añadir cliente");
            System.out.println("2. Eliminar cliente");
            System.out.println("3. Mostrar cliente");
            System.out.println("4. Listar todos los clientes");
            System.out.println("5. Listar clientes preferentes");
            System.out.println("6. Terminar");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine().trim(); // Lee la opción elegida

            // Estructura switch para manejar cada opción del menú
            switch (opcion) {
                case "1": // Opción para añadir un cliente
                    System.out.print("Ingrese el NIF del cliente: ");
                    String nif = sc.nextLine();

                    // Se crea un diccionario para guardar los datos del cliente
                    Map<String, Object> datos = new HashMap<>();

                    // Se piden los datos al usuario
                    System.out.print("Ingrese el nombre: ");
                    datos.put("nombre", sc.nextLine());

                    System.out.print("Ingrese la dirección: ");
                    datos.put("direccion", sc.nextLine());

                    System.out.print("Ingrese el teléfono: ");
                    datos.put("telefono", sc.nextLine());

                    System.out.print("Ingrese el correo: ");
                    datos.put("correo", sc.nextLine());

                    System.out.print("¿Es cliente preferente? (s/n): ");
                    datos.put("preferente", sc.nextLine().trim().equalsIgnoreCase("s"));

                    // Se agrega el cliente al mapa principal usando el NIF como clave
                    clientes.put(nif, datos);
                    System.out.println("Cliente añadido con éxito.");
                    break;

                case "2": // Opción para eliminar cliente
                    System.out.print("Ingrese el NIF del cliente a eliminar: ");
                    String nifEliminar = sc.nextLine();

                    // Se intenta eliminar el cliente. Si existe, se elimina; si no, se notifica
                    if (clientes.remove(nifEliminar) != null) {
                        System.out.println("Cliente eliminado.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case "3": // Opción para mostrar datos de un cliente específico
                    System.out.print("Ingrese el NIF del cliente a mostrar: ");
                    String nifMostrar = sc.nextLine();

                    // Verifica si el cliente existe y muestra su información
                    if (clientes.containsKey(nifMostrar)) {
                        System.out.println("Datos del cliente: " + clientes.get(nifMostrar));
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case "4": // Opción para listar todos los clientes
                    System.out.println("\nLista de todos los clientes:");
                    for (String key : clientes.keySet()) {
                        System.out.println("NIF: " + key + ", Nombre: " + clientes.get(key).get("nombre"));
                    }
                    break;

                case "5": // Opción para listar únicamente clientes preferentes
                    System.out.println("\nClientes preferentes:");
                    for (Map.Entry<String, Map<String, Object>> entry : clientes.entrySet()) {
                        // Verifica si el cliente tiene el atributo "preferente" en verdadero
                        if ((boolean) entry.getValue().get("preferente")) {
                            System.out.println("NIF: " + entry.getKey() + ", Nombre: " + entry.getValue().get("nombre"));
                        }
                    }
                    break;

                case "6": // Terminar programa
                    System.out.println("Programa terminado.");
                    sc.close(); // Cierra el Scanner para liberar recursos
                    return; // Finaliza el método main

                default: // Opción no válida
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
