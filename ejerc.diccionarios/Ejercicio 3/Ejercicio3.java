import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepuestosCarro {
    public static void main(String[] args) {
        Map<String, Double> repuestos = new HashMap<>();
        repuestos.put("Bujia", 1.40);
        repuestos.put("Pastillas de freno", 5.80);
        repuestos.put("Radiador", 300.50);
        repuestos.put("Rodamiento", 10.70);

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del repuesto: ");
        String repuesto = sc.nextLine().trim();

        System.out.print("Ingrese la cantidad de " + repuesto + ": ");
        int cantidad = sc.nextInt();

        if (repuestos.containsKey(repuesto)) {
            double total = repuestos.get(repuesto) * cantidad;
            System.out.printf("El costo total de %d %s(s) es: %.2f dólares.%n", cantidad, repuesto, total);
        } else {
            System.out.println("El repuesto '" + repuesto + "' no está en el diccionario.");
        }

        sc.close();
    }
}
