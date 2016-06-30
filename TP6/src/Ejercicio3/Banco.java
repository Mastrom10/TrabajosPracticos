package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matias Malerba on 17/06/2016.
 */
public class Banco {

    List<Cuenta> lasCuentas;


    public Banco() {
        this.lasCuentas = new ArrayList<>();
    }

    public List<Cuenta> getCuentas() {
        return this.lasCuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.lasCuentas = cuentas;
    }

    public void agregarCuenta(Cuenta cuenta){
        this.lasCuentas.add(cuenta);
    }

    public void quitarCuenta(Cuenta cuenta){
        this.lasCuentas.remove(cuenta);
    }

    public Cuenta ObtenerCuenta(Integer nroCuenta){
        return this.lasCuentas.get(this.lasCuentas.indexOf(new Cuenta(nroCuenta)));
    }

    public Float InformeDeSaldo(){
        Float SaldoSuma = 0f;
        for (Cuenta C :
                this.getCuentas()) {
            SaldoSuma += C.getSaldo();

        }
        return SaldoSuma;
    }

}
