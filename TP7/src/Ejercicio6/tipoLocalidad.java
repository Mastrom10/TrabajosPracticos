package Ejercicio6;

/**
 * Created by Nicolas on 05/07/2016.
 */
public enum TipoLocalidad {

    Adelante(30f),
    Medio(15f),
    Atras(5f);

    private final Float monto;

    TipoLocalidad(Float monto) {
        this.monto = monto;
    }

    public Float getMonto() {
        return monto;
    }

    public Float precioEnDolares() {
        return getMonto() * 14f;
    }

    public Float precioEnEuros() {
        return getMonto() * 17f;
    }

}
