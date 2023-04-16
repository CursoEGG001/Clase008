/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Calculos.Raices;

/**
 *
 * @author pc
 */
public class ServicioRaices {
    
    public double getDiscriminante(Raices R1) {
        return Math.pow(R1.getB(), 2) - 4 * R1.getA() * R1.getC();
    }

    public boolean tieneRaices(Raices R2) {
        double discriminante = getDiscriminante(R2);
        return discriminante >= 0;
    }

    public boolean tieneRaiz(Raices R3) {
        double discriminante = getDiscriminante(R3);
        return discriminante == 0;
    }

    public void obtenerRaices(Raices R4) {
        if (tieneRaices(R4)) {
            double x1 = (-(R4.getB()) + Math.sqrt(getDiscriminante(R4))) / (2 * R4.getA());
            double x2 = (-(R4.getB()) - Math.sqrt(getDiscriminante(R4))) / (2 * R4.getA());
            System.out.println("Las soluciones son: x1=" + x1 + ", x2=" + x2);
        } else {
            System.out.println("No existen soluciones reales");
        }
    }

    public void obtenerRaiz(Raices R5) {
        if (tieneRaiz(R5)) {
            double x = -(R5.getB()) / (2 * R5.getA());
            System.out.println("La solución es: x=" + x);
        } else {
            System.out.println("No existe una única solución real");
        }
    }

    public void calcular(Raices R6) {
        if (tieneRaices(R6)) {
            obtenerRaices(R6);
        } else if (tieneRaiz(R6)) {
            obtenerRaiz(R6);
        } else {
            System.out.println("No existen soluciones reales");
        }
    }
}

