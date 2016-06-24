package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmastromarino on 24/06/2016.
 */
public class GrupoDeContactos {

    private String nombre;
    private List<Contacto> contactos;

    public GrupoDeContactos(String nombre) {
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
}
