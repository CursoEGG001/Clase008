/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Operaciones.Fraccion;
/**
 *
 * @author pc
 */
public class FraccionServicio {

    public static Fraccion sumar(Fraccion f1, Fraccion f2) {
        int numerador = (f1.getNumerador() * f2.getDenominador()) + (f2.getNumerador() * f1.getDenominador());
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(numerador, denominador);
    }

    public static Fraccion restar(Fraccion f1, Fraccion f2) {
        int numerador = (f1.getNumerador() * f2.getDenominador()) - (f2.getNumerador() * f1.getDenominador());
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(numerador, denominador);
    }

    public static Fraccion multiplicar(Fraccion f1, Fraccion f2) {
        int numerador = f1.getNumerador() * f2.getNumerador();
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(numerador, denominador);
    }

    public static Fraccion dividir(Fraccion f1, Fraccion f2) {
        int numerador = f1.getNumerador() * f2.getDenominador();
        int denominador = f1.getDenominador() * f2.getNumerador();
        return new Fraccion(numerador, denominador);
    }
}
