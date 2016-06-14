package Ejercicio2;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

/**
 * Created by Nicolas on 14/06/2016.
 */
public class PilaDeCaracteres {


    private Integer TamanioMaximo = Integer.MAX_VALUE;
    private Integer TamanioActual = 0;

    private ArrayList<Character> _listaDeCaracteres = new ArrayList<>();

    public PilaDeCaracteres(Integer tamanioMaximo) {
        this.TamanioMaximo = tamanioMaximo;
    }

    public PilaDeCaracteres() {
    }

    public Boolean push(Character unCaracter) {
        if (TamanioActual.equals(TamanioMaximo)) return false;
        _listaDeCaracteres.add(TamanioActual, unCaracter);
        this.TamanioActual++;
        return true;
    }

    public Character pop() {
        if (TamanioActual == 0) return null;
        Character resp = _listaDeCaracteres.get(this.TamanioActual - 1);
        _listaDeCaracteres.remove(this.TamanioActual - 1);
        this.TamanioActual--;
        return resp;
    }

    public Integer length() {
        return this.TamanioActual;
    }

    public Boolean isEmpty() {

        return _listaDeCaracteres.isEmpty();
    }
}
