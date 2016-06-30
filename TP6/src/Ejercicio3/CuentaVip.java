package Ejercicio3;

/**
 * Created by nmastromarino on 30/06/2016.
 */
public class CuentaVip extends Cuenta {


    public CuentaVip(Float saldo, Integer pin, Integer numeroCuenta, Boolean enCapital) {
        super(saldo, pin, numeroCuenta, enCapital);
    }

    public CuentaVip(Integer numeroCuenta){
        super(numeroCuenta);
    }

    @Override
    public Float comision(){
        if (this.getEnCapital()){
            return 2f;
        } else {
            return 0f;
        }
    }
}
