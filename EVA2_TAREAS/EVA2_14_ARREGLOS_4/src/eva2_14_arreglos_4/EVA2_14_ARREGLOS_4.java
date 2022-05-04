/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_arreglos_4;

import java.util.Scanner;

/**
 *
 * @author alox1
 */
public class EVA2_14_ARREGLOS_4 {
    public static final int TAM = 32;
    public static void main(String[] args) {
        int[] arreglosEdad = new int[TAM]; //4 bytes = 1 entero
        System.out.println("El arreglo es de " + arreglosEdad.length);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arreglosEdad.length; i++) {
            System.out.println("Cual es tu edad ");
            arreglosEdad[i] = input.nextInt();

        }
        for (int i = 0; i < arreglosEdad.length; i++) {
            System.out.print("[" + arreglosEdad[i] + "]");

        }
    }
    
}
