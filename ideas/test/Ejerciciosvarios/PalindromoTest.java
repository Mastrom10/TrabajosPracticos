package Ejerciciosvarios;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 27/05/2016.
 */
public class PalindromoTest {
    @Test
    public void isCasiPalindromo() throws Exception {
        Palindromo p = new Palindromo();

        Assert.assertTrue(p.isCasiPalindromo("abcdcyx"));
    }

}