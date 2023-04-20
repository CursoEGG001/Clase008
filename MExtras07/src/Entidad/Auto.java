/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author pc
 */
public class Auto {
    private String nombreDuenio;
    private LocalDate fechaVencimientoCarnet;
    private String color;
    private String modelo;
    private int kmMotor;

    public Auto(String nombreDuenio,LocalDate fechaVencimientoCarnet, String color, String modelo, int kmMotor) {
        this.nombreDuenio = nombreDuenio;
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
        this.color = color;
        this.modelo = modelo;
        this.kmMotor = 7500;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public LocalDate getFechaVencimientoCarnet() {
        return fechaVencimientoCarnet;
    }

    public void setFechaVencimientoCarnet(LocalDate fechaVencimientoCarnet) {
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKmMotor() {
        return kmMotor;
    }

    public void setKmMotor(int kmMotor) {
        this.kmMotor = kmMotor;
    }
}

