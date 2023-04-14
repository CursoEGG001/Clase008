/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase08e02;

import Servicios.CafeteraServicio;
  import Entidades.Cafetera;

/**
 *
 * @author pc
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        CafeteraServicio servicio = new CafeteraServicio();
        servicio.llenarCafetera();
        servicio.servirTaza(250);
        servicio.VaciarCafetera();
        servicio.AgregarCafe(500);
    }
}