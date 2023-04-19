/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mextras02;

import Pasaje.Tiempo;
import Servicio.TiempoServicio;

/**
 *
 * @author pc
 */
public class MExtras02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Tiempo tiempo = new Tiempo(12, 30, 0);
        TiempoServicio.simularPasoDelTiempo(tiempo);
    }

}
