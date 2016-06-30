package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmastromarino on 30/06/2016.
 */
public class ContactManager {

    private List<Contacto> contactos;
    private List<Grupo> grupos;


    public void agregarContacto (Contacto c){
        this.contactos.add(c);
    }

    public void quitarContacto(Contacto c){
        this.contactos.remove(c);
        for (Grupo g :
                grupos) {
            if (g.getContactos().contains(c)){
                g.quitarContacto(c);
            }
        }
        c = null;
        //for (Grupo g :
        //        grupos) {
        //    g.quitarContacto(c);
        //}
    }

    public void agregarGrupo(Grupo g){
        this.grupos.add(g);
        for (Contacto con :
                g.getContactos()) {
            if (!getContactos().contains(con)) {
                agregarContacto(con);
            }
        }
    }

    public void quitarGrupo(Grupo g){
        this.grupos.remove(g);
        g = null;
    }

    public void modificarContacto(Contacto c, String nombre, String apellido, String telefono, String mail) {
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setTelefono(telefono);
        c.setMail(mail);
    }

    public void modificarGrupo(Grupo g, String nombre){
        g.setNombre(nombre);
    }

    public void modificarMailContacto(Contacto c, String mail){
        modificarContacto(c, c.getNombre(), c.getApellido(), c.getTelefono(), mail);
    }

    public void agregarContactoAlGrupo(Contacto con, Grupo grp){
        grp.agregarContacto(con);
        if (!getGrupos().contains(grp)){
            agregarGrupo(grp);
        }
        if (!getContactos().contains(con)){
            agregarContacto(con);
        }
    }

    public void agregarContactoAlGrupoPorNombre(Contacto con, String NombreGrupo){
        boolean agregado = false;
        for (Grupo g :
                getGrupos()) {
            if (g.getNombre().equals(NombreGrupo)){
                agregarContactoAlGrupo(con, g);
                agregado = true;
                break;
            }
        }
        if (!agregado){
            Grupo g = new Grupo(NombreGrupo);
            agregarContactoAlGrupo(con, g);
        }
    }



    public ContactManager() {
        this.grupos = new ArrayList<>();
        this.contactos = new ArrayList<>();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactManager that = (ContactManager) o;

        if (contactos != null ? !contactos.equals(that.contactos) : that.contactos != null) return false;
        return grupos != null ? grupos.equals(that.grupos) : that.grupos == null;

    }

    @Override
    public int hashCode() {
        int result = contactos != null ? contactos.hashCode() : 0;
        result = 31 * result + (grupos != null ? grupos.hashCode() : 0);
        return result;
    }
}
