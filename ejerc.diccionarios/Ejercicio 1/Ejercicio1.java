import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConversorDivisas {
    public static void main(String[] args) {
        // Crear un diccionario (HashMap) para almacenar las monedas y su valor en pesos colombianos
        Map<String, Double> monedas = new HashMap<>();
        monedas.put("Euro", 4444.0);              // Valor de 1 Euro en pesos colombianos
        monedas.put("Dolar", 4422.0);             // Valor de 1 Dólar estadounidense en pesos colombianos
        monedas.put("Yen", 31.86);                // Valor de 1 Yen japonés en pesos colombianos
        monedas.put("Libra", 5200.0);             // Valor de 1 Libra esterlina en pesos colombianos
        monedas.put("Franco Suizo", 4600.0);      // Valor de 1 Franco suizo en pesos colombianos
        monedas.put("Dolar Canadiense", 3300.0);  // Valor de 1 Dólar canadiense en pesos colombianos
        monedas.put("Peso Mexicano", 250.0);      // Valor de 1 Peso mexicano en pesos colombianos
        monedas.put("Real Brasileño", 900.0);     // Valor de 1 Real brasileño en pesos colombianos
        monedas.put("Yuan", 650.0);               // Valor de 1 Yuan chino en pesos colombianos
        monedas.put("Rupia India", 53.0);         // Valor de 1 Rupia india en pesos colombianos

        // Crear objeto Scanner para leer datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario la divisa a consultar y elimina espacios al inicio o al final
        System.out.print("Ingrese la divisa que desea consultar: ");
        String divisa = sc.nextLine().trim();

        // Solicita al usuario el valor que quiere convertir de esa divisa
        System.out.print("Ingrese el valor en " + divisa + ": ");
        double valor = sc.nextDouble();

        // Verifica si la divisa ingresada existe en el diccionario
        if (monedas.containsKey(divisa)) {
            // Calcula la conversión multiplicando el valor por la tasa correspondiente
            double conversion = valor * monedas.get(divisa);
            // Muestra el resultado con dos decimales
            System.out.printf("%.2f %s equivalen a %.2f pesos colombianos.%n", valor, divisa, conversion);
        } else {
            // Mensaje en caso de que la divisa no se encuentre en el diccionario
            System.out.println("La divisa '" + divisa + "' no está en el diccionario.");
        }

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
