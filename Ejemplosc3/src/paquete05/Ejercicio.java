/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] arreglo1 = new String[1][5];

        int[][] arreglo2 = new int[1][5];

        String valorIngresado;

        int valorIngresado2;
        valorIngresado2 = 0;

        int produccion;
        produccion = 0;

        int contador;
        contador = 1;

        System.out.println("Ingreso los nombres de los encargados ");

        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("Ingrese el nombre para el encargado %s :", contador);
                valorIngresado = entrada.nextLine();
                arreglo1[i][j] = valorIngresado;
                contador++;
            }
            System.out.println();
        }
        contador = 1;
        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arreglo2[i].length; j++) {
                System.out.printf("Ingrese el valor para el encargado #%s :", contador);
                valorIngresado2 = entrada.nextInt();
                arreglo2[i][j] = valorIngresado2;
                contador++;
            }
        }
    }
}
