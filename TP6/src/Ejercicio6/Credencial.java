package Ejercicio6;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class Credencial {

    private String Nombre, Apellido, Institucion;

    public Credencial(Asistente a){
        setNombre(a.getNombre());
        setApellido(a.getApellido());
        setInstitucion(a.getInstitucion());
    }

    public String getNombre() {
        return Nombre;
    }

    private void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    private void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getInstitucion() {
        return Institucion;
    }

    private void setInstitucion(String institucion) {
        Institucion = institucion;
    }
}
