package Ejercicio3;

/**
 * Created by Matias Malerba on 17/06/2016.
 */

public class Cuenta {

    private Float saldo;
    private Integer pin;
    private Integer numeroCuenta;
    private Boolean enCapital;

    public Cuenta(Float saldo, Integer pin, Integer numeroCuenta, Boolean enCapital) {
        this.saldo = saldo;
        this.pin = pin;
        this.numeroCuenta = numeroCuenta;
        this.enCapital = enCapital;
    }

    public Cuenta(Integer numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Boolean getEnCapital() {
        return enCapital;
    }

    public void setEnCapital(Boolean enCapital) {
        this.enCapital = enCapital;
    }

    public void depositar(Float monto) {
        setSaldo(getSaldo() + monto - comision());
    }


    public void extraer(Float monto) {
        setSaldo(getSaldo() - monto - comision());
    }

    public Float consultarSaldo() {
        extraer(0f);
        return getSaldo();
    }

    public void cambiarPin(Integer pin) {
        extraer(0f);
        setPin(pin);
    }

    public Float comision(){
        return 6f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Cuenta cuenta = (Cuenta) o;

        return numeroCuenta != null ? numeroCuenta.equals(cuenta.numeroCuenta) : cuenta.numeroCuenta == null;

    }

    @Override
    public int hashCode() {
        return numeroCuenta != null ? numeroCuenta.hashCode() : 0;
    }
}
