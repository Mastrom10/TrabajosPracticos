package Ejercicio1.Entidades;

/**
 * Created by nmastromarino on 10/05/2016.
 */
public class Promocion {
    public int id;
    public String nombre;
    public Plato plato;
    public Bebida bebida;
    public Float Precio;

    public Promocion(String nombre, Plato plato, Bebida bebida, Float precio, int id) {
        this.id = id;
        this.nombre = nombre;
        this.plato = plato;
        this.bebida = bebida;
        Precio = precio;
    }

    public Promocion(String nombre, Plato plato, Bebida bebida, Float precio) {
        this.id = 0;
        this.nombre = nombre;
        this.plato = plato;
        this.bebida = bebida;
        Precio = precio;
    }
}
