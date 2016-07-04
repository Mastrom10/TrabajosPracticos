package Ejercicio6;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class Alumno extends Asistente{

    private Integer año;
    public Alumno(String nombre, String apellido, String institucion,  Integer año) {
        this.setAño(año);
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setInstitucion(institucion);
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    @Override
    public Float CalcularDescuento() {
        return getAño() < 4 ? new Float(0.25f) : new Float(0f);
    }
}
