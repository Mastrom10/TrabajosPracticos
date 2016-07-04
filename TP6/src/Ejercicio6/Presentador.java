package Ejercicio6;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class Presentador extends Asistente {

    public Presentador(String nombre, String apellido, String institucion) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setInstitucion(institucion);
    }

    @Override
    public Float CalcularDescuento() {
        return 0.75f;
    }
}
