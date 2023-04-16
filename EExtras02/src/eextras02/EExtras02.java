/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eextras02;

import Contenedor.NIF;
import NIFService.NIFService;

/**
 *
 * @author pc
 */
public class EExtras02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NIF nif = new NIF();
        NIFService doc1 = new NIFService();
        System.out.println("Inicio del Programa");
        doc1.crearNif(nif);
        doc1.mostrar(nif);
    }

}
