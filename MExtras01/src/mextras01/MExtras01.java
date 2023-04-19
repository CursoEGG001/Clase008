/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mextras01;

import java.util.Scanner;
import Servicio.FraccionServicio;
import Operaciones.Fraccion;

/**
 *
 * @author pc
 */
public class MExtras01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FraccionServicio fraccionService = new FraccionServicio();
        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();

        // Pedir al usuario el numerador y denominador de la primera fracción
        System.out.println("Ingrese el numerador de la primera fracción:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el denominador de la primera fracción:");
        int den1 = sc.nextInt();
        fraccion1.setNumerador(num1);
        fraccion1.setDenominador(den1);

        // Pedir al usuario el numerador y denominador de la segunda fracción
        System.out.println("Ingrese el numerador de la segunda fracción:");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el denominador de la segunda fracción:");
        int den2 = sc.nextInt();
        fraccion2.setNumerador(num2);
        fraccion2.setDenominador(den2);

        // Mostrar menú de opciones para el usuario
        System.out.println("Seleccione una opción:");
        System.out.println("1. Sumar fracciones");
        System.out.println("2. Restar fracciones");
        System.out.println("3. Multiplicar fracciones");
        System.out.println("4. Dividir fracciones");
        int opcion = sc.nextInt();

        // Realizar la operación correspondiente según la opción seleccionada por el usuario
        switch (opcion) {
            case 1:
                Fraccion suma = fraccionService.sumar(fraccion1, fraccion2);
                System.out.println("La suma de las fracciones es: " + suma.getNumerador() + " / " + suma.getDenominador());
                break;
            case 2:
                Fraccion resta = fraccionService.restar(fraccion1, fraccion2);
                System.out.println("La resta de las fracciones es: " + + resta.getNumerador() + " / " + resta.getDenominador());
                break;
            case 3:
                Fraccion multiplicacion = fraccionService.multiplicar(fraccion1, fraccion2);
                System.out.println("La multiplicación de las fracciones es: "  + multiplicacion.getNumerador() + " / " + multiplicacion.getDenominador());
                break;
            case 4:
                Fraccion division = fraccionService.dividir(fraccion1, fraccion2);
                System.out.println("La división de las fracciones es: " +division.getNumerador() + " / " + division.getDenominador());
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        sc.close();
    }
}
