package Ejercicio3;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class PersonaTest {

    @Test
    public void ImprimirDatos() {

        Persona p = new Persona(12345678);

        System.out.println(p);

        /*
        Si no redefinimos el metodo toString() la persona imprime:
        Ejercicio3.Persona@a20d8b73

         */

         /*
         Con el metodo toString() redefinido la persona imprime:
         12345678: null, null
          */

        p.setNombre("Homero");
        p.setApellido("Simpson");

        System.out.println(p);

        /*
         Con el metodo toString() redefinido y valores seteados la persona imprime:
         12345678: Simpson, Homero
          */


    }


}