package Ejercicio1;

import java.util.Objects;

/**
 * Created by Nicolas on 14/06/2016.
 */
public class NumeroComplejo {

    Float ParteReal;
    Float ParteImaginaria;


    public NumeroComplejo Sumar(NumeroComplejo nc) {

        return new NumeroComplejo(this.getParteReal() + nc.getParteReal(), this.getParteImaginaria() + nc.getParteImaginaria());
    }

    public NumeroComplejo Restar(NumeroComplejo nc) {

        return new NumeroComplejo(this.getParteReal() - nc.getParteReal(), this.getParteImaginaria() - nc.getParteImaginaria());
    }


    public NumeroComplejo(Float parteReal, Float parteImaginaria) {
        ParteReal = parteReal;
        ParteImaginaria = parteImaginaria;
    }

    /**
     * @param NumeroComplejo Numero complejo en el formato "X + iY"
     */
    public NumeroComplejo(String NumeroComplejo) {
        ParteReal = Float.valueOf(NumeroComplejo.split("\\s\\+\\si")[0]);
        ParteImaginaria = Float.valueOf(NumeroComplejo.split("\\s\\+\\si")[1]);
    }

    public Float getParteReal() {
        return ParteReal;
    }

    public void setParteReal(Float parteReal) {
        ParteReal = parteReal;
    }

    public Float getParteImaginaria() {
        return ParteImaginaria;
    }

    public void setParteImaginaria(Float parteImaginaria) {
        ParteImaginaria = parteImaginaria;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroComplejo that = (NumeroComplejo) o;
        return Objects.equals(ParteReal, that.ParteReal) &&
                Objects.equals(ParteImaginaria, that.ParteImaginaria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ParteReal, ParteImaginaria);
    }
}
