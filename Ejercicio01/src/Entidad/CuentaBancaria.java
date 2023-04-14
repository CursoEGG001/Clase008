/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class CuentaBancaria {

    private int nroCuenta;
    private long dniCliente;
    private double SaldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int nroCuenta, long dniCliente, double SaldoActual) {
        this.nroCuenta = nroCuenta;
        this.dniCliente = dniCliente;
        this.SaldoActual = SaldoActual;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

}
