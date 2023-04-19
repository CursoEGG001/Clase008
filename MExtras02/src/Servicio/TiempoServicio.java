/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Pasaje.Tiempo;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TiempoServicio {

    public static void simularPasoDelTiempo(Tiempo tiempo) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Horas,Minutos y Segundos:");
        int h1, m1, s1;
        do {
            h1 = leer.nextInt();
            m1 = leer.nextInt();
            s1 = leer.nextInt();
        } while (h1 < 0 || h1 > 23 || m1 < 0 || m1 > 59 || s1 < 0 || s1 > 59);
        tiempo.setHora(h1);
        tiempo.setMinutos(m1);
        tiempo.setSegundos(s1);

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
                break;
            }
        }
    }
}
