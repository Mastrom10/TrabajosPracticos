package Ejercicio6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class TicketTest {
    @Test
    public void testtoString() throws Exception {
        Ticket tk1 = new Ticket(TipoLocalidad.Adelante);
        Ticket tk2 = new Ticket(TipoLocalidad.Medio);
        Ticket tk3 = new Ticket(TipoLocalidad.Atras);

        System.out.println(tk1.toString());
        System.out.println(tk2.toString());
        System.out.println(tk3.toString());

    }

}