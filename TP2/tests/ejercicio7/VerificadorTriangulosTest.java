package Ejercicio7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 11/05/2016.
 */
public class VerificadorTriangulosTest {
    @Test
    public void comprarTriangulosEncajan() throws Exception {
        VerificadorTriangulos vt = new VerificadorTriangulos();
        Triangulo t1 = new Triangulo(5f, 3f);
        Triangulo t2 = new Triangulo(4f, 2f);
        VerificadorTriangulos.Posibilidades resultado = vt.ComprarTriangulos(t1, t2);

        assertEquals(VerificadorTriangulos.Posibilidades.ENCAJASINGIRAR, resultado);
    }
    @Test
    public void comprarTriangulosEncajanGirando() throws Exception {
        VerificadorTriangulos vt = new VerificadorTriangulos();
        Triangulo t1 = new Triangulo(5f, 3f);
        Triangulo t2 = new Triangulo(2f, 4f);
        VerificadorTriangulos.Posibilidades resultado = vt.ComprarTriangulos(t1, t2);

        assertEquals(VerificadorTriangulos.Posibilidades.ENCAJAGIRANDO, resultado);
    }
    @Test
    public void comprarTriangulosNoEncajan() throws Exception {
        VerificadorTriangulos vt = new VerificadorTriangulos();
        Triangulo t1 = new Triangulo(5f, 3f);
        Triangulo t2 = new Triangulo(45f, 33f);
        VerificadorTriangulos.Posibilidades resultado = vt.ComprarTriangulos(t1, t2);

        assertEquals(VerificadorTriangulos.Posibilidades.NOENCAJA, resultado);
    }

}