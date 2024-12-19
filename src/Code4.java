//Código Actividad n4
//Almacena un registro de un PH
import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        // Crear el objeto Scanner para capturar entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        String ID;
        int edad;
        long numero_apartamento;
        float tiempoEstadia;
        double tiempoTotalEstadia = 0; // Variable acumulativa para el tiempo total
        char mayorDeEdad; // 'S' o 'N'
        boolean esMayorDeEdad = false;
        byte visitasRealizadas = 0; // Contador de visitas (máximo 127)
        short totalVisitasSemana = 0; // Máximo número de visitas posibles en la semana

        // Capturar datos del visitante
        System.out.print("Digite su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Digite su ID: ");
        ID = entrada.nextLine();
        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();
        System.out.print("Digite el número del apartamento: ");
        numero_apartamento = entrada.nextLong();

        // Determinar si es mayor de edad
        if (edad >= 18) {
            mayorDeEdad = 'S';
            esMayorDeEdad = true;
        } else {
            mayorDeEdad = 'N';
            esMayorDeEdad = false;
        }

        // Leer visitas de la semana
        System.out.print("¿Cuántas visitas realizará esta semana?: ");
        totalVisitasSemana = entrada.nextShort();

        for (int i = 1; i <= totalVisitasSemana; i++) {
            System.out.print("Digite el tiempo de estadía de la visita " + i + " en horas: ");
            tiempoEstadia = entrada.nextFloat();

            // Acumular tiempo total de estadía
            tiempoTotalEstadia += tiempoEstadia;

            // Incrementar el contador de visitas
            visitasRealizadas++;
        }

        // Calcular promedio de tiempo de estadía
        double promedioEstadia = tiempoTotalEstadia / visitasRealizadas;

        // Mostrar resultados finales
        System.out.println("\nResumen de visitas:");
        System.out.println("Nombre del visitante: " + nombre);
        System.out.println("ID: " + ID);
        System.out.println("Edad: " + edad + " años (Mayor de edad: " + (esMayorDeEdad ? "Sí" : "No") + ")");
        System.out.println("Número del apartamento: " + numero_apartamento);
        System.out.println("Total de visitas realizadas: " + visitasRealizadas);
        System.out.printf("Tiempo promedio de estadía: %.2f horas\n", promedioEstadia);
        System.out.println("Tiempo total de estadía en la semana: " + tiempoTotalEstadia + " horas");
    }
}
