import java.util.Scanner;

public class Flota {


    public static final int CANTIDAD_CAMIONES = 6;

    public static double calcularConsumoCada100(double km, double litros){
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
        for (int i = 1; i < km.length; i ++){
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
                indiceMin= i;
            }
        }
        return indiceMin;
    }
    public static void mostrarInforme(String[] patentes, double[] km, double[] litros) {
        double totalKm = sumarArray(km);
        double totalLitros = sumarArray(litros);
        double promedioKm = totalKm / CANTIDAD_CAMIONES;

        double consumoPromedioFlota = calcularConsumoCada100(totalKm, totalLitros);

        int posMasKm = indiceMasKilometros(km);
        int posMenosKm = indiceMenosKilometros(km);

        System.out.printf("================INFORME DE LA FOTA================\n");
        System.out.printf("total kilometros recorridos....: %10.2f km\n", totalKm);
        System.out.printf("total litros consumidos........: %10.2fL\n", totalLitros);
        System.out.printf("Promedio de km por camion......: %10.2f\n", promedioKm);
        System.out.printf("camion con mas kilometros......: %s(%.3f km)\n", patentes[posMasKm], km[posMasKm]);
        System.out.printf("Consumo promedio flota.........: %10.2f L/100km\n", consumoPromedioFlota);
        System.out.printf("===================================================\n");
    }
        public static void main (String [] args){
            Scanner scanner = new Scanner (System.in);
            String[] patentes = new String[CANTIDAD_CAMIONES];
            double[] kmRecorridos = new double[CANTIDAD_CAMIONES];
            double[] litrosConsumidos = new double[CANTIDAD_CAMIONES];

            cargarDatos(patentes, kmRecorridos, litrosConsumidos, scanner);
            mostrarInforme(patentes, kmRecorridos, litrosConsumidos);

            scanner.close();

    }
}