package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Supermercado {

    List<Caja> cajas;

    public Supermercado() {
        this.cajas = new ArrayList<>();
    }

    public List<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(List<Caja> cajas) {
        this.cajas = cajas;
    }

    public Float LiquidacionDelDia() {
        Float total = 0f;
        for (Caja c : this.getCajas()) {
            total += c.getDineroEnCaja();
        }
        return total;
    }

    public void agregarCaja(Caja c) {
        this.cajas.add(c);
    }
}
