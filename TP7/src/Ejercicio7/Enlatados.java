package Ejercicio7;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Enlatados extends ProductoAlimenticio {


    public Enlatados(Integer codigoProducto, Float precio) {
        super(codigoProducto, precio);
    }

    @Override
    public Float getPrecioVenta() {
        return this.getPrecio();
    }
}
