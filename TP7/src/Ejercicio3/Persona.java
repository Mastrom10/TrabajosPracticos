package Ejercicio3;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Persona implements Comparable<Persona> {

    private Integer DNI;
    private String nombre, apellido;
    private Direccion direccion;

    public Persona(Integer DNI) {
        this.DNI = DNI;
    }


    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(DNI, persona.DNI) &&
                Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellido, persona.apellido) &&
                Objects.equals(direccion, persona.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI, nombre, apellido, direccion);
    }


    @Override
    public String toString() {
        return this.getDNI() + ": " + this.getApellido() + ", " + this.getNombre();
    }

    @Override
    public int compareTo(Persona o) {
        //Comparamos Por DNI
        return this.getDNI() - o.getDNI();
    }

}
