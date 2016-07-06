package Ejercicio7;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Lacteos extends ProductoAlimenticio {


    public Lacteos(Integer codigoProducto, Float precio) {
        super(codigoProducto, precio);
    }

    @Override
    public Float getPrecioVenta() {
        return this.getPrecio() * 0.8f;
    }
}
