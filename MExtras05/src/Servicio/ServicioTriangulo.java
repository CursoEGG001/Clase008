/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Formas.Triangulo;

/**
 *
 * @author pc
 */
public class ServicioTriangulo {
    public Triangulo obtenerTrianguloMayor(Triangulo[] triangulos) {
        double maxArea = -1;
        Triangulo trianguloMayor = null;
        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i].calcularArea() > maxArea) {
                maxArea = triangulos[i].calcularArea();
                trianguloMayor = triangulos[i];
            }
        }
        return trianguloMayor;
    }
}