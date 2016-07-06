package Ejercicio7;

import java.util.Objects;

/**
 * Created by Nicolas on 05/07/2016.
 */
public abstract class Producto {

    private Integer CodigoProducto;
    private Float Precio;

    public Producto(Integer codigoProducto, Float precio) {
        CodigoProducto = codigoProducto;
        Precio = precio;
    }

    public Integer getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        CodigoProducto = codigoProducto;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float precio) {
        Precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(CodigoProducto, producto.CodigoProducto) &&
                Objects.equals(Precio, producto.Precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CodigoProducto, Precio);
    }
}
