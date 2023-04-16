/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase08ee01;

import Calculos.Raices;
import Servicios.ServicioRaices;

/**
 *
 * @author pc
 */
public class EExtras01 {
    
    public static void main(String[] args) {
        
        Raices paraRaices = new Raices(-1, 1, 4);
        ServicioRaices Rc1 = new ServicioRaices();
        double Discriminante = Rc1.getDiscriminante(paraRaices);
        
        System.out.println("El discriminanete es: " + Discriminante);
        if (Rc1.tieneRaices(paraRaices)) {
            Rc1.obtenerRaices(paraRaices);
            
        } else if (Rc1.tieneRaiz(paraRaices)) {
            Rc1.obtenerRaiz(paraRaices);
            
        }
        Rc1.calcular(paraRaices);
        System.out.println("Eso es todo...");
    }
}
