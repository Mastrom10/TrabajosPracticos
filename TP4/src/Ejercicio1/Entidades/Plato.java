package Ejercicio1.Entidades;

import java.util.List;

/**
 * Created by nmastromarino on 10/05/2016.
 */
public class Plato {
    public int id;
    public String nombre;
    public List<Ingrediente> ingredientes;
    public Float precio;

    public Plato(String nombre, List<Ingrediente> ingredientes, Float precio,int id) {
        this.id = id;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }
    public Plato(String nombre, List<Ingrediente> ingredientes, Float precio) {
        this.id = 0;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }
}
