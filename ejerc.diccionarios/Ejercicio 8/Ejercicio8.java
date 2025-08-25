import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiccionarioTraduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Para leer entradas del usuario
        Map<String, String> diccionario = new HashMap<>(); // Diccionario español-inglés

        // Crear diccionario
        System.out.print("Ingrese palabras en formato español:inglés separadas por comas: ");
        String entrada = sc.nextLine(); // Leer toda la línea
        String[] pares = entrada.split(","); // Separar por coma

        for (String par : pares) {
            String[] partes = par.trim().split(":"); // Separar por :
            if (partes.length == 2) { // Validar que tenga formato correcto
                diccionario.put(partes[0].trim(), partes[1].trim()); // Guardar en el diccionario
            }
        }

        // Frase a traducir
        System.out.print("Ingrese una frase en español: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" "); // Separar la frase en palabras

        // Mostrar traducción
        System.out.print("Frase traducida: ");
        for (String palabra : palabras) {
            // Si la palabra no está en el diccionario, se deja igual
            System.out.print(diccionario.getOrDefault(palabra, palabra) + " ");
        }

        sc.close(); // Cerrar el escáner
    }
}
