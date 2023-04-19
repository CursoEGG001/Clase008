/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.SopaDeLetras;
import java.util.Arrays;

public class SopaDeLetrasServicio {

    public int[] buscarPalabra(SopaDeLetras sopa) {
        int[] posicion = new int[2];
        for (int i = 0; i < sopa.matriz.length; i++) {
            for (int j = 0; j < sopa.matriz[i].length; j++) {
                if (sopa.matriz[i][j] == sopa.getPalabraAEncontrar().charAt(0)) {
                    boolean encontrada = true;
                    for (int k = 1; k < sopa.getPalabraAEncontrar().length(); k++) {
                        if (j + k >= sopa.matriz[i].length || sopa.matriz[i][j + k] != sopa.getPalabraAEncontrar().charAt(k)) {
                            encontrada = false;
                            break;
                        }
                    }
                    if (encontrada) {
                        posicion[0] = i;
                        posicion[1] = j;
                        return posicion;
                    }
                }
            }
        }
        return null;
    }

    public void reemplazarPalabra(SopaDeLetras sopa, String palabraABuscar, String palabraAReemplazar) {
        for (int i = 0; i < sopa.matriz.length; i++) {
            for (int j = 0; j < sopa.matriz[i].length; j++) {
                if (sopa.matriz[i][j] == palabraABuscar.charAt(0)) {
                    boolean encontrada = true;
                    for (int k = 1; k < palabraABuscar.length(); k++) {
                        if (j + k >= sopa.matriz[i].length || sopa.matriz[i][j + k] != palabraABuscar.charAt(k)) {
                            encontrada = false;
                            break;
                        }
                    }
                    if (encontrada) {
                        for (int k = 0; k < palabraAReemplazar.length(); k++) {
                            sopa.matriz[i][j + k] = palabraAReemplazar.charAt(k);
                        }
                        return;
                    }
                }
            }
        }
    }

    public void imprimirSopaDeLetras(SopaDeLetras sopa) {
        for (char[] fila : sopa.matriz) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();
    }
}
