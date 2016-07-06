package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Chango {

    List<ProductoDeVenta> laCompra;

    public Chango() {
        this.laCompra = new ArrayList<>();
    }

    public List<ProductoDeVenta> getLaCompra() {
        return laCompra;
    }

    public void setLaCompra(List<ProductoDeVenta> laCompra) {
        this.laCompra = laCompra;
    }

    public void agregarProductoAlChanguito(ProductoDeVenta pdv) {
        this.laCompra.add(pdv);
    }
}
