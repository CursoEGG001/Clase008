/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Tiempo.Fecha;

/**
 *
 * @author pc
 */
public class FechaServicio {

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static int cantidadDiasMes(int mes, int anio) {
        int dias;
        switch (mes) {
            case 2:
                if (esBisiesto(anio)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            default:
                dias = 31;
        }
        return dias;
    }

    public static Fecha verificarAnio(Fecha fecha) {
        int anio = fecha.getAnio();
        if (anio < 1900 || anio > 2021) {
            fecha.setAnio(1900);
        }
        return fecha;
    }

    public static Fecha diaAnterior(Fecha fecha) {
        int dia = fecha.getDia();
        int mes = fecha.getMes();
        int anio = fecha.getAnio();
        int diasMesAnterior;
        if (dia == 1) {
            if (mes == 1) {
                mes = 12;
                anio--;
            } else {
                mes--;
            }
            diasMesAnterior = cantidadDiasMes(mes, anio);
            fecha.setDia(diasMesAnterior);
            fecha.setMes(mes);
            fecha.setAnio(anio);
        } else {
            fecha.setDia(dia - 1);
        }
        return fecha;
    }

    public static Fecha diaSiguiente(Fecha fecha) {
        int dia = fecha.getDia();
        int mes = fecha.getMes();
        int anio = fecha.getAnio();
        int diasMesActual = cantidadDiasMes(mes, anio);
        if (dia == diasMesActual) {
            if (mes == 12) {
                mes = 1;
                anio++;
            } else {
                mes++;
            }
            fecha.setDia(1);
            fecha.setMes(mes);
            fecha.setAnio(anio);
        } else {
            fecha.setDia(dia + 1);
        }
        return fecha;
    }
    
    
}