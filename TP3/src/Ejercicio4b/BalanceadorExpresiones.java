package Ejercicio4b;

import java.util.ArrayList;

/**
 * Created by Nicolas on 07/05/2016.
 */
public class BalanceadorExpresiones {

    private static final Character ch1 = '(';
    private static final Character ch2 = '[';
    private static final Character ch3 = '{';
    private static final Character ch4 = '}';
    private static final Character ch5 = ']';
    private static final Character ch6 = ')';

    public boolean verificarExpresion(String exp) {
        boolean esBalanceada = true;
        ArrayList<Character> llaves = new ArrayList<>();
        int nivel = 0;

        try {
            for (int i = 0; i < exp.length(); i++) {
                Character letra = exp.charAt(i);

                if (letra.equals(ch1) || letra.equals(ch2) || letra.equals(ch3)) {
                    nivel += 1;
                    llaves.add(letra);
                } else if (letra.equals(ch4) || letra.equals(ch5) || letra.equals(ch6)) {
                    Character lastchar = llaves.get(llaves.size() - 1);
                    switch (lastchar) {
                        case '{':
                            if (letra.equals(ch4) && nivel > 0) {
                                nivel -= 1;
                                llaves.remove(llaves.size() - 1);
                            } else {
                                return false;
                            }
                            break;
                        case '[':
                            if (letra.equals(ch5) && nivel > 0) {
                                nivel -= 1;
                                llaves.remove(llaves.size() - 1);
                            } else {
                                return false;
                            }
                            break;
                        case '(':
                            if (letra.equals(ch6) && nivel > 0) {
                                nivel -= 1;
                                llaves.remove(llaves.size() - 1);
                            } else {
                                return false;
                            }
                            break;
                        default:
                            esBalanceada = false;
                            break;
                    }
                }

            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            return false;
        }

        if (nivel == 0 && esBalanceada) {
            return esBalanceada;
        } else {
            return false;
        }

    }

}
