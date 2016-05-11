package ejercicio4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 11/05/2016.
 */
public class AbueloTest {
    @Test
    public void desapercibidor() throws Exception {
        Abuelo abu = new Abuelo();
        int resultado = abu.desapercibidor();
        System.out.println("El numero que tenes que jugar en la quiniela es: " + String.valueOf(resultado));
    }

}