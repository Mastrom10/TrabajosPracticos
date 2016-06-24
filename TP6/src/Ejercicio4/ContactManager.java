package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmastromarino on 24/06/2016.
 */
public class ContactManager {

    public List<GrupoDeContactos> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<GrupoDeContactos> grupos) {
        this.grupos = grupos;
    }

    List<GrupoDeContactos> grupos;

    public ContactManager() {
        this.grupos = new ArrayList<>();
        this.grupos.add(new GrupoDeContactos("Default"));
    }

    public void AltaDeContacto(Contacto con, GrupoDeContactos grupo){

    }

    public void BorrarUnContacto (Contacto con){

    }

    void ModificarMailContacto(Contacto con, String NuevoMail){
        con.setMail(NuevoMail);
    }

    GrupoDeContactos CrearUnGrupo(String nombreDelGrupo){
        GrupoDeContactos CC = new GrupoDeContactos(nombreDelGrupo);
        grupos.add(CC);
        return CC;
    }

    void ModificarGrupo(GrupoDeContactos GC, String NuevoNombre){
        GC.setNombre(NuevoNombre);
    }

    void AgregarUnContacto(Contacto cn, GrupoDeContactos GC ){

        this.grupos.indexOf(GC);

    }



}
