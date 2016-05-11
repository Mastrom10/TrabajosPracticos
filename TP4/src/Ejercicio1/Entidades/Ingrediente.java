package Ejercicio1.Entidades;

/**
 * Created by nmastromarino on 10/05/2016.
 */
public class Ingrediente {
    public int id;
    public String nombre;
    public String tipo;

    public Ingrediente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.id = 0;
    }
    public Ingrediente(String nombre, String tipo, int id) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
