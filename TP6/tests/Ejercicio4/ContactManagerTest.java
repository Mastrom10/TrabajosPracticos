package Ejercicio4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 24/06/2016.
 */
public class ContactManagerTest {
    @Test
    public void modificarGrupo() throws Exception {
        ContactManager CM = new ContactManager();

        Assert.assertEquals(CM.getGrupos().size(), 0);
        GrupoDeContactos CC1 = CM.CrearUnGrupo("Default");
        CM.ModificarGrupo(CC1, "IMPORTANTES");
        Assert.assertEquals(CC1.getNombre(), "IMPORTANTES");



    }

    @Test
    public void crearUnGrupo() throws Exception {

        ContactManager CM = new ContactManager();

        Assert.assertEquals(CM.getGrupos().size(), 0);
        GrupoDeContactos CC1 = CM.CrearUnGrupo("Default");
        GrupoDeContactos CC2 = CM.CrearUnGrupo("Facultad");
        GrupoDeContactos CC3 = CM.CrearUnGrupo("Trabajo");
        Assert.assertEquals(CM.getGrupos().size(), 3);
        Assert.assertTrue(CM.getGrupos().indexOf(CC2) > -1);
    }


    @Test
    public void modificarMailContacto() throws Exception {

        Contacto C = new Contacto("PEPE", "Potatoe", "123456", "Juancito@juancito.com");
        Contacto D = C.Clone();
        ContactManager CM = new ContactManager();
        CM.ModificarMailContacto(C, "MiNuevoMail@gmail.com");
        System.out.println(C.toString());

        Assert.assertNotEquals(C, D);

    }

}