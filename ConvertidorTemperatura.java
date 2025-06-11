import java.util.Scanner;

public class ConvertidorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertidor de Temperatura");
        System.out.print("Ingresa la temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("¿Convertir a (1) Fahrenheit o (2) Celsius?: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            double fahrenheit = (temperatura * 9 / 5) + 32;
            System.out.println("Resultado: " + fahrenheit + " °F");
        } else if (opcion == 2) {
            double celsius = (temperatura - 32) * 5 / 9;
            System.out.println("Resultado: " + celsius + " °C");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
