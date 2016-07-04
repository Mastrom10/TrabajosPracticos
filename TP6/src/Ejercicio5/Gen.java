package Ejercicio5;

import java.util.*;

/**
 * Created by nmastromarino on 24/06/2016.
 */
public class Gen {



    enum Nucleotido {
        A,C,G,T;
        public static Nucleotido getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    private Integer ID;
    private Integer Longitud;
    private List<Nucleotido> nucleotidos;

    public Gen(Integer longitud, Integer ID) {
        this.nucleotidos = new ArrayList<>();
        this.Longitud = longitud;
        this.ID = ID;
    }

    public Gen(Gen gen) {
       this.setID(gen.getID());
        this.setLongitud(gen.getLongitud());
        this.nucleotidos = new ArrayList<>();
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getLongitud() {
        return Longitud;
    }

    public void setLongitud(Integer longitud) {
        Longitud = longitud;
    }

    public List<Nucleotido> getNucleotidos() {
        return nucleotidos;
    }

    public void setNucleotidos(List<Nucleotido> nucleotidos) {
        this.nucleotidos = nucleotidos;
    }

    public void setRandomNucleotidos(){
        for (int i = 0; i < Longitud; i++) {
            nucleotidos.add(Nucleotido.getRandom());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gen gen = (Gen) o;

        if (ID != null ? !ID.equals(gen.ID) : gen.ID != null) return false;
        if (Longitud != null ? !Longitud.equals(gen.Longitud) : gen.Longitud != null) return false;
        return nucleotidos != null ? nucleotidos.equals(gen.nucleotidos) : gen.nucleotidos == null;

    }

    @Override
    public int hashCode() {
        int result = ID != null ? ID.hashCode() : 0;
        result = 31 * result + (Longitud != null ? Longitud.hashCode() : 0);
        result = 31 * result + (nucleotidos != null ? nucleotidos.hashCode() : 0);
        return result;
    }


}
