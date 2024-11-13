import java.util.Scanner;

public class CalificacionAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la nota del alumno
        System.out.print("Introduce la nota del alumno (de 0 a 10): ");
        double nota = scanner.nextDouble();

        // Determinar la calificación según la nota
        if (nota < 5) {
            System.out.println("Calificación: Suspenso");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Calificación: Aprobado");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Calificación: Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Calificación: Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Calificación: Sobresaliente");
        } else {
            System.out.println("Nota no válida. Introduce un valor entre 0 y 10.");
        }

        scanner.close();
    }
}