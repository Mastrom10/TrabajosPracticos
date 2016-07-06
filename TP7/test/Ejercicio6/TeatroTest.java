package Ejercicio6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class TeatroTest {
    Teatro unTeatro;

    @Before
    public void setUp() throws Exception {
        unTeatro = new Teatro();
    }

    @After
    public void tearDown() throws Exception {
        unTeatro = null;
    }

    @Test
    public void crearTicket() throws Exception {
        Ticket tk = unTeatro.crearTicket(TipoLocalidad.Adelante);
        Assert.assertTrue(tk.getClass().equals(Ticket.class));
    }

    @Test
    public void mostrarPosiblesLocalidades() throws Exception {
        System.out.println(unTeatro.MostrarPosiblesLocalidades());
    }

}