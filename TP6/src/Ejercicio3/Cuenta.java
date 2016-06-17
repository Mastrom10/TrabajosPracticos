package Ejercicio3;

/**
 * Created by Matias Malerba on 17/06/2016.
 */
public class Cuenta {

    private double saldo;
    private int pin;
    private int numeroCuenta;

    public Cuenta(double saldoInicial) {
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
    }

    public void extraer(double monto) {
        saldo = saldo - monto;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void pin(int pin){
        this.pin = pin;
    }

    public void cambiarPin(int pin) {

    }

    public void numeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
}
