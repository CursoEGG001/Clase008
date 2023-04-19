/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Pasaje.Tiempo;

/**
 *
 * @author pc
 */
public class TiempoServicio {
    public static void simularPasoDelTiempo(Tiempo tiempo) throws InterruptedException {
        while (true) {
            tiempo.imprimirHoraCompleta();
            Thread.sleep(1000);
            tiempo.setSegundos(tiempo.getSegundos() + 1);
            if (tiempo.getSegundos() == 60) {
                tiempo.setSegundos(0);
                tiempo.setMinutos(tiempo.getMinutos() + 1);
            }
            if (tiempo.getMinutos() == 60) {
                tiempo.setMinutos(0);
                tiempo.setHora(tiempo.getHora() + 1);
            }
            if (tiempo.getHora() == 24) {
                tiempo.setHora(0);
            }
        }
    }
}
