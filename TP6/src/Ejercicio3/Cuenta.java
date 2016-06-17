package Ejercicio3;

/**
 * Created by Matias Malerba on 17/06/2016.
 */
public class Cuenta {
    private double saldo;
    private int pin;

    public void depositar (double monto){
        saldo = saldo + monto;
    }

    public void extraer (double monto){
        saldo = saldo - monto;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public void cambiarPin (int pin){

    }
}
