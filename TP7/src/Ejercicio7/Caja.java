package Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Caja {

    private Float dineroEnCaja;

    private List<ProductoDeVenta> compraTemp;

    public Caja() {
        this.dineroEnCaja = 0f;
        this.compraTemp = new ArrayList<>();
    }

    public Float getDineroEnCaja() {
        return dineroEnCaja;
    }

    public void setDineroEnCaja(Float dineroEnCaja) {

        this.dineroEnCaja = dineroEnCaja;
    }

    public Float Facturar(Chango changuito) {
        Float totalVenta = 0f;

        for (ProductoDeVenta pdv : changuito.getLaCompra()) {
            totalVenta += pdv.getPrecioVenta() - promoSi2IgualesSegundoAl70(pdv);
        }
        this.setDineroEnCaja(this.getDineroEnCaja() + totalVenta);
        compraTemp.clear();
        return totalVenta;
    }

    public Float promoSi2IgualesSegundoAl70(ProductoDeVenta pdv) {

        if (this.compraTemp.contains(pdv)) {
            this.compraTemp.remove(pdv);
            return pdv.getPrecioVenta() * 0.3f;
        } else {
            this.compraTemp.add(pdv);
        }
        return 0f;
    }
}
