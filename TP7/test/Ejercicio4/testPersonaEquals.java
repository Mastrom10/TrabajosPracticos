package Ejercicio4;


import Ejercicio3.Persona;
import Ejercicio3.Direccion;
import org.junit.Test;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class testPersonaEquals {

    @Test
    public void ImprimirDatos() {

        Persona p1 = new Persona(12345678);
        Persona p2 = new Persona(12345678);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        /*
        Las dos vece simprime "false".
        porque == compara valor en caso de datos primitivos, pero en objetos tipados == compara a que direccion de heap apunta el stack
        equals si no está redefinido compara lo mismo que ==. el valor que tiene en el stack. por tal motivo hay que redefinirlo.
         */

        /*
        una vez redefinido el metodo .equals() se imprime primero falso y despues verdadero.
        porque == sigue comparando los valores del stack de cada objeto.
        en cambio ahora .equals() compara los valores de la heap del objeto (porque asi lo redefinimos)
         */


    }


}
