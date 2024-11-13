import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Selecciona la operación a realizar: ");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5: Resto de la división (módulo)"); //MODIFICADO PUNTO 7 GIT
        System.out.print("Introduce el número de la operación: ");
        int operacion = scanner.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Resultado de la suma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado de la división: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
                ///MODIFICADO PUNTO 7 GIT
                case 5:
                if (num2 != 0) {
                    System.out.println("Resultado del resto de la división (módulo): " + (num1 % num2));
                } else {
                    System.out.println("Error: No se puede calcular el resto de una división por cero.");
                }
                break;
                //MODIFICADO PUNTO 7 GIT
                
                
            default:
                System.out.println("Operación no válida.");
        }
    }
}