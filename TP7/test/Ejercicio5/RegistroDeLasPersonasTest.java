package Ejercicio5;

import Ejercicio3.Direccion;
import Ejercicio3.Persona;
import org.junit.Test;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class RegistroDeLasPersonasTest {

    @Test
    public void testearRegistroDePersonas() {

        RegistroDeLasPersonas rp = new RegistroDeLasPersonas();

        Persona p1 = new Persona(29111999);
        p1.setNombre("Luciano");
        p1.setApellido("Perez");
        p1.setDireccion(new Direccion("34", 567, "Buenos Aires"));
        rp.AgregarPersona(p1);

        Persona p2 = new Persona(30333666);
        p2.setNombre("Marciel");
        p2.setApellido("Gonzalez");
        p2.setDireccion(new Direccion("34", 567, "Buenos Aires"));
        rp.AgregarPersona(p2);

        System.out.println("El registro de Personas tiene: " + rp.cantidadPersonas() + " de personas.");

        System.out.println(rp.recuperarPersona(30333666).toString());

        Persona p3 = new Persona(29111999);
        p3.setNombre("Juan Andres");
        p3.setApellido("Perez");
        p3.setDireccion(new Direccion("34", 567, "Buenos Aires"));
        rp.AgregarPersona(p3);
        System.out.println("Luego de agregar a " + p3.toString());
        System.out.println("El registro de Personas tiene: " + rp.cantidadPersonas() + " de personas.");


       /*
       Lo que sucede es que cuando querramos acceder a la persona con DNI 29111999
       nos va a devolver la primer persona en la lista que es LucianoPerez en lugar
       de Juan Andres Perez que fue la ultima creada.
               por lo demas all deberia funcionar correctamente.
        */

    }

}