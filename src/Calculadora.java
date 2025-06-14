package com.calculadorajava;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar los operandos al usuario
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // 2. Operaciones aritméticas básicas; Al número1 le asigno el valor 25.5; Al número2 le asigno el valor 30
        System.out.println("\n--- Operaciones Aritméticas Básicas ---");
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2)); //Con número1 (25.5) y con número2 (30), el resultado es 55.5
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2)); //Con número1 (25.5) y con número2 (30), el resultado es -4.5
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2)); //Con número1 (25.5) y con número2 (30), el resultado es 765

        if (numero2 != 0) {
            System.out.println("División: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2)); //Con número1 (25.5) y con número2 (30), el resultado es 0.85
            System.out.println("Módulo: " + numero1 + " % " + numero2 + " = " + (numero1 % numero2)); //Con número1 (25.5) y con número2 (30), el resultado es 25.5
        } else {
            System.out.println("División: No se puede dividir entre cero.");
            System.out.println("Módulo: No se puede calcular el módulo entre cero.");
        }
        scanner.close();
    }
}