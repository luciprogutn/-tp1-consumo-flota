import java.util.Scanner;
public class Viaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PRECIO_LITRO = 1250.0;
        double CAPACIDAD_TANQUE = 400.0;

        System.out.println("ingrese la patente: ");
        String patente = scanner.nextLine();

        System.out.println("ingrese el kilometraje inicial: ");
        double kmInicial = scanner.nextDouble();

        System.out.println("ingrese el kilometraje final: ");
        double kmFinal = scanner.nextDouble();

        System.out.println("ingrese los litros cargados: ");
        double litrosCargados = scanner.nextDouble();

        double kmRecorridos = kmFinal - kmInicial;
        double consumoCada100 = (litrosCargados / kmRecorridos) * 100;
        double rendimientos = kmRecorridos / litrosCargados;
        double costoTotal = litrosCargados * PRECIO_LITRO;
        double costoPorkm = costoTotal / kmRecorridos;
        double porcentajeTanque = (litrosCargados / CAPACIDAD_TANQUE) * 100;


        System.out.println("\n============================================ ");
        System.out.println("             RESUMEN DEL VIAJE          ");
        System.out.println("\n============================================ ");

        System.out.printf("Patente del camion ........: %s%n", patente);
        System.out.printf("Kilometros recorridos .....: %,10.2f km%n", kmRecorridos);
        System.out.printf("Consumo (L/100 km) ........: %,10.2f L/100km%n", consumoCada100);
        System.out.printf("Rendimientos (km/L) .......: %,10.2f km/L%n", rendimientos);
        System.out.printf("Costo total de combustible : $ %,9.2f%n", costoTotal);
        System.out.printf("Costo por kilometro .......: $ %,9.2f%n", costoPorkm);
        System.out.printf("Porcentaje de tanque ......: %,10.2f %% %n", porcentajeTanque);

        System.out.printf("\n============================================ ");
        System.out.printf("\n * ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ *   ");
        System.out.printf("\n============================================ ");


    }
}