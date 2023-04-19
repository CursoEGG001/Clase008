/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;

public class SopaDeLetras {
    public final char[][] matriz;
    private String palabraAEncontrar;

    public SopaDeLetras() {
        this.matriz = new char[10][10];
        inicializarMatriz();
        palabraAEncontrar = "";
    }

    private void inicializarMatriz() {
        String[] palabras = {"perro", "gato", "tigre", "oso", "pato", "búo", "mono", "leon", "cebra", "hiena"};
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            String palabra = palabras[rand.nextInt(palabras.length)];
            for (int j = 0; j < palabra.length(); j++) {
                this.matriz[i][j] = palabra.charAt(j);
            }
            for (int j = 5; j < 10; j++) {
                this.matriz[i][j] = (char) (rand.nextInt(26) + 'a');
            }
        }
    }

    public void setPalabraAEncontrar(String palabra) {
        palabraAEncontrar = palabra;
    }

    public String getPalabraAEncontrar() {
        return palabraAEncontrar;
    }
}
