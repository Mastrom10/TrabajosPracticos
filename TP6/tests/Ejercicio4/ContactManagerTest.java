package Ejercicio4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 30/06/2016.
 */
public class ContactManagerTest {

    Contacto c1;
    Contacto c2;
    Contacto c3;
    Grupo g1;
    Grupo g2;
    ContactManager cm;

    @Before
    public void setUp() throws Exception {
        c1 = new Contacto("Nicolas", "Mastromarino", "12345678", "nicolasmastromarino@mail.com");
        c2 = new Contacto("Matias", "Malerba", "987654321", "matiasmalerba@mail.com");
        c3 = new Contacto("Mr. Mate", "Taragui", "789456123", "MateTaragui@mail.com");
        g1 = new Grupo("Conocidos");
        g2 = new Grupo("Importantes");
        cm = new ContactManager();
    }

    @After
    public void tearDown() throws Exception {
        c1 = null;
        c2 = null;
        c3 = null;
        g1 = null;
        g2 = null;
        cm = null;
    }

    @Test
    public void agregarContacto() throws Exception {
        cm.agregarContacto(c1);
        cm.agregarContacto(c3);

        Assert.assertTrue(cm.getContactos().contains(c1));
        Assert.assertFalse(cm.getContactos().contains(c2));
        Assert.assertTrue(cm.getContactos().contains(c3));
    }

    @Test
    public void agregarGrupo() throws Exception {
        cm.agregarGrupo(g1);

        Assert.assertTrue(cm.getGrupos().contains(g1));
        Assert.assertFalse(cm.getGrupos().contains(g2));
    }

    @Test
    public void modificarMailContacto() throws Exception {
        cm.agregarContacto(c1);
        cm.agregarContacto(c2);
        cm.agregarContacto(c3);

        cm.modificarMailContacto(c1, "UnMailNuevo@unMail.com");
        Assert.assertEquals(c1.getMail(), "UnMailNuevo@unMail.com");
        Assert.assertEquals(cm.getContactos().get(cm.getContactos().indexOf(c1)).getMail(), "UnMailNuevo@unMail.com");

    }

    @Test
    public void modificarGrupo() throws Exception {
        cm.agregarGrupo(g1);
        cm.agregarGrupo(g2);

        cm.modificarGrupo(g1, "Facultad");
        Assert.assertEquals(g1.getNombre(), "Facultad");
        Assert.assertEquals(cm.getGrupos().get(cm.getGrupos().indexOf(g1)).getNombre(), "Facultad");
    }

    @Test
    public void agregarContactoAGrupo() throws Exception {
        cm.agregarContacto(c1);
        cm.agregarGrupo(g1);

        cm.agregarContactoAlGrupo(c1, g1);
        cm.agregarContactoAlGrupo(c2, g2);
        cm.agregarContactoAlGrupoPorNombre(c3, "Importantes");

        Assert.assertTrue(g1.getContactos().contains(c1));
        Assert.assertTrue(cm.getContactos().contains(c2));
        Assert.assertTrue(cm.getContactos().contains(c3));
        Assert.assertTrue(cm.getGrupos().contains(g2));
        Assert.assertTrue(g2.getContactos().contains(c3));
        Assert.assertTrue(g2.getContactos().contains(c2));
    }

    @Test
    public void quitarContacto() throws Exception {
        agregarContactoAGrupo();

        cm.quitarContacto(c2);
        Assert.assertFalse(cm.getContactos().contains(c2));
        Assert.assertFalse(g2.getContactos().contains(c2));

    }







}