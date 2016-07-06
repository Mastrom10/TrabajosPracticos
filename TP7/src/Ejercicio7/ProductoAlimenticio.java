package Ejercicio7;

/**
 * Created by Nicolas on 05/07/2016.
 */
public abstract class ProductoAlimenticio extends Producto implements ProductoDeVenta {


    public ProductoAlimenticio(Integer codigoProducto, Float precio) {
        super(codigoProducto, precio);
    }
}
