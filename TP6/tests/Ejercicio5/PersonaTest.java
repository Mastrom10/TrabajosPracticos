package Ejercicio5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 01/07/2016.
 */
public class PersonaTest {
    Persona p1;
    Persona p2;

    @Before
    public void setUp() throws Exception {
        p1 = new Persona();
        p2 = new Persona();
    }

    @After
    public void tearDown() throws Exception {
        p1 = null;
        p2 = null;
    }

    @Test
    public void genesIguales() throws Exception {
        List<Gen> genesResultado = p1.GenesIguales(p2);
        List<Gen> genesResultadoIguales = p1.GenesIguales(p1);

        Assert.assertNotEquals(25000, genesResultado.size());
        Assert.assertEquals(25000, genesResultadoIguales.size());

        Assert.assertEquals(p1.getGenomaIndividuo().get(6114).getNucleotidos().size(), p2.getGenomaIndividuo().get(6114).getNucleotidos().size() );
        Assert.assertEquals(p1.getGenomaIndividuo().get(6114).getLongitud(), p2.getGenomaIndividuo().get(6114).getLongitud());
        Assert.assertEquals(p1.getGenomaIndividuo().get(6114).getID(), p2.getGenomaIndividuo().get(6114).getID());

    }


}