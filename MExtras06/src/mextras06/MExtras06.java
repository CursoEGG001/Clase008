/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mextras06;

import Entidad.SopaDeLetras;
import Servicio.SopaDeLetrasServicio;
import java.util.Arrays;

/**
 *
 * @author pc
 */
public class MExtras06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SopaDeLetras sopa = new SopaDeLetras();
        sopa.setPalabraAEncontrar("gato");

        SopaDeLetrasServicio servicio = new SopaDeLetrasServicio();

// Buscar la palabra "gato" en la sopa de letras
        int[] posicion = servicio.buscarPalabra(sopa);
        System.out.println(Arrays.toString(posicion) + " se encuentra " + sopa.getPalabraAEncontrar());
        servicio.imprimirSopaDeLetras(sopa);

// Reemplazar la palabra "hola" por "mundo"
        System.out.println("Aquí se cambió:");
        servicio.reemplazarPalabra(sopa, "gato", "mundo");

// Imprimir la sopa de letras
        servicio.imprimirSopaDeLetras(sopa);

    }
}
