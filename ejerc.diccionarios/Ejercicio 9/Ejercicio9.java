// Importamos las librerías necesarias
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionFacturas {
    public static void main(String[] args) {
        // Creamos un HashMap para almacenar las facturas
        // La clave será el número de la factura (String) y el valor su costo (Double)
        Map<String, Double> facturas = new HashMap<>();
        
        // Variable para acumular el total de dinero ya cobrado
        double cobrado = 0.0;

        // Objeto Scanner para leer datos desde la consola
        Scanner sc = new Scanner(System.in);

        // Bucle infinito que solo se detiene cuando el usuario elige la opción 'T'
        while (true) {
            // Mostramos el menú de opciones
            System.out.print("\nSeleccione una opción: [A]ñadir, [P]agar, [T]erminar: ");
            String opcion = sc.nextLine().trim().toUpperCase(); // Leemos y normalizamos la opción

            // Usamos un switch para gestionar las diferentes opciones
            switch (opcion) {
                case "A": // Opción para añadir una nueva factura
                    System.out.print("Ingrese el número de factura: ");
                    String numeroAdd = sc.nextLine().trim(); // Leemos el número de la factura

                    System.out.print("Ingrese el costo de la factura: ");
                    double costo = sc.nextDouble(); // Leemos el valor de la factura
                    sc.nextLine(); // Limpiamos el buffer del Scanner

                    // Guardamos la factura en el diccionario (HashMap)
                    facturas.put(numeroAdd, costo);
                    System.out.println("Factura " + numeroAdd + " añadida.");
                    break;

                case "P": // Opción para pagar una factura existente
                    System.out.print("Ingrese el número de factura a pagar: ");
                    String numeroPay = sc.nextLine().trim(); // Leemos el número de la factura a pagar

                    // Verificamos si la factura existe en el diccionario
                    if (facturas.containsKey(numeroPay)) {
                        // Sumamos el valor al total cobrado y eliminamos la factura del mapa
                        cobrado += facturas.remove(numeroPay);
                        System.out.println("Factura " + numeroPay + " pagada.");
                    } else {
                        // Mensaje en caso de que no se encuentre la factura
                        System.out.println("Factura no encontrada.");
                    }
                    break;

                case "T": // Opción para terminar el programa
                    sc.close(); // Cerramos el objeto Scanner
                    return;     // Salimos del método main y finalizamos el programa

                default: // Opción no válida
                    System.out.println("Opción no válida.");
                    break;
            }

            // Calculamos el total pendiente sumando los valores restantes en el HashMap
            double pendiente = facturas.values().stream()
                                       .mapToDouble(Double::doubleValue)
                                       .sum();

            // Mostramos el total cobrado y pendiente hasta el momento
            System.out.printf("Total cobrado: %.2f | Total pendiente: %.2f%n", cobrado, pendiente);
        }
    }
}
