package Ejercicio6;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public abstract class Asistente {

    private String nombre;
    private String apellido;
    private String institucion;

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

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }


    public Float CalcularPrecio(Float PrecioBase){
        return PrecioBase - (PrecioBase * CalcularDescuento());
    }

    protected abstract Float CalcularDescuento();

    @Override
    public String toString() {
        return getNombre() + " " + getApellido();
    }
}
