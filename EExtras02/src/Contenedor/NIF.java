/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenedor;

/**
 *
 * @author pc
 */
public class NIF {
    private long dni;
    private char letra;

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public NIF() {
    }

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

 
}