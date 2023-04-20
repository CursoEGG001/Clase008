/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Juego.Ahorcado;

/**
 *
 * @author pc
 */
public class Main {

    public static void main(String[] args) {

        Ahorcado jueguito = new Ahorcado();

        jueguito.crearJuego();
        jueguito.longitud();
        jueguito.intentos();
        jueguito.juego();
    }
}
