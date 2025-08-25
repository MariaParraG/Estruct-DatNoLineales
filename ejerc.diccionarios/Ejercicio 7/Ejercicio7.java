import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CestaCompra {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los artículos (clave) y sus precios (valor)
        Map<String, Double> cesta = new HashMap<>();

        // Crear objeto Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        // Bucle para ingresar artículos y precios
        while (true) {
            // Solicitar nombre del artículo
            System.out.print("Ingrese el artículo (o 'salir' para terminar): ");
            String articulo = sc.nextLine().trim();

            // Si el usuario escribe "salir", se rompe el bucle
            if (articulo.equalsIgnoreCase("salir")) {
                break;
            }

            // Solicitar el precio del artículo
            System.out.print("Ingrese el precio de " + articulo + ": ");
            double precio = sc.nextDouble();
            sc.nextLine(); // Limpiar el buffer para evitar problemas en la siguiente lectura

            // Agregar el artículo y su precio al HashMap
            cesta.put(articulo, precio);
        }

        // Mostrar lista de la compra
        System.out.println("\nLista de la compra");
        double total = 0; // Variable para acumular el total de la compra

        // Recorrer el HashMap e imprimir cada artículo con su precio
        for (Map.Entry<String, Double> entry : cesta.entrySet()) {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
            total += entry.getValue(); // Sumar el precio al total
        }

        // Imprimir el total de la compra
        System.out.printf("%nTotal de la compra: %.2f%n", total);

        // Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
}
