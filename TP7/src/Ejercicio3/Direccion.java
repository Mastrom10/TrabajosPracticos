package Ejercicio3;

import java.util.Objects;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Direccion {

    private String calle, ciudad;
    private Integer numero;


    public Direccion(String calle, Integer numero, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(calle, direccion.calle) &&
                Objects.equals(ciudad, direccion.ciudad) &&
                Objects.equals(numero, direccion.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, ciudad, numero);
    }
}
