package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmastromarino on 30/06/2016.
 */
public class Grupo {

    private String nombre;
    private List<Contacto> contactos;



    public void agregarContacto(Contacto elContacto){
        this.contactos.add(elContacto);
    }
    public void quitarContacto(Contacto elContacto){
        this.contactos.remove(elContacto);
    }






    public Grupo(String nombre) {
        this.nombre = nombre;
        this.contactos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grupo grupo = (Grupo) o;

        if (nombre != null ? !nombre.equals(grupo.nombre) : grupo.nombre != null) return false;
        return contactos != null ? contactos.equals(grupo.contactos) : grupo.contactos == null;

    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (contactos != null ? contactos.hashCode() : 0);
        return result;
    }
}
