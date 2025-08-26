// Importa las clases necesarias para trabajar con mapas y entrada de datos
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepuestosCarro {
    public static void main(String[] args) {
        // Crea un mapa (diccionario) que asocia el nombre del repuesto con su precio
        Map<String, Double> repuestos = new HashMap<>();

        // Agrega algunos repuestos con su respectivo precio
        repuestos.put("Bujia", 1.40);
        repuestos.put("Pastillas de freno", 5.80);
        repuestos.put("Radiador", 300.50);
        repuestos.put("Rodamiento", 10.70);

        // Crea un objeto Scanner para leer datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario el nombre del repuesto que desea consultar
        System.out.print("Ingrese el nombre del repuesto: ");
        String repuesto = sc.nextLine().trim(); // Lee el texto y elimina espacios innecesarios

        // Solicita la cantidad del repuesto que el usuario desea comprar
        System.out.print("Ingrese la cantidad de " + repuesto + ": ");
        int cantidad = sc.nextInt(); // Lee el número entero ingresado

        // Verifica si el repuesto ingresado existe en el mapa
        if (repuestos.containsKey(repuesto)) {
            // Calcula el costo total multiplicando el precio unitario por la cantidad
            double total = repuestos.get(repuesto) * cantidad;

            // Muestra el costo total con formato de dos decimales
            System.out.printf("El costo total de %d %s(s) es: %.2f dólares.%n", cantidad, repuesto, total);
        } else {
            // Si el repuesto no está en el mapa, muestra un mensaje de error
            System.out.println("El repuesto '" + repuesto + "' no está en el diccionario.");
        }

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
