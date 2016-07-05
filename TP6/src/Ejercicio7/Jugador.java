package Ejercicio7;

import java.util.Objects;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class Jugador {
    String Nombre;

    public Jugador(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(Nombre, jugador.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre);
    }
}
