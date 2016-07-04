package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class Congreso {

    private List<Asistente> listaDeAsistentes;

    public Congreso() {
        this.listaDeAsistentes = new ArrayList<>();
    }

    public List<Asistente> getListaDeAsistentes() {
        return listaDeAsistentes;
    }

    public void AgregarAsistente(Asistente asistente){
        listaDeAsistentes.add(asistente);
    }

    public String MostrarAsistentes(){
        StringBuilder sb = new StringBuilder();
        for (Asistente a : this.getListaDeAsistentes()) {
            sb.append(a.toString()).append("\n");
        }
        return sb.toString();
    }





}
