/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diferenciadeedad;

import java.util.Scanner;

public class DiferenciaDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los años de nacimiento de las dos personas
        System.out.print("ingrese el annio de nacimiento de la primer persona : ");
        int anoNacimiento1 = scanner.nextInt();

        System.out.print("Ingrese el annio de nacimiento de la segunda persona: ");
        int anoNacimiento2 = scanner.nextInt();

        // Calcular la diferencia de edad
        int diferencia = Math.abs(anoNacimiento1 - anoNacimiento2);

        // Determinar quién es mayor
        if (anoNacimiento1 < anoNacimiento2) {
            System.out.println("La primera persona es mayor por " + diferencia + " years.");
        } else if (anoNacimiento1 > anoNacimiento2) {
            System.out.println("La segunda persona es mayor por " + diferencia + " years.");
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }

        scanner.close();
    }
}