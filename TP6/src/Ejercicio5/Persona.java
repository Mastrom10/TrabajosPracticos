package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmastromarino on 01/07/2016.
 */
public class Persona {

    List<Gen> genomaIndividuo;

    public List<Gen> getGenomaIndividuo() {
        return genomaIndividuo;
    }

    public void setGenomaIndividuo(List<Gen> genomaIndividuo) {
        this.genomaIndividuo = genomaIndividuo;
    }

    public Persona() {
        this.genomaIndividuo = GenomaHumano.getInstance().getModeloGenes();
        for (Gen g : genomaIndividuo) {
                g.setRandomNucleotidos();
        }
    }


    public List<Gen> GenesIguales(Persona p){
        List<Gen> listaGenesIguales = new ArrayList<>();

        for (Gen g1:this.getGenomaIndividuo()) {
           if ( p.getGenomaIndividuo().get(g1.getID()).equals(g1)){
               listaGenesIguales.add(g1);
           }
        }
        return listaGenesIguales;
    }


}
