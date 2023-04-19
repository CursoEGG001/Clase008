/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pasaje;

/**
 *
 * @author pc
 */
public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {}

    public Tiempo(int hora, int minutos, int segundos) {
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("La hora, minutos o segundos son inválidos");
        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("La hora es inválida");
        }
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Los minutos son inválidos");
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Los segundos son inválidos");
        }
        this.segundos = segundos;
    }

    public void imprimirHoraCompleta() {
        System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
    }
}

