import java.util.HashMap;
import java.util.Map;

public class CreditosAsignaturas {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar asignaturas con su número de créditos
        Map<String, Integer> asignaturas = new HashMap<>();
        asignaturas.put("Matemáticas", 6); // Matemáticas con 6 créditos
        asignaturas.put("Física", 4);      // Física con 4 créditos
        asignaturas.put("Química", 5);     // Química con 5 créditos

        // Variable para acumular el total de créditos
        int totalCreditos = 0;

        // Recorrer el HashMap con un for-each para mostrar cada asignatura y sumar sus créditos
        for (Map.Entry<String, Integer> entry : asignaturas.entrySet()) {
            System.out.println(entry.getKey() + " tiene " + entry.getValue() + " créditos");
            totalCreditos += entry.getValue(); // Acumula los créditos
        }

        // Mostrar el total de créditos del curso
        System.out.println("El número total de créditos del curso es: " + totalCreditos);
    }
}
