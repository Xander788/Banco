/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jorge
 */
public class Cuenta {

    private String numeroCuenta; //por ejemplo el bcr es crc pa que no digan nadota
    private double saldo;
    private Moneda moneda;

    private String titular;
    private Estado estados;

    public String getTitular() {
        return titular;
    }

    public Estado getEstados() {
        return estados;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public Cuenta(String numeroCuenta, double saldo, Moneda moneda) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.moneda = moneda;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", moneda=" + moneda + '}';
    }

}
