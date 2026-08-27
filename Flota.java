import java.util.Scanner;

public class Flota {

    public static final int CANTIDAD_CAMIONES = 6;

    public static double calcularConsumocada100(double km, double litros){
    return (litros / km) * 100;
    }
    public static void cargarDatos(String[] patentes, double[] km,double [] litros, Scanner scanner){
        for ( int i= 0; i < CANTIDAD_CAMIONES; i ++){
            System.out.println("---Camion"+(i+1)+"---");
            System.out.println("Ingrese la patente: ");
            patentes[i] = scanner.nextLine();

            System.out.print("Ingrese los kilometros recorridos: ");
            km[i] = scanner.nextDouble();

            System.out.print("Ingrese los litros consumidos: ");
            litros[i] = scanner.nextDouble();

            scanner.nextLine ();


        }
    }
    public static double sumarArray(double[] valores){
        double total = 0;
        for (double valor : valores){
            total += valor;
        }
        return total;
    }
    public static int indiceMasKilometros(double[] km){
        int indiceMax = 0;
        for (int i = < km.length; i ++){
            if (km[i] > km[indiceMax]){
                indiceMax= i;
            }
        }
        return indiceMax;
    }
    public static int indiceMenosKilometros(double[] km){
        int indiceMin = 0;
        for (int i = 1 ; i< km.length; i ++){
            if (km[i] < km[indiceMin]){
                indiceMin;
            }
        }
        return indiceMin;
    }
    public static void mostrarInforme(String[] patentes, double[] km, double[] litros){
        double totalKm= sumarArray(km);
        double totalLitros= sumarArray(litros);
        double promedioKm = totalKm / CANTIDAD_CAMIONES;

        double consumoPromedioFlota = calcularConsumoCada100(totalkm, totalLitros);

        int posMasKm = indiceMasKilometros(km);
        int posMneosKm = indiceMenorKilometros(km);

        System.out.printf("========INFORME DE LA FOTA========");
        System.out.printf("total kilometros recorridos: %10.2f km\n", totalKm);
        System.out.printf("total litros consumidos: %10.2f L" ,totalLitros);
        System.out.printf("")
    }
}