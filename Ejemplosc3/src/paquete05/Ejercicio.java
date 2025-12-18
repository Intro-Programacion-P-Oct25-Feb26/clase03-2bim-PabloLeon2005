package paquete05;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] nombres = new String[5];
        
        int[][] produccion = new int[5][12];
        
        System.out.println("Ingreso los nombres de los encargados\n");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Ingrese el nombre para el encargado de la estación %d: ", (i + 1));
            nombres[i] = entrada.nextLine();
        }
        
        System.out.println();
        
        for (int i = 0; i < produccion.length; i++) {
            System.out.printf("Ingreso de producción mensual para la Estación %d (%s)\n", (i + 1), nombres[i]);
            for (int j = 0; j < produccion[i].length; j++) {
                System.out.printf("Ingrese la producción del mes %d: $", (j + 1));
                produccion[i][j] = entrada.nextInt();
            }
            System.out.println();
        }
        
        int[] totales = new int[5];
        for (int i = 0; i < produccion.length; i++) {
            int suma = 0;
            for (int j = 0; j < produccion[i].length; j++) {
                suma = suma + produccion[i][j];
            }
            totales[i] = suma;
        }
        
        int maxProduccion = totales[0];
        int indiceMax = 0;
        for (int i = 1; i < totales.length; i++) {
            if (totales[i] > maxProduccion) {
                maxProduccion = totales[i];
                indiceMax = i;
            }
        }
        
        System.out.println("Análisis de Producción");
        System.out.println("Estación");
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Nombre Estación %d - Total Producción: $ %d\n", (i + 1), totales[i]);
        }
        
        System.out.println();
        System.out.printf("Estación más productiva: Nombre Estación %d\n", (indiceMax + 1));
        System.out.printf("Encargado de la estación: %s\n", nombres[indiceMax]);
        System.out.printf("Cantidad de la estación más productiva: $ %d\n", maxProduccion);
    }
}