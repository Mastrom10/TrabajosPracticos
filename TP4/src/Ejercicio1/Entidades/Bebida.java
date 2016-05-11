package Ejercicio1.Entidades;

/**
 * Created by nmastromarino on 10/05/2016.
 */
public class Bebida {
    public int id;
    public String nombre;
    public String tamanio;
    public Float precio;

    public Bebida(String nombre, String tamanio, float precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
        this.id = 0;
    }
    public Bebida(String nombre, String tamanio, float precio, int id) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio= precio;
        this.id = id;
    }

}
