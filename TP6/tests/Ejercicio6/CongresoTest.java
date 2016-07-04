package Ejercicio6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class CongresoTest {

    Asistente asAlu1, asAlu2, asPres, asPart1, asPart2;
    Congreso congreso;

    @Before
    public void setUp() throws Exception {
        asAlu1 = new Alumno("Homero", "Simpson", "UAI", 2);
        asAlu2 = new Alumno("Peter", "Griffin", "UAI", 4);
        asPres = new Presentador("Bojack", "Horseman", "Netflix");
        asPart1 = new Particular("Pepe", "Argento", "Telefe", true);
        asPart2 = new Particular("Marcelo", "Tinelli", "Telefe", false);
        congreso = new Congreso();
    }

    @After
    public void tearDown() throws Exception {
        asAlu1 = null;
        asAlu2 = null;
        asPres = null;
        asPart1 = null;
        asPart2 = null;
        congreso = null;
        congreso = null;
    }



    @Test
    public void agregarAsistente() throws Exception {
        congreso.AgregarAsistente(asAlu1);
        congreso.AgregarAsistente(asPres);

        Assert.assertEquals(congreso.getListaDeAsistentes().get(1), asPres);

    }

    @Test
    public void mostrarAsistentes() throws Exception {
        congreso.AgregarAsistente(asAlu1);
        congreso.AgregarAsistente(asAlu2);
        congreso.AgregarAsistente(asPres);
        congreso.AgregarAsistente(asPart1);
        congreso.AgregarAsistente(asPart2);
        String Respuesta = congreso.MostrarAsistentes();
        String RespuestaVerificacion = "Homero Simpson\n" +
                "Peter Griffin\n" +
                "Bojack Horseman\n" +
                "Pepe Argento\n" +
                "Marcelo Tinelli\n";

        Assert.assertEquals(Respuesta, RespuestaVerificacion);
    }

    @Test
    public void CalcularPrecio(){
        Float PrecioCongreso = 1000f;
        Assert.assertEquals(Float.valueOf(PrecioCongreso*0.75f), asAlu1.CalcularPrecio(PrecioCongreso));
        Assert.assertEquals(PrecioCongreso, asAlu2.CalcularPrecio(PrecioCongreso));
        Assert.assertEquals(Float.valueOf(PrecioCongreso*0.25f), asPres.CalcularPrecio(PrecioCongreso));
        Assert.assertEquals(PrecioCongreso, asPart1.CalcularPrecio(PrecioCongreso));
        Assert.assertEquals(Float.valueOf(PrecioCongreso*0.9f), asPart2.CalcularPrecio(PrecioCongreso));

    }

}