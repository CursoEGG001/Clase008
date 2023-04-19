/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mextras05;

import Formas.Triangulo;
import Servicio.ServicioTriangulo;

/**
 *
 * @author pc
 */
public class MExtras05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo[] triangulos = new Triangulo[4];
        triangulos[0] = new Triangulo(3, 4);
        triangulos[1] = new Triangulo(5, 6);
        triangulos[2] = new Triangulo(7, 8);
        triangulos[3] = new Triangulo(9, 10);

        ServicioTriangulo servicio = new ServicioTriangulo();

        // Calcular área y perímetro del primer triángulo
        System.out.println("Área del primer triángulo: " + triangulos[0].calcularArea());
        System.out.println("Perímetro del primer triángulo: " + triangulos[0].calcularPerimetro());

        // Mostrar los datos del triángulo con mayor superficie
        Triangulo trianguloMayor = servicio.obtenerTrianguloMayor(triangulos);
        System.out.println("Triangulo con mayor area: " + trianguloMayor);
    }

}
