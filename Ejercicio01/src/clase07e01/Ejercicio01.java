/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase07e01;

import CuentaBancariaServicio.CuentaBancariaServicio;
import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        CuentaBancariaServicio C1 = new CuentaBancariaServicio();        
        CuentaBancaria Fulanos = C1.crearCuenta();
        C1.consultarDatos(Fulanos);
        System.out.println("Ingrese un saldo a extraer");
        double sumaAExtraer = dato.nextDouble();
        C1.retirar(Fulanos, sumaAExtraer);
        C1.consultarSaldo(Fulanos);
        System.out.println("Escriba el dinero a ingresar: ");
        double AgregadoSaldo = dato.nextDouble();
        C1.ingresar(Fulanos, AgregadoSaldo);
    }
}
