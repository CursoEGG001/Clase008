/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaBancariaServicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CuentaBancariaServicio {

    private Scanner carga = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {

        System.out.println("Ingrese Datos de Cuenta:");
        int numCuenta = carga.nextInt();
        long docCliente = carga.nextLong();
        double Saldo = carga.nextDouble();

        return new CuentaBancaria(numCuenta, docCliente, Saldo);
    }

    public void ingresar(CuentaBancaria S1, double saldoAdicional) {

        saldoAdicional += S1.getSaldoActual();
        S1.setSaldoActual(saldoAdicional);

    }

    public void retirar(CuentaBancaria S2, double saldoExtraer) {

        if (S2.getSaldoActual() > saldoExtraer) {
            double deRetiro = S2.getSaldoActual();
            S2.setSaldoActual(deRetiro - saldoExtraer);
        } else {
            S2.setSaldoActual(saldoExtraer);
        }

    }

    public void extraccionRapida(CuentaBancaria S3, double dinero) {
        if (dinero > S3.getSaldoActual() * 0.2) {
            System.out.println("No se puede realizar la estracción");
        } else {
            double SaldoDinero = S3.getSaldoActual();
            S3.setSaldoActual(SaldoDinero - dinero);
        }
    }

    public void consultarSaldo(CuentaBancaria S4) {
        System.out.println("Su Saldo es :" + S4.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria S5) {
        System.out.println("Estos son los Datos de la Cuenta:\n"
                + "Cuenta: " + S5.getNroCuenta()
                + "\n Documento Cliente: " + S5.getDniCliente()
                + "\n Saldo: " + S5.getSaldoActual());
    }

}
