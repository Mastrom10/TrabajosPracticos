package Ejercicio7;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Carne extends ProductoAlimenticio {


    public Carne(Integer codigoProducto, Float precio) {
        super(codigoProducto, precio);
    }

    @Override
    public Float getPrecioVenta() {
        return this.getPrecio() * 0.9f;
    }


}
