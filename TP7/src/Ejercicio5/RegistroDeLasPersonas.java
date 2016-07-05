package Ejercicio5;

import Ejercicio3.Persona;
import Ejercicio3.Direccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class RegistroDeLasPersonas {

    private List<Persona> personas;

    public RegistroDeLasPersonas() {
        this.personas = new ArrayList<>();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroDeLasPersonas that = (RegistroDeLasPersonas) o;
        return Objects.equals(personas, that.personas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personas);
    }


    void AgregarPersona(Persona persona) {
        this.getPersonas().add(persona);

    }

    //TODO HACER ESTO
    Persona recuperarPersona(Integer dni) {
        for (Persona p :
                this.getPersonas()) {
            if (p.getDNI().equals(dni)) {
                return p;
            }
        }
        return null;
    }

    Integer cantidadPersonas() {
        return this.getPersonas().size();
    }

    String imprimirListaDePersonas() {
        StringBuilder sb = new StringBuilder();
        for (Persona p :
                this.getPersonas()) {
            sb.append(p.toString() + "\n");
        }
        return sb.toString();
    }

    String retornarPersonasOrdenadasdeMenorAMayor() {

        Collections.sort(this.getPersonas());

        return imprimirListaDePersonas();
    }


}

