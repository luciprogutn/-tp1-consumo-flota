import java.util.Scanner;

public class Viaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes (punto B.2) se usa final para que el valor no cambie durante el proceso, siempre va atener el mismo valor
        final double PRECIO_LITRO = 1250.0;
        final double CAPACIDAD_TANQUE = 400.0;

        // Lectura de datos (punto B.1)
        System.out.print("Ingrese la patente: ");
        String patente = scanner.nextLine();

        System.out.print("Ingrese el kilometraje inicial: ");
        int kmInicial = scanner.nextInt();

        System.out.print("Ingrese el kilometraje final: ");
        int kmFinal = scanner.nextInt();

        System.out.print("Ingrese los litros cargados: ");
        double litrosCargados = scanner.nextDouble();

        // ¡Acá vienen las variables y los cálculos del punto B.3!

        scanner.close();
    }
}