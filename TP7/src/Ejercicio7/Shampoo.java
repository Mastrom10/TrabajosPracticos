package Ejercicio7;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Shampoo extends Perfumeria {


    public Shampoo(Integer codigoProducto, Float precio) {
        super(codigoProducto, precio);
    }

    @Override
    public Float getPrecioVenta() {
        return this.getPrecio();
    }
}
