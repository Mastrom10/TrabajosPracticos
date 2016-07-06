package Ejercicio7;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Indumentaria extends Producto implements ProductoDeVenta {


    private Integer talle;
    private String marca;

    public Indumentaria(Integer codigoProducto, Float precio, Integer talle, String marca) {
        super(codigoProducto, precio);
        this.talle = talle;
        this.marca = marca;
    }

    public Integer getTalle() {
        return talle;
    }

    public void setTalle(Integer talle) {
        this.talle = talle;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public Float getPrecioVenta() {
        return this.getPrecio();
    }
}
