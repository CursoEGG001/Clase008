/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pc
 */
public class Cafetera {
    
    private int CapMAX;
    private int CantAct;

    public Cafetera() {
    }

    public Cafetera(int CapMAX, int CantAct) {
        this.CapMAX = CapMAX;
        this.CantAct = CantAct;
    }

    public int getCapMAX() {
        return CapMAX;
    }

    public void setCapMAX(int CapMAX) {
        this.CapMAX = CapMAX;
    }

    public int getCantAct() {
        return CantAct;
    }

    public void setCantAct(int CantAct) {
        this.CantAct = CantAct;
    }


    
}
