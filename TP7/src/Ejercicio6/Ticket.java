package Ejercicio6;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Ticket {

    TipoLocalidad tipoLocalidad;

    public Ticket(TipoLocalidad tipoLocalidad) {
        this.tipoLocalidad = tipoLocalidad;
    }

    public TipoLocalidad getTipoLocalidad() {
        return tipoLocalidad;
    }

    public void setTipoLocalidad(TipoLocalidad tipoLocalidad) {
        this.tipoLocalidad = tipoLocalidad;
    }

    @Override
    public String toString() {
        return tipoLocalidad + ": " + tipoLocalidad.getMonto() + " Pesos.";
    }
}
