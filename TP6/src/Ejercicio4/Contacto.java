package Ejercicio4;

/**
 * Created by nmastromarino on 30/06/2016.
 */
public class Contacto {

    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    public Contacto(String nombre, String apellido, String telefono, String mail) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacto contacto = (Contacto) o;

        if (nombre != null ? !nombre.equals(contacto.nombre) : contacto.nombre != null) return false;
        if (apellido != null ? !apellido.equals(contacto.apellido) : contacto.apellido != null) return false;
        if (telefono != null ? !telefono.equals(contacto.telefono) : contacto.telefono != null) return false;
        return mail != null ? mail.equals(contacto.mail) : contacto.mail == null;

    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }
}
