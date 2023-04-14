/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    Cafetera Nespresso = new Cafetera();
    
    public void llenarCafetera(){
        
        System.out.println("Ingrese la capacidad de la cafetera:");
        int Cap = leer.nextInt();
        Nespresso.setCapMAX(Cap);
        Nespresso.setCantAct(Cap);
                
    }
    
    public void servirTaza(int CapTaza){
        
        System.out.println("Ingrese La cantidad a servir en la taza");
        int CantAServir = leer.nextInt();
        System.out.println("La taza dispone de " + CapTaza + " para servir");
        
        if (CantAServir > CapTaza ) {
            System.out.println("Se lleno la taza");
        } else {
            System.out.println("La taza tiene " + (CapTaza - CantAServir) );
        }
    }
    
    public void VaciarCafetera() {
        
        System.out.println("Se Vació la cafetera");
        Nespresso.setCantAct(0);
    }
    
    public void AgregarCafe(int LaCantidad) {
        Nespresso.setCantAct(LaCantidad);
        System.out.println("Se ha agregado " + LaCantidad);
    }
}
